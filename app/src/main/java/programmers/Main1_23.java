package programmers;

class Main1_23 {

  public static void main(String[] args) {
    System.out.println();
  }

  public int[] solution(int[] num_list) {
    int[] answer = new int[num_list.length];
    int i = num_list.length;
    int j = 0;

    while (i != 0) {
      answer[j++] = num_list[--i];
    }

    return answer;
  }
}