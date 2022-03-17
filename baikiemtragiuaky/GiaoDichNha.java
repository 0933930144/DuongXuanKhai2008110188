package baikiemtragiuaky;

import java.util.Scanner;

public class GiaoDichNha {
    Scanner in = new Scanner(System.in);
    private String diaChi;
    private int dienTich;
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public int getDienTich() {
        return dienTich;
    }
    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }
    @Override
    public String toString() {
        return "GiaoDichNha [diaChi=" + diaChi + ", dienTich=" + dienTich + "]";
    }
    
}
