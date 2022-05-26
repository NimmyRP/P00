import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest2 {
	private int a,b;
	Calculator cal=new Calculator();

	@Before
	public void setUp() throws Exception {
		a=4132;
		b=1234;
		Calculator cal=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		
		int actual=cal.add(a,b);
		assertEquals(5366,actual);
		
	}
	@Test
	public void testSub() {
		
		int actual=cal.subtract (a,b);
		assertEquals(2898,actual);
		
	}
		
}
