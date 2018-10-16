package com.java.interface_test;

public class app {
	public static void main(String[] args) {
		MyThread mth = new MyThread();
		mth.run();
		
		MyRunnable mra = new MyRunnable();
		mra.run();
	}
}
