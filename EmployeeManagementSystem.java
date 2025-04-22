/*Base class Person (name, age), class Employee (salary), class Manager (department). 
Inherit and display full details...*/


class Manager extends Person {
    String department;

    public void dept(String deptname){
        this.department = deptname;
    }
}

class employee extends Person {
    float salary;

    public void sal(float salary){
        this.salary = salary;
    }
}

class Person {
    String Name;
    int Age;

    public void p_name(String Name, int Age){
        this.Name = Name;
        this.Age = Age;
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        employee e = new employee();
        e.p_name("John Doe", 30);
        e.sal(50000);

        Manager m = new Manager();
        m.p_name("Jane Smith", 40);
        m.dept("HR");

        System.out.println("Employee_Name: " + e.Name);
        System.out.println("Emp_age: " + e.Age);
        System.out.println("Emp_salary: " + e.salary);
        System.out.println("Manager_Name: " + m.Name);
        System.out.println("Manager_Age: " + m.Age);
        System.out.println("Department: " + m.department);
    }
}