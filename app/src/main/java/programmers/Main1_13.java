package programmers;

class Main1_13 {
  public int solution(int[] array) {
    int answer = 0;

    java.util.Arrays.sort(array);

    int mid = array.length / 2;

    answer = array[mid];

    return answer;
  }
}