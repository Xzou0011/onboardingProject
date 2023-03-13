package com.onboarding.onboardingProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Rubbish {
    @Id
    private int id;
    private String waste_item;
    private String bins;
    private String descriptions;
    private String about;

    public Rubbish() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWaste_item() {
        return waste_item;
    }

    public void setWaste_item(String waste_item) {
        this.waste_item = waste_item;
    }

    public String getBins() {
        return bins;
    }

    public void setBins(String bins) {
        this.bins = bins;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
