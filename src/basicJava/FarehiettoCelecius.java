package basicJava;

import java.util.Scanner;

public interface FarehiettoCelecius {

	public static void main(String[] args) {
		 System.out.println("Enter Farenhiet in integer :");
      Scanner sc= new Scanner(System.in);
      int fh=sc.nextInt();
     
      double cel;
      cel=(fh-32)*5/9;
      System.out.println("Convered celcius :" +cel);
      sc.close();

	}

}
