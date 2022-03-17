package kiemTraGiuaKyOOP.datnd2008110117;

public class danhSachGiaoDichDat extends danhSachGiaoDich {
    private String loaiDat;
    private String thanhTien;

    public danhSachGiaoDichDat(){
        super();
        this.loaiDat = "";
    }
    public danhSachGiaoDichDat(String ngayGD, String maGD, double donGia, float dienTich, String loaiDat){
        super(ngayGD ,maGD ,donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat(){
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat){
        this.loaiDat = loaiDat;
    }
    public double thanhTien(){
        if(loaiDat == "A" && loaiDat == "B"){
        return this.thanhTien = this.dienTich*this.donGia;
        }
        else{
        return 1.5;
        }

    }

    public void nhapTT(){
        super.nhapTT();
        System.out.print("Chọn Loại Đất(A, B, C): ");
        loaiDat = varInput.next();
    }

    @Override
    public String toString() {
        return super.toString() + "GiaoDichDat [loaiDat=" + loaiDat + "]";
    } {
    
}
