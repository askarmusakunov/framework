package javaExamples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumberInArrat {
    public static void main(String[] args) {
        largestInArrayWithSort();  //1st method

        Integer x[] = {4,2,3,4,1,5,8,98,45,356}; // 2nd method
        System.out.println(largestinArratCollection(x, 10));

        int [] b ={1,23,45,21,11,45}; //3rd method
        System.out.println(getlargest(b, 5));


    }
    // With Sort method
    public static void largestInArrayWithSort(){
        int[] arr = {5, 6, 76, 31, 43, 1};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }


    // With Collections
    public static int largestinArratCollection(Integer []b, int total){
        List<Integer> list = Arrays.asList(b);
        Collections.sort(list);
        int largest = list.get(total-1);
        return largest;
    }


    public static int getlargest (int [] a, int total){
        int temp;
        for(int i = 0; i < total; i++){
            for(int j =i+1; j<total; j++){
                if (a[i]> a[j]){
                    temp = a[i];
                    a[i]= a[j];
                    a[j]= temp;
                }
            }
        }
        return a[total-1];
    }

}