package basicJava;

public class ConstructorSample {
	
	int height;
	int width;
	int depth;
	
//	ConstructorSample(int height,int width, int depth){// constructor initialization with 3 arguements 
//		this.height=height;//this.height represents the attribute of the class and height is the parameter coming thru
//		this.width=width;// we are assigning what is coming thru from parameter as the value of the class attrivute
//		this.depth=depth;//this represents the current class 
//	}
//	
//	ConstructorSample(int height,int width){//constructor with 2 parameters
//		this.height=height;
//		this.width=width;
//		depth=10;//defaulting the value of depth to a constant
//	}
	
	int volume() {
		return height*width*depth;
	}

	public static void main(String[] args) {
		int volume; 
		ConstructorSample cs1=new ConstructorSample();
		volume=cs1.volume();
		System.out.println("Volume of 3 parameterized cuboid is : " +volume);
		

	}

}
