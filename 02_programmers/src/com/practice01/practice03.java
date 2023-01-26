package com.practice01;

public class practice03 {

	/* 자릿수 더하기 */
	public static int main(String[] args) {
		int n = 1234;
		int answer = 0;
        
        String temp = Integer.toString(n);
        int[] arr = new int[temp.length()];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = temp.charAt(i) - '0';
            answer += arr[i];  
        }
        
        return answer;
	}

}
