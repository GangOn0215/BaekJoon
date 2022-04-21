/**
 * Author: CoxeMonkey
 * Create_at: 2022-04-21
 * 
 * 문제
 *   두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 * 입력
 *   첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력
 *   첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
 * 
 * 예제 입력 1
 *   1 3
 * 예제 출력 1
 *   0.33333333333333333333333333333333
 * 
 * 예제 입력 2
 *   4 5
 * 예제 출력 2
 *   0.8
 * 
 * 문제 해결
 *   java라서 Scanner 을 이용하여 a, b 변수를 선언하고 Scanner로 데이터를 받은 뒤 
 *   System.out.printfln 을 이용하여 a / b 를 넣어주어 답을 해결하였습니다.
 * 
 */

import java.util.Scanner;

public class N8_ID_1008 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double a;
    double b;

    a = sc.nextDouble();
    b = sc.nextDouble();

    System.out.println(a / b);

    sc.close();
  }
}
