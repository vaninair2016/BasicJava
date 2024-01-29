package inheritenceDemo;

public class Bicycle {
	
	protected int gear;
	protected int speed;
	
	public Bicycle(int gear, int speed) {
		this.gear=gear;
		this.speed=speed;
	}
	
	public void setGear(int gear) {
		this.gear=gear;
	}
    protected void brake(int decrement) {
    	speed-= decrement;
    }
    protected void speedUp(int increment) {
    	speed+= increment;
    }
  
}
