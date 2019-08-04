package javaExamples;

public class ReverseInt {


    public static void main(String[] args) {
        ReverseInt(2312);
    }




//reverse int numbers
    public static int ReverseInt(int number) {
        int reverse = 0;
        int number1 = number;

        while (number != 0) {    // while number == 0 it will rotate
            int digit = number % 10;      // digit as a container saves all the numbers
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println(reverse);

        return reverse;
    }
}

