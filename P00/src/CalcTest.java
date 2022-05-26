import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	
	private int a,b,c;
	
    Calculator cal =new Calculator();
	@Before
	public void setUp() throws Exception {
		
		cal = new Calculator();
		a = 4321;
		b = 1234;
		c = 0;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() 
	{
		// Arrange
				int a = 54321;
				int b = 12345;
				Calculator cal = new Calculator();
				
				//Act
				int actual = cal.add(a, b); 
				
				//Assert
				int expected = 66666;
				assertEquals (expected, actual);
		
	}
	
	@Test
	public void testSubtract() {
	

		 int actual = cal.subtract(a, b);
		 int expected = 3087;
		 assertEquals (expected,actual);
	}

}
