/**
 * If - Constructs
 * The if statements are executed from the top towards the bottom. As soon as the test expression is true, 
 * codes inside the body of that if statement is executed. Then, the control of program jumps outside if-else-if ladder.
 * 
 * If all test expressions are false, codes inside the body of else is executed.
 * 
 * @author suchitraravindran
 *
 */
public class Constructs {

		//This program find if number is neagtive or postive
		public static void main(String[] args) {  
			
		      int number = 0;
			 
		      if (number > 0) {
		         System.out.println("Number is positive.");
		      }
		      else if (number < 0) {
		         System.out.println("Number is negative.");
		      }
		      else {
		         System.out.println("Number is 0.");
		      } 
		   }
	
}
