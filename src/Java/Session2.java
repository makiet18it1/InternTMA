package Java;

import java.util.Scanner;

public class Session2 {

    public static void main(String[] args){
        float a = 0;
        float b,c;
//        boolean d = a instanceof float;;
//        System.out.println(d);
        Scanner k = new Scanner(System.in);
        System.out.println("Mời nhập cạnh a : ");
        a = k.nextInt();
        System.out.println("Mời nhập cạnh b : ");
        b = k.nextInt();
        System.out.println("Mời nhập cạnh c : ");
        c = k.nextInt();

        System.out.println("Nhập số n : ");
        int n = k.nextInt();


        for (int i = 0; i < n; i++){
        if((a+b>c) && (a+c>b) && (b+c>a) && (a>0) && (b>0) && (c>0)){
            System.out.print("a, b, c là cạnh của : ");
            if((a==b) && (b==c)) System.out.println("Tam giác đều");
            else
            if((a==b) && (b==c) && (a==c)) System.out.println("Tam giác cân");
            else if(((a*a + b*b == c*c) && (a==b)) || ((a*a + c*c == b*b) && (a==c)) || ((b*b + c*c == a*a) && (b == c))) System.out.println("Tam giác vuông cân");
            else if((a*a + b*b == c*c) || (c*c + b*b == a*a) || (a*a + c*c == b*b))  System.out.println("Tam giác vuông");
            else System.out.println("Tam giác thường");
        }
        }

    }

}
