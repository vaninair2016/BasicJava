package inheritenceDemo;

public class ImplementMountainCycle implements InterfaceBicycle{
	
	private int gear;
	private int Height;
	private int speed;
	public ImplementMountainCycle(int gear,int Height, int speed) {
		this.gear=gear;
		this.Height=Height;
		this.speed=speed;
	}
	
	public void setGear(int gear) {
		this.gear=gear;
		
	}
	public int getGear() {
		return gear;
		
	}

	@Override
    public void applyBrake(int decrement) {
    	speed=speed-decrement;
    }
    @Override
    public void speedUp(int increment) {
    	speed=speed+increment;
    }
	
	public static void main(String[] args) {
		ImplementMountainCycle im= new ImplementMountainCycle(2,10,12);
		System.out.println("Current gear is :" + im.gear);
		System.out.println("Current speed is :" + im.speed);
		im.applyBrake(3);
		System.out.println("Current speed is :" + im.speed);

	}

}
