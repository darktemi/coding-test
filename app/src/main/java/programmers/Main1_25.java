package programmers;

class Main1_25 {

  public static void main(String[] args) {
    System.out.println();
  }

  public int solution(int price) {
    int answer = 0;

    if (price < 100000) {
      answer = price;
    } else if (price < 300000) {
      answer = (int)(price * 0.95);
    } else if (price < 500000) {
      answer = (int)(price * 0.9);
    } else {
      answer = (int)(price * 0.8);
    }
    return answer;
  }
}