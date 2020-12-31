public class MaxAndMinDiffArray {
    public static String max(int[] a){
        int max=0;
        String s = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a.length ; j++) {
                if(Math.abs(a[i]-a[j])>max){
                    max= Math.abs(a[i]-a[j]);
                    s= "Two numbers with max difference are "+a[i]+" and "+a[j];
                }
            }
        }
        return s;
    }
    public static String min(int[] a){
        int min=Math.abs(a[0]-a[1]);
        String s = "";
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length && j!=i; j++) {
                if(Math.abs(a[i]-a[j])<=min){
                    min=Math.abs(a[i]-a[j]);
                    s="Two numbers with max difference are "+a[i]+" and "+a[j];
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] a ={4,3,76,11,7};
        System.out.println(max(a));
        System.out.println(min(a));
    }
}
