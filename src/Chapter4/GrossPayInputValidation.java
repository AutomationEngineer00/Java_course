package Chapter4;

import java.util.Scanner;

/*
 * WHILW LOOP
 * Each store employee makes R15 an hour.
 * Write a program that allows the employee to enter the number if hours worked for the week.
 * Do not allow overtime
 * */
public class GrossPayInputValidation {
    public static void main(String[] args) {
        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hours did you work this week?: ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

//        Validate input
        while (hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

//        Calculate gross
        double gross = rate * hoursWorked;
        System.out.printf("Gross pay: R" + gross);
    }

}
