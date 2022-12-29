import java.io.*;

public class star_contrary {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    try {
      int T = Integer.parseInt(br.readLine());
      for(int i = 1; i <= T; i++){
        for(int k = 0; k < (T - i); k++){
          System.out.print(" ");
        }
        for(int j = 0; j < i; j++){
          System.out.print("*");
        }
        System.out.println("");
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
