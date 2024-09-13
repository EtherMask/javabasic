package g_singleton;

public class UserC {
	
	DBConnect db;
	
	public UserC() {
		//db = new DBConnect();
		db = DBConnect.getInstance();
	}
	
	public void use() {
		System.out.println("C 작업");
	}

}
