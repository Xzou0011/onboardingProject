package com.onboarding.onboardingProject.service;

import com.onboarding.onboardingProject.model.Rubbish;
import com.onboarding.onboardingProject.repository.RubbishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubbishService{

    @Autowired
    private RubbishRepository rubbishRepository;

    public List<Rubbish> getRubbishes(String keyword) {
        if (keyword != null) {
            return rubbishRepository.search(keyword);
        }
        return null;
    }
}
