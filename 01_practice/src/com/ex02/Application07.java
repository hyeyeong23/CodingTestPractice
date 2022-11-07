package com.ex02;

import java.util.Scanner;

public class Application07 {

	static final int VMAX = 21;			// 시력의 분포(0.0 ~ 0.1 단위로 21개)
	
	static class PhyscData {
		String name;
		int height;
		double vision;
		
		/* 생성자 */
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	/* 시력 분포 */
	static void distvision(PhyscData[] dat, int[] dist) {
		int i = 0;
		
		dist[i] = 0;
		for(i = 0; i < dat.length; i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
				dist[(int)(dat[i].vision * 10)]++;
			}
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
		
		System.out.println("<신체 검사 리스트>");
		System.out.println("이름       키   시력");
		System.out.println("--------------------");
		for(int i = 0; i < x.length; i++) {
			
			/*
			 * -8s : 8칸만큼 왼쪽 정렬(마이너스는 왼쪽 정렬, 플러스는 오른쪽 정렬)
			 * 3d : 3자리의 정수
			 * 5.1f : 전체 5자리에서 소수점 1자리까지 표현
			 */
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}

		distvision(x, vdist);
		
		System.out.println("\n<시력의 분포>");
		for(int i = 0; i < VMAX; i++) {
			System.out.printf("%3.1f~ : ", i / 10.0);
			for(int j = 0; j <vdist[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
