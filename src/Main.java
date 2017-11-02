import java.util.Scanner;

public class Main {
    //標準體重計算
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        if (b == 1){
            System.out.println(Math.round((a - 80)*0.7f*100)/100f);
        }else {
            System.out.println(Math.round((a - 70)*0.6f*100)/100f);
        }
    }
}
