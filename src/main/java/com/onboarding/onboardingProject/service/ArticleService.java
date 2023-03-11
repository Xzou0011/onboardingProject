package com.onboarding.onboardingProject.service;

import com.onboarding.onboardingProject.model.Article;
import com.onboarding.onboardingProject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getArticles(String keyword) {
        if (keyword != null) {
            return articleRepository.search(keyword);
        }
        return null;
    }}
