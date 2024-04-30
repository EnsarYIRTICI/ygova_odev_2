package tr.edu.medipol.ygova.birimtest1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void testMetniFormatla() {
		String metin = "      ders  1      ";
		String sonuc = Main.metinFormatla(metin);
		
		assertNotNull(sonuc);
		assertEquals("Ders1", sonuc);
				
	}

}
