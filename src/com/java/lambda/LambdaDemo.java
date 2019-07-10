package com.java.lambda;

interface A {
	public void show(String name, int age);
}

/*Option1: Traditional way to use interface method with external class*/
class ABC implements A{
	public void show (String name, int age) {
		System.out.println("Hi " + name + " your age is " + age);
	}
}

public class LambdaDemo {

	public static void main(String[] args) {
		
		/* Option 1: Traditional way to use with class object*/
		A obj1 = new ABC();
		obj1.show("Abhi", 5);
		
		
		
		/*Option2: Traditional way to use interface method with annonymous inner class*/
		A obj2 = new A () {
			public void show (String name, int age) {
				System.out.println("Hi " + name + " your age is " + age);
			}
		};
		obj2.show("Kapil", 10);
		
		
		
		/*Option 3: Using lambda*/
		A Obj3 = (name,age)->System.out.println("Hi " + name + " your age is " + age);
		Obj3.show("Rohit",15);
	}

}
