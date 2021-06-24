package Java;

import java.io.*;

public class Session4 {
    public Session4(String path) {
        File f = new File(path);
        String[] filename = f.list();
        for(int i = 0; i < filename.length; i++){
            System.out.println(filename[i]);
        }
    }
    public static int count(String path){
        int c = 0;
        File f = new File(path);
        String[] filename = f.list();
        for(int i = 0; i < filename.length; i++){
            File fi = new File(path + "//"+filename[i]);
            if(fi.isFile()) c++;
            else c+=count(fi.getAbsolutePath());
        }
        return c;
    }
    public static int cointChar(String path, char ch){
        int c = 0;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(path);
            int data = fin.read();
            while(data != -1){
                if(data == ch) c++;
                data = fin.read();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Không thể tìm thấy tệp : ");
        }
        catch (IOException e) {
            System.out.println("Error : ");
        }
        finally {
            try{
                fin.close();
            }
            catch (IOException e){
                System.out.println("Error : ");
            }
        }
        return c;
    }
    public static void read(String path){
        FileInputStream fin = null;
        try {
            fin = new FileInputStream(path);
            int data = fin.read();
            while(data != -1){
                System.out.print((char)data);
                data = fin.read();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Không thể tìm thấy tệp : ");
        }
        catch (IOException e) {
            System.out.println("Error : ");
        }
        finally {
            try{
                fin.close();
            }
            catch (IOException e){
                System.out.println("Error : ");
            }
        }
    }

    public static void main(String[] args){
        String path = "./src/Java/Session1.java";
        String path2 = "./";
        new Session4(path2);

        System.out.println("Số tập có trong thư mục là : "+count("./"));
        System.out.println("Số ký tự 's' trong file là : "+cointChar(path, 's'));
        System.out.println("Dữ liệu trong tệp :");
        read(path);
    }
}
