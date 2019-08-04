package javaExamples;

public class Prime {

    public static void main(String[] args) {
        primeNumber(4);
        System.out.println(checkPrime(5));


    }
// this method check prime number
    public static void primeNumber(int num) {

        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime number");
        }
    }


// Checks prime number & returns boolean result
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
