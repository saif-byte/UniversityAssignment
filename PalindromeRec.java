public class PalindromeRec {
    public static Boolean isPalindrome(String s){
        if (s.length()==1 || s.length()==0) return true; //base case
        s=s.toLowerCase(); //convert all into lowercase
        if (s.charAt(0)==s.charAt(s.length()-1)) //compare the first and last character
            return (isPalindrome(s.substring(1,s.length()-1))); //if same remove first and last char and return


        return false; //reach here only if first and last char are not same

    }

    public static void main(String[] args) {
        String s= "Madam";
        if (isPalindrome(s)) System.out.println("This is palindrome");
        else System.out.println("This is not palindrome");
    }
}
