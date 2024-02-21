package org.kh.app;
import java.util.Scanner;

public class Condition4 {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);	//scanner console 창에 값 입력하려고 사용하는 자바 유틸 클래스
			System.out.print("점수 입력[0-100] : ");
			int point = scan.nextInt();
			String result;
			/* 점수를 키보드로 입력 받아 판정과 학점 그리고, 시상내용을 쓰시오.
			 * 학점(result)은 점수(point)가
			 * 97~100이면 'A+', 93~96이면 'A0', 90~92이면, 'A-'
			 * 80~89이면 'B+', 83~86이면 'B0', 80~82이면, 'B-'
			 * 70~79이면 'C+', 73~76이면 'C0', 70~72이면, 'C-'
			 * 60~69이면 'D+', 63~66이면 'D0', 60~62이면, 'D-'
			 * 60미만은 'F'로 하되, 다단계 if와 if/elseif/else문 활용
			 * 
			 * 시상 내용은 학점이
			 * 'A+'이면, '학업우수상',
			 * 'A0'이면, '노력상',
			 * 'A-'이면, '아차상',
			 * 나머지는''으로 하되, switch~case~문 활용
			 */
			
			/*
			 [답안 1] 
			 
			if(point>=90) {
				result="A";
				if((point%10>=7 && point%10<=9) || point == 100) {
					result = result+"+";
				} else if(point%10>=3 && point%10<=6) {
					result = result+"0";
				} else {
					result = result+"-";
				}
			} else if(point>=80) {
				result = "B";
				if(point%10>=7 && point%10<=9){
					result = result+"+";
				} else if(point%10>=3 && point%10<=6) {
					result = result+"0";
				} else {
					result = result+"-";
				}
			} else if(point>=70) {
				result = "C";
				if(point%10>=7 && point%10<=9){
					result = result+"+";
				} else if(point%10>=3 && point%10<=6) {
					result = result+"0";
				} else {
					result = result+"-";
				}
			} else if(point>=60) {
				result = "D";
				if(point%10>=7 && point%10<=9){
					result = result+"+";
				}
				else if(point%10>=3 && point%10<=6) {
					result = result+"0";
				} 
				else {
					result = result+"-";
				}
			} else {
				result = "F";
			}
			*/
			
			//[답안2]
			if((point%10>=7 && point%10<=9 && point>=60) || point==100) {
				result = "+";
				if(point>=90) {
					result = "A"+result;
				} else if(point>=80) {
					result = "B"+result;
				} else if(point>=70) {
					result = "C"+result;
				} else {
					result = "D"+result;
				}	
			} else if(point%10>=3 && point%10<=6 && point>=60) {
				result = "0";
				if(point>=90) {
					result = "A"+result;
				} else if(point>=80) {
					result = "B"+result;
				} else if(point>=70) {
					result = "C"+result;
				} else {
					result = "D"+result;
				}	
			} else if(point%10>=0 && point%10<=2 && point>=60) {
				result = "-";
				if(point>=90) {
					result = "A"+result;
				} else if(point>=80) {
					result = "B"+result;
				} else if(point>=70) {
					result = "C"+result;
				} else {
					result = "D"+result;
				}
			} else {
				result = "F";
			}
			
			String remark = "";
			switch(result) {
			case "A+":
				remark = "학업우수상";
				break;
			case "A0":
				remark = "노력상";
				break;
			case "A-":
			remark = "아차상";
				break;
			default:
				remark = "";
			}
			
			System.out.println("당신의 점수 : "+point);
			System.out.println("당신의 학점 : "+result);
			System.out.println("당신의 시상내역 : "+remark);
			
		}
}
			