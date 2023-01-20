package programmers;

class Main1_24 {

  public static void main(String[] args) {
    System.out.println();
  }

  public int solution(int n) {
    int answer = 0;
    int a = 0;

    answer = ((n * 6) / getGcd(n,6)) / 6;

    return answer;
  }

  public static int getGcd(int a, int b) {
    if(a%b == 0) {
      return b;
    }
    return getGcd(b, a%b);
  }
}