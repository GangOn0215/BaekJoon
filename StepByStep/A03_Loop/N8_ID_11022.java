package StepByStep.A03_Loop;

import java.util.Scanner;

public class N8_ID_11022 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int testCase = sc.nextInt();

    for(int i = 1; i <= testCase; i++) {
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();

      System.out.println("Case #" + i + ": " + n1 + " + " + n2 + " = " + (n1 + n2));
    }
    
    sc.close();
  }
}
