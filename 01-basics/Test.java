import java.util.Arrays;

public class Test {

    public void partOneMcq() {
        // q1 : a
        // q2 : a
        // q3 : c
        // q4 : b
        // q5 : b
    }

    public boolean isEven(int num) {
        return (num % 2 == 0) ? true : false;
    }

    public static void main(String args[]) {
        System.out.println("Start Execution");
        int a = 10;
        long b = 80000000L;
        float c = 3.14f;
        double d = 22.33;
        boolean flag = true;
        char ch = 'a';
        // System.out.println(a + b + c + d + flag + ch);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(flag);
        System.out.println(ch);
        String surname = "Shaikh";
        String surnames[] = { "Shaikh", "Khan", "Pathan", "Sayyed" };
        System.out.println(Arrays.toString(surnames));
        for (String ele : surnames) {
            System.out.print(ele + " ");
        }
        int whileFlag = 0;
        while (true) {
            System.out.println(whileFlag);
            whileFlag++;

            if (whileFlag == 3000) {
                break;
            }
        }

    }
}
