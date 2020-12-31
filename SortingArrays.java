public class SortingArrays {
    public static void sort(int[] a){
        int countzero=0;
        int countone=0;
        int counttwo=0;
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==0) {
                countzero++;
            }
            if(a[i]==1) {
                countone++;
            }
            if(a[i]==2) {
                counttwo++;
            }
        }
        for (int i = 0; i <countzero; i++) {
            a[i]=0;
            System.out.print(a[i]+" ");
        }
        for (int i = 0; i <countone ; i++) {
            a[i]=1;
            System.out.print(a[i]+" ");
        }
        for (int i = 0; i <counttwo ; i++) {
            a[i]=2;
            System.out.print(a[i]+" ");
        }
        }


    public static void main(String[] args) {
        int[] a= {0,1,2,0,1,0,2,1,0};
        sort(a);
    }
}
