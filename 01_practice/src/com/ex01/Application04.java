package com.ex01;

public class Application04 {

	/* 세 값의 중간값 구하기 */
	static int medium(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			} else if(a <= c) {
				return a;
			} else {
				return c;
			}
		} else if(a > c) {
			return a;
		} else if(b > c) {
			return c;
		} else {
			return b;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("중간값(3, 2, 1) : " + medium(3, 2, 1));
		System.out.println("중간값(3, 2, 2) : " + medium(3, 2, 2));
		System.out.println("중간값(3, 1, 2) : " + medium(3, 1, 2));
	}

}
