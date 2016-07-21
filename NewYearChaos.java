import java.io.*;
import java.util.*;


public class NewYearChaos {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int testCount = scan.nextInt();
    for (int t=0; t<testCount; t++) {
      int numCount = scan.nextInt();
      int[] nums = new int[numCount];
      for (int i=0; i<numCount; i++) {
        nums[i] = scan.nextInt();
      }
      System.out.println(bribeCount(nums));
    }
    scan.close();
  }

  public static String bribeCount(int[] nums) {
    int count = 0;
    for (int i=0; i<nums.length-1; i++) {
      if (nums[i] > i+3) {
        return "TOO CHAOTIC";
      }
      for (int j=i+1; j<nums.length; j++)
        if (nums[i] > nums[j])
          count++;
    }
    return String.valueOf(count);
  }
}