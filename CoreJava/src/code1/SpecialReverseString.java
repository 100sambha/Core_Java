package code1;

import java.util.ArrayList;
import java.util.List;

public class SpecialReverseString {

	public static void main(String[] args) {
//		String str = "UPPER lower";
//		String str = "Edabit";
		String str = "1 23 456";
		
		System.out.println(str);
		String newString = "";
		
		
		List<Integer> ch = new ArrayList<>();
		
		for (int i = str.length() - 1; i >= 0; i--) {
			if(str.charAt(i)!=' ') {
				newString+=str.charAt(i);
			}
			else {
				ch.add(i);
			}
		}
		newString = newString.toLowerCase();
//		System.out.println(newString);
		
		for (int i = ch.size()-1; i >= 0; i--) {
			newString = newString.substring(0, ch.get(i))+" "+newString.substring(ch.get(i));
		}
		
		for (int i = 0; i < str.length(); i++) {
			String strCh = "";
			if(str.charAt(i)>64&&str.charAt(i)<=90) {
				strCh +=newString.charAt(i);
				newString = newString.substring(0,i)+strCh.toUpperCase()+newString.substring(i+1);
			}
		}
		
		
		System.out.println(newString);
		

	}
}