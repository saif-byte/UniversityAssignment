import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StripComment {
    public static void stripcomment(Scanner sc){
       String line="";
        while(sc.hasNextLine()) {
            line=sc.nextLine();
            if(line.startsWith("/*")&&!line.contains("*/")) line="";
           if(!line.startsWith("/*") ){
               if(!line.contains("/*") && line.endsWith("*/"))
                   line="";
               else if(line.startsWith("/*") || line.contains("*/"))
                   line=line.substring(0,line.indexOf("/*")) + line.substring(line.indexOf("*/")+2);
               else if((line.contains("//")))
                   line= line.substring(0,line.indexOf("//"));

           }
            System.out.println(line);

        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        File myfile=new File("D:\\Java Programs\\src\\javaprogramstrip.txt");
        Scanner sc = new Scanner(myfile);
        stripcomment(sc);
        sc.close();
    }
}
