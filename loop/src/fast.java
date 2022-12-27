import java.io.*;
import java.util.StringTokenizer;

public class fast {
  public static void main(String[] args){
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = null;

    try {
      int T = Integer.parseInt(bf.readLine());
      for(int i = 0; i < T; i++){
        st = new StringTokenizer(bf.readLine());
      }
      for(int i = 0; i < T; i++){
        bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        bw.close();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
