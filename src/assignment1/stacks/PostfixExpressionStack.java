package assignment1.stacks;

import java.util.Stack;

public class PostfixExpressionStack {
	
	public static int calculatePostFix(String expression) {
		boolean validExpression = true;
		Stack<Integer> valueStack = new Stack<Integer>();
		for(int i = 0; i < expression.length(); i++) {
			char currentChar = expression.charAt(i);
			if(Character.isDigit(currentChar)) {
				valueStack.push(Character.getNumericValue(currentChar));
			} else if(currentChar == '+' || currentChar == '-' || currentChar == '*') {
				int value1 = valueStack.pop();
				int value2 = valueStack.pop();
				switch (currentChar) {
				case '+':
					valueStack.push(value1 + value2);
					break;
				case '-':
					valueStack.push(value2 - value1);
					break;
				case '*':
					valueStack.push(value1 * value2);
					break;
				}
			} else {
				System.out.println("Wrong expression. Please enter postfix expression according to the requirements.");
				validExpression = false;
				break;
			}
		}
		return expression.equals("") ? 0 : (validExpression ? valueStack.pop() : -1);
	}

}
