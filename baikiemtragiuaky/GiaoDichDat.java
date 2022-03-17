package baikiemtragiuaky;

import java.util.Scanner;
public class GiaoDichDat extends GiaoDich{
     Scanner tt = new Scanner(System.in);
    private String loaiDat;
    private float dienTich;
    public String getLoaiDat() {
        return loaiDat;
    }
    
    public GiaoDichDat() {
        super();
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }
    public void nhapThongTin() 
    {
        super.nhap();
        System.out.print("Nhap loai dat (A/B/C): ");
        loaiDat = tt.next();
        System.out.print("Nhap dien tich : ");
        dienTich=tt.nextFloat();
    }
    public double getThanhTien()
    {
        if(loaiDat.compareTo("A")==0)
            return dienTich*super.getDonGia()*1.5;
            return super.getDonGia()*dienTich;
    }
    public String toString() {
        return super.toString() +" , Loat dat : "+loaiDat+" , Dien tich : "+dienTich+" , Thanh tien : "+getThanhTien();
    }
}