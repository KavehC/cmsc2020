import java.util.Scanner;

public class MovieDriver {

	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		Movie movie = new Movie();
		
		String ans = "";
		
		do{
			System.out.println("Please enter the name of the movie: ");
			movie.setTitle(scan.nextLine());
		
			System.out.println("Please enter the movies rating: ");
			movie.setRating(scan.nextLine());
		
			System.out.println("Please enter the number of tickets sold: ");
			movie.setSoldTickets(scan.nextInt());
		
			System.out.println(movie.toString());
			
			System.out.println("Do you want to enter another movie? (y or n)");
			ans = scan.nextLine();
			ans = scan.nextLine();
			
		}while(ans.equalsIgnoreCase("y"));
		
		System.out.println("Goodbye");
	}
}
