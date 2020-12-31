import java.util.Locale;

public class SimplyfyRepitition {
    public static String simplify(String s){
        if(s.length()==0) return s;
        if (s.length()==1) return s;
        else if(s.charAt(0)==s.charAt(1)){
            return simplify(s.substring(1));

        }
         else return s.charAt(0)+simplify(s.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(simplify("iiibba"));


    }
}
