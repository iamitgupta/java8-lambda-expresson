package com.dev.test;

public class FunImpl implements FunInterface {

	public static void main(String[] args) {
		FunInterface fun = new FunImpl();
		fun.display();
	}

	@Override
	public void display() {
		System.out.println("Boooom");
	}
}
