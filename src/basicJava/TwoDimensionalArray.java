package basicJava;

public class TwoDimensionalArray {

	public static void main(String[] args) {

     int arr[][]= { {1,2,3},{6,7,8},{5,9,7}};
     
     for (int i=0;i<3;i++) {
    	 for(int j=0;j<3;j++) {
    		 System.out.print("{" +arr [i][j]+"}" +" ");
    	 }
    	 System.out.println();
     }
    		
     

	}

}
