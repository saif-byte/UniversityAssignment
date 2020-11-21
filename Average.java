/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class Average {
    public static double average(int[] args){
    int count=0;
    int sum=0;
    
        if(args.length==0) {
            
            count=1;
        }
    for(int i=0;i<args.length;i++){
    sum=sum+args[i];
    count++;
    }
    
    return sum/count;
    }
    public static void main(String[] args){
    int[] nums={1,2,3,4};
        System.out.println(average(nums));
    }
    
}
