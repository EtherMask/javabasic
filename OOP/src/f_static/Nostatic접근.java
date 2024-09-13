package f_static;

public class Nostatic접근 {

	String name = "홍길동";
	
	public static void main(String[] args) {
		
		Nostatic접근 obj = new Nostatic접근();
		
		System.out.println("고객명" + obj.name);

	}

}
