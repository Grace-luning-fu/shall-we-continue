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
