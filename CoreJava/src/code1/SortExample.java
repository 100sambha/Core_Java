package code1;

public class SortExample {
	public static void main(String[] args) {
		String str = "Paula has a French accent abcde";
//		String str = "The biopsy returned negative results.";
//		String str = "She sells sea shells by the sea shore.";

		String[] strArray = str.split(" ");
		for (int i = 0; i < strArray.length; i++) {
			boolean status = true;
			String s = strArray[i].toLowerCase();
			if (s.length() > 3) {
				for (int j = 0; j < s.length() - 1; j++) {
					int n = (int) s.charAt(j);
					int m = (int) s.charAt(j + 1);
					if (n > m) {
						status = false;
						break;
					}
				}
				if (status) {
					System.out.println(true);
					break;
				}
			}
		}
	}
}
