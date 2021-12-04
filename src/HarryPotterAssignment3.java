import java.util.Scanner;

public class HarryPotterAssignment3 {

	public static void main(String[] args) {
  
		System.out.println("Enter Movie number, Harry Potter Movie name, and year: ");
		Scanner input = new Scanner(System.in);
		
		System.out.println(input.nextInt()+" is the Number "+ input.next() + " is the movie name " + input.nextInt() + " is the release year");
       input.close();
		//Store all the data into respective arrays.
				String HarryMovieName[] = {"HP&the Philosopher's Stone", "HP&the Chamber of Secrets", "HP&the Prisoner of Azkaban", "HP&the Goblet of Fire", "HP&the Order of the Phoenix", "HP&the Half-Blood Prince", "HP&the Deathly Hallows – Part 1", "HP&the Deathly Hallows – Part 2"};
				int HarryMovieYear[] = {2001,2002,2004,2005,2007,2009,2010,2011};
				
				for (int i=0; i<HarryMovieYear.length; i++) {
					System.out.print(HarryMovieYear[i]);

	          for( int j=0; j<HarryMovieName.length; j++) {
	        	  System.out.println( HarryMovieName[j]);
	        	  
	          }}
	         
}}
