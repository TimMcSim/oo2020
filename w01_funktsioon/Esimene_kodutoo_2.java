import java.util.Scanner;

public class Esimene_kodutoo_2{
    public static void main(String[] args){

        System.out.println("See arvutiprogramm konventeerib temperatuurid tselsiuse ja farenheiti skaalade vahel.");
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Mis skaalast konverteerime? Sisesta '1' kui tselsius või '2' kui farenheit: ");
        int andmed = in.nextInt();

        System.out.print("Sisesta temperatuuri väärtus: ");
        int temperat = in.nextInt();

        if (andmed == 1) {

            int konvert = ((temperat * 9)/5) + 32;
            System.out.print("Farenheiti skaalas see väärtus on: ");
            System.out.print(konvert);
            System.out.println("°F");
        }

        // (0 °C × 9/5) + 32 = 32 °F

        if (andmed == 2) {
            
            int konvert = ((temperat - 32) * 5)/9;
            System.out.print("Tselsiuse skaalas see väärtus on: ");
            System.out.print(konvert);
            System.out.println("°C");
        }
        
    }
    
    
}
