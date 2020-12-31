public class CarnivalRide {
    private final String name;
    private final int capacity;
    private final boolean isKiddieRide;
    private  int numTickets;
    public CarnivalRide(String ridename, int maxriders, boolean forchildren  ){
        name=ridename;
        capacity=maxriders;
        isKiddieRide=forchildren;

    }
   public int getTotal(){
        return numTickets;
   }
   public void loadRiders(int n){
        if (n<0) numTickets=0;
        if (isKiddieRide){
           numTickets=n;

        }
        else {
            numTickets=3*n;

        }

   }

    public static void main(String[] args) {
        CarnivalRide mine= new CarnivalRide("rollercoaster", 2, false);
        mine.loadRiders(3);
        System.out.println("The total number of tickets sold for ride '"+mine.name+"' are "+mine.getTotal());

    }
}
