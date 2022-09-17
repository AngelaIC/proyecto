package edu.udea.main.service;

import edu.udea.main.model.Profile;
import edu.udea.main.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    @Autowired
    ProfileRepository profileRepository;

    public void createdProfile(Profile profile){
        profileRepository.save(profile);
    }
}
