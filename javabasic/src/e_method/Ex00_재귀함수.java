package e_method;

public class Ex00_재귀함수 {

	public static void main(String[] args) {
		
	}
		// 1. f(4)를 호출한다면?
		public static void f ( int N ) {
			System.out.println(N);
			if( N > 0 ) f ( N-1);
		}
		
		// 2. g(4)를 호출한다면?
		public static void g ( int N) {
			if( N > 0 ) g( N-1);
			System.out.println(N);
		}
		
		// 3. h(4)를 호출한다면?
		public static void h ( int N ) {
			System.out.println(N);
			if( N > 0 ) h ( N -2 );
			System.out.println(N);
		}
		
		// 4. hh(4)를 호출한다면?
		public static void hh ( int N ) {
			if( N > 0 ) {
				hh ( N-1);
				System.out.println(N);
			}
		}
		
		// 5. abc(78)을 호출한다면?
		public static void abc( int N) {
			int r = N % 2;
			System.out.println("*");
			if( N >= 2 ) abc ( N/2);
			System.out.printf("%d", r);
			return; 
		}
		
		// 6. test ("110100111", 4 )호출한다면?
		public static  int test( String s, int last ) {
			if( last < 0 ) return 0;
			if( s.charAt(last) == '0') return 2 * test ( s, last -1 );
			return 1 + 2 * test ( s, last - 1);
		}
		
		// 7. 무엇을 계산하는 함수인가???
		public static void t ( int N ) {
			if( N > 0 ) t ( N/2);
			System.out.println( N % 2);
		}
	}