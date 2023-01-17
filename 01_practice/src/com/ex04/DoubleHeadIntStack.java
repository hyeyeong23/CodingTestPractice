package com.ex04;

public class DoubleHeadIntStack {
	private int[] stk;
	private int capacity;
	private int ptrA;
	private int ptrB;
	
	public enum AorB {StackA, StackB};
	
	public class EmptyDoubleHeadIntStackException extends RuntimeException {
		public EmptyDoubleHeadIntStackException() {}
	}
	
	public class OverflowDoubleHeadIntStackException extends RuntimeException {
		public OverflowDoubleHeadIntStackException() {}
	}
	
	public DoubleHeadIntStack(int maxlen) {
		ptrA = 0;
		ptrB = maxlen - 1;
		capacity = maxlen;
		try {
			stk = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	public int push(AorB sw, int x) throws OverflowDoubleHeadIntStackException {
		if(ptrA >= ptrB + 1) {
			throw new OverflowDoubleHeadIntStackException();
		}
		switch(sw) {
		case StackA: stk[ptrA++] = x; break;
		case StackB: stk[ptrB--] = x; break;
		}
		return x;
	}
	
	public int pop(AorB sw) throws EmptyDoubleHeadIntStackException {
		int x = 0;
		switch (sw) {
		case StackA:
			if(ptrA <= 0) {
				throw new EmptyDoubleHeadIntStackException();
			}
			x = stk[--ptrA];
			break;
		case StackB:
			if(ptrB >= capacity - 1) {
				throw new EmptyDoubleHeadIntStackException();
			}
			x = stk[++ptrB];
			break;
		}
		return x;
	}
}
