package markerInterface;

public class CloneableInterfaceExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		Books b1 = new Books(1, "Sambhaji");
		Books b2 = (Books)b1.clone();
		
		System.out.println(b1);
		System.out.println(b2);
	}
}

class Books implements Cloneable{
	private int id;
	private String bookName;
	public Books() {
		super();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public Books(int id, String bookName) {
		super();
		this.id = id;
		this.bookName = bookName;
	}



	@Override
	public String toString() {
		return "Books [id=" + id + ", bookName=" + bookName + "]";
	}
	
	
}