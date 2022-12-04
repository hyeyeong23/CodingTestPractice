package com.ex03;

import java.util.Scanner;

public class Application03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("개수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt(); 
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int index = search(x, num, key, x);			// 배열에서 key에 해당하는 값을 검색
		
		System.out.println("반환값 : " + index);
	}

	private static int search(int[] x, int num, int key, int[] idx) {
		int index = 0;
		for(int i = 0; i < num; i++) {
			if(x[i] == key) {
				idx[index++] = i;
			}
		}
		return index;
	}

}
