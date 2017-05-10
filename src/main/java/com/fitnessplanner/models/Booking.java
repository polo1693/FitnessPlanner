package com.fitnessplanner.models;

import javax.persistence.*;

/**
 * Entities for working with Booking
 * Created by paula on 3/14/2017.
 */
@Entity
public class Booking {

    @Id
    @GeneratedValue
    private int id;

    private boolean isApproved;

    @ManyToOne
    @JoinColumn(name = "trainerId")
    private Trainer trainer;

    @ManyToOne
    @JoinColumn(name = "workoutId")
    private Workout workout;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    public Booking() {
    }

    public Booking(boolean isApproved, Trainer trainer, Workout workout, Client client) {
        this.isApproved = isApproved;
        this.trainer = trainer;
        this.workout = workout;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean approved) {
        isApproved = approved;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
