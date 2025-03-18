import java.util.Scanner;
class Employee {
    private String name;
    private double salary;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = sc.nextLine();
        System.out.print("Enter employee salary: ");
        salary = sc.nextDouble();
        sc.close();
    }

    void putData() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}
public class Practical_3_4 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getData();
        System.out.println("Employee Details:-");
        emp.putData();
    }
}
