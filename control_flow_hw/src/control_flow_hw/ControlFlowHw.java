package control_flow_hw;

import java.util.Random;
import java.util.Scanner;

public class ControlFlowHw {
	
	public class AsciiChars 
	{
	  public static void printNumbers()
	  {
		  System.out.println("The following are numbers:");
		  	for (int i = 0;i<10;i++) {
		  		if(i<9) {
		  			System.out.print(i + ", ");
		  		} else {
		  			System.out.print(i+"\n");
		  		}
		  	}
	  }

	  public static void printLowerCase()
	  {
		  System.out.println("The following are lowercase characters:");
		  for (char i = 97;i<=122;i++) {
		  	if(i<122) {
		   		System.out.print(i + ", ");
		   	} else {
		   		System.out.print(i+"\n");
		   	}
		  }
	  }

	  public static void printUpperCase()
	  {
		  System.out.println("The following are uppercase characters:");
		  for (char i = 65;i<=90;i++) {
		  	if(i<90) {
		   		System.out.print(i + ", ");
		   	} else {
		   		System.out.print(i+"\n");
		   	}
		  }
	  }
	}


	public static void main(String[] args) {
		String redCar, favoritePet, favoriteactor, favoritequarterBack, playAgain, lottoNum;
		int favoritePetAge, luckyNumber, modelNumber, randomNumber, jerseyNumber, magicBall;
		jerseyNumber = 0;
		
		System.out.println("\nHello World");
		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();
		System.out.println("Please enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello " + name + "! Do you wish to continue to the interactive portion?");
		String interactiveReply = scanner.nextLine();

		if(interactiveReply.toLowerCase().equals("yes") || interactiveReply.toLowerCase().equals("y")) {
			do {
				
				System.out.println("Do you have a red car? (yes, no):");
				redCar = scanner.next();
				
				System.out.println("What's the name of your favorite pet?:");
				favoritePet = scanner.next();
				
				System.out.println("How old is your favorite pet?:");
				favoritePetAge = scanner.nextInt();
				
				System.out.println("What is your lucky number?:");
				luckyNumber = scanner.nextInt();
				
				System.out.println("Do you have a favorite quarterback? (yes, no):");
				favoritequarterBack = scanner.next();
				if(favoritequarterBack.toLowerCase().equals("yes") || favoritequarterBack.toLowerCase().equals("y")) {
					System.out.println("What is their jersey number?:");
					jerseyNumber = scanner.nextInt();
				};
				
				System.out.println("What is the 2 digit model number of your car?:");
				modelNumber = scanner.nextInt();
				
				System.out.println("What's the name of your favorite actor or actress?:");
				favoriteactor = scanner.next();
				
				System.out.println("Enter a random number between 1 and 50:");
                randomNumber = Math.abs(scanner.nextInt());
				
				Random randomNum = new Random();
				int randomNum1 = Math.abs(randomNum.nextInt(50));
                int randomNum2 = randomNum.nextInt(50);
                int randomNum3 = randomNum.nextInt(50);
                if(jerseyNumber == 0) {
					magicBall = Math.abs(luckyNumber * randomNum1);
				}
				else {
					magicBall = Math.abs(jerseyNumber * randomNum2);
				}
                while (magicBall > 75) {
					magicBall -= 75;
				};
				
				int lottoNumber1, lottoNumber2, lottoNumber3, lottoNumber4, lottoNumber5;
                lottoNumber1 = modelNumber + luckyNumber;
                while(lottoNumber1 > 65){
                    lottoNumber1 -= 65;
                }
                lottoNumber2 = favoritePetAge + modelNumber;
                while(lottoNumber2 > 65){
                    lottoNumber2 -= 65;
                }
                lottoNumber3 = 42;
                while(lottoNumber3 > 65){
                    lottoNumber3 -= 65;
                }
                lottoNumber4 = (int)favoriteactor.charAt(0);
                while(lottoNumber4 > 65){
                    lottoNumber4 -= 65;
                }
                lottoNumber5 = (int)favoritePet.charAt(2);
                while(lottoNumber5 > 65){
                    lottoNumber5 -= 65;
                }
                System.out.println("Lottery numbers: " + lottoNumber1 + "," + lottoNumber2 + "," + lottoNumber3 + "," + lottoNumber4 + "," +
                 lottoNumber5 + "  Magic ball: " + magicBall + " ");
				

				System.out.println("Would you like to play again? (yes, no):");
				playAgain = scanner.next();
				
			} while (playAgain.toLowerCase().equals("yes") || playAgain.toLowerCase().equals("y"));
				System.out.println("Thanks for playing!");
			};
			
		};
		

	};
