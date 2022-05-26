import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class isEvenTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testisEvenNumber() {
		isEven even1=new isEven();
		assertTrue(even1.isEvenNumber(6));
		
	}

}
