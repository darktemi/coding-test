package programmers;
class Main1_10 {
  public double solution(int[] numbers) {
    double answer = 0.0;
    for (int i = 0; i < numbers.length; i++) {
      answer += numbers[i];
    }

    double aver = answer / numbers.length;
    answer = aver;

    return answer;
  }
}