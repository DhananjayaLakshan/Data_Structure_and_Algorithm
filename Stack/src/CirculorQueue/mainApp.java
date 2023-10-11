package CirculorQueue;


public class mainApp {

	public static void main(String[] args) {
		
		int size = 10;
		
		Queue que = new Queue(size);
		Stack stk = new Stack(size);
		Queue qu1 = new Queue(size);
		
		que.insert(1);
		que.insert(2);
		que.insert(3);
		que.insert(4);
		que.insert(5);
		
		while(!que.isEmpty()) {
			stk.push(que.remove());
		}
		
		while(!stk.isEmpty()) {
			que.insert(stk.pop());
		}
		
		qu1.insert(1);
		qu1.insert(2);
		qu1.insert(3);
		qu1.insert(4);
		qu1.insert(5);
		
		while(!qu1.isEmpty()) {
			System.out.print(qu1.remove() +  " ");
		}
		while(!que.isEmpty()) {
			System.out.print(que.remove() +  " ");
		}
		
		
		
		
		
		
	}

}
