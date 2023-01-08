package com.ex04.training;

public class tr01 {

	private int[] stk;			// 스택용 배열
	private int capacity;		// 스택 용량
	private int ptr;			// 스택 포인터
	
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	public void IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= capacity) {
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
	}
	
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1];
	}
	
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stk[i] ==x) {
				return i;
			}
		}
		return -1;
	}
	
	public int getCapacity() {
		return capacity;
	}

}
