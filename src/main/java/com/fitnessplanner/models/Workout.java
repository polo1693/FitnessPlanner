package com.fitnessplanner.models;

/**
 * Entities for working with Workout
 * Created by paula on 3/14/2017.
 */

import javax.persistence.*;

@Entity
public class Workout {

    @Id
    @GeneratedValue
    private int id;

    private String workoutName;
    private String startDate;
    private String endDate;
    private String statTime;
    private String endTime;
    private String description;
    private int capacity;
    private boolean isFull;
    private boolean isCanceled;

   @ManyToOne
   @JoinColumn(name = "trainerId")
    private Trainer trainer;

    public Workout() {
    }

    public Workout(String workoutName, String startDate, String endDate, String statTime, String endTime, String description, int capacity, boolean isFull, boolean isCanceled, Trainer trainer) {
        this.workoutName = workoutName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.statTime = statTime;
        this.endTime = endTime;
        this.description = description;
        this.capacity = capacity;
        this.isFull = isFull;
        this.isCanceled = isCanceled;
        this.trainer = trainer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getStatTime() {
        return statTime;
    }

    public void setStatTime(String statTime) {
        this.statTime = statTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public boolean isCanceled() {
        return isCanceled;
    }

    public void setCanceled(boolean canceled) {
        isCanceled = canceled;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}
