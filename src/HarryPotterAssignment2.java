import java.util.Scanner;

public class HarryPotterAssignment2 {

	public static void main(String[] args) {
		//If user enters input as 1 or 8 print ”First movie”or “Last movie”. For anything else, print “Not First or Last movie”
		System.out.println("Enter number either '1' or '8', I'll tell Harry's movie: ");
		Scanner EnterNumber = new Scanner(System.in);
		int MovieNumber = EnterNumber.nextInt();
		EnterNumber.close();
		
		if (MovieNumber == 1){
			System.out.println("First Movie");}
		else if (MovieNumber == 8){
			System.out.println("last Movie");}
		else {
		System.out.println("Not First or Last movie");}
		
	
			
		}
		
		
	}


