package com.practice01;

public class practice06 {

	String[] id_pw = {"meosseugi", "1234"};
	int n = 10;
	
	/* 로그인 성공 문제 풀기 */
	public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        String pwd = id_pw[1];
        
        for(int i = 0; i < db.length; i++) {
               if(db[i][0].equals(id) && db[i][1].equals(pwd)) {
                   answer = "login";
                   break;
               } else if (db[i][0].equals(id) && !db[i][1].equals(pwd)) {
                   answer = "wrong pw";
                   break;
               } else {
                   answer = "fail";
               }
        }
        
        return answer;
    }
	
	/* 나머지가 1이 되는 수 찾기 */
	public int solution(int n) {
        int answer = 0;
        
        for(int i = 2; i <= n; i++) {
            if(n % i == 1) {
                return i;
            }
        }
        return answer;
    }

}
