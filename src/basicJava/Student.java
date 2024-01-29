package basicJava;

public class Student {
	
	String name;
	int age;
	String Address;

	public Student(String name,int age,String Address) {
		
		this.name=name;
		this.age=age;
		this.Address=Address;
    }
	
	public void setName(String name) {//to set the name coming from main method
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setAddress(String Address) {
		this.Address=Address;
	}
	
	public String getName() {
		return name;
		
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddres() {
		return Address;
	}
	

	public static void main(String[] args) {
		Student s=new Student("Setu",20,"Arambol P.o, 243423");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getAddres());
	}

}
