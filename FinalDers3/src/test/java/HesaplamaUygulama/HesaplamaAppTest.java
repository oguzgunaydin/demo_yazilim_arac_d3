package HesaplamaUygulama;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaAppTest {

	@Test
	public void testToplama() {
		
		int sayi1 = 101;
		int sayi2 = 499;
		
		
		// Asýl metodu çaðýr. (When)
		int sonuc = HesaplamaApp.toplama(sayi1, sayi2);
		
		
		// Kontrol adýmý (Then)
		assertEquals(600,sonuc);
	}

}
