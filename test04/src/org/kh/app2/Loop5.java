package org.kh.app2;
//do~while
public class Loop5 {
	public static void main(String[] args) {
		int a = 0;
		while(a>10) {
			a++;
			System.out.println("a = "+a);			//결과값 안나옴
		}
		
		
		/*do~while~ : 조건이 만족하지 않더라도 1회 이상 실행을 보장하는 문장 */
		do {
			System.out.println("a = "+a);
		} while(a>10);
		
		for(int i=10;i>0;i--) {					//역for문
			System.out.println("i = "+i);
		}
			
	}
}
