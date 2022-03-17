package baikiemtragiuaky;

import java.util.Scanner;

public class GiaoDich {
    private String maGD;
    private String ngayGD;
    private int donGia;
    Scanner tt = new Scanner(System.in);

    public GiaoDich() {
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String toString() {
        return "Ma GD : " + maGD + " , Ngay GD : " + ngayGD + " , Don gia : " + donGia;
    }

    public void nhap() {
        System.out.print("Nhap ma giao dich : ");
        maGD = tt.nextLine();
        System.out.print("Nhap ngay giao dich : ");
        ngayGD = tt.nextLine();
        System.out.print("Nhap don gia : ");
        donGia = tt.nextInt();
    }
}
