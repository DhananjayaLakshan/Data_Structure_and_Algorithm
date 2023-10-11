package Accending_Append;

public class StackX {
	
	private char[] stackArr;
	private int top;
	private int maxSize;
	
	public StackX(int s) {
		maxSize = s;
		stackArr = new char[maxSize];
		top = -1;
	}
	
	public void push(char j) {
		
		if(isFull()) {
			System.out.println("Stack is full.");
		}else {
			stackArr[++top] = j;
		}
		
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return '-';
		}else {
			return stackArr[top--];
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty.");
			return '-';
		}else {
			return stackArr[top];
		}
	}
	
	public boolean isFull() {
		return (top == maxSize -1);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	

}
