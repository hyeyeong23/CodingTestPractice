package com.ex02.traning;

public class tr07 {

	/* 1000이하의 소수 모두 구하기 */
	public static void main(String[] args) {
		int counter = 0;
		
		for(int n = 2; n <= 1000; n++) {
			int i;
			for(i = 2; i < n; i++) {
				counter++;
				if(n % i == 0) {
					break;
				}
			}
			if(n == i) {
				System.out.println(n);
			}
		}
		System.out.println("나눗셈을 수행한 횟수 : " + counter);
	}

}
