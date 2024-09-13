package b_operator;

public class Ex08_ShortCircuitLogic {
	
	public static void main(String[] args) {
		
		int a =3;
		
		if ( a>3 & ++a>3 ) {
			System.out.println("조건만족");
		}
		
		System.out.println("A=" + a);
		
		//---------------------------
		int b = 3;
		if( b > 1 | ++b>3) {
			System.out.println("조건만족2");
		}
		System.out.println("B=" + b);
		
		int c = 5;
		if( c > 1 & ++c>6) {
			System.out.println("조건만족3");
			
		System.out.println("C=" + c);
		}
	}

}
