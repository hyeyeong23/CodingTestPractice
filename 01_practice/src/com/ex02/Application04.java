package com.ex02;

import java.util.Scanner;

public class Application04 {

	/* 배열b의 모든 요소를 배열a에 복사하기 */
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		for(int i = 0; i < num; i++) {
			a[i] = b[i];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 요솟수 : ");
		int numa = sc.nextInt();
		int[] a = new int[numa];
		for(int i = 0; i < numa; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("b의 요솟수 : ");
		int numb = sc.nextInt();
		int[] b = new int[numb];
		for(int i = 0; i < numb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		copy(a, b);
		
		System.out.println("배열b의 모든 요소를 배열 a에 copy 하면");
		for(int i = 0; i < numa; i++) {
			System.out.println("a[" + i + "] : " + a[i]);
		}
		
	}

}
