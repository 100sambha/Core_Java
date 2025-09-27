package design_patterns;

public class SingletoneClass {
	static SingletoneClass singletoneClass;
	
	private SingletoneClass() {
	}

	public static SingletoneClass getBean() {
		if(singletoneClass!=null) {
			return singletoneClass;
		}
		else {
			return singletoneClass=new SingletoneClass();
		}
	}
	
	
}
