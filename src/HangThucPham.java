import java.sql.Date;
import java.text.SimpleDateFormat;

public class HangThucPham {


    private String maHang = "TP01";

    /**
     * @param maHang the maHang to set
     */
    
    private void setMaHang(String maHang){
        if(maHang != null){
            this.maHang = maHang;
        }
        else{
            System.out.println("Ma Hang ko dc rong !");
            this.maHang = "default";
        }

    
    public void setNgayHetHan(Date ngayHetHan){
        //code rong buoc
        if(ngayHetHan != null){
            if(ngayHetHan.after(this.ngaySX)){
                this.ngayHetHan = ngayHetHan;

            }else{
                System.out.println("Ngay het han phai sau ngay san xuat !!! ");
                this.ngayHetHan = new Date;//ngay hien tai
            }
    }


    }
    /*(non-javadoc)
    *@see java.langObject#toString()
    */
    @Override
    public String toString(){
        return "HangThucPham [maHang=" + maHang + "]"
        }
    /** 
     * 
    */
    public boolean kiemTraHanSuDung(){
        boolean isHetHan = false; //con han
        if(this.setNgayHan.before(new Date())){
            isHetHan = true;
        }
        return isHetHan;
    }
    @Override
    public String toString(){
        //dd//mm/yyyy : 10/3/2022
        SimpleDateFormat ngayVietNam = new SimpleDateFormat("dd/mm/yyyy");
        return "Hang thuc pham [donGia" + donGia + ", maHang" + maHang + ", ngayHetHan" + "ngaySanXuat" + ngayVietNam.format(ngaySanXuat) + ", tenHang" + tenHang + "]";
        
    }

}
