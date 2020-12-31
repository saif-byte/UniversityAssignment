import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CollapseSpace {
    public static String collapse(Scanner sc){

        String line=sc.nextLine();
        String[] a=line.split("\\s +");
        String s= Arrays.toString(a);
        s = s.replaceAll("\\[", "").replaceAll("\\]","");
        s=s.replaceAll(","," ");
        s=s.trim();

        return s;

    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("D:\\Java Programs\\src\\Spacedtext.txt"));
            while (sc.hasNextLine()) {
                System.out.println(collapse(sc));
            }
            sc.close();
        }
        catch(FileNotFoundException fnf){
            System.out.println("File not found.");
        }
    }
}
