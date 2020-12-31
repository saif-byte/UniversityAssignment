public class Quiz3 {
    public static String mySubstring(String s, int i ,int j){
        String newstr = " ";
        for (int k = i; k <j ; k++) {
            newstr=newstr+s.charAt(k);

        }
        return newstr;
    }



    public static void main(String[] args) {
        String s=args[0];
        int i=Integer.parseInt(args[1]);
        int j=Integer.parseInt(args[2]);
        System.out.println( mySubstring(s , i ,j));

    }
}
