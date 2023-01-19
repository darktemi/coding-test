package programmers;

class Main1_15 {
  public int solution(int[] array) {
    int answer = 0;
    int[] index = new int[1000];
    int max = 0;

    for (int i = 0; i < array.length; i++) {
      index[array[i]]++;
    }
    for (int i = 0; i < index.length; i++) {
      if (max < index[i]) {
        max = index[i];
        answer = i;
      } else if (max == index[i]) {
        answer = -1;
      }
    }

    return answer;
  }
}