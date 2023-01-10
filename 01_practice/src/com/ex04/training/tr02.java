package com.ex04.training;

import java.util.Scanner;

public class tr02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while (true) {
			System.out.println();
			System.out.printf("현재 데이터 개수: %d / $d\n", s.size(), s.getCapacity());
			System.out.printf("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (0) 종료 : ");
			
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.printf("데이터: ");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			}
	
		}
	}

}
