import java.util.Scanner;

public class Twitterizer_Tester {

	public static void main(String[] args) {
		Scanner keyboard_0 = new Scanner (System.in);
		System.out.println("What do you want to do?");
		System.out.println("To remove vowels from a sentence type VOWEL and press Enter");
		System.out.println("To reverse letters in a sentence type REVERSE and press Enter");
		System.out.print("Type your answer here: ");
		String answer = keyboard_0.next();
		
		if (answer.equals("VOWEL")){
			Twitterizer twitterizer_1 = new Twitterizer();
			Scanner keyboard_1 = new Scanner (System.in);
			System.out.print("Please enter the sentence in which you want to remove vowels: ");
			String longPost = keyboard_1.nextLine();
			System.out.println(twitterizer_1.shorten(longPost));
			keyboard_1.close();
			
			if (answer.equals("REVERSE")){
				Twitterizer twitterizer_2 = new Twitterizer();
				Scanner keyboard_2 = new Scanner (System.in);
				System.out.print("Please enter the sentence to be reversed: ");
				String post = keyboard_2.nextLine();
				System.out.println(twitterizer_2.reverse(post));
				keyboard_2.close();
			} 
		}
			else {
				System.out.println("Wrong answer");
			}
			
		
		keyboard_0.close();
		
	}

}
