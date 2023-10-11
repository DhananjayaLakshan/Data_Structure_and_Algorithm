package StudentStack;

public class QueueX {
	
	private int[] queueArr;
	private int front;
	private int rear;
	private int maxSize;
	private int noItems;
	
	
	public QueueX(int s) {
		maxSize = s;
		queueArr = new int[maxSize];
		front = 0;
		rear = -1;
		noItems = 0;
	}
	
	
	public void insert(int j) {
		if(isFull()) {
			System.out.println("Queue is full..");
		}else {
			
			if(rear == maxSize -1)
				rear = -1;
			
			queueArr[++rear] = j;
			noItems++;
		}
	}
	
	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty..");
			return -1;
		}else {
			noItems--;
			int temp = queueArr[front++];
			
			if(front == maxSize) {
				front = 0;
			}
			
			return temp;
		}
	}
	
	public boolean isEmpty() {
		return (noItems == 0);
	}
	
	public boolean isFull() {
		return (noItems == maxSize);
	}

}
