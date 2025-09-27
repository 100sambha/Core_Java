package xyz;

public class ThrowError {
	public static void main(String[] args) throws CustomeException {
		try {
			throw new StackOverflowError();
		}catch (StackOverflowError e) {
			e.printStackTrace();
		}
		
//		throw new CustomeException();
		
		throw new CustomeException("Invalid input");
	}
}
