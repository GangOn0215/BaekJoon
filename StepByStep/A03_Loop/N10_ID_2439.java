package StepByStep.A03_Loop;

import java.util.Scanner;

public class N10_ID_2439 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = n - 1; j > i; j--) {
        System.out.printf(" ");
      }
      for (int j = 0; j < i + 1; j++) {
        System.out.printf("*");
      }

      System.out.println();
    }

    sc.close();
  }
}
