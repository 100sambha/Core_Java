package basicsOfJava;

public class SimpleInterest {

	public static void main(String[] args) {
		float simpleInterest = 0;
		int principleAmmount = 1000;
		int rateOfInterest = 7;
		int noOfYears = 3;

		simpleInterest = principleAmmount*rateOfInterest*noOfYears / 100f;
		
		System.out.println("For Principle Ammount"+principleAmmount);
		System.out.println("and Rate Of Interest "+rateOfInterest);
		System.out.println("for "+noOfYears+" years");
		System.out.println("Simple Interest is "+simpleInterest);
	}

}
