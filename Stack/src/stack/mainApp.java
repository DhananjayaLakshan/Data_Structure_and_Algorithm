package stack;

public class mainApp {

	public static void main(String[] args) {
		
		Stack stk = new Stack(5);
		
		stk.push('a');
		stk.push('b');
		stk.push('c');
		stk.push('d');
		stk.push('e');//a,b,c,d,e
		stk.push('f');
		
		while(!stk.isEmpty()) {
			System.out.print(stk.pop() + " ");//e,d,c,b,a
		}		
	}

}
