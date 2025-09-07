//Program 2
package p2packageconcept.Other;

import p2packageconcept.Vehicle;

public class OtherCar extends Vehicle {
    public void setSpeed(int s) {
        speed = s; // Accessing protected member in subclass from different package
    }
    public void displaySpeed() {
        System.out.println("OtherCar speed: " + speed);
    }

    public static void main(String[] args) {
        OtherCar oc = new OtherCar();
        oc.setSpeed(100);
        oc.displaySpeed();
    }
}