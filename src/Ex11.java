import java.util.Scanner;

public class Ex11 {
    //季節判定
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        if (m >= 1 && m <= 12) {
            if (m >= 3 && m <= 5) {
                System.out.println("Spring");
            }
            if (m >= 6 && m <= 8) {
                System.out.println("Summer");
            }
            if (m >= 9 && m <= 11) {
                System.out.println("Autumn");
            }
            if (m == 12 || m <= 2) {
                System.out.println("Winter");
            }
        }
    }
}
