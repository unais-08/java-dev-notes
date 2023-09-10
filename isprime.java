//Question 5: Write a Java program with a method called isPrime that checks if a given number is prime or not. Use this method to find all prime numbers between 1 and 100...

public class isprime {

    public void isPrimeMethod(int number) {
        int flag=0;
        if (number==0||number==1) {
            System.out.println("Not prime");

        } else{
        for (int i = 2; i <= number; i++) {
            
            if(number%i==0){
                System.out.println("not prime");
                flag =1;
                break;
            }
           
        }
        if(flag==0)System.out.println("prime");
        }

        
    }
        public static void main(String[] args) {
            isprime checkPrimeRef = new isprime();
            checkPrimeRef.isPrimeMethod(7);
            // checkPrimeRef.isPrimeMethod(10);
            // checkPrimeRef.isPrimeMethod(12);
            // checkPrimeRef.isPrimeMethod(99);
        }
}
