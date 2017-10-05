
import java.util.Scanner;
public class Multiplechoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String answer1;
		String answer2;
		String answer3;
		String answer4; 
		String answer5; 
		String answer6; 
		String answer7; 
		String answer8;
		String answer9;
		int answer10=0;
		int score=0;
		int right=0;
		
		
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
			right++;
		}else {
			System.out.println("Wrong!!! Better luck next time. Minus 5 points.");
			score-=5;
		}
		System.out.println("Your score: "+score+" \n");
		System.out.println("Question 2: What is the slowest animal on Earth? ");
		System.out.println("A: Turtle ");
		System.out.println("B: Snail ");
		System.out.println("C: Sloth ");
		System.out.println("D: Star Fish ");
		System.out.println("Your answer: ");
		answer2=in.nextLine();
		answer2=answer2.toUpperCase();
		if (answer2.equals("C")||answer2.equals("SLOTH")) {
			System.out.println("Wow good job! Plus 10 points.");
			score+=10;
			right++;
		} else {
			System.out.println("So close the answer was C. Minus 5 points.");
			score-=5;
		}
		System.out.println("Your score: "+score+" \n");
		System.out.println("Question 3: When did the first space shuttle fly?");
		System.out.println("A: 1981 ");
		System.out.println("B: 1984 ");
		System.out.println("C: 1986 ");
		System.out.println("D: 1990" );
		answer3=in.nextLine();
		answer3=answer3.toUpperCase();
		if (answer3.equals("A")|| answer3.equals("1981")) {
			System.out.println("What do you work for NASA or something. Plus 10 points for Gryffindor.");
			score+=10;
			right++;
		} else {
			System.out.println("Welp, atleast you tried. Minus 5 points. ");
			score-=5;
		}
		System.out.println("Your score: "+score+" \n");
		System.out.println("Now here is a real cruve ball. ");
		System.out.println("Question 4: Which movie made the most money ever?");
		System.out.println("A: Avengers: Age of Ultron");
		System.out.println("B: Star Wars: the force awakens");
		System.out.println("C: Titanic ");
		System.out.println("D: Avatar");
		answer4=in.nextLine();
		answer4=answer4.toUpperCase();
		if (answer4.equals("D")|| answer4.equals("AVATAR")) {
			System.out.println("Correct. Plus 10 points.");
			score+=10;
			right++;
		} else {
			System.out.println("Incorrect. Minus 5 points.");
			score-=5;
		}
		System.out.println("Your score: "+score+" \n");
		System.out.println("Question 5: What is the most expensive car made?");
		System.out.println("A: W Motors Lykan Hypersport");
		System.out.println("B: Koenigsegg CCXR Trevita ");
		System.out.println("C: Lamborghini Veneno");
		System.out.println("D: El Camino 1970");
		answer5=in.nextLine();
		answer5=answer5.toUpperCase();
		if (answer5.equals("B")|| answer5.equals("KOENIGSEGG CCXR TREVITA")) {
			System.out.println("Wow you must really know your cars. Plus 10 points.");
			score+=10;
			right++;
		} else {
			System.out.println("You win some you loss some, and you just LOST. Minus 5 points.");
			score-=5;
		}
		System.out.println("Your score: "+score+" \n");
		System.out.println("Question 6: How many canadian prime ministers have there been? ");
		System.out.println("A: 21");
		System.out.println("B: 25");
		System.out.println("C: 29");
		System.out.println("D: 30");
		answer6=in.nextLine();
		answer6=answer6.toUpperCase();
		if (answer6.equals("C")|| answer6.equals("30")) {
			System.out.println("Good one. Plus 10 points.");
			score+=10;
			right++;
		} else {
			System.out.println("Aren't you from Canada. Minus 5 points.");
			score-=5;
		}
		System.out.println("Your score: "+score+" \n");
		System.out.println("Question 7: How many cities is there on Earth?");
		System.out.println("A: 4,416");
		System.out.println("B: 4,687");
		System.out.println("C: 4,976");
		System.out.println("D: 5,213");
		answer7=in.nextLine();
		answer7=answer7.toUpperCase();
		if (answer7.equals("A")|| answer7.equals("4416")|| answer7.equals("4,416")) {
			System.out.println("Are you cheating? Correct plus 10 points.");
			score+=10;
			right++;
		} else {
			System.out.println("Wrong, like always. Minus 5 points.");
			score-=5;
		}
		System.out.println("Your score: "+score+" \n");
		System.out.println("Question 8: When was the first olympic games?");
		System.out.println("A: 1864");
		System.out.println("B: 1880");
		System.out.println("C: 1896");
		System.out.println("D: 1912");
		answer8=in.nextLine();
		answer8=answer8.toUpperCase();
		if (answer8.equals("C")|| answer8.equals("1896")) {
			System.out.println("*POP* Noice. Plus 10 points.");
			score+=10;
			right++;
		} else { 
			System.out.println("Wrong, Wrong, Wrong. Minus 5 points.");
			score-=5;
		}
		System.out.println("Your score: "+score+" \n");
		System.out.println("Question 9: How tall is the tallest man on Earth.");
		System.out.println("A: 7'9");
		System.out.println("B: 7'11");
		System.out.println("C: 8'1");
		System.out.println("D: 8'2");
		answer9=in.nextLine();
		answer9=answer9.toUpperCase();
		if (answer9.equals("8'1")|| answer9.equals("C") ) {
			System.out.println("Right again. Plus 10 points.");
			score+=10;
			right++;
		} else {
			System.out.println("Are you even trying. Wrong. Minus 5 points.");
			score-=5;
		}
		System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n Your not allowed to see you score for this question. ");
		System.out.println("Question 10: How many questions have you got wrong?");
		System.out.println("Your answer (Please use numbers):");
		answer10=in.nextInt();
		in.nextLine();
		if (answer10==right) {
			System.out.println("Good job you got it right. Plus 10 points.");
			score+=10;
		} else {
			System.out.println("Really that's the easiest question. Minus 5 points.");
			score-=5;
		}
		if (score==100) {
			System.out.println("Good Job you got everything correct. 10/10");
		} else {
			System.out.println("Try aiming for 10/10 out of ten next time ");
		}
		System.out.println("Finally score "+score+"");
	}

}
