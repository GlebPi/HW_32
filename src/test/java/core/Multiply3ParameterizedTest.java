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

public class Multiply3ParameterizedTest {

	@Parameters(name= "Parameter # {index}: {1} * {2} * {3} = {0}")
	public static Collection<Double[]> multiplyNumbers() {
		return Arrays.asList(new Double[][] {
			{ 32.0, 6.0, 3.0, 2.0 }, // { 18.0, 1.0, 2.0, 3.0, 12.0 },
			{ 72.0, 36.0, 2.0, 1.0 }, // { 13.0, 2.0, 3.0, 6.0, 2.0 },
			{ 81.0, 9.0, 3.0, 3.0 }, // { 20.2, 3.0, 4.0, 4.0, 9.2 },
			{ 512.0, 16.0, 3.0, 2.0 }, // { 20.0, 4.0, 5.0, 8.0, 3.0 },
			{ 150.0, 15.0, 5.0, 2.0 }, // { 17.0, 4.0, 5.0, 2.0, 6.0 },
			{ 91.6, 4.3, 8.2, 2.6 }, // { 19.6, 4.0, 5.0, 7.0, 3.6 },
		});}
	
	@Parameter(value = 0) public Double expected;
	@Parameter(value = 1) public Double first;
	@Parameter(value = 2) public Double second;
	@Parameter(value = 3) public Double third;	
	
	@Test
	public void multiply() {
		System.out.println(first + " * " + second + " * " + third + " = " + expected);
		assertEquals("Not correct", Calculator.multiply(first, second, third), expected, 0.09);
	}
}
