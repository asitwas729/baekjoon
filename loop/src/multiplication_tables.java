import java.util.Scanner;

public class multiplication_tables {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    for(int i = 1; i < 10; i++){
      int sum = N * i;
      System.out.println(N + " * " + i + " = " + sum);
    }
  }
}
