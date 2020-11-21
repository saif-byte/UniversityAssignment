/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class RecSquare {
public static void draw(int n,double x,double y, double sz){
    
 if (n == 0) return;
 double x0 = x - sz,
  x1 = x + sz;
 double y0 = y - sz, 
  y1 = y + sz;
 draw(n-1,x1,y1,sz/2);
 draw(n-1,x1,y0,sz/2);
 draw(n-1,x0,y0,sz/2);
 draw(n-1,x0,y1,sz/2);
 
 StdDraw.setPenColor(StdDraw.BLACK);
 StdDraw.filledSquare(x, y, sz+0.005);
 StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
 StdDraw.filledSquare(x, y, sz);
}
 public static void main(String[] args)
 {
 int n = Integer.parseInt(args[0]);
 draw(n,.5,.5,.20); 
    
    }
    
}
