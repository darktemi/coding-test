package programmers;

class Main1_27 {

  public static void main(String[] args) {
    System.out.println();
  }

  public int[] solution(int[] num_list) {
    int[] answer = new int[2];

    for (int i = 0; i < num_list.length; i++) {
      if (num_list[i] % 2 == 0) {
        answer[0]++;
      } else {
        answer[1]++;
      }
    }

    return answer;
  }
}