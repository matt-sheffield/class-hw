package arrays_hw;

import java.util.Arrays;

public class Question3 {

	public static void main(String[] args) {
		toPower(4,2);
	}
	public static void toPower(int size, int power) {
		int[] myArray = new int[size];
		for (int i=0; i<size; i++) {
			myArray[i] = (int)Math.pow(i, power);
		}
		System.out.println(Arrays.toString(myArray));
	}

}
