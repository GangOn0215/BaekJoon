/**
 * Author: CoxeMonkey
 * Create_at: 2022-04-23
 * 
 * 제목
 *   주사위 세개
 * 
 * 문제
 *   1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
 *     1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
 *     2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
 *     3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
 * 
 *   예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
 *   또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
 *   3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
 * 
 *   3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 * 
 * 입력
 *   첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
 * 
 * 출력
 *   첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. 
 *   (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
 * 
 * 예제 입력 1
 *   3 3 6
 * 
 * 예제 출력 1
 *   1300
 * 
 * 예제 입력 2
 *   2 2 2
 * 
 * 예제 출력 2
 *   12000
 * 
 * 예제 입략 3
 *  6 2 5 
 *  
 * 예제 출력 3
 *   600
 * 
 * 문제 해결
 *   IF a == b OR a == c OR b == c
 *     IF a == b OR b == c
 *       result = a * 1000 + 10000
 *     ELSE IF a == b OR a == c
 *       result = a * 100 + 1000
 *     ELSE
 *       result = b * 100 + 1000
 *   ELSE
 *     max = a
 *     
 *     IF max < b
 *       max = b
 *     IF max < c
 *       max = c
 * 
 *     result = max * 100
 */

package StepByStep.A02_Conditional;

import java.util.Scanner;

public class N7_ID_2480 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int result = 0;

    if (a == b || a == c || b == c) {
      if (a == b && b == c)
        result = a * 1000 + 10000;
      else if (a == b || a == c)
        result = a * 100 + 1000;
      else
        result = b * 100 + 1000;
    } else {
      int max = a;

      if (max < b)
        max = b;
      if (max < c)
        max = c;

      result = max * 100;
    }

    System.out.println(result);

    sc.close();
  }
}
