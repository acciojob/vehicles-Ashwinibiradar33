package com.driver;

class Bot implements WaterVehicle {
     String name;
     int capacity;

    public Bot(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getVehicleName() {
        return name;
    }

    public int getVehicleCapacity() {
        return capacity;
    }
}

