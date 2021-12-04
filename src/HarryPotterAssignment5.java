
public class HarryPotterAssignment5 {

	public static void main(String[] args) {
		int[] movienumber = {1,2,3,4,5,6,7,8};
		String[]moviename = {"HP&the Philosopher's Stone", "HP&the Chamber of Secrets", "HP&the Prisoner of Azkaban", "HP&the Goblet of Fire", "HP&the Order of the Phoenix", "HP&the Half-Blood Prince", "HP&the Deathly Hallows – Part 1", "HP&the Deathly Hallows – Part 2"};
		int movieyear[] = {2001,2002,2004,2005,2007,2009,2010,2011};
	
		for(int num:movienumber) {
			System.out.println(""+num);
			System.out.println(""+moviename[num-1]);                        //for each loop to print all data
			System.out.println(""+movieyear[num-1]);
		}
	}

}
