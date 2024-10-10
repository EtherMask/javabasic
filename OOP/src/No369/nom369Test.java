package No369;

import java.util.*;

public class nom369Test {
		String str = "";
		int number = 0;
	
	public int solution(int nom) {



		for(int i=0;i<=nom;i++) {
			str += i+" ";
		}
		StringTokenizer st = new StringTokenizer(str);
		int na = st.countTokens();
		for(int j=0;j<na;j++) {
			String ad = st.nextToken();

			for(int k=0;k<ad.length();k++) {
				if(ad.charAt(k) == '3' | ad.charAt(k) == '6' | ad.charAt(k) == '9' ) {
					number++; 
					break;
				}
			}
		}
		return number;		
	}
}