package StepByStep.A03_Loop;

import java.util.Scanner;

public class N6_ID_2742 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    for (int i = n; i > 0; i--) {
      System.out.println(i);
    }

    sc.close();
  }
}
