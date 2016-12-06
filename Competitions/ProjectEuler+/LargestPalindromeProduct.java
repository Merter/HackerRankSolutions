
import java.io.*;
import java.util.*;


public class LargestPalindromeProduct {

	public static void main(String[] args) {
		TreeSet<Integer> sortedPalindromes = new TreeSet<Integer>();
		for (int i=100; i<1000; i++) {
			for (int j=100; j<1000; j++) {
				int product = i*j;
				if (isPalindrome(product)) {
					sortedPalindromes.add(product);
				}
			}
		}
	
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		for (int t=0; t<tests; t++) {
			int max = in.nextInt();
			System.out.println(sortedPalindromes.lower(max));
		}
		in.close();	
	}
	
	private static boolean isPalindrome(int num) {
		int current = num;
		int reverse = 0;
		while (current > 0) {
			reverse *= 10;
			reverse += current%10;
			current /= 10;
		}
		return reverse==num;
	}

}

