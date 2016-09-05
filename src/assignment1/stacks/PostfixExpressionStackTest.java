package assignment1.stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class PostfixExpressionStackTest {

	@Test
	public void simpleExpressionTest() {
		assertTrue(PostfixExpressionStack.calculatePostFix("93+3+25*-82*+") == 21);
	}
	
	@Test
	public void emptyExpressionTest() {
		assertTrue(PostfixExpressionStack.calculatePostFix("") == 0);
	}
	
	@Test
	public void smallExpressionTest() {
		assertTrue(PostfixExpressionStack.calculatePostFix("52*") == 10);
	}
	
	@Test
	public void tinyExpressionTest() {
		assertTrue(PostfixExpressionStack.calculatePostFix("1") == 1);
	}
	
	@Test
	public void tooLongExpressionTest() {
		assertTrue(PostfixExpressionStack.calculatePostFix("15+13+*253+*-1-329**33*+-2392+*232-**+13+19+*-+") == -28);
	}
	
	@Test
	public void wrongInputExpressionTest() {
		assertTrue(PostfixExpressionStack.calculatePostFix("93+3+25*-x2*+") == -1);
	}

}
