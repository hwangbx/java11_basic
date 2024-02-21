package org.kh.app;
import java.util.Scanner;

//조건문 if~ elseif~ (else)~
public class Condition3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//scanner console 창에 값 입력하려고 사용하는 자바 유틸 클래스
		System.out.print("점수 입력[0-100] : ");
		int point = scan.nextInt();
		char result;
		/*학점(result)은 점수(point)가
		 * 90~100이면 'A',
		 * 80~89이면 'B',
		 * 70~79이면 'C',
		 * 60~69이면 'D',
		 * 60미만은 'F' 
		 */
		System.out.printf("\n당신의 점수는 %d점 입니다.\n", point);
		
		if(point>=90) {
			result='A';
		} else if(point>=80) {
			result='B';
		} else if(point>=70) {
			result='C';
		} else if(point>=60) {
			result='D';
		}
		else {
			result='F';
		}
		
		System.out.printf("%n당신의 학점은 %s입니다.", result);


	}
}