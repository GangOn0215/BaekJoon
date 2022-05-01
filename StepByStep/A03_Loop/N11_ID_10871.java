package StepByStep.A03_Loop;

import java.util.Scanner;

public class N11_ID_10871 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      if (x > a[i]) {
        System.out.printf(a[i] + " ");
      }
    }
    System.out.println();

    sc.close();
  }
}
