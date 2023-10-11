package Accending_Append;
import java.util.*;

public class mainApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		StackX charStack = new StackX(5);
		QueueX charQueue = new QueueX(10);
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter character : ");
			char c = sc.next().charAt(0);
			charStack.push(c);
			charQueue.insert(c);
		}
		
		while(!charStack.isEmpty()) {
			charQueue.insert(charStack.pop());
		}
		
		while(!charQueue.isEmpty()) {
			System.out.print(charQueue.remove() + " ");
		}
		
	}

}
