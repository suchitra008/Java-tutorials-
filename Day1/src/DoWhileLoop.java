import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		  //Accept a number from system input device i.e. keyboard, until user enter 0 
	      Double number, sum = 0.0;
	      Scanner input = new Scanner(System.in);
	      do {
	    	 System.out.print("Enter a number: ");
	    	 number = input.nextDouble();
	    	 sum += number;
	      } while (number != 0.0);
		   
	      System.out.println("Sum = " + sum);
	   }
	
}
