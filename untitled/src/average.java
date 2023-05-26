import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class average {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int max = 0;
    int sum = 0;

    try {
      int N = Integer.parseInt(br.readLine());
      int[] grade = new int[N];
      String s = br.readLine();

      String array[] = s.split(" ");
      //System.out.println(Arrays.toString(array));
      for(int i = 0; i < N; i++){
        if(grade[i-1] < grade[i]){
          max = grade[i];
        }
      }
      for(int i = 0; i < N; i++){
        grade[i] = grade[i] / max * 100;
        sum += grade[i];
      }
      System.out.println(sum / N);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }


    /*Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] grade = new int[N];
    int max = 0;
    int sum = 0;

    for(int i = 0; i < N; i++){
      grade[i] = sc.nextInt();
      System.out.println(grade[i]);
      if(grade[i-1] < grade[i]){
        max = grade[i];
      }
      grade[i] = grade[i] / max * 100;
      System.out.println(grade[i]);
    }
    for(int i = 0; i < N; i++){
      grade[i] = grade[i] / max * 100;
      sum += grade[i];
    }
    System.out.println(sum / N);*/
  }
}
