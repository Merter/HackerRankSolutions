import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Project Euler #5
public class SmallestMultiple {

    private static final int MAX_SIZE = 40;
    
    public static void main(String[] args) {
        
		long[] multiples = new long[MAX_SIZE+1];
		multiples[1] = 1;
		for (int i=2; i<=MAX_SIZE; i++) {
			if (multiples[i-1]%i == 0) {
                multiples[i] = multiples[i-1];
                continue;
            }
			long gcd = gcd(multiples[i-1], i);
			multiples[i] = ((long)i/gcd) * multiples[i-1];
		}
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(multiples[n]);
        }
    }
    
	private static long gcd(long big, long small) {
		if (big%small == 0)
			return small;
		big %= small;
		return gcd(small, big);
	}
}

