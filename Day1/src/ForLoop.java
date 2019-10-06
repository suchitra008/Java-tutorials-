/**
The initialization expression is executed only once.
Then, the test expression is evaluated. Here, test expression is a boolean expression.
If the test expression is evaluated to true,
Codes inside the body of for loop is executed.
Then the update expression is executed.
Again, the test expression is evaluated.
If the test expression is true, codes inside the body of for loop is executed and update expression is executed.
This process goes on until the test expression is evaluated to false.
If the test expression is evaluated to false, for loop terminates.
 * @author suchitraravindran
 *
 */
public class ForLoop {

	// Find sum of numbers till 1000
	public static void main(String[] args) {
	      
	      int sum = 0;
		   
	      for (int i = 1; i <= 1000; ++i) {
	         sum += i;     // sum = sum + i
	      }
		   
	      System.out.println("Sum = " + sum);
	   }
}
