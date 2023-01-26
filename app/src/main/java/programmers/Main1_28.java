package programmers;

import java.util.Arrays;

class Main1_28 {

  public static void main(String[] args) {
    System.out.println();
  }

  public int[] solution(int[] numbers, int num1, int num2) {
    int[] answer = new int[numbers.length];

    Arrays.spliterator(numbers, num1, num2);

    return answer;
  }
}