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
    }
}
