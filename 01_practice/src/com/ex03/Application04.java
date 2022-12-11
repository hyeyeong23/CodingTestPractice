package com.ex03;

import java.util.Scanner;

public class Application04 {

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
		
		int index = search(x, num, key);
		
		if(index == -1) {
			System.out.println("그 값에 해당하는 값은 없습니다.");
		} else {
			System.out.println("그 값은 x[" + index + "]입니다.");
		}
	}

	private static int search(int[] x, int num, int key) {
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
		System.out.print("   |<-");
		for(int i = 0; i < key; i++) {
			System.out.print("  ");
		}
		System.out.print("+");
		for(int i = 0; i < key; i++) {
			System.out.print("  ");
		}
		System.out.print("->");
		System.out.println();
		System.out.print(key + "  |");
		
		for(int j = 0; j < num; j++) {
			System.out.print(" " + x[j] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < num; i++) {
			if(key == x[i]) {
				return i;
			}
		}
		
		return -1;
	}

}
