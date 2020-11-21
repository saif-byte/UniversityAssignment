public class RemoveX {
    public static String removex(String s){
        if(s.length()==0) return "";

        char c=s.charAt(0);
        if(s.charAt(0) == 'x')
            return removex((s.substring(1)));


        else
            return s.charAt(0)+removex(s.substring(1));

    }
    public static void main(String[] args){
        String s="xaxe";
        System.out.println(removex(s));
    }

}
