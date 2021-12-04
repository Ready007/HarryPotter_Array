import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HarryPotterAssignment1 {

	public static void main(String[] args) {
		
		String Name[] = {"HP&the Philosopher's Stone", "HP&the Chamber of Secrets", "HP&the Prisoner of Azkaban", "HP&the Goblet of Fire", "HP&the Order of the Phoenix", "HP&the Half-Blood Prince", "HP&the Deathly Hallows – Part 1", "HP&the Deathly Hallows – Part 2"};
				int Year[] = {2001,2002,2004,2005,2007,2009,2010,2011};
				
				// How many years elapsed between first and last movie of Harry Potter? 
				int FirstMovieIndex = Arrays.asList(Name).indexOf("HP&the Philosopher's Stone");
				System.out.println("HP&the Philosopher's Stone movie index is: "+FirstMovieIndex);
				int FirstMovieYear = Year[FirstMovieIndex];
				System.out.println("HP&the Philosopher's Stone movie release Year is: "+ FirstMovieYear );
				
				int LastMovieIndex = Arrays.asList(Name).indexOf("HP&the Deathly Hallows – Part 2");
				System.out.println("HP&the Deathly Hallows – Part 2 index is: "+LastMovieIndex);
				int LastMovieYear = Year[LastMovieIndex];
				System.out.println("HP&the Deathly Hallows – Part 2 movie release Year is: "+ LastMovieYear );
				
				int Difference = (LastMovieYear - FirstMovieYear);
				System.out.println("years difference between first and last movie of Harry Potter: "+ Difference);
				
				//Approximate years for a movie release 
				int NoOfMovies = Array.getLength(Name);
				System.out.println("Total no of Harry Potter movies are: "+NoOfMovies);
				int Approx_years = Difference / NoOfMovies;
				System.out.println("Approximate years for a movie release: "+ Approx_years);
				
				//Get a number as input from user and print the name of the movie.
				Scanner EnterYear = new Scanner(System.in);
				System.out.println("Enter the number of movie, I'll tell the movie name : ");
				int MovieYear= EnterYear.nextInt();
				EnterYear.close();

				switch (MovieYear) {
				case 2001:
				System.out.println("Movie is  Harry Potter and the Philosopher's Stone");
				break;
				case 2002:
				System.out.println("Movie is Harry Potter and the Chamber of Secrets");
				break;
				case 2004:
				System.out.println("Movie is Harry Potter and the Prisoner of Azkaban");
				break;
				case 2005:
				System.out.println("Movie is Harry Potter and the Goblet of Fire");
				break;
				case 2007:
				System.out.println("Movie is Harry Potter and the Order of the Phoenix");
				break;
				case 2009:
				System.out.println("Movie is Harry Potter and the Half-Blood Prince");
				break;
				case 2010:
				System.out.println("Movie is Harry Potter and the Deathly Hallows – Part 1");
				break;
				case 2011:
				System.out.println("Movie is Harry Potter and the Deathly Hallows – Part 2");
				break;
				
				
		}

		}}

		