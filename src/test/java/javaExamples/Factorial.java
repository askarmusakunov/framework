package javaExamples;
/*
factorial number: 1*2*3*4*5*6*7*8*9*10
 */
public class Factorial {
    public static void main(String[] args) {
        factorialLoop(10);
        System.out.println(factorial(10));
        System.out.println(factorial1(10));


    }

    static void factorialLoop(int number) {
        int factorialSum = 1;

        for (int i = 1; i <= number; i++) {
            factorialSum = factorialSum * i;
        }
        System.out.println("Factorial of " + number + " is " + factorialSum);
    }


    // method to find factorial of given number
    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }


    static int factorial1(int n) {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }


}
