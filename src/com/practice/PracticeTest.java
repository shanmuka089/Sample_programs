package com.practice;

public class PracticeTest {

	public static void main(String[] args) {

		System.out.println("before main");
		Abc.method1();
		System.out.println("after main");
	}
}

class Abc {

	public static void method1() {
		System.out.println("before method call m1");
		method4();
		System.out.println("after method call m1");
	}

	public static void method3() {
		System.out.println("method m3");	
	}

	public static void method4() {
		System.out.println("before method m4");
		method3();
		System.out.println("after method m4");
	}
}
