package Accending_Append;

public class QueueX {
	
	private char[] queueArr;
	private int front;
	private int rear;
	private int maxSize;
	private int noItems;
	
	
	public QueueX(int s) {
		maxSize = s;
		queueArr = new char[maxSize];
		front = 0;
		rear = -1;
		noItems = 0;
	}
	
	public void insert(char c) {
		
		if(rear == maxSize -1)
			rear = -1;
			
		queueArr[++rear] = c;
		noItems++;
		
	}
	
	public char remove() {
		
		if(isEmpty()) {
			System.out.println("Queue is empty..");
			return '-';
		}else {
			
			char temp = queueArr[front++];
			
			if(front == maxSize) {
				front = 0;
			}
			noItems--;			
			return temp;
		}
		
	}
	
	public boolean iSFull() {
		return (noItems == maxSize);
	}
	
	public boolean isEmpty() {
		return (noItems == 0);
	}
	
}
