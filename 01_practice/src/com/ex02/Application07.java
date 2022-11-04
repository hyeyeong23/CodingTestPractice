package com.ex02;

import java.util.Scanner;

public class Application07 {

	static final int VMAX = 21;
	
	static class PhyscData {
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
				new PhyscData("강민하", 162, 0.3),
				new PhyscData("김찬우", 173, 0.7),
				new PhyscData("박준서", 175, 2.0),
				new PhyscData("유서범", 171, 1.5),
				new PhyscData("이수연", 168, 0.4),
				new PhyscData("장경오", 174, 1.2),
				new PhyscData("황지안", 169, 0.8),
		};
		int[] vdist = new int[VMAX];
		
		for(int i = 0; i < x.length; i++) {
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}

		
	}

}
