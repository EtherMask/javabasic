package l_abstract;

public class PolySample {

	public static void main(String[] args) {

		Item[] result = method();
		// 처리 출력
		for(int i=0;i<result.length;i++) {
			result[i].output();
		}
	}

	static Item[] method() {

		Book b = new Book("001","자바","oracle","누군가");
		Dvd	 d = new Dvd("002","범죄도시4","마동석","누군가");
		Cd	 c = new Cd("003","해바라기도 가끔 목이 아프죠","MC The Max");

		Item[] obj = new Item[3];
		obj[0] = b;
		obj[1] = d;
		obj[2] = c;

		return obj;
		
	}

}
