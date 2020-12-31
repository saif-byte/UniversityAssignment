public class findinstring {
    public static boolean find(String text, String s){
        if(text.length()<s.length()) return false;
        if(text.startsWith(s)) return true;
        return find(text.substring(1),s);
    }

    public static void main(String[] args) {
        System.out.println(find("cathartic","har"));
    }
}
