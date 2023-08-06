package com.driver;

public class F1 extends Car {
private int currentSpeed;
private int currentGear;

    public F1(String name, boolean isManual) {
        super(name, isManual);
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        this.currentSpeed += rate;
        if (this.currentSpeed >= 200) {
            this.currentGear = 6;
        } else if (this.currentSpeed >= 150) {
            this.currentGear = 5;
        } else if (this.currentSpeed >= 100) {
            this.currentGear = 4;
        } else if (this.currentSpeed >= 60) {
            this.currentGear = 3;
        } else if (this.currentSpeed >= 30) {
            this.currentGear = 2;
        } else {
            this.currentGear = 1;
        }

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }

    private int getCurrentDirection() {
        return 0;
    }
}
