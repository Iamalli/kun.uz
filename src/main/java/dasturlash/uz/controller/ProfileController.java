package dasturlash.uz.controller;

import dasturlash.uz.aggregation.dto.profile.ProfileRequestDTO;
import dasturlash.uz.service.dao.ProfileInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/profile")
public class ProfileController {


    private final ProfileInterface profileInterface;


    public ProfileController(ProfileInterface profileInterface) {
        this.profileInterface = profileInterface;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createProfile(@RequestBody ProfileRequestDTO profileRequestDTO){
        return ResponseEntity.ok(profileInterface.createProfile(profileRequestDTO));
    }
}
