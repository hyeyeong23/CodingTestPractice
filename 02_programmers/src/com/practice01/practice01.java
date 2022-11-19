package com.practice01;

import java.util.ArrayList;
import java.util.List;

public class practice01 {

	public static void main(String[] args) {
		int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
		int[] avg = new int[score.length];
		int count = 0;
		List<Integer> list = new ArrayList<>();
		List<Integer> rank = new ArrayList<>();
		
		for(int i = 0; i < score.length; i++) {
			int num1 = score[i][0];
			int num2 = score[i][1];
			
			avg[i] = (num1 + num2) / 2;
			System.out.println(avg[i]);
			list.add(avg[i]);
		}
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			int tempScore = list.get(i);
			count = list.size();
			for(int j = 0; j < list.size(); j++) {
				if(tempScore > list.get(j)) {
					count--;
				}
			}
			rank.add(count);
		}
		System.out.println(rank);
	}

}
