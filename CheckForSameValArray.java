public class CheckForSameValArray {
    public static boolean sameValues(int[]a ,int[] b){
        boolean flag=false;
        for (int i = 0; i <a.length ; i++) {
            if(!flag){
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j]) {
                    flag=true;
                    if(flag) break;
                }
            }}
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] a={1, 2,3};
        int[] b={1,2,3};
        System.out.println(sameValues(a,b));
    }
}
