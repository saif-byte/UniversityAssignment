/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class MaxSpan {
    public static int maxspan(int[] a){
    int count=0;
    for(int i=0;i<a.length;i++){
     for (int j=a.length-1;j>=0;j--){
         if(a[i]==a[j]){
         count=j-i+1;
         
         return count;
         
         }break;
     
     }
    }return count;
    
    }
    public static void main(String[] args){
    int[] a={1, 2, 1, 1, 3};
    System.out.println(maxspan(a));
    }
}
