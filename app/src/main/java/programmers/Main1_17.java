package programmers;

class Main1_17 {

  public static void main(String[] args) {
    System.out.println();
  }

  public int solution(int n, int k) {
    int answer = 0;
    int yang = n * 12000;
    int coke = k * 2000;
    int sale = 0;

    if(n / 10 >= 1) {
      sale = (n / 10) * 2000;
    }

    answer = yang + coke - sale;

    return answer;
  }
}