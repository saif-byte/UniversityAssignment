
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class Stats {
    public static void main(String[] args){
    //int n=Integer.parseInt(args[0]);
    Scanner key=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=key.nextInt();
    
    int count=0;
    int sum=0;
    System.out.println("Enter a number: ");
    
    for(count=0;count<n;count++){    
    int k=StdIn.readInt();
    sum+=k;}
    //count++;}
    
    
    
    int avg=sum/count;
    System.out.println(avg);
    System.out.println(count);
            
    }
    
}
