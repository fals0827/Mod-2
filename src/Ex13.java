import java.util.Scanner;

public class Ex13 {
    //平年閏年判斷
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int y = scn.nextInt();
        if (y % 4 == 0){
            if (y % 100 == 0){
                if (y % 400 == 0){
                    System.out.println("Bissextile Year");
                }else {
                    System.out.println("Common Year");
                }
            }else {
                System.out.println("Bissextile Year");
            }
        }else {
            System.out.println("Common Year");
        }
    }
}
