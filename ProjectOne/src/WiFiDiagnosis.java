import java.util.Scanner;
public class WiFiDiagnosis {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String ans = "";
		boolean compleated = false;
		
		//Has the use try disconnecting and reconnecting to fix wifi connection
		System.out.println("Disconnect and reconnect to your wifi\nAre you able to connect with the internet?(yes or no)");
		ans = scan.nextLine();
		ans = ans.replaceAll("\\s", "");
		//Chech's to make sure that the use is imputing a yes or no response regardless of caps
		while(!ans.equalsIgnoreCase("no") && !ans.equalsIgnoreCase("yes")) 
		{
			System.out.println("Please respond with yes or no");
			ans = scan.nextLine();
			ans = ans.replaceAll("\\s", "");
		}
		//Checks to see if the user replied with "yes"
		if(ans.equalsIgnoreCase("yes")) 
		{
			System.out.println("Reconnecting to the wifi seemed to work");
			compleated = true;
		}
		
		//Checks to make sure that the user has not yet fixed their internet
		if(!ans.equalsIgnoreCase("yes")) 
		{
			//resets the answer to prepare for the next question
			ans = "";
			//Asks the user to reboot their computer
			System.out.println("Reboot your computer\nAre you able to connect with the internet?(yes or no)");
			ans = scan.nextLine();
			ans = ans.replaceAll("\\s", "");
			//checks to make sure that the user response with a yes or no answer
			while(!ans.equalsIgnoreCase("no") && !ans.equalsIgnoreCase("yes")) 
			{
				System.out.println("Please respond with yes or no");
				ans = scan.nextLine();
				ans = ans.replaceAll("\\s", "");
			}
		}
		//checks to make sure the user fixed their internet connection and that it was because they rebooted their computer
		if(ans.equalsIgnoreCase("yes") && !compleated) 
		{
			System.out.println("Rebooting your computer seemed to work");
			compleated = true;
		}
		
		//Checks to make sure that the user has not yet fixed their internet
		if(!ans.equalsIgnoreCase("yes")) 
		{
			//resets the answer to prepare for the next question
			ans = "";
			//Ask the user to check cable connections
			System.out.println("Make sure the cables to your router are plugged in firmly and your router is getting power\nAre you able to connect with the internet?(yes or no)");
			ans = scan.nextLine();
			ans = ans.replaceAll("\\s", "");
			//checks to make sure that the user response with a yes or no answer
			while(!ans.equalsIgnoreCase("no") && !ans.equalsIgnoreCase("yes")) 
			{
				System.out.println("Please respond with yes or no");
				ans = scan.nextLine();
				ans = ans.replaceAll("\\s", "");
			}
		}
		//checks to make sure the the user fixed their internet connection and that it was because of cable connection 
		if(ans.equalsIgnoreCase("yes") && !compleated) 
		{
			System.out.println("A cable was probably loose");
			compleated = true;
		}
		
		//Checks to make sure that the user has not yet fixed their internet
				if(!ans.equalsIgnoreCase("yes")) 
				{
					//resets the answer to prepare for the next question
					ans = "";
					//Ask the user to move their computer closer to their router 
					System.out.println("Move the computer closer to the router and try to connect\nAre you able to connect with the internet?(yes or no)");
					ans = scan.nextLine();
					ans = ans.replaceAll("\\s", "");
					//checks to make sure that the user response with a yes or no answer
					while(!ans.equalsIgnoreCase("no") && !ans.equalsIgnoreCase("yes")) 
					{
						System.out.println("Please respond with yes or no");
						ans = scan.nextLine();
						ans = ans.replaceAll("\\s", "");
					}
				}
				//checks to make sure the the user fixed their internet connection and that it was because they moved their computer closer to their router
				if(ans.equalsIgnoreCase("yes") && !compleated) 
				{
					System.out.println("Moving your computer closer to the router must of worked");
					compleated = true;
				}
		
		//Checks to make sure that the user has not yet fixed their internet
				if(!ans.equalsIgnoreCase("yes")) 
				{
					
					//tell the user to contact their ISP
					System.out.println("Contact your ISP\nMake sure your ISP is hooked up to your router.");
				}
	}

}
