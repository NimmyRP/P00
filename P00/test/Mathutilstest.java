import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Mathutilstest 
{
	Mathutils mt;
	@Before
	public void setUp() throws Exception {
		
	mt=new Mathutils();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a=1;
		int b=1;
		
		int actual=mt.add(a,b);
		int expected=2;
		assertEquals(expected,actual);
	}
		
	@Test
	public void testcircleradius()
	{
		double actual=mt.circlearea(2);
	    double expected =12.566370614359172;
	    assertEquals(expected,actual,0.000);
	}
	

}
