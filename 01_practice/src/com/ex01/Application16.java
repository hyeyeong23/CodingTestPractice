package com.ex01;

import java.util.Scanner;

public class Application16 {

	static void npira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("n값을 입력하시오 : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		npira(n);
		
	}

}
