/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class SquareWave {
public static double squarewave(double t,double n){
double v=0;
double sum=0;
  for(int i=0;i<=n*2;i++){
    if(i%2==1){
      v=(Math.sin(i*2*Math.PI*t))/i;
      sum +=v;
}
}
return (4/Math.PI)*sum;
} 
public static void main(String[] args){
    System.out.println(squarewave(0.25,2));
}
}
