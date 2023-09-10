class Student {
    // int rollNo=5;
    // String name = "unais";
    boolean pass = true;

    /* Constructors in java */
    Student(String name, int marks) {
        System.out.println("My name is " + name);
        System.out.println("I get " + marks + " in SSC exam");
        System.out.println("Thanks to invite me");
    }
}

public class Oops_01 {

    public static void main(String[] args) {
        Student S1 = new Student("Unais", 83);
        Student S2 = new Student("Taqui", 88);
        Student S3 = new Student("Huzefa", 60);
        Student S4 = new Student("Danish", 70);
        Student S5 = new Student("Rehan", 66);
        

    }
}
