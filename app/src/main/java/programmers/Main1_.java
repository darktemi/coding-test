package programmers;

class Main1_ {

  public static void main(String[] args) {}

  public String solution(String my_string) {
    int j = 0;

    char[] a = my_string.toCharArray();
    char[] b = new char[a.length];

    for (int i = a.length -1; i >= 0; i--) {
      b[i] = a[j++];
    }

    String answer = new String(b);

    return answer;
  }
}