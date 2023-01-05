package test3;

import java.util.Scanner;

public class Main3_7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 테스트 수
    int test = sc.nextInt();

    // 입력값 a, b 담을 배열
    int[] arrA = new int[test];
    int[] arrB = new int[test];

    // 결과값
    int[] result = new int[test];

    for(int i = 0; i < test; i++) {

      // 사용자 입력 값 담을 변수
      int a = sc.nextInt();
      int b = sc.nextInt();

      // a + b
      arrA[i] = a;
      arrB[i] = b;
      result[i] = a + b;
    }

    int count = 1;
    for(int i = 0; i < test; i++) {
      // 출력값
      System.out.println("Case #" + count + ": " + arrA[i] + " + " + arrB[i] + " = " + result[i]);
      count++;
    }
  }
}

//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.StringTokenizer;
//
//public class Main {
//  public static void main(String[] args) throws IOException {
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//    StringTokenizer st;
//
//    int t = Integer.parseInt(br.readLine());
//
//    for(int i = 1; i <= t; i++) {
//      st = new StringTokenizer(br.readLine());
//      int a = Integer.parseInt(st.nextToken());
//      int b = Integer.parseInt(st.nextToken());
//      int sum = a + b;
//
//      bw.write("Case #" + i + ": " + a + " + " + b + " = " + sum + "\n");
//    }
//    bw.close();
//  }
//}