public class strCopies {
    private static int l;

    public static boolean strCopies(String str, String sub, int n){
        if(str.length()<sub.length()) return false;
        if(str.startsWith(sub)){
            n--;
            return strCopies(str.substring(1),sub,n);

        }
        if (n==0) return true;
        else return strCopies(str.substring(1),sub,n);


    }

    public static void main(String[] args) {
        System.out.println(strCopies("catcowcat", "cat", 2));
    }
}
