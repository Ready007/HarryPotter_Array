

public class HarryPotterAssignment4 {

	public static void main(String[] args) {
		
		//for loop to print all data
		int[] movienumber = {1,2,3,4,5,6,7,8};
		String[]moviename = {"HP&the Philosopher's Stone", "HP&the Chamber of Secrets", "HP&the Prisoner of Azkaban", "HP&the Goblet of Fire", "HP&the Order of the Phoenix", "HP&the Half-Blood Prince", "HP&the Deathly Hallows – Part 1", "HP&the Deathly Hallows – Part 2"};
		int movieyear[] = {2001,2002,2004,2005,2007,2009,2010,2011};
		int i;
		for(i=0;i<movienumber.length;i++) {
			System.out.println("movie number: "+ movienumber[i]);
			System.out.println("movie name: "+moviename[i]);               
			System.out.println("year of release: "+movieyear[i]);
			System.out.println("\n");
		}
		}

}
