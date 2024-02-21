package org.kh.site2;
//복합 대입 연산자 : 연산 후에 대입하는 연산자 +=,-=,*=, /=, %=, |=, >>=, <<=, >>>=, ^=
//비트 연산자 : &(and), |(or), ~(complement), ^(xor), >>(>>>, right shift), <<(left shift) <<<(이건 없음)
public class Operation7 {
	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		int tmp;
		
		a += b;	//a=35, b=15
		b -= a;	//a=35, b=-20
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		// a와 b의 값을 맞교환 (tmp라는 변수를 만들어서 교환)
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("********** 교환 후 **********");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//비트(2진수) 연산
		int x = 0b01101;
		int y = 0b01011;
		System.out.println("x = "+Integer.toBinaryString(x));
		System.out.println("y = "+Integer.toBinaryString(y));
		System.out.println("x & y = "+Integer.toBinaryString(x & y));	//and
		System.out.println("x | y = "+Integer.toBinaryString(x | y));	//or
		System.out.println("x ^ y = "+Integer.toBinaryString(x ^ y));	//xor : 입력이 서로 다른 경우 1을 출력, 배타적 논리합, 2진수 연산
		System.out.println("~x "+Integer.toBinaryString(~x));			//not
		System.out.println("x >> 2 : "+Integer.toBinaryString(x >> 2));	//right shift : /2와 같음
		System.out.println("x >> 2 : "+Integer.toBinaryString(x << 2));	//left shift : *2와 같음
		System.out.println("********** 대입 연산자 **********");
		
		int i = 25;	//11001
		int j = 30;	//11110
		
		i &= j;	// i = i & j
		System.out.println("i &= j : "+i);	//11000 = 24
		System.out.println("i &= j : 2진수 "+Integer.toBinaryString(i));
		
		i=25;
		i |= j;	// i = i | j
		System.out.println("i |= j : "+i);	//11111 = 31
		System.out.println("i |= j : 2진수 "+Integer.toBinaryString(i));
		
		i=25;
		i ^= j;	// i = i ^ j
		System.out.println("i ^= j : "+i);	//111 = 7
		System.out.println("i ^= j : 2진수 "+Integer.toBinaryString(i));
		
		j >>= 2;
		System.out.println("i >>= j : "+j);	//11110 = 7
		System.out.println("i >>= j : 2진수 "+Integer.toBinaryString(j));
		
		j=30;
		j <<= 2;
		System.out.println("i <<= j : "+j);	//1111000 = 120
		System.out.println("i <<= j : 2진수 "+Integer.toBinaryString(j));
		
		int e = 2;
		System.out.println(Integer.toBinaryString(~e));
	}
}