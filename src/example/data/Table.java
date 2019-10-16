package example.data;

public class Table implements Idata {
 int [][]table;
 public Table (int[][]t) {
	 this.table=t;
 }
	@Override
	public void presentData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getDataType() {
		// TODO Auto-generated method stub
		return "table";
	}

	@Override
	public String getDataDescription() {
		// TODO Auto-generated method stub
		return "table content";
	}
	

}
