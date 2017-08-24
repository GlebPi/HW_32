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

public class Add3ParameterizedTest {

	@Parameters(name= "Parameter # {index}: {1} + {2} + {3} = {0}")
	public static Collection<Double[]> addNumbers() {
		return Arrays.asList(new Double[][] {
			{ 6.0, 1.0, 2.0, 3.0 }, { 6.0, 1.0, 2.0, 3.0 },
			{ 27.0, 2.0, 3.0, 22.0 }, { 76.66, 2.0, 3.0, 6.0 },
			{ 16.0, 3.0, 4.0, 9.0 }, { 11.0, 3.0, 4.0, 4.0 },
			{ 21.0, 4.0, 5.0, 12.0 }, { 17.0, 4.0, 5.0, 8.0 },
			{ 55.0, 10.0, 1.0, 44.0 }, { 11.0, 4.0, 5.0, 2.0 },
			{ 23.2, 15.3, 5.2, 2.7 }, { 16.0, 4.0, 5.0, 7.0 },
		});}
	
	@Parameter(value = 0) public Double expected;
	@Parameter(value = 1) public Double first;
	@Parameter(value = 2) public Double second;
	@Parameter(value = 3) public Double third;	
	
	@Test
	public void add() {
		System.out.println(first + " + " + second + " + " + third + " = " + expected);
		assertEquals("Not correct", Calculator.add(first, second, third), expected, 0.09);
	}
}
