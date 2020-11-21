public class RandomNum {
    public static void main(String[] args) {
        System.out.println("Enter number of random numbers: ");
        int n= StdIn.readInt();
        System.out.println("Enter range: ");
        int R= StdIn.readInt();
        for(int i=0;i<n;i++){
        double k= Math.random()*R +1;
        System.out.println(k);}
    }
}
