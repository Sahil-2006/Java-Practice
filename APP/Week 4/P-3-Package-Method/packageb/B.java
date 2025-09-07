//Program 3
package packageb;

import packagea.A;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.display(); // Calling public method from class A in another package
    }
}