import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Furkan", 2000.00, 45,2000);

        double vergi = e1.tax();
        double bonusPara = e1.bonus();
        double raise = e1.raiseSalary();



        System.out.println("vergi: " + vergi + "\nbonus para: " + bonusPara + "\nraise: " + raise);





    }
}