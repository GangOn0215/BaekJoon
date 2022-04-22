/**
 * Author: CoxeMonkey
 * Create_at: 2022-04-21
 * 
 * ����
 *   ���� n���� �־����� ��, n���� ���� ���ϴ� �Լ��� �ۼ��Ͻÿ�.
 *   �ۼ��ؾ� �ϴ� �Լ��� ������ ����.
 * 
 *   long sum(int[] a); (Ŭ���� �̸�: Test)
 *     a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
 *     ���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
 * 
 * ���� �ذ�
 *   �ϴ� class �̸��� Test ������ �� �����ϱ� �������� �ϴ� �׳� ��ҿ� ������� N?_id_????? ������� ����߽��ϴ�.
 *   �����Ҷ� �ҽ��ڵ忡 �����ֽ��ϴ�.
 * 
 *   public class Test {
 *     long sum(int[] a) {
 *       long ans = 0;
 * 
 *       return ans;
 *     }
 *   }
 *   
 *   ���̵��� �ſ� ���� ���߽��ϴ�.
 *   Integer a �迭�� �����ͼ� a�� length(����)�� for������ �ְ� ������ ans ���ٰ� += �ϸ� �Ǵ� �����Դϴ�.
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