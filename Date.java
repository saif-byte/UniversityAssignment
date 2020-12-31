public class Date {
    public static String daterev(String s){
        String year="";
        String date="";
        String month="";
        for (int i = 6; i <= s.length()-1; i++) {
            year = year + s.charAt(i);
        }
        for (int i = 3; i <5 ; i++) {
            date=date+s.charAt(i);
        }
        for (int i = 0; i <2 ; i++) {
            month=month+s.charAt(i);
        }
        return year+date+month;
    }

    public static void main(String[] args) {
        String s="11/23/2020";
        System.out.println(daterev(s));
    }
}
