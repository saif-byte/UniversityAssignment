/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class Square {
    public static void main(String[] args) {

        // number of line segments to plot
        int n = Integer.parseInt(args[0]);

        // the function y = sin(4x) + sin(20x), sampled at n+1 points
        // between x = 0 and x = pi
        double[] x = new double[n+1];
        double[] y = new double[n+1];
        for (int i = 0; i <= n; i++) {
            for(int t=0; t<=Math.PI*6;t++){
            x[i] =Math.PI * i / n;
            y[i] =SquareWave.squarewave(0.25, t);
        }}

        // rescale the coordinate system
        //StdDraw.setXscale(0,Math.PI);
        //StdDraw.setYscale(-2.0, +2.0);

        // plot the approximation to the function
        for (int i = 0; i < n; i++) {
            StdDraw.line(x[i], y[i], x[i+1], y[i+1]);
        }
    }
}
