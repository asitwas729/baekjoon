import java.util.Scanner;

public class costco {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int kinds = sc.nextInt();
    int X = 0;
    int N = 0;
    int sum = 0;

    for(int i = 0; i < kinds; i++){
      X = sc.nextInt();
      N = sc.nextInt();
      sum += X * N;
    }

    if(count == sum){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
