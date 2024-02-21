package org.kh.site;
//증감 연산 : ++, -- => 전위 연산, 후위연산이 각각 있음
public class Operation4 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		/*
		 * ++a => 증가 후 출력 
		 * a++ => 출력 후 증가
		 * --a => 감소 후 출력
		 * a-- => 출력 후 감소
		 */
		
		System.out.println("전위 증가 연산 : "+(++a));	//11
		System.out.println("후위 증가 연산 : "+(b++));	//10
		System.out.println("전위 감소 연산 : "+(--a));	//10
		System.out.println("후위 감소 연산 : "+(b--));	//11
		
		System.out.println("a : "+a);
		System.out.println("B : "+b);
		
	}
}