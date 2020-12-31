public class Rational {
    public static int gcd(int p,int q){
        if(q==0) return p;
        else if(p>q){
            p=p%q;
            int g=0;
            for (int i = 2; i <=p ; i++) {
                if ((p%i==0)&&(q%i==0))
                    g=i;

            }
        return g;
        }
        else if(p<q){
            q=q%p;
            int g=0;
            for (int i = 2; i <=q ; i++) {
                if ((p%i==0)&&(q%i==0))
                    g= i;
            }
            return g;
        }
        return 1;
    }

    private final int p;
    private final int q;

    public Rational(int numerator, int denominator){
        p=numerator;
        q=denominator;
    }
    public double abs(){
        double newp=p;
        double newq=q;
        return (newp/newq);
    }
    public Rational negate(){
        return new Rational(-p, q);
    }
    public Rational plus(Rational b){
        return new Rational(p*b.q+q*b.p,q*b.q);
    }
    public Rational plusEq(Rational b){
        return new Rational(this.plus(b).p*b.q+this.plus(b).q*b.p,this.plus(b).q*b.q);
    }
    public Rational multiply(Rational b){
        return new Rational(p*b.p,q*b.q);
    }
    public Rational multiplyEq(Rational b){
        return new Rational(this.multiply(b).p*b.p,this.multiply(b).q*b.q);
    }
    public String toString(){
        return p+"/"+q;
    }

    public static void main(String[] args) {
        Rational a=new Rational(8,6);
        Rational b=new Rational(8,5);
        System.out.println("The double value is "+a.abs());
        System.out.println("The negated value is "+a.negate());
        System.out.println("The sum of a and b is "+a.plus(b));
        System.out.println("The sum of a,b and b is "+a.plusEq(b));
        System.out.println("The product of a and b is "+a.multiply(b));
        System.out.println("The product of a,b and b is "+a.multiplyEq(b));
        System.out.println("The rational number is "+a);
    }}
