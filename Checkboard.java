/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class Checkboard {
public static void main(String[] args){
int n=Integer.parseInt(args[0]);
StdDraw.setXscale(0, n);
StdDraw.setYscale(0, n);
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    if((i+j)%2!=0) StdDraw.setPenColor(StdDraw.BLACK);
    else StdDraw.setPenColor(StdDraw.RED);         
     StdDraw.filledSquare(i+0.5, j+0.5, 0.5);
    }
}
}    
}
