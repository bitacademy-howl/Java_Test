package com.java.mutex;

public class NotConsideredMutex {
	static char[] queue = new char[32];
	static int head = 0;
	int tail = 4;
	public static void setQueue(char[] queue) {
		NotConsideredMutex.queue = queue;
	}
	
	static int getchar(){
	    int pos;
	    char ret;
	    
	    pos = head;
	    ret = queue[pos];
		    
	    pos = (pos + 1) % 32;
	    head = pos;
	    return ret;
	}
}
