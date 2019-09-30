package LoonyLoops;

import java.util.ArrayList;
import java.util.List;

public class ElBuckleDeNombres {

	public static void main(String[] args) {
		String[] names = { "Ziva", "Seth", "Zdzicha", "Zbyszek", "Yossarian", "Wito", "Vader", "Ulryka", "Telemach",
				"Sterios", "Sophia", "Satya", "Sasza", "Sacha ", "Ryan ", "Bryan", "Roxanne", "Pina", "Optimus",
				"Ondina", "Ona", "Olin", "Oleg", "Noe", "Nawojka", "Naomir", "Mi³ka", "Mikuc", "Masza ", "Lewko", "Lew",
				"Lenny", "Lennox", "Kiara", "Kayla ", "Theo", "Kataleja", "Joy", "Jezus", "Janek", "Jamajka", "Ivo",
				"Idia", "Helenka", "Hanja", "Gwiazdka", "Ester", "Esmeralda", "Emily", "Elis", "Dezyderiusza",
				"Cirzpibog", "Brooklyn", "Bubus³awa", "Atharjatha", "Armin", "Arek", "Aragorn", "Antek", "Anka",
				"Alabama", "Adya", "Zola", "Zoe", "Zenia", "Zadar", "Xena", "W³odzimierza", "Tulasi Manjari", "Œnie¿ka",
				"Œnie¿yna", "Savannah", "Sasza", "Salaya", "Robin", "Radosz ", "Jawor", "Orze³", "Nathan", "Matteo",
				"Mason", "Marketa", "Ma³gorzata", "Magnolia", "Luis", "Liwia", "Lilia", "Lian", "Liam", "Lia ", "Izi",
				"Lexie", "Leah", "Lajla", "Kurt", "Juta", "Javier", "Janka", "Jana", "Jamir", "Irina", "Hawier", "Hana",
				"Halka", "Esme", "Emmanuel", "Elencza", "Drogomys³", "Darko", "Charlotte", "Balaram", "Araya",
				"Alokadia", "Alexander ", "Maurycy", "Owidiusz", "Abhimanyu", "Abimanju", "Abimaniu", "Zoja ", "Zoe ",
				"Zoya", "Wiera", "Vanessa", "Tonia", "Tamerlan", "Sofia", "Saviannah", "Prudencja", "Oriana",
				"Ordynacja", "Oliver", "Olga", "Odin ", "Odyn", "Nepomucen", "Nelli", "Nel", "Nadja", "Misha", "Mika",
				"Melisa", "Marlon", "Malcolm", "Malkolm", "Majestica", "Madlena", "Lukasz", "Luba", "Lola", "Livia",
				"Linda", "Pamela", "Lea", "Anis", "Lars", "Lan", "Kastiel", "Kama", "Johanna", "Ivo, Bruno", "Inga",
				"Guliwer", "Gniewko", "Gigi", "Gabi", "Freya", "Freja", "Fantazja", "Estel", "Elvis", "Elwis", "Eliana",
				"Dobrena", "Dita", "Ditta", "Selah", "Dean", "Dastan", "Dante", "Cirilla", "Cyryla", "Bella", "Chloe",
				"Belizariusz", "Awa", "Teo", "Atfosmera ", "Atmosfera", "Atalanta", "Annika", "Anda", "Anakin", "Ala",
				"Aisha ", "Ajsza", "Aisza", "Wilczan", "Veronica", "Tymjan", "Tunia", "Tosia", "Teo", "Szarlota",
				"Dastin", "Yoda", "Sonja", "Semir", "Pawe³", "Orszula", "Olimp", "Oliana", "Eunika", "Ksawier",
				"Natasza", "Nastasija", "Nadia", "Milka", "Merkucjo", "Lula", "Lilu", "Lila", "Lilla", "Kola", "Kleo",
				"Kinka", "Jonata", "Jim", "Jimi", "Jarek", "Izydora ", "Alana", "Izadora", "Alana", "Iskandar", "Hugo",
				"Jurek", "Gonsalwy", "Gaja", "Gabriella", "Favour", "Elias", "Darianna", "Dariana", "Carlos", "Betina",
				"Bettina", "Ata", "Arika", "Aries", "Aqil", "Asnen", "Anja", "Angelika", "Allegra", "Alexandra",
				"Alenka", "Aiden", "Zosia", "Vitold", "Viktor", "Truskawka", "Tiara", "Sasha", "Riko", "Rico", "Ralf",
				"Pio³un", "Nela", "Milano ", "Santino", "Angelo", "Michelle", "Miguel", "Marysia", "Marina", "Mariko",
				"Malka", "Magda", "Luna", "Luka", "Luca", "Ludon", "Lisev", "Liliana", "Lili", "Lilli", "Lidja", "Leo",
				"Leal", "Kika", "Kermit", "Keira", "Junior", "Junia", "Jowana", "Janika", "Jakób", "Jagienka",
				"Hosanna", "Godspower", "Gloria ", "Etelinda", "Andrasta", "Frank", "Franek", "Easton", "Elbren",
				"Chantall", "Carmen", "Karmena", "Borys³aw", "Blanca", "Bianka", "Bella", }; // endStringPopulation
		List<String> namesEndingWithA = new ArrayList<String> ();
		for (int i = 0; i < names.length; i++) {
			String currentName = names[i];
			String lastChar = currentName.substring(currentName.length() - 1);
			System.out.println("Current name : "+currentName+" Last char: "+lastChar);
			if(lastChar.equals("a")) {
				namesEndingWithA.add(currentName);			
			}
		} // endFor
		
		for (int i = 0;i<namesEndingWithA.size(); i++) {
			System.out.println("Name ending with a "+ namesEndingWithA.get(i));
		}

	}// endMain

}// endClass
