import java.util.Scanner;

public class N1_ID_10818 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    int min = 0;
    int max = 0;

    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    min = arr[0];
    max = arr[0];

    for(int j = 0; j < n; j++) {
      if(min > arr[j]) {
        min = arr[j];
      }
    }

    for(int j = 0; j < n; j++) {
      if(max < arr[j]) {
        max = arr[j];
      }
    }

    System.out.printf("%d %d", min, max);
    sc.close();
  }
}
