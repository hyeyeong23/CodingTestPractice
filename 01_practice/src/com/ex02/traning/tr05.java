package com.ex02.traning;

import java.util.Arrays;
import java.util.Scanner;

/* 배열에 있는 값들을 역순으로 재배열하기 */
public class tr05 {

	private static void swap(int[] x, int i, int j) {
		int temp = x[i];
		x[i] = x[j];
		x[j] = temp;
	}
	
	private static void reverse(int[] x) {
		for(int i = 0; i < x.length / 2; i++) {
			swap(x, i, x.length - i - 1);
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
		
		System.out.println("역순으로 정리하면");
		System.out.println("x = " + Arrays.toString(x));
		
	}

	

}
