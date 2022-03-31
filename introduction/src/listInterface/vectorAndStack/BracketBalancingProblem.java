package listInterface.vectorAndStack;
import java.util.*;

public class BracketBalancingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the test cases");
		int t = sc.nextInt();
		
		while(t-- != 0) {
			System.out.println("Enter the string");
			String s = sc.nextLine();
			Stack<Character> stack = new Stack<>();
			boolean isBalanced = true;
			
			for(int i = 0 ; i<s.length() ; i++) {
				char ch = s.charAt(i);
				if(ch == '(' || ch == '{' || ch == '[') {
					stack.push(ch);
					continue;
				}
				
				if(stack.empty()) {
					isBalanced = false;
					break;
				}
				if(ch == '[') {
					if(stack.peek() == ']') {
						stack.pop();
					}else {
						isBalanced = false;
						break;
					}
				}
				if(ch == '{') {
					if(stack.peek() == '}') {
						stack.pop();
					}else {
						isBalanced = false;
						break;
					}
				}
				if(ch == '(') {
					if(stack.peek() == ')') {
						stack.pop();
					}else {
						isBalanced = false;
						break;
					}
				}
			}
			if(!stack.empty()) {
				isBalanced = false;
			}
			if(isBalanced) {
				System.out.println("Balanced");
			}else {
				System.out.println("Not Balanced");
			}
		}
	}

}
