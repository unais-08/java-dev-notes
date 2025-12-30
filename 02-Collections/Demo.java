package Collections;
interface A { // List
    void display();
}

class B implements A { // Vector implements List

    @Override
    public void display() {
        System.out.println("method of B class implemented from A interface");
    }

    public void show() {
        System.out.println("show method of B class");
    }

}

class C extends B { // Stack class itself

    public void methodFromC() {
        System.out.println("method of C class");
    }
}

class Demo {
    public static void main(String[] args) {

        System.out.println();
        A obj = new C();
        ((C) obj).methodFromC();
        obj.display();
        ((B) obj).show();

    }
}