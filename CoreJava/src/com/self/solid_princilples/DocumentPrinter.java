package com.self.solid_princilples;

public class DocumentPrinter implements LaserPrinter {

	private Scanner scanner;
	
	public DocumentPrinter(Scanner scanner) {
		this.scanner = scanner;
	}
	
	@Override
	public void print() {
		scanner.scan();
		System.out.println("Document Pringting");
	}

}
