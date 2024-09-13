package g_singleton;

public class UserB {
	
	DBConnect db;
	
	public UserB() {
		//db = new DBConnect();
		db = DBConnect.getInstance();
	}
	
	public void use() {
		System.out.println("B 작업");
	}

}
