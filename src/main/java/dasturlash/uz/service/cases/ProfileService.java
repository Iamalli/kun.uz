package dasturlash.uz.service.cases;

import dasturlash.uz.aggregation.dto.profile.ProfileRequestDTO;
import dasturlash.uz.aggregation.dto.profile.ProfileResponseDTO;
import dasturlash.uz.aggregation.model.Profile;
import dasturlash.uz.repository.ProfileRepository;
import dasturlash.uz.service.dao.ProfileInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class ProfileService implements ProfileInterface {
    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @Override
    public ProfileResponseDTO createProfile(ProfileRequestDTO profileRequestDTO) {
        log.info("Creating profile with request: {}", profileRequestDTO);
        try {
            Profile profile = toEntity(profileRequestDTO);
            profile = profileRepository.save(profile);
            log.info("Profile created successfully: {}", profile);
            return toResponseDTO(profile);
        }catch (Exception e){
            throw new RuntimeException("Error creating profile: " + e.getMessage());
        }

    }

    private Profile toEntity(ProfileRequestDTO profileRequestDTO){
        Profile profile = new Profile();
        LocalDateTime localDateTime = LocalDateTime.now();
        profile.setName(profileRequestDTO.getName());
        profile.setEmail(profileRequestDTO.getEmail());
        profile.setPhone(profileRequestDTO.getPhone());
        profile.setUsername(profileRequestDTO.getUsername());
        profile.setStatus(true);
        profile.setVisible(true);
        profile.setPassword(profileRequestDTO.getPassword());
        profile.setCreatedAt(localDateTime);
        return profile;
    }

    private ProfileResponseDTO toResponseDTO(Profile profile){
        ProfileResponseDTO profileResponseDTO = new ProfileResponseDTO();
        profileResponseDTO.setId(profile.getId());
        profileResponseDTO.setName(profile.getName());
        profileResponseDTO.setUsername(profile.getUsername());
        profileResponseDTO.setEmail(profile.getEmail());
        profileResponseDTO.setPhone(profile.getPhone());
        profileResponseDTO.setStatus(profile.isStatus());
        profileResponseDTO.setVisible(profile.isVisible());
        return profileResponseDTO;
    }
}
