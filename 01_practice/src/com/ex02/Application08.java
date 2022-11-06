package com.ex02;

import java.util.Scanner;

public class Application08 {

	int y;		// 년
	int m;		// 월
	int d;		// 일
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},		// 평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},		// 윤년
	};

	static int isLeap(int year) {
		/* 4로 나누어 떨어지면 윤년, 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어지면 윤년 */
		int leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
		return leapYear;
	}
	
	/* 생성자 */
	public Application08(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}

	/* n일 후의 날짜를 계산 */
	Application08 after(int n) {
		Application08 temp = new Application08(this.y, this.m, this.d);
		if(n < 0) {
			return before(-n);
		}
		
		temp.d += n;
		
		while(temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
			temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
			if(++temp.m > 12) {
				temp.y++;
				temp.m = 1;
			}
		}
		return temp;
	}
	
	/* n일 전의 날짜를 계산 */
	Application08 before(int n) {
		Application08 temp = new Application08(this.y, this.m, this.d);
		if(n < 0) {
			return after(-n);
		}
		
		temp.d -= n;
		
		while(temp.d < 1) {
			if(--temp.m < 1) {
				temp.y--;
				temp.m = 12;
			}
			temp.d += mdays[isLeap(temp.y)][temp.m - 1];
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("날짜를 입력하세요.");
		System.out.print("년 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("일 : ");
		int day = sc.nextInt();
		
		System.out.print("전/후 날짜를 구한 n값을 입력하세요 : ");
		int n = sc.nextInt();
		
		
	}

}
