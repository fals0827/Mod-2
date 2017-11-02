import java.util.Scanner;

public class Ex8 {
    //質數判別
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int sum = 0 ;
        for (int i = 2 ; i <= a ; i++){
            if (a % i == 0){
                sum ++;
            }
        }
        if (sum == 1){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
