package org.kh.java;

public class Variable1 {
	public static void main(String[] args) {
		boolean a = true;			//1byte, 논리형(true, false) : 
		//byte b = 255; (=>Overflow)
		//byte b =-129; (=>Underflow)
		byte b = 126;				//1byte=8bit=256가지(-128~127)
		short c = 32763; 			//2byte=16bit=65536가지(-32768~32767) 
		char d = 'k';				//2byte
		int e = 234567;				//4byte
		float f = 3.14F;			//4byte, float인 것을 표현 f or F
		long g = 23456789L;			//8byte, long인 걸을 표현 l or L
		double h = 3.14D;			//8byte, double인 것을 표현 d or D
		
		System.out.println("byte+ : "+Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);	//Byte = wrapper type, 하나의 클래스 (boolean은 없음)
		System.out.println("short : "+Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println("char : "+Character.MIN_VALUE+"~"+Character.MAX_VALUE);
		System.out.println("int : "+Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println("float : "+Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		System.out.println("long : "+Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		System.out.println("double : "+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		
	}
}
