/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class ArrayEqual {
    public static boolean ArrayEq(int[] args,int[] argh){
       
        
        if(args.length==argh.length){
                for(int i=0;i<args.length;i++){ 
                    if(args[i]!=argh[i])
                       return false;
                        
                }
                return true;
        }
          
        
     return false;
    }
    
    public static void main(String[] args){
    int[] array1={1,2,9,4,5};
    int[] array2={1,2,3,4,5};
    System.out.println(ArrayEq(array1,array2));
    
    
    }
}
