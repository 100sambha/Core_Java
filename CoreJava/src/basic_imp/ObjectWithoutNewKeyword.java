package basic_imp;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ObjectWithoutNewKeyword {
	public static void main(String[] args) {
		try {
//			Array and String
			String s = "Sambhaji";
			int nums[] = {4,6,8};
			System.out.println(s);
			System.out.println(Arrays.toString(nums));
			
			
			
			Test t2 = new Test("Ravi");
			System.out.println(t2.getName());

			Test t2Clone = (Test) t2.clone();
			System.out.println(t2Clone.getName());
			
			System.out.println(t2);
			System.out.println(t2Clone);
			
			
			
			
//			Object without param
			Class<?> c = Class.forName("basic_imp.Test");
			Test t = (Test) c.newInstance();
			System.out.println(t.getCollegeName());

//			Parameterize object
			Class<?> c1 = Class.forName("basic_imp.Test");
			Constructor<?> constructor = c1.getDeclaredConstructor(String.class);
			Test t1 = (Test) constructor.newInstance("Test");
			System.out.println(t1.getName());
			System.out.println();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}