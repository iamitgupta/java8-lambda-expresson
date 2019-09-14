package com.dev.methodref;

public class MethodRefrenece {
	public static void main(String[] args) {

		// for static method
		Thread t1 = new Thread(Printer::threadStatus);
		t1.start();

		// for non-static method
		Thread t2 = new Thread(new Printer()::show);
		t2.start();

		// using interface ref.
		Tester test = new Printer()::displaySomething;
		test.display();

		// calling constructor
		TesterFuncInterface test2 = Printer2::new;
		test2.display(123);

	}

}
