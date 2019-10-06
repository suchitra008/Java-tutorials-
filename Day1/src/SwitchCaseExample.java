/**
 * 
 * @author suchitraravindran
 * The switch statement can a substitute for long if..else..if ladders which generally makes your code more readable.
 * The break statement terminates the execution of switch statement. The break statements are important because 
 * if they are not used, all statements after the matching case label are executed in sequence until the end of switch statement.
 */
public class SwitchCaseExample {
	
	public static void main(String[] args) {
	      int week = 4;
	      String day;
		        
	      switch (week) {
	         case 1:
	           day = "Sunday";
	           break;
	         case 2:
	           day = "Monday";
		   break;
	         case 3:
	           day = "Tuesday";
	           break;
	         case 4:
	           day = "Wednesday";
	           break;
	         case 5:
	           day = "Thursday";
	           break;
	         case 6:
	           day = "Friday";
	           break;
	         case 7:
	           day = "Saturday";
	           break;
	         default: 
	           day = "Invalid day";
	           break;
	      }
	      System.out.println(day);
	   }
}
