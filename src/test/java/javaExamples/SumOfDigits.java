package javaExamples;
/*
sum of 1346 = 14
 */

public class SumOfDigits {

    public static void main(String[] args) {
        sumof(1346);

    }


    public static void sumof(int number) {
        int sum = 0;

        while(number>0){
            sum =sum+number%10;
            number = number/10;
        }
        System.out.println(sum);
    }
}
