package com.ex01;

import java.util.Scanner;

public class Application08 {

	/* a, b를 포함한 사이에 있는 값들의 총합 구하기 */
	static int sumof(int a, int b) {
		int min;
		int max;
		
		if(a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}
		
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a 값을 입력하시오 : ");
		int a = sc.nextInt();
		System.out.print("b 값을 입력하시오 : ");
		int b = sc.nextInt();
		
		int sum = sumof(a, b);
		System.out.println("a와 b를 포함하여 그 사이에 있는 값들의 총합은 " + sum + "입니다.");
	}

}
