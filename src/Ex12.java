import java.util.Scanner;

public class Ex12 {
    //星座查詢
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int m = scn.nextInt();
        int d = scn.nextInt();
        switch (m){
            case 1:
                if (d < 21){
                    System.out.println("Capricorn");
                }else {
                    System.out.println("Aquarius");
                }
                break;
            case 2:
                if (d < 19){
                    System.out.println("Aquarius");
                }else {
                    System.out.println("Pisces");
                }
                break;
            case 3:
                if (d < 21){
                    System.out.println("Pisces");
                }else {
                    System.out.println("Aries");
                }
                break;
            case 4:
                if (d < 21){
                    System.out.println("Aries");
                }else {
                    System.out.println("Taurus");
                }
                break;
            case 5:
                if (d < 22){
                    System.out.println("Taurus");
                }else {
                    System.out.println("Gemini");
                }
                break;
            case 6:
                if (d < 22){
                    System.out.println("Gemini");
                }else {
                    System.out.println("Cancer");
                }
                break;
            case 7:
                if (d < 23){
                    System.out.println("Cancer");
                }else {
                    System.out.println("Leo");
                }
                break;
            case 8:
                if (d < 24){
                    System.out.println("Leo");
                }else {
                    System.out.println("Virgo");
                }
                break;
            case 9:
                if (d < 24){
                    System.out.println("Virgo");
                }else {
                    System.out.println("Libra");
                }
                break;
            case 10:
                if (d < 24){
                    System.out.println("Libra");
                }else {
                    System.out.println("Scorpio");
                }
                break;
            case 11:
                if (d < 23){
                    System.out.println("Scorpio");
                }else {
                    System.out.println("Sagittarius");
                }
                break;
            case 12:
                if (d < 22){
                    System.out.println("Sagittarius");
                }else {
                    System.out.println("Capricorn");
                }
                break;
        }
    }
}
