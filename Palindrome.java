public class Palindrome {
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
       String p=new String(s);
        String r= "";
        for (int i = p.length()-1; i >=0 ; i--) {
            char c= p.charAt(i);
            r= r+c;


        }
        return r.equals(s);
    }

    public static void main(String[] args) {
        if (isPalindrome("10201")) System.out.println("This is Palindrome");
        else System.out.println("This is not Palindrome");
    }
}
