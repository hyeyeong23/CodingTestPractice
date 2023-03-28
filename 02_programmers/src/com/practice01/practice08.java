package com.practice01;

public class practice08 {
	
	int[] number = {-2, 3, 0, 2, -5};
	
	/* 삼총사 */
	public int solution(int[] number) {
        int count = 0;
        int sum = 0;
        
        for(int i = 0; i < number.length - 2; i++) {
            for(int j = i + 1; j < number.length - 1; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    sum = number[i] + number[j] + number[k];
                    if(sum == 0) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}
