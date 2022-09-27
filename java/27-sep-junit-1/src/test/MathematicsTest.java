/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Mathematics;

/**
 * @author rjaga
 *
 */
public class MathematicsTest {
	Mathematics aut;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		aut=new Mathematics();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		aut=null;
	}

	/**
	 * Test method for {@link model.Mathematics#add()}.
	 */
	@Test
	void testAdd() {
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
	void testSubtract() {
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
	void testDifference() {
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
	void testProduct() {
		aut.setNo1(2);
		aut.setNo2(3);
		Double expected=6.0;
		aut.product();
		Double actual=aut.getResult();
		assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		aut.setNo1(2);
		aut.setNo2(3);
		Double expected=0.6666666666666666;
		aut.divide();
		Double actual=aut.getResult();
		
		assertEquals(expected, actual);
	}
}
