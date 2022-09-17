import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoopMapEx1 {

	public static void main(String[] args) {
		List<Integer> myArr = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		for(int i=0; i<5; ++i) {		
		
			System.out.println("Enter number:");
			Integer number = Integer.parseInt(input.nextLine());
			myArr.add(number);
		}
		
		System.out.println(myArr);
		
		int sumArr = myArr.stream()
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println("Sum of all values: " + sumArr);
		
		int productArr = myArr.stream()
				.reduce(1, (a, b) -> a * b);
		System.out.println("Product of all values: " + productArr);
		
		int largestOfArr = myArr.stream()
				.max(Integer::compare).get();
		System.out.println("Largest of all values: " + largestOfArr);
		
		int smallestOfArr = myArr.stream()
				.min(Integer::compare).get();
		System.out.println("Smallest of all values: " + smallestOfArr);

	}

}
