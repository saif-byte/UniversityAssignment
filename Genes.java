public class Genes{
public static String gene(String dna){
    if(dna.length()==0) return "";
    int start=dna.indexOf("ATG");

    String k="";
    String t=dna.substring(start);
    for (int i = 0; i <t.length() ; i++) {
        if((t.charAt(i)=='T'&&t.charAt(i+1)=='A' && t.charAt(i+2)=='G') || (t.charAt(i)=='T'&&t.charAt(i+1)=='A' && t.charAt(i+2)=='A') || (t.charAt(i)=='T'&&t.charAt(i+1)=='G' && t.charAt(i+2)=='A')){
            k=t.substring(0,i-1);

            if(k.length()%3==0){
                return k;

            }
        }
    }
  return k;
}

    public static void main(String[] args) {
        System.out.println(gene("ATAGATGCATAGCGCATAGCTAGATGTGCTGAC"));
    }
}