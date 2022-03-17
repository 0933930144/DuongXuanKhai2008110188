package baikiemtragiuaky;


import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public int ktr(String s)
    {
        if(s.charAt(s.length()-1) != '3')
            return 0;
        if(s.charAt(s.length()-2) != '1')
            return 0;
        if(s.charAt(s.length()-3) != '0')
            return 0;
        if(s.charAt(s.length()-4) != '2')
            return 0;
        if(s.charAt(s.length()-6) != '9')
            return 0;
        return 1;
    }
    public void xuly()
    {
        ArrayList<GiaoDichDat> a=new ArrayList<GiaoDichDat>();
        Scanner tt = new Scanner(System.in);
        int n;
        System.out.print("Nhap so luong giao dich : ");
        n=tt.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap thong tin giao dich thu "+(i+1));
            GiaoDichDat tam=new GiaoDichDat();
            tam.nhapThongTin();
            a.add(tam);
        }
        System.out.println("Danh sach diao dich vua nhap : ");
        for(int i=0;i<a.size();i++)
            System.out.println(a.get(i));
        double s=0;
        for(int i=0;i<a.size();i++)
            s+=a.get(i).getThanhTien();
        System.out.println("Trung binh thanh tien cac giao dich la "+(s/a.size()));
        System.out.println("Cac giao dich cua thang 9 nam 2013 la ");
        for(int i=0;i<a.size();i++)
            if(ktr(a.get(i).getNgayGD())==1)
                System.out.println(a.get(i));
    }
    public static void main(String[] args)
    {
        Main m=new Main();
        m.xuly();
    }
}

