package collectiondemo;

public class DemoWrapper {
	public static void main(String[] args) {
		String marks ="90";                 //String is a class and marks is object
		int i = Integer.parseInt(marks);    // i is varaible but after using Integer wrraper class we can easily cast
		System.out.println(i+5);
	}

}
