package com.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class Application06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("개수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0]: ");
		x[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = sc.nextInt();
			} while(x[i] < x[i - 1]);
		}
		
		System.out.print("검색할 값:");
		int key = sc.nextInt();
		
		int index = Arrays.binarySearch(x, key);
		
		/* 검색에 실패할 때 삽입 포인트의 값 출력 추가 */
		if(index < 0) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println("그 값은 x[" + index + "]에 있습니다.");
		}
	}

}
