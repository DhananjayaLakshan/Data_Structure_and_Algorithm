package stack;

public class Stack {
	
	private char stkArr[];
	private int maxSize;
	private int top;
	
	public Stack(int size) {		
		maxSize = size;
		stkArr = new char[maxSize];
		top = -1;		
	}
	
	public void push(char a) {
		if(isFull()) {
			System.out.println("Array is full");
		}else {
			stkArr[++top]=a;
		}
	}	
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Array is Empty");
			return 'z';
		}else {
			return stkArr[top--];
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("Array is Empty");
			return 'z';
		}else {
			return stkArr[top];
		}
	}
	
	public boolean isEmpty() {		
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == maxSize-1);
	}
	

}
