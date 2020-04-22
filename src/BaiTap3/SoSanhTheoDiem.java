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
public class SoSanhTheoDiem implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      int result = 0;
        if (o1.getDiemTB() > o2.getDiemTB())
        {
            result = 1;
            return result;
        }
        if (o1.getDiemTB() < o2.getDiemTB())
        {
            result = -1;
            return result;
        }
      return result;
    }
    
}
