package com.ex01;

import java.util.Scanner;

public class Application10 {

	/* 양의 정숫값의 자릿수 구하기 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("양의 정숫값을 입력하시오 : ");
			n = sc.nextInt();
		} while (n <= 0);
		
		int no = 0;
		while(n > 0) {
			n /= 10;
			no++;
		}
		System.out.println("그 수는 " + no + "입니다.");
		
	}

}
