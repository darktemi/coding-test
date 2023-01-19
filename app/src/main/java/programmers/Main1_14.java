package programmers;

class Main1_14 {
  public int[] solution(int numer1, int denom1, int numer2, int denom2) {
    int[] answer = new int[2];
    int numer = numer1 * denom2 + numer2 * denom1;
    int denom = denom1 * denom2;
    int com = getGcd(numer, denom);

    answer[0] = numer / com;
    answer[1] = denom / com;

    return answer;
  }

  public static int getGcd(int a, int b) {
    if(a%b == 0) {
      return b;
    }
    return getGcd(b, a%b);
  }
}