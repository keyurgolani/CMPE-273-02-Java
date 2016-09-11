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
	
	public static void main(String[] args) {
		/*
		 * Topic: Stacks in Java
		 * Problem: Calculating the output of postfix expressions is an essential problem
		 * 		since postfix expressions are usually how the compilers and kernels deal
		 * 		with the expressions.
		 * Solution: Solving postfix expression requires the saving of values until an
		 * 		operator is encountered and then fetching the saved values in a reverse
		 * 		order to process them using the encountered operator. Stack gives the
		 * 		exact same functionality necessary for this operation. Stack allows one
		 * 		value to be pushed at a time into it. And out of the pushed values, one
		 * 		value to be fetched at a time in reverse order to the order they were pushed.
		 */
		
		String postfixExpression = "15+13+*253+*-1-329**33*+-";
		System.out.println("Postfix Expression (" + postfixExpression + ") evaluates to " + calculatePostFix(postfixExpression) + ".");
		
	}

}
