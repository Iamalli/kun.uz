package dasturlash.uz.service.dao;

import dasturlash.uz.aggregation.dto.profile.ProfileRequestDTO;
import dasturlash.uz.aggregation.dto.profile.ProfileResponseDTO;

public interface ProfileInterface {

    ProfileResponseDTO createProfile(ProfileRequestDTO profileRequestDTO);
}
