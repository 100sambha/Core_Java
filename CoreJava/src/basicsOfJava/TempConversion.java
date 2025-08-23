package basicsOfJava;

public class TempConversion {
	public static void main(String[] args) {
		int cTemp = 37;
		System.out.println("Fahrenheit :"+(32+((9/5f)*cTemp)));
		
		int fTemp = 98;
		System.out.println("Celsius :"+((5/9f)*(fTemp-32)));
	}
}