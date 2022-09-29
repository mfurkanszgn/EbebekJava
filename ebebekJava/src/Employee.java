import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if(this.salary > 1000.00) {
            double empTax = (this.salary * 3.00) / 100;
            return empTax;
        }
        else {
            return 0.00;
        }
    }

    public double bonus() {
        if(this.workHours > 40) {
            int bonusSalary = (workHours - 40) * 30;
            return bonusSalary;
        }
        return 0.00;
    }

    public double raiseSalary() {
        int year = 2021 - hireYear;
        if(year < 10) {
            return (this.salary * 5) / 100;
        }
        else if (year > 9 && year < 20) {
            return (this.salary * 10) / 100;
        }
        else {
            return (this.salary * 15) / 100;
        }


    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }


}
