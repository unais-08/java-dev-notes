class Student {
    // int rollNo=5;
    // String name = "unais";
    boolean pass;

    /* Constructors in java */
    Student(String name, int marks, boolean pass) {
        System.out.println("My name is " + name);
        System.out.println("I get " + marks + " in SSC exam");
        System.out.println("Thanks to invite me");
        this.pass = pass;
        /* Constructors Overloading in java */

    }

    Student(String name) {
        System.out.println(name);
    }

}

public class Oops_01 {

    public static void main(String[] args) {
        Student S1 = new Student("Unais", 83, true);
        Student S2 = new Student("Taqui", 88, false);
        Student S3 = new Student("Huzefa", 60, true);
        Student S4 = new Student("Danish", 70, false);
        Student S5 = new Student("Rehan", 66, true);
        Student S6 = new Student("Unknown...");//Constructor overload with diffrent parameters
        System.out.println(S1.pass);
        System.out.println(S2.pass);
        System.out.println(S3.pass);
        System.out.println(S4.pass);
        System.out.println(S5.pass);

    }
}
