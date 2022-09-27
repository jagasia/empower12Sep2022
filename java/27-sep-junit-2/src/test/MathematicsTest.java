/**
 * 
 */
package test;



import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import model.Mathematics;

/**
 * @author rjaga
 *
 */
public class MathematicsTest {
	Mathematics aut=new Mathematics();
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		aut=new Mathematics();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		aut=null;
	}

	/**
	 * Test method for {@link model.Mathematics#add()}.
	 */
	@Test
	public void testAdd() {
		aut.setNo1(2);
		aut.setNo2(3);
		Double expected=5.0;
		aut.add();
		Double actual=aut.getResult();
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link model.Mathematics#subtract()}.
	 */
	@Test
	public void testSubtract() {
		aut.setNo1(2);
		aut.setNo2(3);
		Double expected=-1.0;
		aut.subtract();
		Double actual=aut.getResult();
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link model.Mathematics#difference()}.
	 */
	@Test
	public void testDifference() {
		aut.setNo1(2);
		aut.setNo2(3);
		Double expected=1.0;
		aut.difference();
		Double actual=aut.getResult();
		assertEquals(expected, actual);
	}

	/**
	 * Test method for {@link model.Mathematics#product()}.
	 */
	@Test
	@Ignore
	public void testProduct() {
		aut.setNo1(2);
		aut.setNo2(3);
		Double expected=6.0;
		aut.product();
		Double actual=aut.getResult();
		assertEquals(expected, actual);
	}

	@Test
	@Ignore
	public void testDivide() {
		aut.setNo1(2);
		aut.setNo2(3);
		Double expected=0.67;
		aut.divide();
		Double actual=aut.getResult();
		
		assertEquals(expected, actual);
	}
}
