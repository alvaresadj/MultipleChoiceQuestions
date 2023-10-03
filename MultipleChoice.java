import java.util.Scanner;

public class MultipleChoice {

public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String[] response = {"", "", "", ""};
	String[] answers = {"c", "b", "a", "d"};
	
	System.out.println("What is the capital of Ireland?");
	System.out.println("a) London");
	System.out.println("b) Paris");
	System.out.println("c) Dublin");
	System.out.println("d )Amsterdam");
	

	System.out.println("");
	System.out.println("Who has won the most French Opens in tennis history?");
	System.out.println("a) Novak Djokovic");
	System.out.println("b) Rafael Nadal");
	System.out.println("c) Roger Federer");
	System.out.println("d) Björn Borg ");
	
	System.out.println("");
	System.out.println("What is the fastest land mammal?");
	System.out.println("a) Cheetah");
	System.out.println("b) Lion");
	System.out.println("c) Gazelle");
	System.out.println("d) Wildebeats");
	
	System.out.println("");
	System.out.println("Who won the 2010 FIFA World Cup??");
	System.out.println("a) Netherlands");
	System.out.println("b) Germany");
	System.out.println("c) Uruguay");
	System.out.println("d) Spain");
	
    response[0] = scan.next();
	response[1] = scan.next();
	response[2] = scan.next();
	response[3] = scan.next();
	
	
	System.out.println(response[0]);
	System.out.println(response[1]);
	System.out.println(response[2]);
	System.out.println(response[3]);
	
	int score = 0;
	
	for(int i = 0; i < 4; i++) {
		if (response[i].equalsIgnoreCase(answers[i])) {
			score++;
		}
		
		System.out.println("Score: " + score + "/4");
	}
}




}
