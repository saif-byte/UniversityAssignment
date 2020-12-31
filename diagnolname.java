public class diagnolname {
    public static void main(String[] args) {
        String sp= "";
        String s= "SAIF ULLAH KHAN";
        for (int i = 0; i <s.length() ; i++) {
            for (int j = 0; j >= i && j<s.length(); j++) {

                System.out.println(sp+s.charAt(j));
                sp+="  ";

            }

        }

        }
    }

