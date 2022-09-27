package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import model.Mathematics;

@RunWith(Parameterized.class)
public class MathematicsParamTest {
	private Integer no1, no2;
	private Double result;
	private Mathematics m=new Mathematics();
	
	
	@Before
	public void setUp() throws Exception {
		m=new Mathematics();
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	public MathematicsParamTest(Integer no1, Integer no2, Double result)
	{
		this.no1=no1;
		this.no2=no2;
		this.result=result;
	}
	
	public static Collection inputs()
	{
		return Arrays.asList(new Object[][]{
			{2, 3, 5.0},
			{22, 33, 55.0},
			{8,5,13.0}
		});
	}
	
	@Test
	public void testAdd()
	{
		m.add();
		assertEquals(result,m.getResult() );
	}
}
