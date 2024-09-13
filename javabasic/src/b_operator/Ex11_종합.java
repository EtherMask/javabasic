package b_operator;

public class Ex11_종합 {
	public static void main(String[] args) {
		
		//int z = 10 - 7 ^ 3 + 1 * 2 & 4;
		
		//System.out.println("Z=" + z);
		
/*		int i = 5;
		System.out.println(i++); // ?
		System.out.println(i++); // ?
*/
		int a =-5;
		if( (a>0) && (++a /3 > 0) ) {
			a++;
		}
		System.out.println("A=" + a);
	}

}

// 0010 =2, 0111=7, 1010=10, 0100=4, 5=0101	
// 							 0101
//							 0100
//							 
//							 0100=0011
// 2+3=5 ,3
// =7