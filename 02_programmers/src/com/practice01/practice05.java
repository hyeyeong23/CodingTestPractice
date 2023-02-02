package com.practice01;

public class practice05 {
	String A = "hello";
	String B = "ohell";
	
	/* 문자열 밀기 */
	public int solution(String A, String B) {
        int answer = 0;
        
        String copy = A;
        for(int i = 0; i < A.length(); i++) {
            if(copy.equals(B)) {
                return answer;
            }
            String str = copy.substring(copy.length() - 1);
            copy = str + copy.substring(0, copy.length() - 1);
            answer++;
        }
        return -1;
    }
}
