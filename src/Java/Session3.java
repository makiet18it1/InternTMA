package Java;

import java.util.Locale;

public class Session3 {

    public static void main(String[] args){
        String s = "Tooi ddax hojc Java dduowcj 2 nawm vaf toi ddang hojc laij";
        int dem = 0;
        for (int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == 'o') dem++;
        }
        System.out.println("Số lượng ký tự 'o' là : "+dem);
        System.out.println("\n");
        System.out.println(s.toUpperCase(Locale.ROOT));
        System.out.println("\n");
        System.out.println(s.toLowerCase(Locale.ROOT));
    }
}
