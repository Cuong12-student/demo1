/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong01;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Objects;
import java.util.Map;
/**
 *
 * @author VICTUS
 */
class SinhVien{
    String ID;  
    double Diem;
    public SinhVien(String ID,double Diem){
        this.ID=ID;
        
        this.Diem=Diem;
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID=ID;
    }
    
    public double getDiem(){
        return getDiem();
    }
    public void setDiem(double Diem){
        this.Diem=Diem;
    }
    @Override
    public boolean equals(Object o){
        if(this==o)
            return true;
        if(!(o instanceof SinhVien))
            return false;
        SinhVien sv=(SinhVien) o;
        return Objects.equals(ID,sv.ID);
    }
    
    public int hashCode(){
        return Objects.hash(ID);
    }
    
    public String show(){
        return ID+" | "+Diem;
    }
}
public class BaiTap04 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int choice;
        do{
            System.out.println("=== Menu ===");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi");
            System.out.println("3. Tim kiem theo ma");
            System.out.println("4. Cap nhat diem thi");
            System.out.println("5. Xoa diem thi");
            System.out.println("6. Hien thi diem trung binh");
            System.out.println("0. Thoat");
            System.out.print("Chon:");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }while(choice!=0);
    }
}
