package LoonyLoops;

public class Names2 {

	public static void main(String[] args) {
		String[] names = { "Zosia Wito Helenka", "Ziva  Vader Hanja", "Seth Ulryka Gwiazdka", "Zdzicha Telemach Ester",
				"Zbyszek Sterios Esmeralda", "Yossarian Sophia Emily", "Wito Satya Elis", "Vader Sasza ",
				"Ulryka Sacha  ", "Telemach Ryan  ", "Sterios Bryan ", "Sophia Roxanne ", "Son Gohan Pina ",
				"Satya Optimus ", "Sasza Ondina ", "Sacha   ", "Sasza  ", "Ryan   ", "Bryan  ", "Roxanne  ", "Pina  ",
				"Optimus  ", "Ondina  ", "Ona  ", "Olin  ", "Olek  " };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
			String[] subnames = names[i].split("\\s+");
			for (int n = 0; n < subnames.length; n++) {
				String lc= lastChar(subnames[n]);
				if(lc.equals("a")||lc.equals("o")) {
			System.out.println("Names ending with a||o are as following: "+subnames[n]);
				}//endIf
			}//endEmbeddedFor

		}

	}// endMain

	public static String lastChar(String s) {
		return s.substring(s.length() - 1);
	}//endLastCharMeth
	
}// endClass
