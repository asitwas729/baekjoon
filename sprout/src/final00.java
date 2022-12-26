import java.util.Scanner;

public class final00 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = 2000000;
    int[] sum = new int[k];
    int i = 0;

    while (true){
      int A = sc.nextInt();
      int B = sc.nextInt();
      sum[i] = A + B;
      i++;

      if((A == 0) && (B == 0)){
        break;
      }


    }
    for (int j = 0 ; j < i-1; j++){
      System.out.println(sum[j]);
    }
  }
}
