package arrays_hw;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		int myArr[] = {17,3,45,13};
		
		int sum = Arrays.stream(myArr).sum();
		
		System.out.println(sum);
	}

}
