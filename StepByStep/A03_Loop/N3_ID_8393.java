package StepByStep.A03_Loop;

import java.util.Scanner;

public class N3_ID_8393 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    System.out.println(sum);
    sc.close();
  }
}
