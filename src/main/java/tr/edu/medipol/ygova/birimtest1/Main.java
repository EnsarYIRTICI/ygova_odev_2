package tr.edu.medipol.ygova.birimtest1;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		
		String metin = "ah met dfsgdsfg sdfgsdfg 435345 sdfgsdf g45345 bbbbbbbbbbbbbb";
		String formatliMetin = metinFormatla(metin);
		
		System.out.println(formatliMetin);

	}
	
	
	public static String metinFormatla(String metin) {
		metin = StringUtils.deleteWhitespace(metin);		
		metin = StringUtils.capitalize(metin);
		metin = StringUtils.abbreviate(metin, 25);
						
		return metin;
	}
	
	

}
