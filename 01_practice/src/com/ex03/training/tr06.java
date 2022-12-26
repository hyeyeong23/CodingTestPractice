package com.ex03.training;

import java.util.Arrays;
import java.util.Scanner;

/* 원하는 키워드 찾기 */
public class tr06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] x = {
				"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const"
		};
		
		System.out.print("원하는 키워드를 입력하세요: ");
		String key = sc.next();
		
		int index = Arrays.binarySearch(x, key);
		
		if(index < 0) {
			System.out.println("해당 키워드가 없습니다.");
		} else {
			System.out.println("해당 키워드는 x[" + index + "]에 있습니다.");
		}
	}

}
