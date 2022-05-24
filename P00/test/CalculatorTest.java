import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//Class container for a cohesive set of tests

public class CalculatorTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	

	@Test
	//Name of unit test
	public void test() {
		
		// Arrange
		int n1=10;
		int n2=20;
		Calculator cal=new Calculator();
		
		//Act
		int actual =cal.sum(n1,n2);
		
		// Assert
				
		assertEquals(30,actual);	
		
		
		
	}

}
