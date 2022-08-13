package com.example.recyclerviewstest;

public class Exercise {
    private String name;
    private String repsSets;
    private String imageUrl;

    public Exercise(String name, String repsSets, String imageUrl) {
        this.name = name;
        this.repsSets = repsSets;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepsSets() {
        return repsSets;
    }

    public void setRepsSets(String repsSets) {
        this.repsSets = repsSets;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + repsSets + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
