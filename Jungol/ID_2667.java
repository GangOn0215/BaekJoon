package Jungol;

import java.util.Scanner;

public class ID_2667 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int length = sc.nextInt();
    int[][] map = new int[length][length];

    for (int i = 0; i < length; i++) {

    }

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        System.out.println(map[i][j]);
      }
      System.out.println();
    }

    sc.close();
  }
}