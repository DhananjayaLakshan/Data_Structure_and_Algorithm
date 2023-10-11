package CirculorQueue;

public class Stack {	

		private int arrStk[];
		private int maxSize;
		private int top;
		
		public Stack(int size) {
			maxSize = size;
			arrStk = new int [maxSize];
			top = -1;		
		}
		
		public boolean isFull() {
			return (top == maxSize -1);
		}
		
		public boolean isEmpty() {
			return (top == -1);
		}
		
		public void push(int j) {
			if(isFull()) {
				System.out.println("Stack is Full");
			}else {
				arrStk[++top] = j;
			}
		}
		
		public int pop() {
			if(isEmpty()) {
				System.out.println("Stack is Empty...!!");
				return '-';
			}else {
				return arrStk[top--];
			}
		}
		
		public int peek() {
			if(isEmpty()) {
				System.out.println("Stack is Empty...!!");
				return '-';
			}else {
				return arrStk[top];
			}
		}
}



