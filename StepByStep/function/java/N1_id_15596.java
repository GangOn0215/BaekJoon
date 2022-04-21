public class N1_id_15596 {
  static public long sum(int[] a) {
    long sum = 0;

    for(int i = 0; i < a.length; i++) {
      sum += a[i];
    }

    return sum;
  }
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};

    System.out.println(sum(a));
  }
}
