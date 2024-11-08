//import java.util.Random;
//
//public class RandomNames {
//
//
//    private static final String[] FIRST_NAMES = {"John", "Emma", "Michael", "Sophia", "William", "Olivia", "James", "Ava", "Robert", "Isabella"};
//    private static final String[] LAST_NAMES = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor"};
//
//    public static void main(String[] args) {
//        // Example usage
//        for (int i = 0; i < 5; i++) {
//            String randomName = generateRandomName();
//            String randomNumber = createRandomNumbers();
//            System.out.println("Random Name: " + randomName);
//            System.out.println("Random Numbers: " + randomNumber);
//            stringToBo("true");
//        }
//    }
//public static void stringToBo(String isEnabled){
//    boolean rememberMeBool = Boolean.parseBoolean(isEnabled);
//    System.out.println(rememberMeBool);
//
//}
//public  static WebDriver driver(){
//
//        return driver;
//}
//    public static String generateRandomName() {
//        Random random = new Random();
//
//        // Select random first name and last name from the arrays
//        String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
//        String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
//
//        // Concatenate and return the full name
//        return firstName + " " + lastName;
//    }
//
//    public static String createRandomNumbers(){
//// Specify the length of the random number
//        int length = 4;
//
//        // Create an instance of the Random class
//        Random random = new Random();
//
//        // Generate a random number with the specified length
//        StringBuilder randomNumber = new StringBuilder();
//        for (int i = 0; i < length; i++) {
//            int digit = random.nextInt(10); // Generates a random digit (0-9)
//            randomNumber.append(digit);
//        }
//
//        // Convert StringBuilder to String
//        String result = randomNumber.toString();
//
//        // Print the generated random number
//        System.out.println("Random 4-digit number: " + result);
//        return result;
//    }
//}
//
////    This example defines a `RandomNameGenerator` class with an array of first names and last names. The `generateRandomName` method selects a random first name and last name from the arrays and concatenates them to create a full name. The `main` method demonstrates how to use the `generateRandomName` method to generate and print five random names.
//
