/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class SumTo {
    public static double sumto(int n){
    if (n==0) return 0;
    
    return sumto(n-1)+(1.0/n);
    
    }
    public static void main(String[] args){
    int n=4;
        System.out.println(sumto(n));
    
    }
}
