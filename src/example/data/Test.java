package example.data;

public class Test{

	public static void main(String[] args) {
	Message m= new Message("hi");
	presentData(m);
	}
	public static void presentData(Idata data) {
		System.out.println("dataType: "+data.getDataType());
		System.out.println("description: "+data.getDataDescription());
		data.presentData();
	}

}
