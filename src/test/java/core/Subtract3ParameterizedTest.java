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

public class Subtract3ParameterizedTest {

	@Parameters(name= "Parameter # {index}: {1} - {2} - {3} = {0}")
	public static Collection<Double[]> subtractNumbers() {
		return Arrays.asList(new Double[][] {
			{ 20.0, 33.0, 3.0, 10.0 }, // { 18.0, 1.0, 2.0, 3.0 },
			{ 89.0, 92.0, 2.0, 1.0 }, // { 13.0, 2.0, 3.0, 6.0 },
			{ 10.0, 18.0, 3.0, 5.0 }, // { 20.2, 3.0, 4.0, 4.0 },
			{ 20.0, 36.0, 3.0, 13.0 }, // { 20.0, 4.0, 5.0, 8.0 },
			{ 30.0, 44.0, 5.0, 9.0 }, // { 17.0, 4.0, 5.0, 2.0 },
			{ 41.5, 72.3, 8.2, 22.6 }, // { 19.6, 4.0, 5.0, 7.0 },
		});}
	
	@Parameter(value = 0) public Double expected;
	@Parameter(value = 1) public Double first;
	@Parameter(value = 2) public Double second;
	@Parameter(value = 3) public Double third;	
	
	@Test
	public void subtract() {
		System.out.println(first + " - " + second + " - " + third + " = " + expected);
		assertEquals("Not correct", Calculator.subtract(first, second, third), expected, 0.09);
	}
}
