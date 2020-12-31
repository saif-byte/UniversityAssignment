import java.util.Arrays;

public class PlayGround {
   public static boolean func(int[] a ){
       boolean flag=false;
       for (int i = 0; i <a.length ; i++) {
           for (int j = 0; j < a.length ; j++) {
               if(a[i]+1==a[j])
                  flag=true;
           }
       }
       return flag;
   }
    public static void main(String[] args) {
        int[] a= {8, 4, 9};
        System.out.println((func(a)));
    }
    }

