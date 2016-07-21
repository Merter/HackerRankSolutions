public class NewYearChaos {

  public void bribeCount(int[] nums) {
    int count = 0;
    for (int i=0; i<nums.length-1; i++) {
      if (nums[i] > i+3) {
        System.out.println("TOO CHAOTIC");
        return;
      }
      for (int j=i+1; j<nums.length; j++)
        if (nums[i] > nums[j])
          count++;
    }
    System.out.println(count);
  }
}