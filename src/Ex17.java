import java.util.Scanner;

public class Ex17 {
    //計算正整數被3整除之數值之和
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int sum = 0;
        for (int i = 0 ; i <= a ; i +=3){
            sum += i ;
        }
        System.out.println(sum);
    }
}
