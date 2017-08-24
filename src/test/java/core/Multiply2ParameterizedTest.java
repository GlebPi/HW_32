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

public class Multiply2ParameterizedTest {

	@Parameters(name= "Parameter # {index}: {1} * {2} = {0}")
	public static Collection<Double[]> multiplyNumbers() {
		return Arrays.asList(new Double[][] {
			{ 18.0, 6.0, 3.0 }, // { 18.0, 1.0, 2.0 },
			{ 72.0, 36.0, 2.0 }, // { 13.0, 2.0, 3.0 },
			{ 27.0, 9.0, 3.0 }, // { 20.2, 3.0, 4.0 },
			{ 48.0, 16.0, 3.0 }, // { 20.0, 4.0, 5.0 },
			{ 75.0, 15.0, 5.0 }, // { 17.0, 4.0, 5.0 },
			{ 35.2, 4.3, 8.2 }, // { 19.6, 4.0, 5.0 },
		});}
	
	@Parameter(value = 0) public Double expected;
	@Parameter(value = 1) public Double first;
	@Parameter(value = 2) public Double second;
	
	@Test
	public void multiply() {
		System.out.println(first + " * " + second + " = " + expected);
		assertEquals("Not correct", Calculator.multiply(first,  second), expected, 0.09);
	}
}
