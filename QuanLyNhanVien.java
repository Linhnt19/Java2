/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ngo Nhan
 */
public class QuanLyNhanVien {
    ArrayList<NhanVien> listNhanVien = new ArrayList<>();

    public QuanLyNhanVien() {
        listNhanVien.add(new NhanVien("NV01", "An", 20, "anxinh@gmail.com", 5100000));
        listNhanVien.add(new NhanVien("NV02", "Bảo", 20, "baodepzai@gmail.com",9000000));
        listNhanVien.add(new NhanVien("NV03", "Triệu", 19, "trieulove@gmail.com", 6000000));
        listNhanVien.add(new NhanVien("NV04", "Vỹ", 26, "vyxinh@gmail.com", 7000000));
    }
    
    ArrayList<NhanVien> getListNhanVien(){
        return listNhanVien;
    }
    Boolean addNew(NhanVien nhanVien){
        listNhanVien.add(nhanVien);
        return true;
    }
    
    Boolean delete(String id){
        for (int i = 0; i < listNhanVien.size(); i++) {
            if (listNhanVien.get(i).getMaNV().equals(id)) {
                listNhanVien.remove(i);
            }
        }
        
        return true;
    }
    
    ArrayList<NhanVien> search(String ma){
        ArrayList<NhanVien> ketQuanTim = new ArrayList<>();
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getMaNV().equals(ma)) {
                ketQuanTim.add(nhanVien);
            }
            
        }
        return ketQuanTim;
    }
    
    
}
