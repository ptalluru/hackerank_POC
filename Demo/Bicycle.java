public class Bicycle {
        
    private int cadence;
    private int gear;
    private int speed;
    private int id;
    private static int numberOfBicycles = 0;
        
    public Bicycle(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // increment number of Bicycles
        // and assign ID number
        id = ++numberOfBicycles;
    }

    // new method to return the ID instance variable
    public int getID() {
        return id;
    }

    public static void main(String...args) {
    	int b = new Bicycle(10,30,5).getID();
    	int b1 = new Bicycle(20,40,3).getID();
    	int b2 = new Bicycle(10,50,4).getID();
    	int b3 = new Bicycle(10,60,6).getID();
    	int b4 = new Bicycle(10,60,6).getID();
    	System.out.println(b);
    	System.out.println(b1);
    	System.out.println(b2);
    	System.out.println(b3);
    	System.out.println(b4);
    	System.out.println(Bicycle.numberOfBicycles);
    }
}



/*
 * public class Bicycle {
 * 
 * private int cadence; private int gear; private int speed;
 * 
 * private int id;
 * 
 * private static int numberOfBicycles = 0;
 * 
 * 
 * public Bicycle(int startCadence, int startSpeed, int startGear) { gear =
 * startGear; cadence = startCadence; speed = startSpeed;
 * 
 * id = ++numberOfBicycles; }
 * 
 * public int getID() { return id; }
 * 
 * public static int getNumberOfBicycles() { return numberOfBicycles; }
 * 
 * public int getCadence() { return cadence; }
 * 
 * public void setCadence(int newValue) { cadence = newValue; }
 * 
 * public int getGear(){ return gear; }
 * 
 * public void setGear(int newValue) { gear = newValue; }
 * 
 * public int getSpeed() { return speed; }
 * 
 * public void applyBrake(int decrement) { speed -= decrement; }
 * 
 * public void speedUp(int increment) { speed += increment; } }
 */