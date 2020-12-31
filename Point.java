public class Point {
    private  double p1,p2;
    public Point(double xO,double yO){
        p1=xO;
        p2=yO;

    }

    public double distanceTo(double x,double y){

        return Math.sqrt((p1-x)*(p1-x)+(p2-y)*(p2-y));

    }
    public String toString(){
        return "Point is: "+"("+p1+","+p2+")";
    }
    public int quadrant(){
        if (p1>0 && p2>0) return 1;
        else if (p1<0 && p2>0) return 2;
        else if(p1<0 && p2<0) return 3;
        else if(p1>0 && p2<0) return 4;
        return 0;
    }
    public void flip(){
        double c=-p1;
        p1=-p2;
        p2=c;

    }

    public static void main(String[] args) {
        Point p = new Point(4,17);


        System.out.println("Point is:" + p);
        System.out.println(p.quadrant());
        System.out.println("Distance to origin is:" +p.distanceTo(0,0));
        p.flip();
        System.out.println(p);


    }


}
