package checkBracket_LAB01;

import stack.Stack;

public class bracketChecker {

	private String inputStr;
	
	public bracketChecker(String in) {
		inputStr = in;
	}
	
	public void checkB() {
		int size = inputStr.length();
		Stack Bstack = new Stack(size);
		
		for (int i = 0; i < size; i++) {
			
			if(inputStr.charAt(i) == '(') {
				Bstack.push('(');
			}else if(inputStr.charAt(i) == ')') {
				Bstack.pop();
			}
		}
		
		if(!Bstack.isEmpty()) {
			System.out.println("Invalid string");
		}else {
			System.out.println("Valid String");
		}
	}
	
}
