package com.java.interface_test;

public class app {
	public static void main(String[] args) {
		ThreadTest mth = new ThreadTest();
		mth.start();
		
		RunnableTest mra = new RunnableTest();
//		mra.run();  // 이것은 쓰레드가 아님
		Thread rable = new Thread(mra);
		rable.start();
		
//		람다식으로 Thread 생성 및 실행
		
		Thread thread = new Thread(() -> {
			String threadName = Thread.currentThread().getName();
			
			for(int i = 0; i < 10; i++) {
				System.out.println(threadName);
				sleep
			}
			
		});
		
		thread.setName("Thread #1");
		thread.start();
	}
}
