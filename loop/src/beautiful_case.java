import java.io.*;

public class beautiful_case {
  public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    try {
      int T = Integer.parseInt(br.readLine());
      for(int i = 0; i < T; i++){
        String s = br.readLine();
        int A = Integer.parseInt(s.split(" ")[0]);
        int B = Integer.parseInt(s.split(" ")[1]);
        System.out.println("Case #" + (i + 1) + ": " + A + " + " + B + " = " + (A + B));
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
