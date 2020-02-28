package com.company.factorial;

public class Factorial {
	static int factorialCycle(int n) {
		if(n == 1) {
			return 1;
		}
		int res = factorialCycle(n - 1) * n; //вычисление при помощи рекурсии
		return res;
	}

	public static int factorial(int n) {
		//вычисление при помощи цикла
		int res = 1;
		for (int i = 1; i <= n; i++) { // i=1;true;2 | i=2;true;3 | i=3;true;4
			res *= i; // res=1*1 | res=1*2 | res=2*3 | res=6*4
		}
		return res;
	}
	public static void main(String[] args) {
		System.out.println("Калькуляция факториала циклом FOR: " + factorial(3));
		System.out.println("Калькуляция факториала рекурсией: " + factorialCycle(4));
	}
}
