import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TripletSumArray {
    public static String tripsum(int[]a,int n){
        String s= "";
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length-1 ; j++) {
                if(a[i]+a[j]+a[j+1]==n){
                    s+= "( "+a[i]+" "+a[j]+" "+a[j+1]+" ) ";

                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] a={1, 6, 3, 0, 8, 4, 1, 7};
        System.out.println(tripsum(a,5));
    }
}
