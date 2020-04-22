/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.util.ArrayList;

/**
 *
 * @author FPT_2-4
 */
public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> sp;

    public void setIThanhToan(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    public double thanhToan(int tienHang)
    {
        return hinhThucTT.thanhToan(tienHang);
    }
//    public void add(HangHoa s)
//    {
//        sp.add(s);
//    }
    public void xuat (ArrayList<HangHoa> sp)
    {
        for (int i = 0; i < sp.size(); i++)
        {
            sp.get(i).display();
            System.out.println("Gia phai tra la:" + thanhToan(sp.get(i).gia)+"\n");
            System.out.println("--------------------------------------------");
        }
        
    }
    
}
