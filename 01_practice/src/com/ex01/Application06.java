package com.ex01;

import java.util.Scanner;

public class Application06 {

	/* 1부터 n까지의 총합 구하기 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("n을 입력하세요 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("n까지의 총합은 " + sum + "입니다.");
	}

}
