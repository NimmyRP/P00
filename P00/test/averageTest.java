import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class averageTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	//Name of unit test
	public void testAverage()
	
	{
		
		// Arrange
		int n1=10;
		int n2=20;
		int n3=10;
		int n4=20;
		int n5=30;
		average Avg=new average();
		
		//Act
		int actual =Avg.aveargeoffive(n1,n2,n3,n4,n5);
		
		// Assert
				
		assertEquals(18,actual);

		
   }
}
