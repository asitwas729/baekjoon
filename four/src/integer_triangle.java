import java.util.Scanner;

public class integer_triangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] line = new int[N][N];
    int[][] sum = new int[N][N];

    for(int i = 1; i <= N; i++){
      for(int j = 1; j <= i; j++){
        line[i][j] = sc.nextInt();
      }
    }

    for(int i = 2; i <= N; i++){
      for(int j = 1; j <= i; j++){
        if(j == 1){
          sum[i][j] = line[i][j] + line[i-1][j];
        } else if(j == i){
          sum[i][j] = line[i][j] + line[i-1][j-1];
        } else{
          sum[i][j] = line[i][j] + line[i-1][j];
        }
      }
    }

  }
}
