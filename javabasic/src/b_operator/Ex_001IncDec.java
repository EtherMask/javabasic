package b_operator;

public class Ex_001IncDec {

	public static void main(String[] args) {
	
		
	int a = 5;
	int b = 7;
	
	System.out.println("A=" + a + ", B=" + b);
	
	// A=51
	System.out.println("A=" + (a+1) + ", B=" + (b+1)); //주의* 그냥은 숫자가 커짐
	
	a = a + 1;
	b = b - 1;
	System.out.println("A=" + a + ", B=" + b);
	
	//증가감소연산자
	++a;
	--b;
	//--------
	int z= 10, y = 10;
	int result = ++z; //z=z+1; int result = z;
	System.out.println(result);
	
	int result2 = y++; // int result2 = y; y=y+1
	System.out.println(result2);  //10
	
	System.out.println("Z=" + z + "Y=" + y); // Z==11, Y=11
	
	System.out.println("Z=" + ++z + ",Y=" + --y); //Z=12, Y=10 
	System.out.println("Z=" + z++ + ",Y=" + y--); //Z=13, Y=9
	
	System.out.println("Z=" + --z + ",Y=" + y--);
	System.out.println("Z=" + z + ",Y=" + y);
	}

}
