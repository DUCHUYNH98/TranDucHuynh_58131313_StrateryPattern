/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author FPT_2-4
 */
public class Chia implements Tinh{

    @Override
    public float tinh(float a, float b) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      if (b == 0){
          System.out.println("khong the chia dc vi so bi chia bang:  ");
          return b;
      }
      else {
          return a / b;
      }
    }
    
}
