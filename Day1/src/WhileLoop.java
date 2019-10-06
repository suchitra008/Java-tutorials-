/**
 * Program to find the sum of natural numbers from 1 to 100 using whileloop
 * @author suchitraravindran
 *
 */
public class WhileLoop {

	public static void main(String[] args) {
	      
	      int sum = 0, i = 100;
		   
	      while (i != 0) {
	         sum += i;     // sum = sum + i;
	         --i;
	         
	      }
	      System.out.println("Sum = " + sum);  
	     
	   }

}
