/*Create a Student class with name, age, course. 
Use methods to input and display details for 3 students.*/
class Student {
    String name;
    int age;
    String course;

    public void setDetails(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentInfoSystem {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setDetails("Gaurav", 22, "Computer Engineer");
        student1.displayDetails();

        Student student2 = new Student();
        student2.setDetails("Riya", 20, "Mechanical Engineer");
        student2.displayDetails();

        Student student3 = new Student();
        student3.setDetails("Aman", 21, "Civil Engineer");
        student3.displayDetails();
    }
}
