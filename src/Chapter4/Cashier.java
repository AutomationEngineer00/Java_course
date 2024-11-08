package Chapter4;

import java.util.Scanner;

/*
* FOR LOOP
* Write a cashier program that will scan a given number of items and tall the cost*/
public class Cashier {
    public static void main(String[] args) {
//      Get number of items to you would like to scan
        System.out.println("Enter number of items to you would like to scan: ");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0.0;

        for (int i = 0; i<quantity; i++){
            System.out.println("Enter the cost of the item: ");
            double price = scanner.nextDouble();

            total = price + total;

        }
        scanner.close();
        System.out.println("Your is: R"+total);

    }

}
