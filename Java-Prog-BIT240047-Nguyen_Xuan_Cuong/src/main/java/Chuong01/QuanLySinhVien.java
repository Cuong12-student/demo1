/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chuong01;

/**
 *
 * @author VICTUS
 */
import java.util.HashMap;
import java.util.Map;

public class QuanLySinhVien {
    Map<SinhVien,String> mp=new HashMap<>();
    public void Them(SinhVien sv){
        if(mp.containsKey(sv)){
            mp.put(sv,mp.get(sv)+1);
        }else{
            mp.put(sv,1);
        }
    }
}
