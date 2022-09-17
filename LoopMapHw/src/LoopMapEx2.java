import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoopMapEx2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, String> modelAndMake = new HashMap<>();
		
		modelAndMake.put("Model 3", "Tesla");
		modelAndMake.put("Palisade", "Hyundai");
		modelAndMake.put("CX-5", "Mazda");
		modelAndMake.put("Escape", "Ford");
		modelAndMake.put("C-130", "Mercedez");
		modelAndMake.put("Sequoia", "Toyota");
		
		
		System.out.println("Hi, what car are you looking for today?");
		String carModel = input.nextLine();
		if(modelAndMake.containsKey(carModel)) {
			String carMake = modelAndMake.get(carModel);
			System.out.println("Perfect, we have your " + carMake + " " + carModel + " right over here!");
		} else {
			System.out.println("Sorry, we don't have that particular vehicle");
		}
		
	}

}
