package javaExamples;

public class Merdiven {

    public static void main(String[] args) {
        merdivenNumber(5);
    }
        public static void merdivenNumber ( int number){


            for (int x = 1; x <=number; x++) {
                for (int y = 1; y <= x; y++) {
                    System.out.println(y + "");
                }
                System.out.println("*********");
            }
        }
    }
