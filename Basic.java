

public class Basic {
    public static void main(String[] args) {
        String name = "Unais"; 
        int age = 20;
        boolean student = true;
        char surnameStartWith = 'U';
        double salary = 00.00;
        float percentage = 83;

        System.out.println(name);
        System.out.println(age);
        System.out.println(student);
        System.out.println(surnameStartWith);
        System.out.println(salary);
        System.out.println(percentage);

        //Conditional Statements in java:(if-then-else)/switch statements

        int driverAge = 16;
        int applyForElection = 16;

        if(driverAge>=20){
            System.out.println("You can drive the vehical with legal Licencse");
        }
        else if(applyForElection>=18){
            System.out.println("You are eligible to be a candidate in upcoming elections");
        }
        else{
            System.out.println("you can't drive!!!");
        }


    }
}


