/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author FPT_2-4
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int result = 0;
        result = o1.getTen().compareTo(o2.getTen());
        if (result > 0)
        {
            result = 1;
            return result;
        }
       
        if(result < 0)
        {
            result = -1;
            return result;
        }
        
       return result;
    }
    
}
