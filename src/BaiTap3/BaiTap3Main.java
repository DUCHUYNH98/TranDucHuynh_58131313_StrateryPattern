/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author FPT_2-4
 */
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar calendar = Calendar.getInstance();
        calendar.set(1998, 7, 20);
        Date date = calendar.getTime();
        calendar.set(1998,9,10);
        Date date1 = calendar.getTime();
        ArrayList<SinhVien> list = new ArrayList<>();
        QLSV ql = new QLSV();
        list.add(new SinhVien("Huynh",date ,(float) 9.5));
        list.add(new SinhVien("Kha", date1, (float)8));
        ql.inDS(list);
        
        
        
        ql.setISoSanh(new SoSanhTheoDiem());
        ql.sapXep(list);
        System.out.println("-------------------------------");
        System.out.println("Sap xep theo diem: \n");
        ql.inDS(list);
        
        ql.setISoSanh(new SoSanhTheoTen());
        ql.sapXep(list);
        System.out.println("-------------------------");
        System.out.println("Sap xep theo ten: \n");
        ql.inDS(list);
        
    }
    
}
