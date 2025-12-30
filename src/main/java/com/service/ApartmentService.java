package com.service;

import com.dm.Apartment;
import com.dm.Owner;
import com.dm.Tenant;

import java.util.ArrayList;
import java.util.List;

public class ApartmentService
{
    private final List<Apartment> apartments = new ArrayList<>();
    private final List<Owner> owners = new ArrayList<>();
    private final List<Tenant> tenants = new ArrayList<>();

    public Apartment addApartment(Apartment a) { ... }
    public Apartment updateApartment(Long id, Apartment updated) { ... }
    public boolean deleteApartment(Long id) { ... }
    public Apartment getApartmentById(Long id) { ... }
    public List<Apartment> getAllApartments() { ... }

    public List<Apartment> searchByCity(String city) { ... }
    public List<Apartment> filterByPriceRange(double min, double max) { ... }
    public List<Apartment> filterByRooms(int rooms) { ... }
    public List<Apartment> availableApartments() { ... }

    public void assignOwnerToApartment(Long ownerId, Long apartmentId) { ... }
    public void rentApartment(Long tenantId, Long apartmentId) { ... }
//dkfn
}