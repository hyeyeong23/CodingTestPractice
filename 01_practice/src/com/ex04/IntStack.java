package com.ex04;

public class IntStack {
	private int[] stk;			// 스택용 배열
	private int capacity;		// 스택 용량
	private int ptr;			// 스택 포인터
	
	/* 실행 시 예외 : 스택이 비어 있음 */
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {}
	}
	
	/* 실행 시 예외 : 스택이 가득 참 */
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
	}
	
	/* 생성자 */
	public IntStack(int maxlen) {
		ptr = 0;
		capacity = maxlen;
		try {
			stk = new int[capacity];		// 스택 본체용 배열을 생성
		} catch (OutOfMemoryError e) {		// 생성할 수 없음
			capacity = 0;
		}
	}
	
	/* 스택에 x를 푸시 */
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= capacity) {			// 스택이 가득 차있음
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
	}
	
	/* 스택에서 데이터를 팝함 */
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) {					// 스택이 비어 있음
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}
	
	/* 스택에서 데이터를 피크함 */
	public int peek() throws EmptyIntStackException {
		if(ptr <= 0) {					// 스택이 비어 있음
			throw new EmptyIntStackException();
		}
		return stk[ptr - 1];
	}
	
	/* 스택을 비움 */
	public void clear() {
		ptr = 0;
	}
	
	/* 스택에서 x를 찾아 인덱스를 반환 */
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {		// 꼭대기부터 선형 검색
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	
	/* 스택의 용량을 반환 */
	public int getCapacity() {
		return capacity;
	}
	
	/* 스택에 쌓여 있는 데이터 개수를 반환 */
	public int size() {
		return ptr;
	}
	
	/* 스택이 비어 있는지 확인 */
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	/* 스택이 가득 차 있는지 확인 */
	public boolean isFull() {
		return ptr >= capacity;
	}
	
	/* 스택 안의 모든 데이터를 바닥부터 꼭대기 순서로 출력 */
	public void dump() {
		if(ptr <= 0) {
			System.out.println("스택이 비어 있습니다.");
		} else {
			for(int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
		}
	}
}
