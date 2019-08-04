package javaExamples;

public class AddHiphenToString {

    public static void main(String[] args) {
        String arr= "Expedia";
        String newArr= "Expe-dia";
        String name1 = "";
//1st option
        String hyp = arr.substring(0, 4) + "-" +arr.substring(4);
        System.out.println(hyp);

 //2nd option
        System.out.println( arr.replaceAll(arr, newArr));

//3rd option
        for(int i = 0; i < arr.length(); i ++){
            name1 = name1 +arr.charAt(i);
            if (i == 1){
                name1 = name1 + "-";
            }

        }
        System.out.println(name1);

    }
}
