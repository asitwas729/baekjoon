import java.util.Scanner;

public class alarm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if((H == 0) && (M < 45)){
            H = 23;
            M = 60 + (M - 45);
            System.out.println(H + " " + M);
        } else{
            if(M < 45){
                H -= 1;
                M = 60 + (M - 45);
                System.out.println(H + " " + M);
            } else if(M > 45){
                M -= 45;
                System.out.println(H + " " + M);
            } else{
                M = 0;
                System.out.println(H + " " + M);
            }
        }

    }
}
