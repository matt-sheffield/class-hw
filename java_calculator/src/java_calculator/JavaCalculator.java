package java_calculator;

public class JavaCalculator {
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static int subtract(int num1, int num2) {
		int sum = num1 - num2;
		return sum;
	}
	
	public static int multiply(int num1, int num2) {
		int sum = num1 * num2;
		return sum;
	}
	
	public static int divide(int num1, int num2) {
		int sum = num1 / num2;
		return sum;
	}
	
	public static int square(int num) {
		int sum = num * num;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(add(1, 3));
		System.out.println(subtract(8, 2));
		System.out.println(multiply(17, 3));
		System.out.println(divide(32, 4));
		System.out.println(square(9));
	}

}
