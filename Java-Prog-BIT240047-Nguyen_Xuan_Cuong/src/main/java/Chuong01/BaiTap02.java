/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong01;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author VICTUS
 */
class SinhVien{
    int ID;
    String hoTen;
    int Tuoi;
    public SinhVien(int ID,String hoTen,int Tuoi){
        this.ID=ID;
        this.hoTen=hoTen;
        this.Tuoi=Tuoi;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setHoTen(String hoTen){
        this.hoTen=hoTen;
    }
    public int getTuoi(){
        return Tuoi;
    }
    public void setTuoi(int Tuoi){
        this.Tuoi=Tuoi;
    }
    public void show(){
        System.out.println("Ma:"+ID+"|Ho ten:"+hoTen+"|Tuoi:"+Tuoi);
    }
}
public class BaiTap02 {
    static Scanner sc=new Scanner(System.in);
    ArrayList<SinhVien> list=new ArrayList<>();
    void Them(){
        System.out.print("Nhap so luong sinh vien:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Nhap thu tu "+i+" :");
            System.out.print("Nhap ma sinh vien:");
            int ID=sc.nextInt();
            System.out.print("Nhap ho ten:");
            String hoTen=sc.nextLine();
            sc.nextLine();
            System.out.print("Nhap tuoi:");
            int Tuoi=sc.nextInt();
            list.add(new SinhVien(ID,hoTen,Tuoi));
        }       
        System.out.println("Da them");
    }
    void HienThi(){
        System.out.println("Danh sach sinh vien");
        if(list.isEmpty()){
            System.out.println("Trong");
            return;
        }
        for(SinhVien sv:list){
            sv.show();
        }
    }
    void TimKiem(){
        System.out.print("Nhap ma de tim:");
        int ID=sc.nextInt();
        boolean found=false;
         for(SinhVien sv:list){
          if(sv.getHoTen().equals(ID)){
            sv.setID(ID);
            found=true;
          }  
         }
        if(found){
            System.out.println("Da tim thay");
        }else{
            System.out.println("Khong tim thay");
        }
    }
    void Xoa(){
        System.out.print("Nhap ma de xoa:");
        int ID=sc.nextInt();
        boolean found=false;
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(ID)){
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
        System.out.print("Nhap ma de cap nhat:");
        int ID=sc.nextInt();
        boolean found=false;
        for(SinhVien sv:list){
            if(sv.getID()==ID){
                System.out.print("Nhap ID moi:");
                int id=sc.nextInt();
                System.out.print("Nhap ho ten moi");
                String hoten=sc.nextLine();
                sc.nextLine();
                System.out.print("Nhap tuoi moi:");
                int tuoi=sc.nextInt();
                found=true;
                break;
        }
            if(!found){
            System.out.println("Khong the cap nhat");
        }
    }
    }
        void ASC(){
        if(list.isEmpty()){
            System.out.println("Trong");
            return;
        }
        Collections.sort(list, new Comparator<SinhVien>() {
        @Override
        public int compare(SinhVien sv1, SinhVien sv2) {
            return sv1.getHoTen().compareToIgnoreCase(sv2.getHoTen());
        }
    });
        System.out.println("Da sap xep");
    }
        void menu(){
            int choice;
        do{
        System.out.println("\n===== MENU =====");
        System.out.println("1. Them sinh vien");
        System.out.println("2. Hien thi");
        System.out.println("3. Tim kiem theo ma sinh vien");
        System.out.println("4. Xoa sinh vien theo ma sinh vien");
        System.out.println("5. Cap nhat sinh vien theo ma sinh vien");
        System.out.println("6. Sap xep danh sach sinh vien ASC");
        System.out.println("0. Xoa");
        System.out.print("Chon: ");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                Them();
                break;
            case 2:
                HienThi();
                break;
            case 3:
                TimKiem();
                break;
            case 4:
                Xoa();
                break;
            case 5:
                CapNhat();
                break;
            case 6:
                ASC();
                break;
            case 0:
            break;
            default:
                break;
        }
        }while(choice!=0);
        }
    public static void main(String[] args){
        BaiTap02 bt=new BaiTap02();
        bt.menu();
    }
}
