/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong01;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author VICTUS
 */

public class BaiTap03 {
    static Scanner sc=new Scanner(System.in);
    static Set<String> hs=new HashSet();
    static void Them(){
        System.out.print("Nhap tu khoa de them:");
        sc.nextLine();
        String key=sc.nextLine();
        if(hs.add(key)){
            System.out.println("Them thanh cong");
        }
            System.out.println("Them khong thanh cong");
    }
    static void Xoa(){
        System.out.print("Nhap tu khoa de xoa:");
        sc.nextLine();
        String key=sc.nextLine();
        if(hs.remove(key)){
            System.out.println("Xoa thanh cong");
        }
            System.out.println("Xoa khong thanh cong");       
    }
    static void TimKiem(){
        System.out.print("Nhap tu khoa de tim:");
        sc.nextLine();
        String key=sc.nextLine();
        boolean found=false;
        if(key.contains(key)){
            System.out.println("Tu khoa da ton tai");
        }
           System.out.println("Tu khoa khong ton tai");
        
    }
    static void HienThi(){
        if(hs.isEmpty()){
            System.out.println("Trong");
            return;
        }
        System.out.println("=== Danh sach tu khoa ===");
        for(String n:hs){
            System.out.println("- "+n);
        }
    }
    public static void main(String[] args){
        int choice;
        do{
            System.out.println("==== Menu ====");
            System.out.println("1. Them");
            System.out.println("2. Xoa");
            System.out.println("3. Tim kiem");
            System.out.println("4. Hien thi");
            System.out.println("0. Thoat");
            System.out.print("Chon:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    Them();
                    break;
                case 2:
                    Xoa();
                    break;
                case 3:
                    TimKiem();
                    break;
                case 4:
                    HienThi();
                    break;
                case 0:
                    break;
                default:
                    break;
                    }
            }while(choice!=0);
        }
    }

