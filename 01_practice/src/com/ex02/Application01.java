package com.ex02;

import java.util.Random;

public class Application01 {

	static int maxof(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int num = 1 + random.nextInt(20);
		int[] height = new int[num];
		
		System.out.println("사람 수는 " + num + "명입니다.");
		for(int i = 0; i < num; i++) {
			height[i] = 100 + random.nextInt(90);
			System.out.println(height[i]);
		}
		System.out.println("최댓값은 " + maxof(height) + "입니다.");
	}

}
