package javaExamples;

/*Armstrong Number: 153
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */

public class Armstrong {

    public static void main(String[] args) {
        armstrongNum(153);
    }

    public static void armstrongNum(int number) {
        int sum = 0;
        int temp;
        int digit;
        temp = number;
        while (temp > 0) {
            digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }

        if (number == sum) {
            System.out.println(number + " is an armstrong number ");
        }else{
            System.out.println(number + " is NOT an armstrong number");
        }
    }
}
