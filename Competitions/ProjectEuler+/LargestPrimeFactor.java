import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Project Euler #3
public class LargestPrimeFactor {
    
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
      long n = in.nextLong();
      System.out.println(largestPrimeFactorFor(n));
    }
    in.close();
  }
  
  private static long largestPrimeFactorFor(long num) {
    long maxPrime = 1L;
    for (long div=1; div<=Math.sqrt(num); div++) {
      if (num%div == 0) {
        long quo = num/div;
        if (isPrime(quo)) {
          return quo;
        }
        if (isPrime(div)) {
          maxPrime = div;
        }
      }
    }
    return maxPrime;
  }

  private static boolean isPrime(long num) {
    if (num<2) {
      return false;
    }
    for (long div=2; div<=Math.sqrt(num); div++) {
      if (num%div == 0) {
        return false;
      }
    }
    return true;
  }
}
