package javaExamples;

public class DivisionWithoutDivider {
    public static void main(String[] args) {
        division(21,3);
    }

    public static void division(int divident, int divisor){
        int quotient = 0;
        int remainder =0;

        while(divident>=divisor){
            divident=divident-divisor;
            quotient++;
            remainder=divident;
        }
        System.out.println("quotient = " + quotient+ "remainder = " +remainder);
    }
}
