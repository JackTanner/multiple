
import java.util.Scanner;
public class Multiplechoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String answer1;
		String answer2;
		int score=0;
		
		
		System.out.println("Let's play a game, I'm going to ask a question and if you get it right you get points and if you get it wrong you lose 5 points(the points will go in the negitive)");
		System.out.println("There may also be bonus points on some questions");
		System.out.println("Question 1: What year was the first laptop invented?");
		System.out.println("A: 1979 ");
		System.out.println("B: 1981 ");
		System.out.println("C: 1984 ");
		System.out.println("D: 1990 ");
		System.out.println("Your answer: ");
		answer1=in.nextLine();
		answer1=answer1.toUpperCase();
		if (answer1.equals("B")|| answer1.equals("1981")) {
			System.out.println("You the man. Plus 10 points.");
			score+=10;
		}else {
			System.out.println("Wrong!!! Better luck next time.");
			score-=5;
		}
		System.out.println("Question 2: What is the slowest animal on Earth? ");
		System.out.println("A: Turtle ");
		System.out.println("B: Snail ");
		System.out.println("C: Sloth ");
		System.out.println("D: Star Fish ");
		
		
	}

}
