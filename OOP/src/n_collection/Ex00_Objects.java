package n_collection;

public class Ex00_Objects {

	public static void main(String[] args) {
		
		StudentA a = new StudentA("01234", "홍길동");
		StudentA b = new StudentA("01234", "홍길동");
		
		System.out.println(a.toString());//Object걸 overriding해온다
		System.out.println(b.toString());//그렇다 보니 toString이 없어도 println이 자동으로 불러온다
		
		if(a.equals(b)) {
			System.out.println("동일인");
		}else {
			System.out.println("다른사람");
		}
		
	}

}

class StudentA {
	String number;
	String name;

	StudentA(String number, String name) {
	this.number = number;
	this.name = name;
	}
	
	public String toString() {
		return "학번:" + number + " [이름]:" + name;
	}
	public boolean equals(Object obj) {
		StudentA other = (StudentA)obj;
		if( number.equals(other.number)) {
			return true;
		}else {
			return false;
		}
	}
}