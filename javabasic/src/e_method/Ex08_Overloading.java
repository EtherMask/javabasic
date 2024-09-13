package e_method;
/*
 * 	Overloading
 * 		- method(함수)명이 동일한 함수를 지칭
 */
public class Ex08_Overloading {

	public static void main(String[] args) {
		String str = "홍길순";
		StringBuffer sb = new StringBuffer("홍길자");
		char [] ch = new char[] {'홍', '길', '동'};
		
		System.out.println(str);
		System.out.println(sb);
		System.out.println(ch);
	}
}
/*class Test {
public static void method( int i, int j) {
	  i <<= j; <- 시프트 연산자
0	}
	public static void main ( String  [] args ) {
	  int i = 4, j = 2;
	  method( i, j );
	  System.out.println("i = " + i );
	}
	}

	2. 다음 아래의 method 메소드를 오버로딩 한 메소드들은?
	long  method ( int a , int b ) {   return  a+b;   } 

		(1)  void method ( int x, int y ) 	 {  return x+y; 	}
		(2)  long method ( long a, long b ) {  return a+b;	}
		(3)  long Method ( long a, long b ) {  return a+b;	}
		(4)  long method ( int a, long b )  {  return  a+b;	}

	3. 다음 프로그램의 결과는?

	class Test {
	static void method( int i, int j) {
	     i += j;
	     System.out.println("i = " + i + " , j = " + j );
	}
	public static void main ( String  [] args ) {
	     int i = 4, j = 2;
	     method( i, j );
	     System.out.println("i = " + i + " , j = " + j );<- 메모리값이 삭제되기에 값이 안변한다
	}
	}

	4. 다음 프로그램의 결과는?

	class Test {
	static void method( String i, String j) {
	     i += j;
	     System.out.println(“i = “ + i + “ , j = “ + j );
	}
	public static void main ( String  [] args ) {
	     String i = “안녕”, j = “자바”;
	     method( i, j );
	     System.out.println(“i = “ + i + “ , j = “ + j );
	}
	}

	5. 다음 프로그램의 결과는?

	class Test {
	static int method( int i, int j) {
	     int sum = i + j;
	     System.out.println(“sum = “ +  sum );
	     return sum;
	}
	public static void main ( String  [] args ) {
	     int i = 4,  j = 2;
	     int sum = 0;
	     method( i, j );
	     System.out.println(“sum = “ +  sum );
	}
	}
	*/
/*	오버로딩이 없다면
 
		void drawRect(int w, int h) {
			// 폭과 높이로 사격형 그리기
		}
		
		void drawRect(Point p1, Point p2, Point p3, Point [4) {
			//	점 4개의 정보로 사각형 그리기
		}
	----------------
	오버로딩이 적용된다면??
	
*/
