package com.practice01;

public class practice02 {

	/* 프로그래머스 옹알이(1) */
	public static int main(String[] args) {
		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
		
		int count = 0;
        
        String str1 = "aya";
        String str2 = "ye";
        String str3 = "woo";
        String str4 = "ma";
        
        for(int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replace(str1, "*");
            babbling[i] = babbling[i].replace(str2, "*");
            babbling[i] = babbling[i].replace(str3, "*");
            babbling[i] = babbling[i].replace(str4, "*");
            babbling[i] = babbling[i].replace("*", "");
            System.out.println(babbling[i]);
            
            if(babbling[i].equals("")) {
                count++;
            }
        }
        
        return count;
	}

}
