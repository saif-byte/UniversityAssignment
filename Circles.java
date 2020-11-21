/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class Circles {
    public static void main(String[] args){
    double circles=Double.parseDouble(args[0]);
    double probablity=Double.parseDouble(args[1]);
    double radiusmin=Double.parseDouble(args[2]);
    double radiusmax=Double.parseDouble(args[3]);
    for(int i=0;i<circles;i++){
    double randomprobablity=Math.random();
    double randomx=Math.random();
    double randomy=Math.random();
    double radius=(Math.random()*(radiusmax-radiusmin))+radiusmin;
    if(randomprobablity<probablity) StdDraw.setPenColor(StdDraw.BLACK);
    else StdDraw.setPenColor(StdDraw.WHITE);
    StdDraw.filledCircle(randomx, randomy, radius);
    
    }
    }
    
}
