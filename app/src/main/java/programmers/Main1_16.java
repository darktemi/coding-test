package programmers;

class Main1_16 {
  public static void main(String[] args) {
    System.out.println();
  }
  class Solution {
    public static int[] solution(int n) {
      int[] answer = new int[(n + 1) / 2];

      for(int i = 1; i <= n; i++) {
        if (i % 2 == 1) {
          answer[i / 2] = i;
        }
      }
      return answer;
    }
  }
}