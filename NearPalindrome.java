import java.util.Arrays;

public class NearPalindrome {
    public static boolean isnear(String s){
        s.toLowerCase();
        int count=0;
        for (int i = 0; i <s.length()/2 ; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1)){
                count++;
            }
        }
        if (count!=1) return false;
        else return true;
    }

    public static void main(String[] args) {
        System.out.println(isnear("racecar"));
        System.out.println(isnear("maddm"));

    }
}
