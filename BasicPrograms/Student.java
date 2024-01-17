package BasicPrograms;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.name = "Vineeth";

        System.out.println("Student Name: " + student.getName());
    }
}
