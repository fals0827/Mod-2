import java.util.Scanner;

public class Ex10 {
    //停⾞費計算
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = scn.nextInt();
        int sum ;
        sum = (c*60 + d) - (a*60 + b);
        if (sum <= 120){
            System.out.println(sum/30*30);
        }
        if (sum > 120 && sum <= 240){
            System.out.println((sum-120)/30*40+120);
        }
        if (sum > 240){
            System.out.println((sum-240)/30*60+120+160);
        }
    }
}
