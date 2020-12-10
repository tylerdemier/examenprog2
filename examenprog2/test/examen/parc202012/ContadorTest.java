package examen.parc202012;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContadorTest {

	@Test
	public void testContador() {
		Contador c = new Contador();
		assertEquals(0, c.get());
	}

	@Test
	public void testContadorNumero() {
		Contador c = new Contador(1);
		assertEquals(1, c.get());
	}

	@Test
	public void testGet() {
		int numero;
		Contador c = new Contador(2);
		numero = c.get();
		assertEquals(numero, c.get());
	}
	
	@Test
	public void testInc() {
		Contador c = new Contador();
		c.inc();
		assertEquals(1, c.get());
	}
	
	@Test
	public void testIncNumero() {
		Contador c = new Contador();
		c.inc(2);
		assertEquals(2, c.get());
	}
	
	@Test
	public void testToString() {
		Contador c = new Contador();
		assertEquals("0", c.toString());
	}

}
