package e_method;

public class Ex99_복습1 {

	public static void main(String[] args) {
		System.out.println("A");//1
		test();					//->10번째 줄로 이동
		System.out.println("B");//6
	}
	static void test() {		
		System.out.println("C");//2
		sample();				//->16번째 줄로 이동
		imsi();					//돌아와서 19번째 줄로 이동
		System.out.println("D");//5		
	}	
	static void sample() {
		System.out.println("E");//3
	}
	static void imsi() {
		System.out.println("F");//4
	}

}