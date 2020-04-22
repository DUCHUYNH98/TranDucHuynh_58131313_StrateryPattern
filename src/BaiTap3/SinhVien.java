/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author FPT_2-4
 */
public class SinhVien {
    String ten;
    String ngaySinh;
    float diemTB;
    SimpleDateFormat  ft = new SimpleDateFormat("dd.MM.yyyy");

    public SinhVien(String ten, String ngaySinh, float diemTB) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    public void display()
    {
        System.out.println("Ten: " + ten +"\n" +
                            "Ngay Sinh: " + ngaySinh + "\n" +
                            "Diem TB: "+ diemTB + "\n"
                
                );
    }
}
