package programmers;

class Main1_22 {

  public static void main(String[] args) {
    System.out.println();
  }

  public int solution(int n) {
    int answer = 0;

    if(n % 7 == 0) {
      answer = n / 7;
    } else {
      answer = (n / 7) + 1;
    }

    return answer;
  }
}