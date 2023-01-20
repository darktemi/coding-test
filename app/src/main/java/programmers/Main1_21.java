package programmers;

class Main1_21 {

  public static void main(String[] args) {
    System.out.println();
  }

  public int solution(int[] array, int height) {
    int answer = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] > height) {
        answer++;
      }
    }
    return answer;
  }
}