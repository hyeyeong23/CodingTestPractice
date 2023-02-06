package com.ex04;

public class IntArrayQueue {
	private int[] que;		// 큐의 본체
	private int capacity;	// 큐의 용량
	private int num;		// 현재 데이터 개수
	
	/* 실행 시 예외처리: 큐가 비어 있음 */
	public class EmptyIntArrayQueueException extends RuntimeException {
		public EmptyIntArrayQueueException() {}
	}
	
	/* 실행 시 예외처리: 큐가 가득 차 있음 */
	public class OverflowIntArrayQueueException extends RuntimeException {
		public OverflowIntArrayQueueException() {}
	}
	
	/* 생성자 */
	public IntArrayQueue(int maxlen) {
		num = 0;
		capacity = maxlen;
		try {
			que = new int[capacity];
		} catch(OutOfMemoryError e) {
			capacity = 0;
		}
	}
	
	/* 큐에 데이터를 인큐 */
	public int enque(int x) throws OverflowIntArrayQueueException {
		if(num >= capacity) {
			throw new OverflowIntArrayQueueException();
		}
		que[num++] = x;
		return x;
	}
	
	
}
