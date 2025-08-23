package basicsOfJava;

public class DaysConversion {
	public static void main(String[] args) {
		int days = 652;
		int rem = days/365;
		days%=365;
		System.out.println("Years - "+rem);
		rem = days/30;
		days%=30;
		System.out.println("Months - "+rem);
		rem = days/7;;
		days %= 7;
		System.out.println("Weeks - "+rem);
		System.out.println("Days - "+days);
	}
}