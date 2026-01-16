/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong01;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author VICTUS
 */
class HocSinh{
    String ten;
    double diem;
    public HocSinh(String ten,double diem){
        this.ten=ten;
        this.diem=diem;
    }
    public String getName(){
        return ten;
    }
    public void setName(String name){
        this.ten=ten;
    }
    public double getDiem(){
        return diem;
    }
    public void setDiem(double diem){
        this.diem=diem;
    }
    public void show(){
        System.out.println("Ten:"+ten+"|Diem:"+diem);
    }
}
public class BaiTap01 {
    ArrayList<HocSinh> list=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    void Them(){
        System.out.print("Nhap so luong hoc sinh:");
        int n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Nhap thu tu "+i+" :");
            System.out.print("Nhap ho ten:");
            String ten=scanner.nextLine();
            scanner.nextLine();
            System.out.print("Nhap diem:");
            double diem=scanner.nextDouble(); 
            list.add(new HocSinh(ten,diem));
        }
        
        System.out.println("Da them");
    }
    void Xoa(){
        System.out.print("Nhap ten can xoa:");
        String name=scanner.nextLine();
        scanner.nextLine();
        boolean found=false;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getName().equalsIgnoreCase(name)){
                list.remove(i);
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Da xoa"); 
        }else{
            System.out.println("Khong the xoa");
        }
    }
    void CapNhat(){
        System.out.print("Nhap ten de tim:");
        String name=scanner.nextLine();
        scanner.nextLine();
        boolean found=false;
        for(HocSinh p:list){
            if(p.getName().equalsIgnoreCase(name)){
                System.out.print("Nhap diem moi:");
                p.setDiem(scanner.nextDouble());
                System.out.println("Da cap nhat diem.");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Khong the cap nhat");
        }
    }
    void HienThi(){
        System.out.println("Danh sach hoc sinh");
        if(list.isEmpty()){
            System.out.println("Trong");
            return;
        }
        for(HocSinh P:list){
            P.show();
        }
    }
    void Tim(){
        System.out.print("Nhap ten can tim:");
        String name=scanner.nextLine();
        scanner.nextLine();
        boolean found=false;
        for(HocSinh hs:list){
            if(hs.getName().equalsIgnoreCase(name)){
                hs.show();
                found=true;
            }
        }
        if(found){
            System.out.println("Da tim thay");
        }else{
            System.out.println("Khong tim thay");
        }
    }
    void Max(){
        if(list.isEmpty()){
        System.out.println("Trong");
        return;
        }
        double maxDiem=list.get(0).getDiem();
        for(HocSinh hs:list){
            if(hs.getDiem()>maxDiem){
                maxDiem=hs.getDiem();
            }
        }
        System.out.println("Diem cao nhat:"+maxDiem);
        System.out.println("Diem cao nhat trong cac diem:");
        for(HocSinh hs:list){
            if(hs.getDiem()==maxDiem){
                hs.show();
            }
        }
    }
    void Min(){
        if(list.isEmpty()){
        System.out.println("Trong");
        return;
        }
        double minDiem=list.get(0).getDiem();
        for(HocSinh hs:list){
            if(hs.getDiem()<minDiem){
                minDiem=hs.getDiem();
            }
        }
        System.out.println("Diem cao nhat:"+minDiem);
        System.out.println("Diem cao nhat trong cac diem:");
        for(HocSinh hs:list){
            if(hs.getDiem()==minDiem){
                hs.show();
            }
        }
    }
    void menu(){
        int choice;
        do{
        System.out.println("\n===== MENU =====");
        System.out.println("1. Them hoc sinh");
        System.out.println("2. Xoa hoc sinh bang ten");
        System.out.println("3. Cap nhat diem");
        System.out.println("4. Hien thi");
        System.out.println("5. Tim kiem hoc sinh");
        System.out.println("6. Tim diem hoc sinh cao nhat");
        System.out.println("7. Tim diem hoc sinh thap nhat");
        System.out.println("0. Xoa");
        System.out.print("Chon: ");
        choice=scanner.nextInt();
        switch(choice){
            case 1:
              Them();
              break;
            case 2:
              Xoa();
              break;
            case 3:
                CapNhat();
                break;
            case 4:
                HienThi();
                break;
            case 5:
                Tim();
                break;
            case 6:
                Max();
                break;
            case 7:
                Min();
                break;
            case 0:
            break;
            default:
                System.out.println("Loi.Vui long nhap lai");
                break;
        }
        }while(choice!=0);
    }
    public static void main(String[] args){
        BaiTap01 m=new BaiTap01();
        m.menu();
    }
}
