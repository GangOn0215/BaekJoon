package StepByStep.A03_Loop;

import java.util.Scanner;

public class N7_ID_11021 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int testCase = sc.nextInt();

    for(int i = 0; i < testCase; i++) {
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();

      System.out.println("Case #" + (i + 1) + ": " + (n1 + n2));
    }
    
    sc.close();
  }
}
