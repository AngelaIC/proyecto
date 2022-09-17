package edu.udea.main.controller;

import edu.udea.main.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @Autowired
    ProfileService profileService;
}
