package coding-test.myapp;

import java.util.Scanner;

class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int answer = 0;
    float num1;
    float num2;

    num1 = sc.nextFloat();
    num2 = sc.nextFloat();

    answer = (int)((num1 /num2) * 1000);
    System.out.println(answer);

  }
}
