import java.util.Scanner;
public class chess {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Wking = sc.nextInt();
        int Wqueen = sc.nextInt();
        int Wrook = sc.nextInt();
        int Wbishop = sc.nextInt();
        int Wknight = sc.nextInt();
        int Wpawn = sc.nextInt();
        int king = 1;
        int queen = 1;
        int rook = 2;
        int bishop = 2;
        int knight = 2;
        int pawn = 8;
        System.out.println((king - Wking) + " " + (queen - Wqueen) + " " +
                (rook - Wrook) + " " + (bishop - Wbishop) + " " + (knight - Wknight) + " " +
                (pawn - Wpawn));
    }
}
