package com.fitnessplanner.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entities for working with Client
 * Created by paula on 3/14/2017.
 */
@Entity
public class Client {

    @Id
    @GeneratedValue
    private int id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String cnp;
    private boolean hasActiveSubscription;

    public Client() {
    }

    public Client(String firstName, String lastName, String email, String phone, String address, String cnp, boolean hasActiveSubscription) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.cnp = cnp;
        this.hasActiveSubscription = hasActiveSubscription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public boolean isHasActiveSubscription() {
        return hasActiveSubscription;
    }

    public void setHasActiveSubscription(boolean hasActiveSubscription) {
        this.hasActiveSubscription = hasActiveSubscription;
    }
}
