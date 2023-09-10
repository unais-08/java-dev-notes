package OOP;

class Student{
    String name = "unais";
    double marks=7.08f;
    boolean pass=true;
}

public class OOP01 {
    public static void main(String[] args) {
        
        Student unais = new Student();
        System.out.println(unais.name);
        System.out.println(unais.marks);
        System.out.println(unais.pass);
        }
}