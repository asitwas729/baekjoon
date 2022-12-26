import java.util.Scanner;

public class count {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] T = new int[N];

    for(int i = 0; i < N; i++){
      T[i] = sc.nextInt();
    }
    int V = sc.nextInt();
    int count = 0;

    for(int i = 0; i < N; i++){
      if(V == T[i]){
        count += 1;
      }
    }
    System.out.println(count);
  }
}
