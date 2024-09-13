package d_array;

public class Ex03_lotto {

	public static void main(String[] args) {
		
		int [][]lotto = new int[5][6];
		
		//값지정: 임의의 값
		int lot =0;
		for(int a=0;a<lotto.length;a++) {
			for(int b=0;b<5;b++) {
				lotto[a][b] = lot;
				System.out.println();	
			}
		}

		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<6;j++, lot++) {
				lotto[i][j] = lot;
				System.out.print(lotto[i][j] + "/");	
			}
		}
		//출력
		System.out.println();

	}

}