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
	
	/* 하샤드 수 */
	public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        String str = Integer.toString(x);
        int[] arrNum = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            arrNum[i] = str.charAt(i) - '0';
        }
        
        for(int i = 0; i < arrNum.length; i++) {
            sum += arrNum[i];
        }
        if(x % sum != 0) {
            answer = false;
        }
        return answer;
    }
}
