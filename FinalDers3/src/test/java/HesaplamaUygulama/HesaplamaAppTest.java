package HesaplamaUygulama;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaAppTest {

	@Test
	public void testToplama() {
		
		int sayi1 = 101;
		int sayi2 = 499;
		
		
		// As�l metodu �a��r. (When)
		int sonuc = HesaplamaApp.toplama(sayi1, sayi2);
		
		
		// Kontrol ad�m� (Then)
		assertEquals(600,sonuc);
	}

}
