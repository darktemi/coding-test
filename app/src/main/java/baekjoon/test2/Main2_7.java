package baekjoon.test2;

import java.util.Scanner;

public class Main2_7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[3];

    arr[0] = sc.nextInt();
    arr[1] = sc.nextInt();
    arr[2] = sc.nextInt();

    int max = arr[0];

    for(int i = 0; i < arr.length; i++) {
      if(max < arr[i]) {
        max = arr[i];
      }
    }

    if(arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[0]) {
      System.out.println(10000 + arr[0] * 1000);
    } else if (arr[0] == arr[1] && arr[1] != arr[2]) {
      System.out.println(1000 + arr[0] * 100);
    } else if (arr[0] != arr[1] &&  arr[0] == arr[2]) {
      System.out.println(1000 + arr[0] * 100);
    } else if (arr[0] != arr[1] && arr[1] == arr[2]) {
      System.out.println(1000 + arr[1] * 100);
    } else System.out.println(max * 100);
  }
}