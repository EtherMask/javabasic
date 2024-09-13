package b_operator;

/*
 * 	대입연산자 =
 * 
 * 		대입연산자 축양 : 산술, 쉬프트, 이진논리
 * 
 * 		a = a + b;		===> a+=b;
 * 		a = a - b;		===> a-=b;
 * 		a = a * b;		===> a*=b;
 * 		a = a / b;		===> a/=b;
 * 		a = a % b;		===> a%=b;
 */
public class Ex10_대입연산자 {
	
	public static void main(String[] args) {
		
		int a = 10, b= 7;
		
		a+=b;
		System.out.println("+= 결과:" + a);
		a-=b;
		System.out.println("-= 결과:" + a);
		a*=b;
		System.out.println("*= 결과:" + a);
		a/=b;
		System.out.println("/= 결과:" + a);
		a%=b;
		System.out.println("%= 결과:" + a);
	}

}
