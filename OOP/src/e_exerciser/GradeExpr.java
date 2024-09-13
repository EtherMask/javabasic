package e_exerciser;

public class GradeExpr {

	int [] jumsu;

	GradeExpr(int [] jumsu) {
		this.jumsu = jumsu;
	}
	double getAverage() {
		double avg = (double)getTotal() / jumsu.length;
		
		return avg;
	}

	int getTotal() {
		int total =0;
		for(int i=0;i<jumsu.length;i++) {
			total += jumsu[i];
		}
		
		return total;
	}
	int getGoodscore() {
		int max =0;
		for(int a=0;a<jumsu.length;a++) {
			if(max < jumsu[a]) max  = jumsu[a];
		}
		return max;
	}
	int getBadscore() {
		int min = Integer.MAX_VALUE;
			for(int b=0;b<jumsu.length;b++) {
				if(min > jumsu[b]) min = jumsu[b];
			}
			return min;
	}
}