package com.ex02.traning;

import java.util.Random;
import java.util.Scanner;

public class tr04 {

	/* 랜덤으로 나오는 키 중에서 최댓값 구하기 */
	private static int maxOf(int[] height) {
		int max = height[0];
		for(int i = 0; i < height.length; i++) { 
			if(height[i] > max) {
				max = height[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		System.out.println("키는 아래와 같습니다.");
		for(int i = 0; i < num; i++) {
			height[i] = 100 + random.nextInt(90);	// 100 + 0~89사이의 난수
			System.out.println("height[" + i + "] : " + height[i]);
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}
}
