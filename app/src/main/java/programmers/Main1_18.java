package programmers;

class Main1_18 {

  public static void main(String[] args) {
    System.out.println();
  }

  public int[] solution(int money) {
    int[] answer = new int[2];
    answer[0] = money / 5500;
    answer[1] = money % 5500;

    return answer;
  }
}