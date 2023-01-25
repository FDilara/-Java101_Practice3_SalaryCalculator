package salary;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    List<Employee> employees = new ArrayList<>();
    String nameAndSurname;
    double salary;
    int perWorkHours;
    int beginYear;

    public Employee(String nameAndSurname, double salary, int perWorkHours, int beginYear) {
        this.nameAndSurname = nameAndSurname;
        this.salary = salary;
        this.perWorkHours = perWorkHours;
        this.beginYear = beginYear;
    }

    public double taxCalculation(double salary) {
        double tax;
        if(salary<1000) {
            tax = 0;
        } else {
            tax = salary * 0.03;
        }
        return tax;
    }

    public int bonusFee(int perWorkHours) {
        int bonus;
        if(perWorkHours>40) {
            bonus = (perWorkHours-40) * 30;
        } else {
            bonus = 0;
        }
        return bonus;
    }

    public double raiseSalary(int beginYear) {
        int nowYear = 2021;
        double raiseSalary=0;
        if((nowYear-beginYear)<10) {
            raiseSalary = this.salary * 0.05;
        } else if((nowYear-beginYear)>9 && (nowYear-beginYear)<20) {
            raiseSalary = this.salary * 0.10;
        } else if((nowYear-beginYear)>19) {
            raiseSalary = this.salary * 0.15;
        }
        return raiseSalary;
    }

    public void employeeInformation() {
        System.out.println("Name and Surname: " + this.nameAndSurname);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work hours: " + this.perWorkHours);
        System.out.println("Begin year: " + this.beginYear);
        System.out.println("Tax: " + taxCalculation(this.salary));
        System.out.println("Bonus: " + bonusFee(this.perWorkHours));
        System.out.println("Raise salary: " + raiseSalary(this.beginYear));
        double totalSalary = this.salary+raiseSalary(this.beginYear);
        double taxAndBonus = taxCalculation(this.salary)+bonusFee(this.perWorkHours);
        System.out.println("Salary with tax and bonus: " + (totalSalary-taxAndBonus));
        System.out.println("Total salary: " + totalSalary);
    }
}
