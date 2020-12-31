import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BoysGirl {
public static void boysgirls(Scanner sc) {
    int boyscount = 0;
    int boysint = 0;
    int girlsscount = 0;
    int girlsint = 0;
    while (sc.hasNext()) {
        sc.next();
        boyscount++;
        boysint += sc.nextInt();

    if (!sc.hasNext()) break;

    sc.next();
    girlsscount++;
    girlsint += sc.nextInt();
    }
    System.out.println(boyscount+" boys "+girlsscount+" girls");
    System.out.println("Difference between boys' and girls' sums: "+Math.abs(boysint-girlsint));

}

    public static void main(String[] args) throws FileNotFoundException {
        File myfile= new File("D:\\Java Programs\\src\\tas.txt");
        Scanner sc = new Scanner(myfile);
        boysgirls(sc);
        sc.close();
    }
}
