package inheritenceDemo;

public class MountainBicycle extends Bicycle {
	
	int height;

	public MountainBicycle(int gear, int speed, int height) {
		super(gear, speed);
		this.height=height;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	public static void main(String[] args) {
		MountainBicycle mb = new MountainBicycle(1,10,10);
		System.out.println("Gear is : " +mb.gear);
		mb.brake(2);
		System.out.println("Speed is : " +mb.speed);
		
	}


}
