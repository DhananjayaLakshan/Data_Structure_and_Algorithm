package queue;

public class QueueX {
	
	private int queueArr[];
	private int maxSize;
	private int front;
	private int rear;
	private int noItems;
	
	public QueueX(int size) {
		maxSize = size;
		queueArr = new int[maxSize];
		front = 0;
		rear = -1;
		noItems = 0; 
				
	}
	
	public void insert(int j) {
		if(isFull()) {
			System.out.println("Queue is Full...");
		}else {
			queueArr[++rear] = j;
			noItems++;
		}
	}
	
	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty...!!!");
			return -1;
		}else {
			noItems--;
			return queueArr[front++];
		}
	}
	
	public int peekFront() {
		if(isEmpty()) {
			System.out.println("Queue is empty...!!!");
			return -1;
		}else {
			return queueArr[front];
		}
	}
	
	public boolean isEmpty() {
		return (noItems == 0);
	}
	
	public boolean isFull() {
		return(rear == maxSize-1);
	}
}
