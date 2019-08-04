package javaExamples;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static groovyjarjarpicocli.CommandLine.Help.Ansi.Style.reverse;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseString("Expedia"));
        System.out.println(reversStringBuilder("Expedia"));

    }

    public static String reverseString(String name) {
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        return reverse;
    }

    public static StringBuilder reversStringBuilder(String name) {

        StringBuilder sb = new StringBuilder(name);

        return sb.reverse();
    }


    //Doesnt work
    public static  void ReverseStringArrayList( String input){
        List<Character> array = new ArrayList<>();

        for(char c: input.toCharArray()){
            array.add(c);
        }
        Collections.reverse((array));
        Object[] arr2 = array.toArray();
        for(int i = 0;  i<arr2.length; i++){
          //  reverse += arr2[i];
        }
        System.out.println(reverse);
    }


    }

