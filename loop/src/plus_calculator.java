import java.util.Scanner;

public class plus_calculator {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt();
    int[] sum = new int[L];

    for(int i = 0; i < L; i++){
      int A = sc.nextInt();
      int B = sc.nextInt();
      sum[i] = A + B;
    }
    for(int i = 0; i < L; i++){
      System.out.println(sum[i]);
    }
  }
}
