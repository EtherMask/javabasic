package exercise;

private final String str = "매력있는";

public class testest {

	void method( String s ) {
	    str += s;
	}
	public static void main ( String [] args ) {
	  testest  t = new testest();
	  t.method("자바");
	  System.out.println( t.str );
	}
	}