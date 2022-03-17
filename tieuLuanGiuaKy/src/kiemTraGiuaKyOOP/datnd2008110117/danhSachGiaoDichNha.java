package kiemTraGiuaKyOOP.datnd2008110117;

public class danhSachGiaoDichNha extends danhSachGiaoDich{
    private int loaiNha;
    private String diaChi;
    
    
    public danhSachGiaoDichNha(){
        super();
        this.loaiNha = 0;
        this.diaChi = "";
    }

    public danhSachGiaoDichNha(String ngayGD, String maGD, double donGia, float dienTich, int loaiNha, String diaChi){
        super(ngayGD, maGD, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(int loaiNha) {
        this.loaiNha = loaiNha;
    }    
    public void nhapTT(){
        super.nhapTT();
        System.out.print("Nhap dia chi" );
        diaChi = varInput.next();
    }
    public double TTien(){
        if(loaiNha == 1){
        return this.thanhTien = this.dienTich*this.donGia;
        }
        else{
        return 0.9; //90% = 0.9
        }

    }
    public String toString(){
        String temp;
        if(loaiNha ==1 )
        temp = "Loại NhàCao Cấp";
        else if(loaiNha == 2)
        temp = "Loại Nhà Thường";
        else
        temp = "Không Hợp lệ";

        return "Giao Dịch Nhà: " + super.toString() + ", Loại nhà: " + temp + ", Địa Chỉ: " + diaChi + "]";
    } {
    
}
