package org.kh.java;
//형 변환1(Auto Casting, Force Casting) = type conversion
public class Casting1 {
	public static void main(String[] args) {
		//Auto Casting(묵시적 형변환) : 작은 크기의 저장소에 있는 데이터 값이 큰 크기의 저장소로 옮겨지면서 자동으로 형 변환
		byte b = 20;	//1byte
		short s = b;	//2byte : byte => short
		int i = s;		//4byte short => integer
		long l = i;		//8byte integer => long
		//Force Casting(명시적 형변환) : 큰 크기의 저장소에 있는 데이터 값을 별도의 타입 연산자를 활용하여 강제로 형 변환
		int i2 = (int) l;
		short s2 = (short) i;
		byte b2 = (byte) s;
		
		//page69 Q4
		int A = 10;
		double B = 2.0;
		int S = A+(int)B;
		System.out.println(S);
		//page69 Q5
		char g = '\uAE00';
		System.out.println(g);
	}
}