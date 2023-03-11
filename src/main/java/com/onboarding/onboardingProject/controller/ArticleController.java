package com.onboarding.onboardingProject.controller;

import com.onboarding.onboardingProject.model.Article;
import com.onboarding.onboardingProject.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/articleHomepage")
    public String viewHomePage(Model model, @Param("keyword") String keyword) {
        List<Article> articles = articleService.getArticles(keyword);
        model.addAttribute("articles", articles);
        model.addAttribute("keyword", keyword);
        return "articleHomepage";
    }

}
