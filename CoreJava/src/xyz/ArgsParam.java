package xyz;

import java.util.Arrays;

public class ArgsParam {

	public String[] args = { "1", "2" };

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println(args.length);
		}
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
	}
}