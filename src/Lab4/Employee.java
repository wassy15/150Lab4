package Lab4;

public class Employee implements Rules {
    String name;
    int salary;

    Employee() {
        name = "NO NAME";
        salary = 0;
    }

    Employee(String inName, int inSalary) {
        name = inName;
        salary = inSalary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return (name + " has a salary of $" + salary + ".");
    }
}
