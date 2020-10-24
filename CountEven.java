public class CountEven{
  public static void main(String[] args){
    //int n=Integer.parseInt(args[0]);
	int[] a=new int[args.length];
	int count=0;
	for(int i=0;i<a.length;i++){
	  a[i]=Integer.parseInt(args[i]);
      if(a[i]%2==0){
      count++;		  
	 }
  }  System.out.println(count);
}

}
