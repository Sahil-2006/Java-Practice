//Program 4
class Employee {
    static int count = 0;

    public Employee() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Total number of employees created: " + count);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        Employee.displayCount();
    }
}