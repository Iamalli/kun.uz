package dasturlash.uz.controller;

import dasturlash.uz.aggregation.dto.profile.ProfileRequestDTO;
import dasturlash.uz.service.dao.ProfileInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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

    @PutMapping("/update")
    public ResponseEntity<?> updateProfile(@RequestBody ProfileRequestDTO profileRequestDTO){
        return ResponseEntity.ok(profileInterface.createProfile(profileRequestDTO));
    }

    @PostMapping("/delete")
    public ResponseEntity<?> deleteProfile(@RequestBody ProfileRequestDTO profileRequestDTO){
        return ResponseEntity.ok(profileInterface.createProfile(profileRequestDTO));
    }








}
