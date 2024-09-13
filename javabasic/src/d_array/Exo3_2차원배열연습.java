package d_array;

public class Exo3_2차원배열연습 {

	public static void main(String[] args) {

		int a[][]=new int[][]{{-2, 11, 2, -7}, {3,-5, 12 }, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
//									4				10				  -139					-36
		// 출력
		//		for(int i=0;i<4;i++) {
		//			for(int j=0; j<a[i].length;j++) {
		//				System.out.print(a[i][j] + "/");
		//				
		//			}
		//			System.out.println();
		//		}
		//		int sum = 0;
		//		for(int i=0;i<4;i++) {
		//			for(int j=0; j<a[i].length;j++) {
		//				sum += a[i][j];
		//				System.out.print(a[i][j] + "/");
		//	}
		//}
		//		System.out.println("합" + sum);

		int [] hap = new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				hap[i] = hap[i] + a[i][j];
			}
		}
		//계산위치
		int lol=hap[0];
		int pul=0;
		for(int d=1;d<hap.length;d++) {
			if(lol<hap[d]) {
				lol = hap[d];
				pul=d;			//{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}
			}		
		}	
		System.out.println("합이 가장 큰 값:" + lol);
		System.out.println("합이 가장 큰 행:" + pul + "번째");
		}
	}