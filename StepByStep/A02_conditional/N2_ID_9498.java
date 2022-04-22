/**
 * Author: CoxeMonkey
 * Create_at: 2022-04-22
 * 
 * 제목
 *   시험 성적
 * 
 * 문제
 *   시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 * 
 * 입력
 *   첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 * 
 * 출력
 *   시험 성적을 출력한다.
 * 
 * 예제 입력 1
 *   100
 * 
 * 예제 출력 1
 *   A
 * 
 * 문제 해결
 *   && 연산자를 써도 되지만 90점 이상 80점 이상 70점 이상 60점 이상 그 외 이런방식으로 접근하여 해결하였습니다.
 */


package StepByStep.A02_Conditional;

import java.util.Scanner;

public class N2_ID_9498 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int score = sc.nextInt();
    
    if(score >= 90) {
      System.out.println("A");
    } else if (score >= 80) {
      System.out.println("B");
    } else if (score >= 70) {
      System.out.println("C");
    } else if (score >= 60) {
      System.out.println("D");
    } else {
      System.out.println("F");
    } 

    sc.close();
  }  
}
