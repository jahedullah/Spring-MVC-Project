package com.Jahedul.lc.controllers;

import com.Jahedul.lc.api.RegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

    @RequestMapping("/register")
    public String showRegistrationPage(@ModelAttribute("userReg")RegistrationDTO registrationDTO){

        registrationDTO.setName("Jahedul");
        registrationDTO.setUsername("Jahedul1234");

        return "register-page";
    }

    @RequestMapping("/registration-success")
    public String processUserRegistration(@ModelAttribute("userReg")RegistrationDTO registrationDTO){

        return "registration-success";
    }
}
