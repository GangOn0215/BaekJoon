package StepByStep.A03_Loop;

import java.util.Scanner;

public class N1_ID_2739 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int multi = sc.nextInt();

    for (int i = 1; i <= 9; i++) {
      System.out.println(multi + " * " + i + " = " + multi * i);
    }

    sc.close();
  }
}
