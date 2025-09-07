class Teacher{
    String name;
    String subject;
    public void setTeacher(String n, String sn){
        name =n;
        subject = sn;
    }

    public String getName(){
        return name;
    }

    public String getSubject(){
        return subject;
    }
}
class MathTeacher extends Teacher{
    public MathTeacher(String name) {
        setTeacher(name, "Mathematics");
    }
}
public class P1_Teacher {
    public static void main(String[] args){
        Teacher teacher = new Teacher();
        teacher.setTeacher("John", "Mathematics");
        System.out.println(teacher.getName() + " teaches " + teacher.getSubject());
    }
}