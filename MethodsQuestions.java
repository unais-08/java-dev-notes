import java.util.Scanner;

public class MethodsQuestions {

    public int calculateAverage()

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements you want in your array");

        int myarrSize = sc.nextInt();
        int[] myarr = new int[myarrSize];

        sc = new Scanner(System.in);
        for (int i = 0; i < myarr.length; i++) {
            System.out.println("Enter the element in " + i + " position");
            myarr[i] = sc.nextInt();
        }
        // System.out.println("----------------------");

        for (int i = 0; i < myarr.length; i++) {
            // System.out.println(myarr[i]);
        }


        
        int Total=0;
        for ( int i = 0; i < myarr.length; i++) {
            Total=Total+myarr[i];
        }
        // System.out.println("Total sum is "+Total);
        int avg = (Total )/(myarrSize);
        // System.out.println("Avg of an array is "+avg);
        return avg;
    }

    public static void main(String[] args) {
        // Question 4: Define a method calculateAverage that takes an array of integers
        // as input and returns the average value of the elements.
        MethodsQuestions printArr = new MethodsQuestions();
       int avg =  printArr.calculateAverage();
        System.out.println(avg);
    }
}
