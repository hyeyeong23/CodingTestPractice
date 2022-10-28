package com.ex01;

import java.util.Scanner;

public class Application15 {
    
	/* n단의 피라미드 만들기 */
	static void spira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
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
		} while (n <= 0);
		
		spira(n);
	}

}
