package baekjoon.test3;

import java.util.Scanner;

public class Main3_6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int test = sc.nextInt();
    int[] arr = new int[test];

    for(int i = 0; i < test; i++) {
      arr[i] = sc.nextInt() + sc.nextInt();
    }

    int count = 1;
    for(int i = 0; i < test; i++) {
      System.out.println("Case #" + count + ": " + arr[i]);
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
//      bw.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
//    }
//    bw.close();
//  }
//}