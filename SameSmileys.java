public class SameSmileys {
    public static boolean smileys(String s,String t ){
        boolean flag=false;
        if(s.length()<t.length()){
         for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==':' && s.charAt(i+1)==')' && t.charAt(i)==':' && t.charAt(i+1)==')') {
                flag=true;
            }
        }}
        if(s.length()>t.length()){
            for (int i = 0; i <t.length() ; i++) {
                if(s.charAt(i)==':' && s.charAt(i+1)==')' && t.charAt(i)==':' && t.charAt(i+1)==')') {
                    flag=true;
                }
            }}


        return flag;
    }

    public static void main(String[] args) {
        System.out.println(smileys("hi:)there:)you", "12:)(123):)"));
    }
}
