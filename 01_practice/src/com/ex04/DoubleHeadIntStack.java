package com.ex04;

public class DoubleHeadIntStack {
	private int[] stk;			// 스택 본체
	private int capacity;		// 스택 용량
	private int ptrA;			// 스택포인터A
	private int ptrB;			// 스택포인터B
	
	public enum AorB {StackA, StackB};
	
	/* 실행 시 예외 : 스택이 비어 있음 */
	public class EmptyDoubleHeadIntStackException extends RuntimeException {
		public EmptyDoubleHeadIntStackException() {}
	}
	
	/* 실행 시 예외 : 스택이 가득 참 */
	public class OverflowDoubleHeadIntStackException extends RuntimeException {
		public OverflowDoubleHeadIntStackException() {}
	}
	
	/* 생성자 */
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
	
	/* 스택에 x를 푸시 */
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
	
	/* 스택에서 데이터를 팝 */
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
	
	/* 스택에서 데이터를 피크 */
	public int peek(AorB sw) throws EmptyDoubleHeadIntStackException {
		int x = 0;
		switch (sw) {
		case StackA:
			if(ptrA <= 0) {
				throw new EmptyDoubleHeadIntStackException();
			}
			x = stk[ptrA - 1];
			break;
		case StackB:
			if(ptrB >= capacity - 1) {
				throw new EmptyDoubleHeadIntStackException();
			}
			x = stk[ptrB + 1];
			break;
		}
		return x;
	}
	
	/* 스택에서 x를 검색하여 인덱스를 반환(발견하지 못하면 -1을 반환) */
	public int indexOf(AorB sw, int x) {
		switch (sw) {
		case StackA:
			for(int i = ptrA - 1; i >= 0; i--) {
				if(stk[i] == x) {
					return i;
				}
			break;
			}
		case StackB:
			for(int i = ptrB + 1; i < capacity; i++) {
				if(stk[i] == x) {
					return i;
				}
			break;
			}
		}
		return -1;
	}
}
