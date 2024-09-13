package c_control;

public class Ex04_switch정리 {

	public static void main(String[] args) {
		
		int a =5;
		switch(a/2) {
		case 1 : System.out.println("일");		break;
		case 2 : System.out.println("이"); 		break;
		default : System.out.println("나머지");	break;
		case 3 : System.out.println("삼");		break;
		case 4 : System.out.println("사");		break;
		}

	}

}
