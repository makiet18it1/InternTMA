package Java;

import java.util.*;
import java.util.Locale;
import java.util.Scanner;

public class Session3 {


    public static void str(String s){
        int demS = 0;
        int demT = 0;
        for (int i = 0; i < s.length(); i ++){
            ;
            if(s.charAt(i) == 'o') demT++;
            if(s.charAt(i) >= '1' && s.charAt(i) <= '9') demS++;
        }
//        String s1 = s.toUpperCase(Locale.forLanguageTag(s.replace("dd", "đ")));
        System.out.println("Số lượng ký tự trong chuỗi là : "+s.length());
        System.out.println("Số lượng ký tự 'o' là : "+demT);
        System.out.println("Số lượng ký tự số là : "+demS);
        System.out.println(s.replace("dd", "đ"));
        System.out.println(s.toUpperCase(Locale.ROOT));
    }

    public static void main(String[] args){
        str("Tooi ddax hojc Java dduowcj 2 nawm vaf tooi ddang hojc laij Java khos quas");
        Scanner k = new Scanner(System.in);
        System.out.print("Mời nhập n : ");
        int n = k.nextInt();
        int[] array = new int[n];
        int s = 0;
        Date day = new Date();

        for(int i = 0; i < n; i++){
            System.out.print("Mời nhập số : ");
            array[i] = k.nextInt();
        }
        System.out.print("Chuỗi vừa nhập : ");
        for(int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        System.out.print("Chuỗi đảo ngược : ");
        for(int j = (n -1); j >= 0; j--){
            System.out.print(array[j]+ " ");
        }
//tổng từ 1 - 100
        System.out.print("\n");
        for(int i = 1; i <= 100; i++){
            s += i;
        }
        System.out.println("Tổng các số từ 1 đến 100 là : "+s);
        System.out.println("Tôi đã hoàn thành vào ngày : "+day.toString());

    }
}
