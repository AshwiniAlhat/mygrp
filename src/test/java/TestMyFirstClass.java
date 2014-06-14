import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author idnprk
 *
 */
public class TestMyFirstClass {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMultiply() {
		MyFirstClass myFirstClass=new MyFirstClass();
		assertTrue(myFirstClass.multiply(5, 4)==20);
		
	}

}
