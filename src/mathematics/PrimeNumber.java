package mathematics;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrimeNumberByForLoop(int number) {
		boolean flag = false;
		for (int i = 2; i <= number/2; i++) {
			if (number%i == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public static int enterNumber() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to check prime number or not: ");
		int number = in.nextInt();
		if (number == 0 || number == 1) {
			System.out.println("As '0' and '1' are not prime numbers. Kindly type other than '0' and '1'");
			return enterNumber();			
		}
		return number;	
		
	}

	public static void main(String[] args) {
		int number = enterNumber();
		if(!isPrimeNumberByForLoop(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
		
	}

}