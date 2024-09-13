package c_control;

public class Ex06_for중첩 {

	public static void main(String[] args) {
		
//		for(int r=0;r<5;r++) {			//5줄
//			for(int Ar=0;Ar<5;Ar++) {	//5칸
//				System.out.print("*");
//			}
//			System.out.println();
//		for(int r=0;r<5 ;r++) {		//5줄
//			for(int Ar=0;Ar<r+1 ;Ar++) {	//5칸
//				System.out.print("*");
//			}
//		}
//			System.out.println();
		
		/*for(int r=0;r>1;r++) {				//5줄
			for(int Ar=0;Ar<5-r;Ar++) {	//5칸
				System.out.print("*");	
			} // end of for-r
		*/ // end of for-Ar
	 // end of main
 //end of class

		for(int j=0;j<5;j++) {			//5줄
			//공백출력
//			for(int i=0; j>i ; ++i) {	
//				System.out.print(" ");
//			}
			
			// '*'찍기
			for(int i=0; i<5-j ;i++ ) {
				System.out.print("*");
			}// end of for-i
			System.out.println();
		} //end of for-j
	}
}