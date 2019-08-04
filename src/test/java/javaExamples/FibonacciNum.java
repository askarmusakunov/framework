package javaExamples;

public class FibonacciNum {
    public static void main(String[] args) {
        fibo(20);
    }

    public static void fibo(int number) {
        int a = 0;
        int b = 1;
       // System.out.println(a + " " + b + " ");
        for (int i = 1; i <= number; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c + " + ");
        }
    }

}