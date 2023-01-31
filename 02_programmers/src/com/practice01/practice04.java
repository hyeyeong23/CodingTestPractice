package com.practice01;

public class practice04 {

	int price = 3;
	int money = 20;
	int count = 4;
	
	/* 부족한 금액 계산하기 */
	public long solution(int price, int money, int count) {
		
        long answer = 0;
        long sum = 0;
        
        for(int i = 1; i <= count; i++) {
            sum += price * i;
        }
        
        if(money >= sum) {
            answer = 0;
        } else {
            answer = sum - money;
        }
        
        return answer;
    }

}
