package StudentStack;

public class StackX {

	private int maxSize;
	private int[] stackArr;
	private int top;
	
	public StackX(int size) {
		maxSize = size;
		stackArr = new int[maxSize];
		top = -1;
	}
	
	public void push(int j) {
		if(isFull()) {
			System.out.println("Stack is full");
		}else {
			stackArr[++top] = j;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty...");
			return -1;
		}else {
			return stackArr[top--];
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty...");
			return -1;
		}else {
			return stackArr[top];
		}
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize -1);
		
	}
}
