package com.self.design_patterns;

interface Coffee {
	int cost();
}

class SimpleCoffee implements Coffee {
	public int cost() {
		return 10;
	}
}

class MilkDecorator implements Coffee {
	private Coffee coffee;

	MilkDecorator(Coffee c) {
		coffee = c;
	}

	public int cost() {
		return coffee.cost() + 2;
	}
}