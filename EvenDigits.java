import java.util.Scanner;

public class EvenDigits {
    public static String evendigit(int n){
        if(n<10 && n%2==0) return n+"";
        else if(n<10 && n%2!=0) return "0";
        else if ((n%10)%2==0) return (evendigit(n/10)) +""+ (n%10);
        else return (evendigit(n/10)) +"";


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Number");
        int i=sc.nextInt();

        if (i<0){
            i=i*-1;
            String n=evendigit(i);

            if(i%2==0){
                String f=n.replace('0',' ');
                System.out.println("-"+f.replaceFirst("^0+(?!$)", ""));
            }


            else System.out.println("-"+n.replaceFirst("^0+(?!$)", "")+"");


        }
    else{
        String n=evendigit(i);

        if(i%2==0){
            String f=n.replace('0',' ');
            System.out.println(f.replaceFirst("^0+(?!$)",""));
        }


        else System.out.println(n.replaceFirst("^0+(?!$)","")+"");


        }


     }}

