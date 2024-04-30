package tr.edu.medipol.ygova.birimtest1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesapTest {

	@Test
	public void testTopla() {
		
		int sayi1 = 10;
		int sayi2 = 5;
		
		int sonuc = Hesap.topla(sayi1, sayi2);
		
		assertEquals(15, sonuc);
		
	}
	
	@Test
	public void testCikart() {
		
		int sayi1 = 10;
		int sayi2 = 5;
		
		int sonuc = Hesap.cikart(sayi1, sayi2);
		
		assertEquals(5, sonuc);
		
	}
	
	@Test
	public void testCarp() {
		
		int sayi1 = 10;
		int sayi2 = 5;
		
		int sonuc = Hesap.carp(sayi1, sayi2);
		
		assertEquals(50, sonuc);
		
	}
	
	@Test
	public void testBol() {
		
		int sayi1 = 10;
		int sayi2 = 5;
		
		int sonuc = Hesap.bol(sayi1, sayi2);
		
		assertEquals(2, sonuc);
		
	}
	
	

}
