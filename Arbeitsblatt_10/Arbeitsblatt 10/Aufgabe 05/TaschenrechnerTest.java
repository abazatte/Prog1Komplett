package Aufgabe5;

import static org.junit.Assert.*;
import org.junit.Test;

public class TaschenrechnerTest {

	Taschenrechner tr = new Taschenrechner();

	@Test
	public void testAdd() {
		int a = 5;
		int b = 3;
		assertEquals(8, tr.add(a, b));
	}

	@Test
	public void testSub() {
		int a = 5;
		int b = 3;
		assertEquals(2, tr.sub(a, b));
	}

	@Test
	public void testMul() {
		int a = 5;
		int b = 3;
		assertEquals(15, tr.mult(a, b));
	}

	@Test
	public void testDiv() {
		int a = 15;
		int b = 3;
		assertEquals(5, tr.div(a, b));
	}

	@Test
	public void testMod() {
		int a = 5;
		int b = 3;
		assertEquals(2, tr.mod(a, b));
	}

}
