import java.util.ArrayList;
import java.util.Scanner;

public class Arrayliststm {
    public static double sum(ArrayList<Double> list){
        double sum=0;
        for (Double y : list) {
            sum += y;
        }
        return sum;
    }
    public static double mean(double sum ,int length){
        return sum/length;
    }
    public static double sumsq(double[] a,int length){
        double sumsq=0;
        for (int i = 0; i <length ; i++) {
            sumsq+=a[i];
        }
        return sumsq;
    }
    public static double div(double a, int length){
        return a/length;
    }
    public static double stddav(double a){
        return Math.sqrt(a);
    }
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some numbers");
        while (sc.hasNext()) {
            double d = sc.nextDouble();
            list.add(d);
        }
        double sum = sum(list);
        double mean = mean(sum, list.size());
        double[] distfrommean = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            distfrommean[i] = Math.pow(Math.abs(mean - list.get(i)), 2);
        }
        double sumsq = sumsq(distfrommean, distfrommean.length);
        double div = div(sumsq , list.size());
        double stddav = stddav(div);
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + stddav);
    }
    }

