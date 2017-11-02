import java.util.Scanner;

public class Ex6 {
    //找零錢問題
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        int a3 = scn.nextInt();
        int b = 0;
        int b1 = 0;
        int b2 = 0;
        if (a1*15 + a2*20 + a3*30 <= n){
            b = n - (a1*15 + a2*20 + a3*30);
            b1 = b / 50;
            b = b % 50;
            b2 = b / 5;
            b = b % 5;
            System.out.println(b);
            System.out.println(b2);
            System.out.println(b1);
        }
    }
}
