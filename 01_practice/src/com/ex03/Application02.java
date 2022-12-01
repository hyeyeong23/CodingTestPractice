package com.ex03;

import java.util.Scanner;

public class Application02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("개수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];						// num크기의 x라는 배열
		
		/* 배열에 값을 담아주기 위해서 for문 사용 */
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int index = search(x, num, key);			// 배열에서 key에 해당하는 값을 검색
		
		if(index == -1) {
			System.out.println("그 값에 해당하는 값은 없습니다.");
		} else {
			System.out.println("그 값은 x[" + index + "]입니다.");
		}
	}

	private static int search(int[] x, int num, int key) {
		
		/* 출력화면 만들기 */
		System.out.print("   |");
		for(int i = 0; i < num; i++) {
			System.out.print(" " + i + " ");
		}
		System.out.println();
		
		System.out.print("---+");
		for(int i = 0; i < num; i++) {
			System.out.print("---");
		}
		System.out.println();
		
		System.out.print("   |");
		
		/* 배열에서 key값에 해당하는 값을 검색하여 i를 반환 */
		for(int i = 0; i < num; i++) {
			if(key == x[i]) {
				return i;
			}
		}
		
		return -1;
	}

}
