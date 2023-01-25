package salary;

public class Salary {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ahmet Şahin", 2000.0, 45, 1985);
        Employee e2 = new Employee("Aslı Yılmaz", 3000.0, 40, 2019);
        Employee e3 = new Employee("Derya Er", 3500.0, 45, 2018);
        Employee e4 = new Employee("Ali Yılmaz", 4000.0, 30, 2017);

        System.out.println("1. Employee Information");
        e1.employeeInformation();
        System.out.println("=======================");
        System.out.println("2. Employee Information");
        e2.employeeInformation();
        System.out.println("=======================");
        System.out.println("3. Employee Information");
        e3.employeeInformation();
        System.out.println("=======================");
        System.out.println("4. Employee Information");
        e4.employeeInformation();
    }
}
