package kiemTraGiuaKyOOP.datnd2008110117;

import java.util.Scanner;

public class danhSachGiaoDich {
    protected String ngayGD, maGD;
    protected double donGia;
    protected float dienTich;

    Scanner varInput = new Scanner(System.in);

    protected danhSachGiaoDich(){

        super();
        this.ngayGD = "";
        this.maGD = "";
        this.donGia = 0;
        this.dienTich = 0;

    }

    protected danhSachGiaoDich(String ngayGD, String maGD, double donGia, float dienTich) {
        this.ngayGD = ngayGD;
        this.maGD = maGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }


    protected String getNgayGD() {
        return ngayGD;
    }

    protected void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    protected String getMaGD() {
        return maGD;
    }

    protected void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    protected double getDonGia() {
        return donGia;
    }

    protected void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    protected float getDienTich() {
        return dienTich;
    }

    protected void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    protected void nhapTT(){
        
        System.out.print("Ngày Giao Dịch: ");
        ngayGD = varInput.next();

        System.out.print("Mã Giao Dịch: ");
        maGD = varInput.next();

        System.out.print("Đơn Gía Đất: ");
        donGia = varInput.nextDouble();

        System.out.print("Diện Tích Đất: ");
        dienTich = varInput.nextFloat();
    }

    @Override
    public String toString() {
        return "GiaoDich [dienTich= " + dienTich + ", donGia= " + donGia + ", maGD= " + maGD + ", ngayGD= " + ngayGD + "]";
    }
    
}
