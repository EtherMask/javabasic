package g_singleton;

public class DBConnect {

	private DBConnect() {
		System.out.println("실제 디비에 연결함");

	}
	
	private static DBConnect dbconn = null;
	
	public static DBConnect getInstance() {
		if(dbconn == null) dbconn = new DBConnect();
		return dbconn;
	}
}

//Caleandar Instance