package math.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {
	

	@Test
	public void testAdd()
	{
	
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.add(2, 6);
		Integer expected = 8;
		assertEquals(expected, actual);
		
	}
	@Test
	public void testtts(){
		ArithmeticOperations ooArithmeticOperations = new ArithmeticOperations();
		
		Integer ahha = ooArithmeticOperations.add(3, 9);
		Integer exp = 18;
		assertEquals(exp, ahha);
	}
}
