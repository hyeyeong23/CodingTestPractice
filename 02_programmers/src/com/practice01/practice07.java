package com.practice01;

public class practice07 {
	
	String my_string = "3 + 4";
	int chicken = 100;
	int result = 11;
	int[] array = {3, 10, 28};
	int n = 20;
	int i = 1;
	int j = 13;
	int k = 1;
	String my_string1 = "bus";
	int[] common = {1, 2, 3, 4};
	
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
    
    /* 가까운 수 */
    public class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;
            int temp = Math.abs(array[0] - n);
            
            for(int i = 0; i < array.length; i++) {
                if(Math.abs(array[i] - n) < temp) {
                    temp = Math.abs(array[i] - n);
                    answer = array[i];
                } else if (Math.abs(array[i] - n) == temp) {
                    answer = array[i - 1] <= array[i]? array[i - 1] : array[i];
                }
            }      
            return answer;
        }
    }
    
    /* k의 개수 */
    public int solution(int i, int j, int k) {
        int answer = 0;
        int remain = 0;
        
        for(int a = i; a <= j; a++) {
            int num = a;
            
            while(num > 0) {
                remain = num % 10;
                if(remain == k) {
                    answer++;
                    num /= 10;
                } else {
                    num /= 10;
                } 
            }
        }
        return answer;
    }
    
    /* 모음 제거 */
    public String solution1(String my_string1) {
        String str = my_string1;
        
        str = str.replace("a", "");
        str = str.replace("e", "");
        str = str.replace("i", "");
        str = str.replace("o", "");
        str = str.replace("u", "");
        
        return str;
    }
    
    /* 저주의 숫자 3 */
    public int solution1(int n) {
        int answer = 0;
        
        for(int i = 0; i < n; i++) {
            answer++;
            while(answer % 3 == 0 || String.valueOf(answer).contains("3")) {
              answer++;
              System.out.println(i + "=" + answer);
            } 
        }
        return answer;
    }
    
    /* 다음에 올 숫자 */
    public int solution(int[] common) {
        int answer = 0;
        
        for(int i = 0; i < common.length / 2; i++) {
            int num = common.length;
            if(common[i + 1] - common[i] == common[i + 2] - common[i + 1]) {
                answer = common[num - 1] + (common[i + 1] - common[i]);
            } else if (common[i + 1] / common[i] == common[i + 2] / common[i + 1]) {
                answer = common[num - 1] * (common[i + 1] / common[i]);
            }
        }
        
        return answer;
    }
}
