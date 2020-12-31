public class BracketsChecker {
    public static boolean bracketcheck(String s){
        int roundcount=0;
        int curlycount=0;
        int squarecount=0;
        for (int i = 0; i <=s.length()-1 ; i++) {
            if(s.charAt(i)=='(') roundcount++;
            else if(s.charAt(i)==')') roundcount--;
            else if(s.charAt(i)=='{') curlycount++;
            else if(s.charAt(i)=='}') curlycount--;
            else if(s.charAt(i)=='[') squarecount++;
            else if(s.charAt(i)==']') squarecount--;


        }
        return roundcount == 0 && curlycount == 0 && squarecount == 0;
    }

    public static void main(String[] args) {
        if(bracketcheck("[()]{}{[()()]()}")) System.out.println("Ok");
        else System.out.println("Wrong");
    }
}
