/**
 * Author: CoxeMonkey
 * Create_at: 2022-04-21
 * 
 * 문제
 *   정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
 *   작성해야 하는 함수는 다음과 같다.
 * 
 *   long sum(int[] a); (클래스 이름: Test)
 *     a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
 *     리턴값: a에 포함되어 있는 정수 n개의 합
 * 
 * 문제 해결
 *   일단 class 이름이 Test 이지만 전 관리하기 쉽기위해 일단 그냥 평소에 쓰던대로 N?_id_????? 방식으로 사용했습니다.
 *   제출할때 소스코드에 적혀있습니다.
 * 
 *   public class Test {
 *     long sum(int[] a) {
 *       long ans = 0;
 * 
 *       return ans;
 *     }
 *   }
 *   
 *   난이도는 매우 쉬움에 속했습니다.
 *   Integer a 배열을 가져와서 a의 length(길이)를 for문으로 넣고 돌리며 ans 에다가 += 하면 되는 문제입니다.
 * 
 *   public class Test {
 *     long sum(int[] a) {
 *       long ans = 0;
 *       
 *        for(int i = 0; i < a.length; i++) {
 *          ans += a[i];
 *        }
 * 
 *       return ans;
 *     }
 *   }
 * 
 */
package StepByStep.A05_Function;

public class N1_ID_15596 {
  static public long sum(int[] a) {
    long ans = 0;

    for(int i = 0; i < a.length; i++) {
      ans += a[i];
    }

    return ans;
  }
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};

    System.out.println(sum(a));
  }
}