package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, boolean isManual) {
        //Hint: Car extends Vehicle
        super(name);
        this.currentGear = currentGear;
        this.gears=gears;
        this.seats=seats;
        this.doors=doors;
        this.wheels=wheels;
        this.isManual=isManual;
        this.type=type;



    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
