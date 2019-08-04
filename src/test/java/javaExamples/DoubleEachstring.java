package javaExamples;

public class DoubleEachstring {

    public static void main(String[] args) {

    String name = "expedia";

    String doubleLetter = " ";

        for (int i = 0; i < name.length(); i++ ){
            doubleLetter = doubleLetter+name.charAt(i)+name.charAt(i);

        }
        System.out.println(doubleLetter);
    }
}
