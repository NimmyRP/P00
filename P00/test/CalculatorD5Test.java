import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorD5Test {
	int a, b;
	CalculatorD5 cal=new CalculatorD5();
	

	@Before
	public void setUp() throws Exception {
		
		a=4321;
		b=1234;
		CalculatorD5 cal=new CalculatorD5();
		
	}

	@Test
	public void testadd() {
		
			
		int actual=cal.add(a, b);
		int expected =5555;
		assertEquals(expected,actual);
				
	}
	@Test
	public void testsub() 
	{
				
		int actual=cal.sub(a,b);
		int expected =3087;
		assertEquals(expected,actual);
				
	}
	
	@Test
	public void testmul() 
	{
				
		int actual=cal.mul(a,b);
		int expected =5332114;
		assertEquals(expected,actual);
				
	}
	@After
	public void tearDown() throws Exception {
		
	}
}
