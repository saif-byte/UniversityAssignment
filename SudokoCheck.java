/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class SudokoCheck {
static int k=0;
public static boolean Check(int[][] a){
for(int i=0;i<a.length;i++){
   for(int j=0;i<a.length;j++){
     if(a[i][j]<1 || a[i][j]>9 || !isvalid(i,j,a))
         return false;
}

}
return true;
}
public static boolean isvalid(int i,int j,int[][] a){
 //to check row wise
 for(int row=0;row<a.length;row++){
 if(row!=i && a[row][j]==a[i][j]){
  return false;
 }}
 //to check column wise
 for(int column=0;column<a.length;column++){
 if(column!=j && a[i][column]==a[i][j]){
  return false;
 }}
 //to check grid wise
 for(int row=(i/3)*3;row < ((i/3)*3+3);row++){
     for(int column=(i/3)*3;column < ((i/3)*3+3);column++){
 
       if(!(column==j && row==i) && a[i][j]==a[row][column]){
        return false;
 }
 }

}return true;
 }

public static void main(String[] args){
  int[][] a = {
{5, 3, 4, 6, 7, 8, 9, 1, 2},
{6, 7, 2, 1, 9, 5, 3, 4, 8},
{1, 9, 8, 3, 4, 2, 5, 6, 7},
{8, 5, 9, 7, 6, 1, 4, 2, 3},
{4, 2, 6, 8, 5, 3, 7, 9, 1},
{7, 1, 3, 9, 2, 4, 8, 5, 6},
{9, 6, 1, 5, 3, 7, 2, 8, 4},
{2, 8, 7, 4, 1, 9, 6, 3, 5},
{3, 4, 5, 2, 8, 6, 1, 7, 9} };
    if(Check(a))
        System.out.println("This is  valid");
    else System.out.println("This is not valid");

}
}
