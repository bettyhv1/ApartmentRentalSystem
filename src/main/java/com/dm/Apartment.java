package com.dm;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private Long id;
    private String city;
    private String address;
    private String description;
    private double price;
    private int numberOfRooms;
    private boolean isAvailable;
    private String ownerPhoneNumber;
    private double squareMeter;
    private List<String> imageUrls;
    private LocalDate entryDate;

    public Apartment(Long id, String city, String address, String description,
                     double price, int numberOfRooms, String ownerPhoneNumber, double squareMeter) {
        this.id = id;
        this.city = city;
        this.address = address;
        this.description = description;
        this.price = price;
        this.numberOfRooms = numberOfRooms;
        this.ownerPhoneNumber = ownerPhoneNumber;
        this.squareMeter = squareMeter;
        this.isAvailable = true;
        this.imageUrls = new ArrayList<>();

    }

    //Getters
    public Long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setOwnerPhoneNumber(String ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public void setSquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }
}