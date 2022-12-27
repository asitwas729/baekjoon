import java.io.*;

public class fast {
  public static void main(String[] args){
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    try {
      int T = Integer.parseInt(bf.readLine());
      for(int i = 0; i < T; i++){
        String s = bf.readLine();
        int a = Integer.parseInt(s.split(" ")[0]);
        int b = Integer.parseInt(s.split(" ")[1]);
        bw.write(a+b+"\n");
      }
      bw.flush();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }
}
