import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the readings of last month: ");
        int lmr = sc.nextInt();
        System.out.println("Kindly enter the readings of this month: ");
        int tmr = sc.nextInt();
        if (lmr > 99999 || tmr > 99999 || lmr < 0 || tmr < 0) System.out.println("Please Enter valid readings");
        else {
            int diff = Math.abs(tmr - lmr);
            if (diff < 1000) {
                double cost = (7.00 * diff) / 100;//in dollars1
                System.out.println("your cost is " + cost + "$");
            }
            if (diff >= 1000 && diff < 2500) {
                double cost = 70 + (5.00 * (diff - 1000)) / 100;
                System.out.println("your cost is " + cost + "$");
            }
            if (diff > 2500) {
                double cost = 145 + (3.00 * (diff - 2500)) / 100;
                System.out.println("your cost is " + cost + "$");
            }

        }}}