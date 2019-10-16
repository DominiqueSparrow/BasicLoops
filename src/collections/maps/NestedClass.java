package collections.maps;

public class NestedClass {

	static {
		final int z = 1+1+1;
	}
	
	static int v = 3;
	
	int x = 2;

	class SubClass {

		public int y = x + 4;
	}
	
	interface iface{
		StringBuilder create();
	}
	
	

	static class StaticSubClass {

		int y = 4;
	}

	public static void main(String[] argv) {
		StaticSubClass ssc = new NestedClass.StaticSubClass();
		SubClass sc = new NestedClass().new SubClass();
		System.out.println(sc.y);
		System.out.println(NestedClass.v);
		System.out.println(NestedClass.v);
		
	}

}
