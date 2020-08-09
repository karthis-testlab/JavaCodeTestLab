package mathematics;

import java.util.Scanner;

/**
 * Logic: In mathematics, the Fibonacci numbers or Fibonacci series, commonly denoted Fn, form a sequence, called the Fibonacci sequence, 
 *        such that each number is the sum of the two preceding ones, starting from 0 and 1.
 */
public class FibonacciSeries {
	
	public static void fibonacciSeriesByForLoop(int count) {
		int n1 = 0, n2 = 1, n3;
		System.out.print("The fibonacci series of "+count+" is :- "+n1+", "+n2);
		for (int i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(", "+n3);
			n1 = n2;
			n2 = n3;
		}
	}
	
	public static void fibonacciSeriesByWhileLoop(int count) {
		int n1 = 0, n2 = 1, n3, i = 2;
		System.out.print("The fibonacci series of "+count+" is :- "+n1+", "+n2);
		while (i < count) {
			n3 = n1 + n2;
			System.out.print(", "+n3);
			n1 = n2;
			n2 = n3;
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the fibonacci sequence count: ");
		int count = in.nextInt();
		fibonacciSeriesByWhileLoop(count);
		in.close();
	}

}
