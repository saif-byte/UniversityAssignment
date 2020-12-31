import java.util.ArrayList;
import java.util.Scanner;

public class EvenLengthString {
    public static ArrayList<String> removeEvenLength(ArrayList<String> s){
        for (int i = 0; i <s.size() ; i++) {
            if(s.get(i).length()%2==0){
                s.remove(i);
            }
        }
        return s;
    }
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter some text");
        while(sc.hasNext()){
            String s=sc.next();
            list.add(s);
        }
        System.out.println(removeEvenLength(list));
    }
}
