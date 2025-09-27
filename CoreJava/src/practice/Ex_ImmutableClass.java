package practice;

final class Ex_Immutable {
	private final Integer num;
	
	
	public Ex_Immutable(Integer num) {
		this.num = num;
	}
	
	public Integer getNum() {
		return this.num;
	}

}

public class Ex_ImmutableClass {
	public static void main(String[] args) {
		Ex_Immutable ex_Immutable = new Ex_Immutable(10);
		System.out.println(ex_Immutable.getNum());
	}
	
}