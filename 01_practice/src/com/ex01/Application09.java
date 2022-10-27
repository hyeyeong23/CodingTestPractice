package com.ex01;

import java.util.Scanner;

public class Application09 {

	/* a, b 값의 차이를 구하시오(단, b가 a보다 커야한다.) */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a값 : ");
		int a = sc.nextInt();
		System.out.print("b값 : ");
		int b = sc.nextInt();
		if(a >= b) {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b값 : ");
			b = sc.nextInt();
		}
		System.out.println("b - a는 " + (b - a) + "입니다.");
	}

}
