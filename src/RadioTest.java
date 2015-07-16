import static org.junit.Assert.*;

import org.junit.Test;


public class RadioTest {

	@Test
	public void testRadio() {
		Radio pruebaRadio = new Radio();
		assertEquals(0,pruebaRadio.getVolumen(),0);
		assertEquals(0,pruebaRadio.getEmisora(),0);
	}

	@Test
	public void testSetVolumen() {
		Radio pruebaRadio = new Radio();
		pruebaRadio.setVolumen(8);
		assertEquals(8,pruebaRadio.getVolumen(),0);
	}

	@Test
	public void testSetEmisora() {
		Radio pruebaRadio = new Radio();
		pruebaRadio.setEmisora(10);
		assertEquals(10,pruebaRadio.getEmisora(),0);
	}

	@Test
	public void testCambiarFrec() {
		Radio pruebaRadio = new Radio();
		pruebaRadio.cambiarFrec();
	}

	@Test
	public void testCargarEmisora() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdelantarEmisora() {
		fail("Not yet implemented");
	}

	@Test
	public void testAtrasarEmisora() {
		fail("Not yet implemented");
	}

	@Test
	public void testGuardarEmisora() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubirVolumen() {
		fail("Not yet implemented");
	}

	@Test
	public void testBajarVolumen() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
