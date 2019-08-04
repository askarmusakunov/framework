package javaExamples;

public class RemoveExtra {
    static  String name = "A)Y(D)(I(N";

    static String cleanName ="";

    public static void main(String[] args) {

        for(int i = 0 ; i< name.length(); i++ ){

            if(name.charAt(i)!= '(' && name.charAt(i)!= ')'){
                cleanName = cleanName +name.charAt(i);
            }
        }
        System.out.println(cleanName);
    }
}
