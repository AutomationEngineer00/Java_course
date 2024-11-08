package Chapter2;

import java.util.Scanner;

public class SeasonOfTheYear {
    public static void main(String[] args) {
//        Create a program that asks a user for a season of the year,
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a season of the year: ");
        String season = scanner.next();
        System.out.println("Season: "+season);

//        then a whole number, then an adjective.
        System.out.println("Enter a whole number: ");
        int myNumber = scanner.nextInt();
//        And use the input to complete the sentence below.
//        Output the result.
        System.out.println("On a "+season+ " day, I drink a minimum of "+myNumber+ " cups of coffee.");
    }
}
