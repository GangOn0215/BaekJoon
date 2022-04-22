/**
 * Author: CoxeMonkey
 * Create_at: 2022-04-22
 * 
 * 문제
 *   (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *   (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 * 
 * 입력
 *   첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 * 
 * 출력
 *   첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 * 
 * 예제 입력 1
 *   472
 *   385
 * 
 * 예제 출력 1
 *   2360
 *   3776
 *   1416
 *   181720
 * 
 * 문제 해결
 *   두번째로 받는 숫자를 잘라서 
 * 
 */

package StepByStep.A01_Input_Output;

import java.util.Scanner;

public class N13_ID_2588 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int bOne = b % 10;
    int bTwo = (b / 10) % 10;
    int bThree = (b / 100) % 100;

    System.out.println(a * bOne);
    System.out.println(a * bTwo);
    System.out.println(a * bThree);
    System.out.println(a * b);    

    sc.close();
  }
}
