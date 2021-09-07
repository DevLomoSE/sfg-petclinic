package com.devlomose.sfgpetclinic.model;

/**
 * Speciality at: pet-clinic-data/src/main/java/com/devlomose/sfgpetclinic/model
 * Created by @DevLomoSE at 7/9/21 10:33.
 */
public class Speciality extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
