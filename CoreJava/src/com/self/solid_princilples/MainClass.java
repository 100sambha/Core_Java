package com.self.solid_princilples;

public class MainClass {
	public static void main(String[] args) {
		LaserPrinter printer = new DocumentPrinter(new DocumentScan());
		printer.print();
	}

}
