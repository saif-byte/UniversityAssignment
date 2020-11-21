/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class WriteChars {
    public static String writechars(int n){
   
   
       if (n%2==1) {
          if (n==1) return "*";
          return "<"+writechars(n-2)+">";
       }
       else {
       if (n==2) return "**";
       return "<"+writechars(n-2)+">";
       
       }
    
    }
    public static void main(String[] args){
        System.out.println(writechars(4));
    }
}
