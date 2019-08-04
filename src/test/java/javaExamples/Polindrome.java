package javaExamples;


public class Polindrome {

    public static void main(String[] args) {
        System.out.println(isPolindrome("ata"));
        System.out.println(isPalindromeReverseTheString("Mada"));
        System.out.println(isPolindromewithCharAt("Madam"));
    }

    // returns boolean result.Check String
    public static boolean isPolindrome(String str) {
        if (str == null)
            return false;
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }

    // returns boolean. ignores lower/ Uppercase
    public static boolean isPalindromeReverseTheString(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        System.out.print(reverse.toString() + " - is " );
        return (reverse.toString()).equals(clean);
    }

    //Polindrome with charAt
    public static boolean isPolindromewithCharAt(String s){
        int head = 0;
        int tail = s.length()-1;
        while(head<tail){
            if(s.charAt(head)!=s.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }
        return  true;
    }


}
