package org.kh.java;

public class Variable7 {
	public static void main(String[] args) {
		String name = "황병찬";
		Integer age = 29;
		String age2 = "29";
		int age3 = Integer.parseInt(age2)+ 8;
		Float height = 177.7f;
		String height2 = "177.7";
		float height3 = Float.parseFloat(height2);
		//boolean pass = true;
		Double weight = 77.7;
		
		System.out.println("age : "+age3);
		System.out.println("height : "+height3);
		System.out.println("name : "+name.getClass().getName());
		System.out.println("age : "+age.getClass().getName());
		System.out.println("height : "+height.getClass().getName());
		System.out.println("Double : "+weight.getClass().getName());
		//primitive type => wrapper type : boxing (기본형 변수를 클래스로 바꿈)
		//wrapper type => primitive type : unboxing
	}
}