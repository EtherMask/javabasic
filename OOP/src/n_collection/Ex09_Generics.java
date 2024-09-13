package n_collection;

public class Ex09_Generics {

	public static void main(String[] args) {

		MyType<String, String> name		= new MyType<String, String>("이름","김자바");
		MyType<String, Integer> age		= new MyType<String, Integer>("나이", new Integer(20));
		MyType<String, Double> height	= new MyType<String, Double>("키", new Double(182.9));

		System.out.println(name.getName() + "/" + name.getValue());
		System.out.println(age.getName() + "/" + age.getValue());
		System.out.println(height.getName() + "/" + height.getValue());
	
	}

}

class MyType<K, V>{//자료형을 통째로 받을수도있다
	K name;
	V value;
	MyType(K name, V value){
		this.name = name;
		this.value = value;
	}

	K getName() {
		return name;
	}

	V getValue() {
		return value;
	}
}