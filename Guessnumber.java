package guess_number;
import java.util.Scanner;
import java.util.Random;


public class Guessnumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		
		int targetnum=rand.nextInt(50)+1; //Random number generate;
		int guessnum=0;
		int attempts=0;
		
		System.out.println("Welcome to guess the number gamee!");
		System.out.println("I've picked number between 1 to 50");
		
		while(guessnum !=targetnum) {
			System.out.println("Enter the guess number: ");
			
			try {
				guessnum=scan.nextInt();
				attempts++;
				
				if(guessnum<targetnum) {
					System.out.println("To low try again!");
				}else if(guessnum>targetnum) {
					System.out.println("To high try again!");
				}else {
					System.out.println("Congratulations yow guess the number in "+ attempts+ "th attempts");
				}
			}catch (Exception e) {
					System.out.println("Enter the valid number");
					scan.next();
					}
				}
		scan.close();
	}
}
