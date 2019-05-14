package math.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {
	

	@Test
	public void testAdd()
	{
		ArithmeticOperations opr = new ArithmeticOperations();
		Integer add = opr.add(2, 6);
		Integer expected = 8;
		assertEquals(expected, add);
		
	}
	@Test
	public void testMultiply(){
		ArithmeticOperations opr = new ArithmeticOperations();
		Integer multiply = opr.multi(3, 9);
		Integer expected = 27;
		assertEquals(expected, multiply);
	}
}
