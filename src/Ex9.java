import java.util.Scanner;

public class Ex9 {
    //判斷座標是否在圓形的範圍內
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        if (x*x + y*y <= 100*100){
            System.out.println("inside");
        }else{
            System.out.println("outside");
        }
    }
}
