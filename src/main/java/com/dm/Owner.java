package com.dm;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String id;
    private String fullName;
    private String phoneNumber;
    private String email;
    private List<Apartment> ownedApartments;


    public Owner(String id, String fullName, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.ownedApartments = new ArrayList<>();
    }

    //Getters
    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public List<Apartment> getOwnedApartments() {
        return ownedApartments;
    }


    //Setters
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addApartment(Apartment apt) {
        this.ownedApartments.add(apt);
    }
}

