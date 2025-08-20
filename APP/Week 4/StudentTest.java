//Program 1
class Student {
    private int marks;
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        // s.marks = 90; // this line will cause a compilation error
        s.setMarks(90);
        System.out.println("Marks: " + s.getMarks());
    }
}