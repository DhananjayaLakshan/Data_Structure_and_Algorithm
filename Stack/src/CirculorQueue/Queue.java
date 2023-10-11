package CirculorQueue;

public class Queue {
	
	private int []queArry;
	private int maxSize;
	private int front;
	private int rear;
	private int noItems;
	
	public Queue(int size) {
		maxSize = size;
		queArry = new int[maxSize];
		front = 0;
		rear = -1;
		noItems = 0;
	}
	
	public boolean isEmpty() {
		return (noItems == 0);
	}
	
	public boolean isFull() {
		return (noItems == maxSize);
	}
	
	public void insert(int j) {
		if(rear == maxSize -1) {
			System.out.println("Queue is Full");
		}else {
			
			if(noItems == maxSize) 
				rear = -1;
			
			queArry[++rear] = j;
			noItems++;
		}
	}
	
	public int remove() {
		if(noItems == 0) {
			System.out.println("Queue is empty");
			return -99;
		}else {
			noItems--;
			int temp = queArry[front++];
			if(front == maxSize)
				front = 0;
			return temp;		
		}
	}
	
	
	

}
