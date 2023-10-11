package Dscending_Order;

public class Queue {

	private char queue[];
	private int front;
	private int rear;
	private int noItems;
	private int maxSize;
	
	public Queue(int size) {
		maxSize = size;
		queue = new char[maxSize];
		front = 0;
		rear = -1;
		noItems = 0;
	}
	
	public boolean isEmpty() {
		return (noItems == 0);
	}
	
	public boolean isFull() {
		return (rear == (maxSize));
	}
	
	public void insert(char a) {
		if(isFull()) {
			System.out.println("Queue is Full...");
		}else{
			if(rear == maxSize-1) {
				rear = -1;
			}
			
			queue[++rear] = a;
			noItems++;
		}
	}
	
	public char remove() {
		if(noItems == 0) {
			System.out.println("Queue is Empty...!!");
			return '-';
		}else {
			
			noItems--;			
			char temp = queue[front++];
			
			if(front == maxSize) {
				front = 0;
			}
			
			return temp;
		}
	}
	
	
	
}
