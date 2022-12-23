import java.util.Scanner;

public class oven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();

            if((M + T) % 60 == 0){
                int i = (M + T) / 60;
                H += i;
                M = 0;
                if(H >= 24){
                    H -= 24;
                    System.out.println(H + " " + M);
                }
                else{
                    System.out.println(H + " " + M);
                }
            } else if((M + T) > 60){
                int i = (M + T) / 60;
                H += i;
                M = (M + T) - (60 * i);
                if(H >= 24){
                    H -= 24;
                    System.out.println(H + " " + M);
                }
                else{
                    System.out.println(H + " " + M);
                }
            }else{
                M += T;
                System.out.println(H + " " + M);
            }
    }
}
