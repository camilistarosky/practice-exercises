package codewars;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			num[i] = Integer.valueOf(scan.nextLine());
			
			if (num[i] > 0) {
				sum += num[i];
			} 
		}
		System.out.println(+sum);
	}
}