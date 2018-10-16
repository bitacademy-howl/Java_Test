package com.java.mutex;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NotConsideredMutex.queue[0] = 'a';
		NotConsideredMutex.queue[1] = 'b';
		NotConsideredMutex.queue[2] = 'c';
		NotConsideredMutex.queue[3] = 'd';
		
		int i = 0;
		while(NotConsideredMutex.queue[i] != 0) {
			System.out.println(NotConsideredMutex.getchar());
			i++;
		}
	}
}
