package com.dev.test;

public class LambdaTest {
	public static void main(String[] args) {
		
//		FunInterface f = () -> System.out.println("Lambda Expression");
//		System.out.println("before method call");
//		f.display();
		
		Runnable r = () -> {

			System.out.println("Thread is created");

		};

		Thread t = new Thread(r);


		t.start();

	}
}
