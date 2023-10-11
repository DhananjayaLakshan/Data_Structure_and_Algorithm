package queue;
import java.util.*;

public class mainApp {

	public static void main(String[] args) {
		
		QueueX mainQueue = new QueueX(5);
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		for (int i = 1; i <= 5; i++) {			
			System.out.print("Enter transaction ID " + i + ": ");
			input = sc.nextInt();			
			
			mainQueue.insert(input);
		}	

		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue  = new QueueX(5);
		
		int value;
		
		while(!mainQueue.isEmpty()) {
			
			value = mainQueue.remove();
			
			if(value%2 == 0) {
				evenQueue.insert(value);
			}else {
				oddQueue.insert(value);
			}	
		}
		
		System.out.println();
		System.out.println("PC1");
		while(!evenQueue.isEmpty()) {
			System.out.println("Transaction " + evenQueue.remove());
		}
		
		System.out.println();
		System.out.println("PC2");
		while(!oddQueue.isEmpty()) {
			System.out.println("Transaction " + oddQueue.remove());
		}
		
	}

}
