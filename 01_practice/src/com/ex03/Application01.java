package com.ex03;

import java.util.Scanner;

public class Application01 {

	/* 선형 검색(while문을 for문으로 바꾸기) */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("개수: ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		
		int idx = seqSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		}
	}

	private static int seqSearch(int[] x, int num, int key) {
		int i = 0;
		
		x[num] = key;
		
		for(i = 0; i < x.length; i++) {
			if(x[i] == key) {
				break;
			}
		}
		return i == num ? -1 : i;
	}
}
