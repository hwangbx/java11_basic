package org.kh.java;

public class Variable6 {
	public static void main(String[] args) {
		float f1 = 3.14f;
		double f2 = 3.14;
		int kor = 90, eng = 80, mat = 90;				//같은 형식의 변수는 한번에 선언 가능
		float avg = (float)(kor + eng + mat) / 3;		//정수 나누기 정수 = 정수값 (실수로 바꿔주어야함)
														//방법2 float avg = (kor + eng + mat) / 3.0f;
		System.out.printf("\nf1=%." + "3f", f1);
		System.out.printf("\nf2=%.2f", f2);
		System.out.printf("\n평균 : %.2f", avg);
	}
}
