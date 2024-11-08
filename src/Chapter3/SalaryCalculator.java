package Chapter3;

import java.util.Scanner;

/*
* IF Statement.
* All sales people get a payment of $1000 for a week
* Salesperson who exceed 10 sales get an additional bonus of $250
* */
public class SalaryCalculator {
    public static void main(String[] args) {

        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("Number of sales an employee made: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales> quota){
            salary = salary+bonus;

        }
        System.out.println("The employee salary is: $"+salary);

    }
}
