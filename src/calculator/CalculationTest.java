package calculator;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class CalculationTest {
	Calculation c = new Calculation ();
	
	@Test
	public void shouldAdd() {
		assertEquals(c.add(1.0, 1.0),2.0);
	}
	@Test
	public void shouldAddFailureCheck() {
		assertNotEquals(c.add(1.0, 1.0),3.0);
	}
	
	@Test
	public void shouldSub() {
		assertEquals(c.subtract(3.0, 1.0),2.0);
	}
	@Test
	public void shouldsubFailureCheck() {
		assertNotEquals(c.subtract(2.0, 1.0),3.0);
	}
	
	@Test
	public void shouldMultiply() {
		assertEquals(c.multiply(2.0, 2.0),4.0);
	}
	@Test
	public void shouldMultFailureCheck() {
		assertNotEquals(c.multiply(1.0, 1.0),3.0);
	}
	
	@Test
	public void shoulddivide() {
		assertEquals(c.divide(4.0, 2.0),2.0);
	}
	@Test
	public void shouldDivFailureCheck() {
		assertNotEquals(c.divide(4.0, 2.0),3.0);
	}

}
