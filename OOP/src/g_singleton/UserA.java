package g_singleton;

public class UserA {
	
	DBConnect db;
	
	public UserA() {
		//db = new DBConnect();
		db = DBConnect.getInstance();
	}
	
	public void use() {
		System.out.println("A 작업");
	}

}
