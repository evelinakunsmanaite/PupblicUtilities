/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

/**
 *
 * @author Administrator
 */
public class House {
    private int id;
    private int apartmentNumber;
    private double apartmentArea;
    private int floor;
    private int roomsCount;
    private String street;
    private BuildingType buildingType;
    private double lifetime;

    public House(int id, int apartmentNumber, double apartmentArea, int floor, int roomsCount, String street, BuildingType buildingType, double lifetime) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.apartmentArea = apartmentArea;
        this.floor = floor;
        this.roomsCount = roomsCount;
        this.street = street;
        this.buildingType = buildingType;
        this.lifetime = lifetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public double getApartmentArea() {
        return apartmentArea;
    }

    public void setApartmentArea(double apartmentArea) {
        this.apartmentArea = apartmentArea;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomsCount() {
        return roomsCount;
    }

    public void setRoomsCount(int roomsCount) {
        this.roomsCount = roomsCount;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }

    public double getLifetime() {
        return lifetime;
    }

    public void setLifetime(double lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "House{" + "id=" + id + ", apartmentNumber=" + apartmentNumber + ", apartmentArea=" + apartmentArea + ", floor=" + floor + ", roomsCount=" + roomsCount + ", street=" + street + ", buildingType=" + buildingType + ", lifetime=" + lifetime + '}';
    }
}
