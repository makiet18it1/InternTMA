package OOP;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class StudentManagement {

    Vector list = new Vector();
    public StudentManagement() {
        while(true) {
            System.out.println("--* CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN *--");
            System.out.println("--* Chức năng chương trình *--");
            System.out.println("-- 1. Nhập danh sách sinh viên --");
            System.out.println("-- 2. Xem danh sách sinh viên --");
            System.out.println("-- 3. Sắp xếp danh sách sinh viên theo điểm trung bình --");
            System.out.println("-- 4. Tìm kiếm sinh viên theo tên --");
            System.out.println("-- 5. Thoát. --");

            int num ;
            Scanner k = new Scanner(System.in);
            System.out.print(" Nhập một số để chọn chức năng : ");
            num = k.nextInt();
            switch(num){
                case 1:
                    this.input();
                    break;
                case 2:
                    this.view();
                    break;
                case 3:
                    sort();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.out.println("---- Chương trình kết thúc ----");
                    System.exit(num);
                    break;
            }

        }
    }

    public void search() {
        Scanner k = new Scanner(System.in);
        System.out.print(" Nhập tên cần tìm kiếm : ");
        String name = k.nextLine();
        Enumeration vEnum = list.elements();
        System.out.println("\n ---- Kết quá tìm kiếm ----");
        while(vEnum.hasMoreElements()){
            Student sts = (Student)vEnum.nextElement();
            if(sts.getName().indexOf(name) != -1)
                System.out.println(" ID : "+sts.getId()+" Name : "+sts.getName()+" Average"+sts.getAvr()+" !");
        }
        System.out.println("**-----------------------------------**");
    }

    public void sort() {
        Student[] sts = new Student[list.size()];
        int index = 0;
        Enumeration vEnum = list.elements();
        while(vEnum.hasMoreElements()){
            sts[index] = (Student)vEnum.nextElement();
            index++;
        }
        Arrays.sort(sts);
        System.out.println("\n--- Danh sách sinh viên sau khi sắp xếp");
        for(index = 0; index < sts.length; index++){
            System.out.println("   "+(index+1)+". ID = "+sts[index].getId()+".");
            System.out.println("   Tên sinh viên : "+sts[index].getName()+".");
            System.out.println("   Điểm trung bình : "+sts[index].getAvr()+".");
            System.out.println("-----------------------------------");
        }
        System.out.println("**-----------------------------------**");
    }

    public void view() {
        System.out.println("-- Thông tin danh sách sinh viên --");
        Enumeration vEnum = list.elements();
        int id = 1;
        while(vEnum.hasMoreElements()){
            Student sts = (Student)vEnum.nextElement();
            System.out.println("   "+id+". ID = "+sts.getId()+".");
            System.out.println("   Tên sinh viên : "+sts.getName()+".");
            System.out.println("   Điểm trung bình : "+sts.getAvr()+".");
            System.out.println("-----------------------------------");
            id++;
        }
        System.out.println("**-----------------------------------**");
    }

    public void input() {
        int num ;
        Scanner k = new Scanner(System.in);
        System.out.println("-- Nhập một số lượng sinh viên --");
        num = k.nextInt();
        for (int i = 0; i <= num; i++){
            System.out.println(" Nhập thông tin sinh viên "+i+" :");
            System.out.print(" ID : ");
            int id = Integer.parseInt(k.next());
            k.nextLine();
            System.out.print(" Tên sinh viên : ");
            String name = k.nextLine();
            System.out.print(" Điểm trung bình : ");
            float aver = k.nextFloat();
            Student st = new Student(id,name,aver);
            list.add(st);
        }
    }
    public static void  main(String[] args){
        new StudentManagement();
    }


}
class Student implements Comparable{
    private int id;
    private String name;
    private float aver;

    public Student(){
        name = new String("");
        id = 0;
        aver = 0;
    }
    public Student(int id, String name, float aver){
        this.id = id;
        this.name = name;
        this.aver = aver;
    }


    public int getId() { return id;}
    public String getName() {return name;}
    public float getAvr(){ return aver; }

    public int compareTo(Object other){
        Student otherRect = (Student)other;
        return (int)(this.aver - otherRect.aver);
    }
}