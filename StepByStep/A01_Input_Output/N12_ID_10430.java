/**
 * Author: CoxeMonkey
 * Create_at: 2022-04-22
 * 
 * 문제
 *   (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
 *   (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 *   세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 * 
 * 입력
 *   첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 * 출력
 *   첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
 * 
 * 예제 입력 1
 *   5 8 4
 * 예제 출력 1
 *   1
 *   1
 *   0
 *   0
 * 
 * 문제 해결
 *   숫자 a, b, c 를 받은뒤
 *   출력에서 요구하는대로 수식을 적어줬습니다.
 */

package StepByStep.A01_Input_Output;

import java.util.Scanner;

public class N12_ID_10430 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println((a+b)%c);
    System.out.println(((a%c) + (b%c))%c);
    System.out.println((a*b)%c);
    System.out.println(((a%c) * (b%c))%c);

    sc.close();
  }  
}
