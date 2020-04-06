/*Kahendsüsteem

* Teata, kas sisestatud neljakohaline arv koosneb vaid ühtedest ja nullidest.
* Kui tingimus on tõene, väljasta selle kahendsüsteemi arvu väärtus kümnendsüsteemis.
* Võrreldes eelmisega võib sisestatud kahendsüsteemi arv olla kuni kümnekohaline. 
Eraldi kuvatase välja, millisele väärtusele iga "üks" selles arvus vastab. */

import java.util.Scanner;
import java.lang.Math;

public class D_to_B {

static String controll(String zeroone) {
    char zero = '0';
    char one = '1';
    int compZ_O = 0;
    int howlong = zeroone.length();
    String answer = "";
    
    char[] z_o = zeroone.toCharArray();    
    for(int i=0; i <= (howlong-1); i++) {
        if (z_o[i] == zero || z_o[i] == one){
            compZ_O++;
        }
    if(howlong == compZ_O){
        answer = "Jah! Sisestatud arv koosneb vaid ühtedest ja nullidest."; } else {
            answer = "Ei! Sisestatud arv EI koosne vaid ühtedest ja nullidest.";}
    }
    return answer;
}

static int deci_back(String zeroone_2){
    int howlong_2 = zeroone_2.length();
    int grade = howlong_2-1;
    int return_Deci = 0;
    for (int j = 0; j <= (howlong_2-1); j++) {
        int zeroorone = Integer.parseInt(zeroone_2.substring(j, j+1));
        return_Deci += (zeroorone*Math.pow(2, grade));
        --grade;
    }
    return return_Deci;
}
    static String allones(String zeroone_3){
        int howlong_3 = zeroone_3.length();
        int grade_2 = howlong_3-1;
        double return_Deci_2= 0;
        String value_of_one = "";
        for (int k = 0; k <= (howlong_3-1); k++) {
            int zeroorone_3 = Integer.parseInt(zeroone_3.substring(k, k+1));
            return_Deci_2 = (zeroorone_3*Math.pow(2, grade_2));
            --grade_2;
            if(zeroorone_3 == 1){
                String grade_of_two = String.valueOf(return_Deci_2);
                String position_of_two = String.valueOf(k+1);
                value_of_one += "Üks positsioonil '"+position_of_two+"' on väärtusega "+grade_of_two+" !\n";
            }
        }
        return value_of_one;

}
    public static void main(String[] args) {
        Scanner myInt = new Scanner(System.in);
        String arv = myInt.nextLine();
        
        String what = controll(arv);
        
        if(what.charAt(0) == 'J'){
            System.out.println();
            System.out.println(what);
            System.out.println();
            System.out.println("Sisestatud arvule vastab kümnendsüsteemi arv "+ deci_back(arv) +".");
            System.out.println();
            System.out.println(allones(arv));
        } else {
            System.out.println();
            System.out.println(what);
        }
    }
}