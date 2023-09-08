import java.util.Arrays;

// This is a Java class named 'Basic' containing the main method.
public class Basic {
    public static void main(String[] args) {

        // Declaring and initializing various variables.
        String name = "Unais";
        int age = 20;
        boolean student = true;
        char surnameStartWith = 'U';
        double salary = 00.00;
        float percentage = 83;

        // Printing the values of the variables.
        System.out.println(name);
        System.out.println(age);
        System.out.println(student);
        System.out.println(surnameStartWith);
        System.out.println(salary);
        System.out.println(percentage);

        // Conditional Statements in Java: if-then-else and switch statements.

        int driverAge = 16;
        int applyForElection = 16;

        // Checking if the driver's age is greater than or equal to 20.
        if (driverAge >= 20) {
            System.out.println("You can drive the vehicle with a legal license");
        } else if (applyForElection >= 18) {
            // Checking if the age is 18 or above to be eligible for elections.
            System.out.println("You are eligible to be a candidate in upcoming elections");
        } else {
            // If neither condition is met, print a message.
            System.out.println("You can't drive!!!");
        }

        // Using a switch statement to handle different cases based on the 'result'
        // variable.

        String result = "Abandoned";
        switch (result) {
            case "win":
                System.out.println("Win the match");
                break;
            case "loss":
                System.out.println("Loss the match");
                break;
            case "Abandoned":
                System.out.println("Match has been Abandoned due to rain!!");
                break;
            default:
                System.out.println("Information not available 404!!!");
        }

        // Logical operators (&& , || , !) are demonstrated in the following examples.

        String hsc = "poetry";
        String ssc = "Urdu";

        // Using the '&&' (logical AND) operator to check both conditions.
        if (hsc.equals("poetry") && ssc.equals("urdu")) {
            System.out.println("You are eligible to do Urdu mastery");
        } else {
            System.out.println("Not eligible");
        }

        int currentInAmp = 500;
        int voltage = 220;

        // Using the '||' (logical OR) operator to check either condition.
        if (currentInAmp > 200 || voltage > 200) {
            System.out.println("Very Dangerous");
        } else {
            System.out.println("Warn yourself ");
        }

        int chaseScore = 300;
        int wicketsInHands = 8;

        // Using both '&&' and '||' in a single condition.
        if (chaseScore > 250 && wicketsInHands < 10) {
            System.out.println("Win percentage 60%");
        } else {
            System.out.println("Win percentage 35%");
        }

        boolean genderIsMale = false;

        // Using the '!' (logical NOT) operator to negate a condition.
        if (!genderIsMale) {
            System.out.println("Female");
        }

        // ####Arrays in Java####

        // Array declaration
        int[] agesOfPlayers = new int[6];
        agesOfPlayers[0] = 25;
        agesOfPlayers[1] = 34;
        agesOfPlayers[2] = 33;
        agesOfPlayers[3] = 28;
        agesOfPlayers[4] = 29;
        agesOfPlayers[5] = 30;

        // printing values
        System.out.println(agesOfPlayers[0]);
        System.out.println(agesOfPlayers[1]);
        System.out.println(agesOfPlayers[2]);
        System.out.println(agesOfPlayers[3]);
        System.out.println(agesOfPlayers[4]);
        System.out.println(agesOfPlayers[5]);

        // Explicit Declaration of an Array
        double[] salaryInDollars = { 20.5, 30.5, 55.6, 85.1 };

        // printing values
        System.out.println(salaryInDollars[0]);
        System.out.println(salaryInDollars[1]);
        System.out.println(salaryInDollars[2]);
        System.out.println(salaryInDollars[3]);

        /*
         * we want to have a more descriptive printout of the array itself, we need a
         * toString() method that is provided by the Arrays package in Java.
         * [import java.util.Arrays] We put this at the top of the file, before we even
         * define the class!
         */

        String[] teamNames = { "India", "Pakistan", "Austrailia", "England", "Newzealand", "SouthAfrica", "Afghanistan",
                "Bangladesh" };

        System.out.println(Arrays.toString(teamNames));

        // Empty Array in java
        String[] menuItems = new String[5];
        System.out.println(menuItems.length); // .length to find the length of an array
        int[] my_ages = new int[5];
        System.out.println(Arrays.toString(menuItems)); // empty string array give null
        System.out.println(Arrays.toString(my_ages));// empty int array give 0

        // #### LOOPS IN JAVA ####

        // This section demonstrates a 'while' loop.
        int javaScore = 100; // Initialize the 'javaScore' to 100.
        int myScore = 50; // Initialize 'myScore' to 50.
        System.out.println(myScore); // Print 'myScore' to the console.
        while (javaScore != myScore) { // Continue looping until 'javaScore' equals 'myScore'.
            myScore++; // Increment 'myScore' by 1.
            System.out.println(myScore); // Print the updated 'myScore' to the console.
        }
        System.out.println("my final count is " + myScore); // Print the final 'myScore'.

        // This section demonstrates a 'for' loop.
        int sum = 0; // Initialize the 'sum' to 0.
        int naturalCount = 0; // Initialize 'naturalCount' to 0.
        for (naturalCount = 0; naturalCount <= 10; naturalCount++) {
            sum += naturalCount; // Add 'naturalCount' to 'sum' in each iteration.
        }
        System.out.println("sum of first 10 natural number is " + sum); // Print the sum.

        // This section demonstrates a 'do-while' loop.
        int sumOfNaturalNum = 0; // Initialize the 'sumOfNaturalNum' to 0.
        int NaturalNumCount = 0; // Initialize 'NaturalNumCount' to 0.
        do {
            NaturalNumCount++; // Increment 'NaturalNumCount' by 1.
            sumOfNaturalNum += NaturalNumCount; // Add 'NaturalNumCount' to 'sumOfNaturalNum'.
        } while (NaturalNumCount != 10); // Continue looping until 'NaturalNumCount' equals 10.
        System.out.println(sumOfNaturalNum); // Print the sum of natural numbers.

        // Methods in java

        /*
         * In Java, a method is a block of code that performs a specific task or action.
         * Methods are used to break down a program into smaller, more manageable
         * pieces, making it easier to read, understand, and maintain your code. Methods
         * are also reusable, which means you can call them multiple times from
         * different parts of your program.
         */

    }
}
