package com.ex01;

import java.util.Scanner;

public class Application02 {
	
	/* 세 값의 최솟값 구하기 */
	static int min3(int a, int b, int c) {
		int min = a;
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a를 입력하시오 : ");
		int a = sc.nextInt();
		System.out.print("b를 입력하시오 : ");
		int b = sc.nextInt();
		System.out.print("c를 입력하시오 : ");
		int c = sc.nextInt();
		
		int min = min3(a, b, c);
		
		System.out.println("최솟값은 " + min + "입니다.");
	}
}
