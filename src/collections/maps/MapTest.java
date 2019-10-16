package collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MapTest {

	@Test
	public void mapTest() {
		Map<Integer, String> months = new HashMap<Integer, String>();
		months.put(1, "Styczeñ");
		months.put(2, "luty");
		months.put(3, "Marzec");
		months.put(4, "Kwiecieñ");
		
		months.put(2, "Luty");
		for (int i = 1;i<=4;i++) {
			System.out.println(String.format(" Nazwa  %d miesiaca to %s",i, months.get(i)));
		}
		
		Set<Integer> numery = months.keySet();
		for(Integer numerMiesiaca : numery) {
			System.out.println("dla klucza "+numerMiesiaca+" mamy wartoœæ");			
		}

		for(String month : months.values()) {
			System.out.println("Mamy wartoœæ "+month);
		}
	}
}
