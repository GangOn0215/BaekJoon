/**
 * Author: CoxeMonkey
 * Create_at: 2022-04-21
 * 
 * 문제
 *   두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 * 입력
 *   첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출력
 *   첫째 줄에 A-B를 출력한다.
 * 
 * 예제 입력
 *   3 2
 * 예제 출력 
 *   1
 * 
 * 문제 해결
 *   java라서 Scanner 을 이용하여 a, b 변수를 선언하고 Scanner로 데이터를 받은 뒤 
 *   System.out.printfln 을 이용하여 a - b 를 넣어주어 답을 해결하였습니다.
 * 
 */

package StepByStep.A01_Input_Output;

import java.util.Scanner;

public class N6_ID_1001 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a;
    int b;

    a = sc.nextInt();
    b = sc.nextInt();

    System.out.println(a - b);

    sc.close();
  }  
}
