public class Clump {
    public static int clump(int[] a){
        int cl=0;
        int ag=0;
        for (int i = 0; i <a.length-1 ; i++) {
            if(a[i]==a[i+1]){
                cl++;
                if(cl>=ag)//for largest number of occurrence
                ag=cl+1;
            }
            else {
                cl=0;
            }
        }
        return ag;
    }

    public static void main(String[] args) {
        System.out.println(clump(new int[]{1,1,1,2,3,4,5,6,6}));
    }
}
