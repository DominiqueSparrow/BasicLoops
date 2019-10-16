package example.data;

public class Message implements Idata{

	String messageText;
	public Message (String m) {
		this.messageText= m;
	}
	
	@Override
	public void presentData() {
	System.out.println("message: "+messageText);
		
	}

	@Override
	public String getDataType() {
		// TODO Auto-generated method stub
		return "message";
	}

	@Override
	public String getDataDescription() {
		// TODO Auto-generated method stub
		return "message content ";
	}
	

}
