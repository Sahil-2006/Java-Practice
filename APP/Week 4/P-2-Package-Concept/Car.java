//Program 2
package p2packageconcept;

public class Car extends Vehicle {
    public void setSpeed(int s) {
        speed = s; // Accessing protected member
    }
    public void displaySpeed() {
        System.out.println("Car speed: " + speed);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(80);
        c.displaySpeed();
    }
}