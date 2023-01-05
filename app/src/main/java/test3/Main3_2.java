package test3;

import java.util.Scanner;

public class Main3_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int test = sc.nextInt();

    for(int i = 0; i < test; i++) {
      System.out.println(sc.nextInt() + sc.nextInt());
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
//      bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
//    }
//    bw.close();
//  }
//}