public class ChangePi {
    public static String changePi(String str){
        if(str.startsWith("pi")){
            str=str.replace("pi","3.14");
            return str;
        }
        else if(str.length()<2) return str;
        else return str.charAt(0)+(changePi(str.substring(1)));

    }

    public static void main(String[] args) {
        System.out.println(changePi("xpix"));
    }
}
