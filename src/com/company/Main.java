package com.company;
public class Main {
	public static void main(String[] args) {
		String a = "my test ";
		String b = "this is";
		String c;
			switch (a) {
				case "MY TEST":
					c = a + b;
					break;
				case "My_Test":
					c = b + a;
					break;
				case "my_test":
					c = a + a;
					break;
				default:
					c = a + a;
			}
		System.out.println(c);

		Interface myInterface = new Interface();
		myInterface.walk();
		myInterface.run();
	}
}