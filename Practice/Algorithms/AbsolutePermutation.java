import java.io.*;
import java.util.*;


public class AbsolutePermutation {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int testCount = scan.nextInt();
    for (int t=0; t<testCount; t++) {
      int N = scan.nextInt();
      int K = scan.nextInt();
      System.out.println(absolutePermutation(N, K));
    }
    scan.close();
  }
  
  private static String absolutePermutation(int N, int K) {
    int[] absPerm = new int[N];
    for (int i=0; i<K; i++) {
      int pos = i+1;
      while (pos<=N) {
        if (pos+K > N)
          return "-1";
        absPerm[pos-1] = pos+K;
        pos += 2*K;
      }
    }
    for (int i=1; i<=K; i++) {
      int pos = N-i;
      while (pos>=0) {
        if (pos-K < 0)
          return "-1";
        absPerm[pos-1] = pos-K;
        pos -= 2*K;
      }
    }
    StringBuilder stb = new StringBuilder();
    for (int i=0; i<N; i++) {
      stb.append(absPerm[i]);
      stb.append(" ");
    }
    return stb.toString().trim();
  }

}
