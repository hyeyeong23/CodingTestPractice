package com.ex01;

import java.util.Scanner;

public class Application14 {

	/* 왼쪽 아래가 직각인 이등변삼각형 출력 */
	static void triangleB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/* 왼쪽 위가 직각인 이등변삼각형 출력 */
	static void triangleLU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/* 오른쪽 위가 직각인 이등변삼각형 출력 */
	static void triangleRU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/* 오른쪽 아래가 직각인 이등변삼각형 출력 */
	static void triangleRB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("n 값을 입력하시오 : ");
			n = sc.nextInt();
		} while (n <= 0);
		
		System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");
		triangleB(n);
		
		System.out.println("왼쪽 위가 직각인 이등변삼각형을 출력합니다.");
		triangleLU(n);
		
		System.out.println("오른쪽 위가 직각인 이등변삼각형을 출력합니다.");
		triangleRU(n);
		
		System.out.println("오른쪽 아래가 직각인 이등변삼각형을 출력합니다.");
		triangleRB(n);
	}

}
