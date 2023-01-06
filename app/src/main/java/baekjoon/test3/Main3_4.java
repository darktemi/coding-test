package baekjoon.test3;

import java.util.Scanner;

public class Main3_4 {

  // 가격 * 개수
  static int Value(int price, int num) {
    return price * num;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 총액
    int total = sc.nextInt();
    // 종류
    int list = sc.nextInt();
    // 총합
    int sum = 0;

    // 종류의 값 및 개수 총합
    int[] arr = new int[list];

    for(int i = 0; i < list; i++) {
      int price = sc.nextInt();
      int num = sc.nextInt();

      arr[i] = Value(price, num);
      sum += arr[i];
    }

    //결과 출력
    if(sum == total) System.out.println("Yes");
    else System.out.println("No");
  }
}