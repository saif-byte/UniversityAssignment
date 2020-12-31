public class Quiz6 {

    public static boolean isSubSeqOf(int[] a, int[] b){
        for (int i = 0; i < b.length-a.length; i++) {
            int found=0;
            for (int j = 0; j <a.length ; j++) {
                if(b[i+j]==a[j]){
                    found++;
                }
            }
            if(found==a.length){
                return true;
            }
            
        }
        return false;
    }


    public static void main(String[] args) {
        int[] lst1 = {5, 2, 1};
        int[] lst2 = {4, 2, 3, 8, 0, 5, 2, 1, 9, 7};
        System.out.println(isSubSeqOf(lst1,lst2));
        int[] lst3 = {0,2,1};
        System.out.println(isSubSeqOf(lst3,lst2));
    }
}
