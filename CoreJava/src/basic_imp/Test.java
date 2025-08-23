package basic_imp;

public class Test implements Cloneable{

	private String name;
    private String collegeName;

    // No-argument constructor
    public Test() {
        this.collegeName = "SSP College";
    }
	
	public Test(String name) {
		super();
		this.name = name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
