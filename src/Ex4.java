import java.util.Scanner;

public class Ex4 {
    //字⺟往前移
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int a = scn.nextInt();
        int sum = 0 ;
        for (int i = 0 ; i < str.length() ; i++) {
            sum = (int) str.charAt(i);
            sum = sum + a;
            System.out.print((char) sum);
        }
        System.out.println();
    }
}
