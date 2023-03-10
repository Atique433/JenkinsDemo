package practiseString;

public class PalindromeString {
    
    public static void main(String[] args) {
        String str = "Kayak";
        String temp = str;
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        if (temp.equalsIgnoreCase(rev)) {
            System.out.println("palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
