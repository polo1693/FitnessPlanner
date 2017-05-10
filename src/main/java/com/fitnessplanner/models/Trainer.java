package com.fitnessplanner.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Paula on 08.05.2017.
 */
@Entity
public class Trainer {

    @Id
    @GeneratedValue
     private int id;

     private String trainerName;
     private String speciality;

    public Trainer() {
    }

    public Trainer(int id, String trainerName, String speciality) {
        this.id = id;
        this.trainerName = trainerName;
        this.speciality = speciality;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
