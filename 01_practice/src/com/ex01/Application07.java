package com.ex01;

import java.util.Scanner;

public class Application07 {

	/* 1부터 n까지의 총합 구하기 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n을 입력하세요 : ");
		int n = sc.nextInt();
		
		int sum = (1 + n) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		
		System.out.println("1부터 n까지의 합은 " + sum + "입니다.");
	}

}
