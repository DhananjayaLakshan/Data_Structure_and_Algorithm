package Dscending_Order;

public class Stack {

	private char arrStk[];
	private int maxSize;
	private int top;
	
	public Stack(int size) {
		maxSize = size;
		arrStk = new char [maxSize];
		top = -1;		
	}
	
	public boolean isFull() {
		return (top == maxSize -1);
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public void push(char j) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}else {
			arrStk[++top] = j;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty...!!");
			return '-';
		}else {
			return arrStk[top--];
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty...!!");
			return '-';
		}else {
			return arrStk[top];
		}
	}
}
