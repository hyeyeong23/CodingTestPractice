package com.ex03;

import java.util.Scanner;

public class Application05 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("개수 : ");
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
		
		System.out.print("검색할 값: ");
		int key = sc.nextInt();
		
		int index = search(x, num, key);
		
		if(index == -1) {
			System.out.println("그 값에 해당하는 값은 없습니다.");
		} else {
			System.out.println("그 값은 x[" + index + "]입니다.");
		}
	}

	private static int search(int[] x, int num, int key) {
		int first = 0;
		int end = num - 1;
		
		do {
			int middle = (first + end) / 2;
			if(x[middle] == key) {
				
				/* 개선사항 - 중앙에서 key와 동일한 값을 찾더라도 앞쪽에 동일한 값이 더 없는지 확인 */
				for(int i = 0 ; middle > first; middle--) {
					if(x[middle - 1] != key) {
						break;
					}
				}
				return middle;
				
			} else if(x[middle] < key) {
				first = middle + 1;
			} else {
				end = middle - 1;
			}
		} while(first <= end);
		
		return -1;
	}
}
