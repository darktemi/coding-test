package programmers;
class Main1_11 {
  public static int solution(int n) {
    int a = n / 2;

    if (n % 2 == 0) {
      int sum = n;

      for (int i = 0; i < a; i++) {
        sum += sum - 2;
        sum = a;
      }
    } else {
      int sum = n - 1;

      for (int j = 0; j < a; j++) {
        sum += sum - 2;
        sum = a;
      }
    }
    return a;
  }


  public static void main(String[] args) {
    solution(11);
  }
}