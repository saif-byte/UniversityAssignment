/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USMANULLAH KHAN
 */
public class Triangle {
public static void drawtriangle(double[] args){
double x=args[0];
double y=args[1];
double s=args[2];

StdDraw.line(x, y+Math.sqrt(3)/2*s,x - s/2, y - Math.sqrt(3)/6 * s);
StdDraw.line(x - s/2, y - Math.sqrt(3)/6 * s, x + s/2, y - Math.sqrt(3)/6 * s );
StdDraw.line( x + s/2, y - Math.sqrt(3)/6 * s ,x, y+Math.sqrt(3)/2*s);
//x=args[0]-0.1;
//y=args[1]+0.1;

}
  
public static void main(String [] args){
double[] parameters=new double[args.length];
for(int i=0;i<parameters.length;i++){
    parameters[i]=Double.parseDouble(args[i]);
   
}

for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.02;
    
  //parameters[i]=Double.parseDouble(args[i])+0.1;
  
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.04;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.06;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.08;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.1;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.12;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.14;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.16;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.18;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.2;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.22;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.24;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.26;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.28;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.3;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.32;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.34;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.36;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.38;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.4;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.42;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.44;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.46;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.48;
      
  
    
    drawtriangle(parameters);
}
for(int i=0;i<parameters.length;i++){
   

    if(i==2) parameters[i]=Double.parseDouble(args[i])+0.5;
      
  
    
    drawtriangle(parameters);
}


}
}
