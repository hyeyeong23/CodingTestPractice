package com.ex02;

import java.util.Scanner;

public class Application03 {

	/* 배열 a의 모든 요소의 합계 구하기 */
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수(길이)를 입력하세요 : ");
		int num = sc.nextInt();
		
		int[] a = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.println("모든 요소의 합계는 " + sumOf(a) + "입니다.");
	}

}
