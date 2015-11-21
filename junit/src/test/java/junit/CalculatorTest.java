/**
 * 
 */
package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.imt.junit.Calculator;

/**
 * @author imteyaz
 *
 */
public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		double result = calculator.add(10, 50);
		assertEquals(60, result, 0);
	}

	@Test
	public void testSubstract() {
		Calculator calculator = new Calculator();
		double result = calculator.substract(50, 10);
		assertEquals(40, result, 0);
	}
	
	@Test
	public void testMultiply() {
		Calculator calculator = new Calculator();
		double result = calculator.multiply(50, 10);
		assertEquals(500, result, 0);
	}

	@Test
	public void testDivision() {
		Calculator calculator = new Calculator();
		double result = calculator.division(50, 10);
		assertEquals(5, result, 0);
	}
}
