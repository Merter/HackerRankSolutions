import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Project Euler #2
public class EvenFibonacciNumbers {

	private static final long MAX_N = 4*10000000000000000L;

	public static void main(String[] args) {
		TreeMap<Long, Long> evenSumMap = prepareSumOfEvens();
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		for (int t=0; t<tests; t++) {
			long N = in.nextLong();
			System.out.println(evenSumMap.lowerEntry(N).getValue());
		}
		in.close();
	} 

	public static TreeMap<Long, Long> prepareSumOfEvens() {
		long sum = 2;
		long first = 1;
		long second = 2;
		TreeMap<Long, Long> evenSumMap = new TreeMap<>();
		evenSumMap.put(second, sum);
		while (true) {
			long temp = first;
			first = second;
			second = temp+first;
			if (second > MAX_N)
				break;
			if (second%2 == 0) {
				sum += second;
				evenSumMap.put(second, sum);
			}
		}
		return evenSumMap;
	}
}
