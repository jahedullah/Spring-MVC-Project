package com.Jahedul.lc.controllers;

import com.Jahedul.lc.api.RandomNumberDTO;
import com.Jahedul.lc.api.UserInfoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LCAppController  {

    @RequestMapping("/")
    public String showHomePage(UserInfoDTO userInfoDTO, Model model){

        model.addAttribute("userInfo", userInfoDTO);
        return "home-page";
    }

//    @RequestMapping("/process-homepage")
//    public String showResultPage(@RequestParam String userName, @RequestParam String friendName, Model model){
//        model.addAttribute("uName", userName);
//        model.addAttribute("fName", friendName);
//
//
//        return "result-page";
//    }

    @RequestMapping("/process-homepage")
    //Thing to remember here when you are calling the UserInfoDTO the constructor is being called first while you are creating the object.
    public String showResultPage(UserInfoDTO userInfoDTO, RandomNumberDTO randomNumberDTO, Model model){

        model.addAttribute("userInfo", userInfoDTO);
        model.addAttribute("randomNumber", randomNumberDTO);

        return "result-page";
    }

    // See the above method "showResultPage". We do not have to write this much line of code we can just
    //bind it in another way.


}
