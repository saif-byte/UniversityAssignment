

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class PercentEven {
    public static int percenteven(int[] args) {
    int count=0;
    int totalcount=0;
        if(args.length==0){
        totalcount=1;
    }
    
        for(int i=0;i<args.length;i++){
        totalcount++;
        if(args[i]%2==0)
         count++;
    }
        int percentage=(count*100)/totalcount;
        return percentage;
}
    public static void main(String[] args){
    //int nums[]={1,2,3,5};
    int nums[]=new int[args.length];
    for(int i=0;i<args.length;i++){
     nums[i]=Integer.parseInt(args[i]);
    }
    double s=percenteven(nums);
    System.out.println(s);
    
    }
}
