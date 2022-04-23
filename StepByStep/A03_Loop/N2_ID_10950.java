package StepByStep.A03_Loop;

import java.util.Scanner;

public class N2_ID_10950 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int testCaseLength = sc.nextInt();

    for (int i = 0; i < testCaseLength; i++) {
      int tempA = sc.nextInt();
      int tempB = sc.nextInt();

      System.out.println(tempA + tempB);
    }

    sc.close();
  }
}
