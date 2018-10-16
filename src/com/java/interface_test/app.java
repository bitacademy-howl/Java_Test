package com.java.interface_test;

public class app {
	public static void main(String[] args) {
		ThreadTest mth = new ThreadTest();
		mth.start();
		
		RunnableTest mra = new RunnableTest();
//		mra.run();  // 이것은 쓰레드가 아님
		Thread rable = new Thread(mra);
		rable.start();
	}
}
