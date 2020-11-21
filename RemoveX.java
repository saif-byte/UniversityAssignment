/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class RemoveX {
public static String removex(String s){
if(s.length()==1) return s;
char c = s.charAt(s.length()-1);
if("x".equals(Character.toString(c))) return (s.substring(0, s.length()-1));

//if(!("x".equals(Character.toString(c)))) //return s;
else return removex(s.substring(0, s.length()-1));

}    
public static void main(String[] args){
String s="abcxtrxe";
System.out.println(removex(s));
}
}
