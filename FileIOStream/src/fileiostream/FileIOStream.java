/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fileiostream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;
/**
 *
 * @author Aslam
 */
public class FileIOStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        /*try(FileOutputStream fos=new FileOutputStream("C:/Users/Aslam/OneDrive/Desktop/mdaslam/java/FileIOStreamProgram/Data.txt")){
        Scanner sc=new Scanner(System.in);
        String str=new String();
        str=sc.nextLine();
        byte b[]=str.getBytes();
        fos.write(b, 0, str.length());
        //fos.close();
        }*/
        try(FileInputStream fis=new FileInputStream("C:/Users/Aslam/OneDrive/Desktop/mdaslam/java/FileIOStreamProgram/Data.txt")){
            
            System.out.println(fis.available());
            System.out.println(fis);
            byte b[]=new byte[fis.available()];
            fis.read(b);
            String str=new String(b);
            System.out.println("byte b[] is printed "+b.length);
            System.out.println(str);
        }
        try(FileInputStream fis=new FileInputStream("C:/Users/Aslam/OneDrive/Desktop/mdaslam/java/FileIOStreamProgram/Data.txt")){
            int x;
            do{
                x=fis.read();
                if(x==-1)
                    continue;
                System.out.print((char)x);
            }while(x>-1&&x!=-1);
        }
        System.out.println();
        try(FileInputStream fis=new FileInputStream("C:/Users/Aslam/OneDrive/Desktop/mdaslam/java/FileIOStreamProgram/Data.txt")){
            int x;
            while((x=fis.read())!=-1){
                System.out.print(fis.read());
            }
        }        System.out.println();
        try(FileInputStream fis=new FileInputStream("C:/Users/Aslam/OneDrive/Desktop/mdaslam/java/FileIOStreamProgram/Data.txt")){
            int x;
            while((x=fis.read())!=-1){
                System.out.print((char)x);
            }
        }        
        System.out.println();
        try(FileReader fis=new FileReader("C:/Users/Aslam/OneDrive/Desktop/mdaslam/java/FileIOStreamProgram/Data.txt")){
            int x;
            while((x=fis.read())!=-1){
                System.out.print((char)x);
            }
        }
    }
    
}
