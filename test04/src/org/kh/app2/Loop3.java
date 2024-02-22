package org.kh.app2;

public class Loop3 {
	public static void main(String[] args) {
		int[] nums = {80,95,75,60,100,65,70,90,85,95};
		System.out.println("점수\t판정");
		/* 자바 1.6 이상 개선된 for문 (중요)
		for(int n : nums) {
			if (n>=80) {
				System.out.print(n+"점\t합격\n");
			} else {
				System.out.print(n+"점\t탈락\n");
			}
		}
		*/
		for(int i=0;i<nums.length;i++) {
			System.out.println(i);
		}
	}
}