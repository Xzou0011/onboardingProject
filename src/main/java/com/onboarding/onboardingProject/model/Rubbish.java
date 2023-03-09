package com.onboarding.onboardingProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Rubbish {
    @Id
    private int id;
    private String name;
    private String recycleType;
    private String description;

    public Rubbish() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecycleType() {
        return recycleType;
    }

    public void setRecycleType(String recycleType) {
        this.recycleType = recycleType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
