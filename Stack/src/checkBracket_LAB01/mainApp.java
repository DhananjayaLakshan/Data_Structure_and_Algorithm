package checkBracket_LAB01;
import java.util.*;

public class mainApp {

	public static void main(String[] args) {
		String input;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter code: ");
		input = sc.nextLine();
		
		bracketChecker bracketchecker = new bracketChecker(input);
		bracketchecker.checkB();
		
	}

}
//3+((6*2)-3