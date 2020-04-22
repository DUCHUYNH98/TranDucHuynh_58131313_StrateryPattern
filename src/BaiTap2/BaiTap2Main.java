/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author FPT_2-4
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<HangHoa> sp = new ArrayList<>();
        GioHang g = new GioHang();
        sp.add(new HangHoa("Ca Mu", 2500000, "Ca mu bien"));
        sp.add(new HangHoa("Ca co", 900000, "Ca co vung tau"));
        //--------------------------------
        g.setIThanhToan(new ThanhToanCOD());
        System.out.println("Thanh toan COD: \n");
        g.xuat(sp);
       //----------------------------------
        g.setIThanhToan(new ThanhToanOnline());
        System.out.println("Thanh toan Online: \n");
        g.xuat(sp);
        
    }
    
}
