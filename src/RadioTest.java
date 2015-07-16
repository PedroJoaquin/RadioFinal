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
	public void testAdelantarEmisora() {
		Radio pruebaRadio = new Radio();	
		pruebaRadio.adelantarEmisora();
		assertEquals(0.2,pruebaRadio.getEmisora(),0);
	}

	@Test
	public void testAtrasarEmisora() {
		Radio pruebaRadio = new Radio();	
		pruebaRadio.atrasarEmisora();
		assertEquals(-0.2,pruebaRadio.getEmisora(),0);
	}

	@Test
	public void testGuardarEmisora() {
		Radio pruebaRadio = new Radio();
		pruebaRadio.setEmisora(90.1);
		pruebaRadio.guardarEmisora(0, 1);
		assertEquals(90.1,pruebaRadio.getMemoria(0, 0),0);
	}

	@Test
	public void testSubirVolumen() {
		Radio pruebaRadio = new Radio();
		pruebaRadio.subirVolumen();
		assertEquals(1,pruebaRadio.getVolumen(),0);
	}

	@Test
	public void testBajarVolumen() {
		Radio pruebaRadio = new Radio();
		pruebaRadio.bajarVolumen();
		assertEquals(0,pruebaRadio.getVolumen(),0);
	}


}
