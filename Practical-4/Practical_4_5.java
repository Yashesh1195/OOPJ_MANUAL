class Employee {
    String name;
    int employeeId;
    double salary;
    
    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
    
    void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;
    
    Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }
    
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage;
    
    Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }
    
    void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class Practical_4_5 {
    public static void main(String[] args) {
        Manager manager = new Manager("Yashesh", 101, 75000, "IT");
        Developer developer = new Developer("Het", 102, 65000, "Java");
        
        System.out.println("Manager Details:");
        manager.displayInfo();
        
        System.out.println();
        
        System.out.println("Developer Details:");
        developer.displayInfo();
    }
}
