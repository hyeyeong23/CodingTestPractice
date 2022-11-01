package com.ex02;

import java.util.Arrays;
import java.util.Scanner;

public class Application02 {

	/* 배열 요소를 역순으로 정렬하기 */
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		System.out.println(Arrays.toString(a));
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i +"]와 a[" + (a.length - i - 1) + "]을 교환합니다.");
			swap(a, i, a.length - i - 1);
			System.out.println(Arrays.toString(a));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);
		
		System.out.println("역순 정렬을 마쳤습니다.");
	}

}
