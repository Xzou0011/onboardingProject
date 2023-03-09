package com.onboarding.onboardingProject.controller;

import com.onboarding.onboardingProject.model.Rubbish;
import com.onboarding.onboardingProject.service.RubbishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/rubbish")
//@CrossOrigin
@Controller
public class RubbishController {

    @Autowired
    private RubbishService rubbishService;

    @RequestMapping("/rubbishHomepage")
    public String viewHomePage(Model model, @Param("keyword") String keyword) {
        List<Rubbish> rubbishes = rubbishService.getRubbishes(keyword);
        model.addAttribute("rubbishes", rubbishes);
        model.addAttribute("keyword", keyword);
        return "rubbishHomepage";
    }

//    @GetMapping("/rubbishHomepage")
//    public String showRubbishList(Model model){
//        List<Rubbish> rubbishes = rubbishService.getAllRubbishes();
//        model.addAttribute("rubbishes", rubbishes);
//        return "rubbishHomepage";
//    }
}
