package basicsOfJava;

public class CircleAreaPerimeter {
	public static void main(String[] args) {
		float rad = 5f;
		float pi = 3.14f;
		System.out.println("Area Of Circle - "+(pi*(Math.pow(rad, 2))));
		System.out.println("Perimeter Of Circle - "+(2 * pi * rad));
	}
}