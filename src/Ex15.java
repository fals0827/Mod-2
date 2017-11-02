import java.util.Scanner;

public class Ex15 {
    //計算電費
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a <= 120){
            System.out.println(Math.round(a * 2.10f*100)/100f);
            System.out.println(Math.round(a * 2.10f*100)/100f);
        }
        if (a >120 && a <= 330){
            System.out.println(Math.round(120 * 2.10f*100)/100f + Math.round((a-120) * 3.02f*100)/100f);
            System.out.println(Math.round(120 * 2.10f*100)/100f + Math.round((a-120) * 2.68f*100)/100f);
        }
        if (a > 330 && a <= 500){
            System.out.println(Math.round(120 * 2.10f*100)/100f + Math.round(210 * 3.02f*100)/100f +
                    Math.round((a-330) * 4.39f*100)/100f);
            System.out.println(Math.round(120 * 2.10f*100)/100f + Math.round(210 * 2.68f*100)/100f +
                    Math.round((a-330) * 3.61f*100)/100f);
        }
        if (a >500 && a <= 700){
            System.out.println(Math.round(120 * 2.10f*100)/100f + Math.round(210 * 3.02f*100)/100f +
                    Math.round(170 * 4.39f*100)/100f + Math.round((a-500) * 4.97f*100)/100f);
            System.out.println(Math.round(120 * 2.10f*100)/100f + Math.round(210 * 2.68f*100)/100f +
                    Math.round(170 * 3.61f*100)/100f + Math.round((a-500) * 4.01f*100)/100f);
        }
        if (a > 700){
            System.out.println(Math.round(120 * 2.10f*100)/100f + Math.round(210 * 3.02f*100)/100f +
                    Math.round(170 * 4.39f*100)/100f + Math.round(200 * 4.97f*100)/100f +
                    Math.round((a-700) * 5.63f*100)/100f);
            System.out.println(Math.round(120 * 2.10f*100)/100f + Math.round(210 * 2.68f*100)/100f +
                    Math.round(170 * 3.61f*100)/100f + Math.round(200 * 4.01f*100)/100f +
                    Math.round((a-700) * 4.50f*100)/100f);
        }
    }
}
