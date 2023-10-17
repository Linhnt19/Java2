/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import java.io.Serializable;

/**
 *
 * @author Ngo Nhan
 */
public class NhanVien implements Serializable{
    private String maNV;
    private String tenNV;
    private int tuoi;
    private String eMail;
    private double luong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, int tuoi, String eMail, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoi = tuoi;
        this.eMail = eMail;
        this.luong = luong;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
  

    
    
}
