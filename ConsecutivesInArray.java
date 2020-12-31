public class ConsecutivesInArray {
    public static boolean hasconsecutive(int[] a){
        boolean flag=false;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                if(a[i]+1==a[j]) flag=true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] a={8, 3, 17, 5, 1, 11, 13};
        System.out.println(hasconsecutive(a));
    }
}
