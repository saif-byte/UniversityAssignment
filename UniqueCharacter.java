public class UniqueCharacter {
    public static String uniquechar(String s){
        int count=0;
        for (int i = 0; i <=s.length()-1 ; i++) {
            for (int j = 0; j <=s.length()-1 ; j++) {
                if(s.charAt(i)==s.charAt(j)) count++;
            }
        if (count==1) return s.charAt(i)+"";
        count=0;
        }
    return "";
    }

    public static void main(String[] args) {
        String s="ABCDBADDAB";
        System.out.println(uniquechar(s));
    }
}
