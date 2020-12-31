public class InnerOuterArraysCheck {
    public static boolean LinearIn(int[] outer, int[] inner){

            boolean notFound;
            for(int i = 0; i < inner.length; i++)
            {
                notFound = true;
                for(int j=0; j < outer.length && notFound; j++)
                {
                    if(inner[i] == outer[j])
                        notFound = false;
                }
                if(notFound)
                    return false;
            }
            return true;
        }


    public static void main(String[] args) {
        int[] a={1, 2, 4, 6};
        int[] b={2, 4};
        System.out.println(LinearIn(a,b));
    }
}
