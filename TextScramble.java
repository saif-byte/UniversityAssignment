import java.util.NoSuchElementException;
import java.util.Scanner;

public class TextScramble {
    public static String scramble(String s){
        char[] a= s.toCharArray();
        for (int i = 1; i <a.length ; i++) {
            int r=i+(int)(Math.random()*(a.length-1-i));
            char temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
        s=new String(a);
        return s;
    }

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Some Text");
        while(sc.hasNext()){
            String text = sc.next();
            System.out.print(scramble(text) + " ");

        }

    }
}
