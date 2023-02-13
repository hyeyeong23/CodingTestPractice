package com.practice01;

public class practice07 {
	
	String my_string = "3 + 4";
	int chicken = 100;
	int result = 11;
	
	/* 문자열 계산하기 */
	public int solution(String my_string) {
        
        String[] str = my_string.split(" ");
        int answer = Integer.parseInt(str[0]);
        
        for(int i = 1; i < str.length; i+=2) {
            if(str[i].equals("+")) {
                answer += Integer.parseInt(str[i+1]);
            } else {
                answer -= Integer.parseInt(str[i+1]);
            }
        }
        return answer;
    }
	
	/* 치킨 쿠폰 */
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        
        while(coupon >= 10) {
            answer += coupon / 10;              // 최대 서비스 치킨의 수
            int rest = coupon % 10;             // 남은 쿠폰수
            coupon = rest + (coupon / 10);      // 총 쿠폰 수 = 남는 쿠폰수 + 서비스치킨으로 생긴 쿠폰 수
        }
        
        return answer;
    }

}
