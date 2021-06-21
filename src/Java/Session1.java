package Java;

import java.util.Scanner;

public class Session1 {

//    String name;
//    int age;
//    String school;
//    String major;

    public Session1(String name, int age, String school, String major) {
        System.out.println("Chào mừng bạn "+ name+", "+age+" tuổi, trường ĐH "+school+ ", chuyên ngành "+major );
    }

    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        String ten = k.next();
        System.out.println("Welcom to "+ ten+ " !");
        Session1 s1 = new Session1("MA Kiệt", 21, "VKU", "CNTT.");
    }

}
