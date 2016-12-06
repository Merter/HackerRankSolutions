import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MultiplesOf3and5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(sumOfMultiplesOf3and5(n));
        }
        in.close();
    }
    
    private static long sumOfMultiplesOf3and5(int n) {
        long count = (n-1) / (long)3;
        long sum = 3*count*(count+1)/2;
        
        count = (n-1) / (long)5;
        sum += (5*count*(count+1)/2);
        
        count = (n-1) / (long)15;
        sum -= (15*count*(count+1)/2);
        return sum;
    }
}

