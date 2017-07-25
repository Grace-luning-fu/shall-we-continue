Shall we continue?

Algorithm:

1. Prompt the user - "Would you like to continue?"

2. Get input from the user

3. Check for 3 things:

    a) Yes - y  - continue --- Re-prompt the user
    b) No - N - Quit
    c) Other - ... - Error Message
                                 Re-prompt


Pseudocode:

1.  Initialize String response to Null

2. Do 
         print "would you like to continue"
         scan input and store it as String response
             if response is not "y"  and not "n"
             print error message 
     while response is not "n"

3. End if the response is "n"
  



Java Code:

package ShallWeContinue;
import java.util.Scanner;

public class Continue {	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String response = null;
		// Do prompt at least once, if the response is "n", quit; if not, continue the loop. 
		// Within the loop, if the response is not "y" and not "n", print error message.
		do {
			System.out.println("Would you like to continue? y/n");
			Scanner scan = new Scanner(System.in);
			response= scan.nextLine(); 

	        if(!response.equalsIgnoreCase("y")&&!response.equalsIgnoreCase("n")){
				System.out.println("Error Message: input should be y/n");
			} 
			
			
			
		}while (!response.equalsIgnoreCase("n"));
		

	} 

}



