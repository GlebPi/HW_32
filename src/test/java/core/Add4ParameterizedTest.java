package core;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class Add4ParameterizedTest {

	@Parameters(name= "Parameter # {index}: {1} + {2} + {3} + {4} = {0}")
	public static Collection<Double[]> addNumbers() {
		return Arrays.asList(new Double[][] {
			{ 11.0, 1.0, 2.0, 3.0, 5.0 }, { 18.0, 1.0, 2.0, 3.0, 12.0 },
			{ 41.0, 2.0, 3.0, 22.0, 14.0 }, { 13.0, 2.0, 3.0, 6.0, 2.0 },
			{ 33.0, 3.0, 4.0, 9.0, 17.0 }, { 20.2, 3.0, 4.0, 4.0, 9.2 },
			{ 66.0, 4.0, 5.0, 12.0, 45.0 }, { 20.0, 4.0, 5.0, 8.0, 3.0 },
			{ 67.0, 10.0, 1.0, 44.0, 12.0 }, { 17.0, 4.0, 5.0, 2.0, 6.0 },
			{ 28.1, 15.3, 5.2, 2.7, 4.9 }, { 19.6, 4.0, 5.0, 7.0, 3.6 },
		});}
	
	@Parameter(value = 0) public Double expected;
	@Parameter(value = 1) public Double first;
	@Parameter(value = 2) public Double second;
	@Parameter(value = 3) public Double third;
	@Parameter(value = 4) public Double fourth;	
	
	@Test
	public void add() {
		System.out.println(first + " + " + second + " + " + third + " + " + fourth + " = " + expected);
		assertEquals("Not correct", Calculator.add(first, second, third, fourth), expected, 0.09);
	}
}
