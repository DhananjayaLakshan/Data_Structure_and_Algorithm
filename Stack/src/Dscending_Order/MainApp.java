package Dscending_Order;
import java.util.*;

public class MainApp {

	public static void main(String[] args) {
		
		int size = 5;
		
		Stack stackArr =  new Stack(size);
		Queue queueArr = new Queue(size);
		
		Scanner sc = new Scanner(System.in); 
		
		for (int i = 0; i < size; i++) {
			System.out.print("Enter character : ");
			char c = sc.next().charAt(0);
			queueArr.insert(c);
		}
		
		while(!queueArr.isEmpty()) {
			
			stackArr.push(queueArr.remove());
		}
		
		while (!stackArr.isEmpty()) {			
			queueArr.insert(stackArr.pop());
		}
		
		while(!queueArr.isEmpty()) {			
			System.out.print(queueArr.remove() + " ");
		}
		
	}

}
