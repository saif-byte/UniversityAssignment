import java.util.Arrays;
import java.util.Scanner;

public class Matrix {

    private final int[][] element;

    public Matrix(int[][] e){
        element=e;
    }
    public int getRows(){
        return element.length;
    }
    public int getColumns(){
        return element[0].length;
    }
    public int[][] setElement(int s,int i, int j){
        element[i][j]=s;
        return element;
    }
    public int[][] addMatrix(int[][] newmat){
        int[][] anothermatrix = new int[newmat.length][newmat[0].length];
        if (element.length== newmat.length && element[0].length==newmat[0].length) {

            for (int i = 0; i < newmat.length; i++) {
                for (int j = 0; j < newmat[0].length; j++) {
                    anothermatrix[i][j]= element[i][j]+newmat[i][j];
                }
            }
        }
        return anothermatrix;
    }
    public int[][] mulyiplyMatrix(int[][] m){
        int[][] a={{0,0}};
        if(element[0].length == m.length){
            int[][] newmat= new int[element.length][m[0].length];
            for (int i = 0; i <newmat.length-1 ; i++) {
                for (int j = 0; j <newmat[0].length-1 ; j++) {
                    newmat[i][j]= (element[i][j]*m[i][j])+(element[i][j+1]*m[i+1][j]);
                }
            }
        return newmat;
        }
        return a;

    }
    public String toString(){
        return Arrays.deepToString(element);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Kindly enter number of rows");
        int i= sc.nextInt();
        System.out.println("Kindly enter number of columns");
        int j= sc.nextInt();
        System.out.println("Kindly enter the matrix");
        int[][] a=  new int[i][j];
        while (sc.hasNextInt()){
            for (int k = 0; k <i ; k++) {
                for (int l = 0; l < j; l++) {
                    a[k][l]= sc.nextInt();
                }
            }

        }
        Matrix m= new Matrix(a);
        System.out.println(m.getRows());
        System.out.println(Arrays.deepToString(m.addMatrix(a)));
        System.out.println(Arrays.deepToString(m.mulyiplyMatrix(a)));
    }
}
