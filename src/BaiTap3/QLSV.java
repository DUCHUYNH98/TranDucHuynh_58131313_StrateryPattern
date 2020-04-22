/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author FPT_2-4
 */
public class QLSV {
     ISoSanh<SinhVien> t;
     ArrayList<SinhVien> s;
     

    public void setISoSanh(ISoSanh<SinhVien> t) {
        this.t = t;
    }
    
    public int soSanh (SinhVien o1, SinhVien o2)
    {
        return t.soSanh(o1, o2);
    }
    
//    public void them(SinhVien s1)
//    {
//            s.add(s1);
//    }
    
    public void sapXep(ArrayList<SinhVien> s)
    {
        for (int i = 0; i < s.size(); i++)
        {
            for (int j = i+1; j < s.size(); j++)
            {
                if(soSanh(s.get(i),s.get(j)) == 1)
                {
                    Collections.swap(s, i, j);
                }
            }
        }
    }
    
    public void inDS(ArrayList<SinhVien> s)
    {
        for(int i = 0; i < s.size(); i++)
            s.get(i).display();
    }
     
}
