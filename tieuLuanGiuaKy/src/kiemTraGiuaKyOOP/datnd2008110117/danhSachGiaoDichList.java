package kiemTraGiuaKyOOP.datnd2008110117;

public class danhSachGiaoDichList {
    private danhSachGiaoDich[] gD = new danhSachGiaoDich[100];
    private int countGD,tongNha=0,tongDat=0;
    private double tongTienDat =0,tBTienDat;

    public danhSachGiaoDichList(){
        countGD =0;
 
    }

    public void nhapDS(int temp) throws ParseException{
        if(countGD>100){
            System.out.println("Danh sach qua tai!!!");
        }else{
            if(temp == 1){
                gD[countGD] = new danhSachGiaoDichDat();
                danhSachGiaoDichDat gDDat = new danhSachGiaoDichDat();
                gDDat.nhap();
                gDDat.tinhThanhTien();
                gD[countGD] = gDDat;
                tongTienDat += gDDat.getThanhTien();
                tongDat++;
            }else{
                gD[countGD] = new danhSachGiaoDichNha();
                danhSachGiaoDichNha GDN = new danhSachGiaoDichNha();
                GDN.nhap();
                GDN.tinhThanhTien();
                GDN[countGD] = GDN;
                tongNha++;
            }
            countGD++;
        }
    }
    public void inDS() {
        for (int i = 0; i < countGD; i++) {

            System.out.println(gD[i].toString());
        }
    }
    public void tongSLTungLoai() {
        System.out.println("Tổng Số Giao Dịch Nhà: " + tongNha );
        System.out.println("Tổng Số Giao Dịch Đất: " + tongDat );
    }
    public void tinhTBTienDat() {
        tBTienDat = tongTienDat / tongDat;
        System.out.println("Trung Bình TIền Bán Đất: "+tBTienDat);
    }
    SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
    public void inGiaoDichTheoThang()throws ParseException {
        for (int i = 0; i < countGD; i++) {
            if(gD[i].getNgayGiaoDich().compareTo(sdf.parse("17/11/2002"))>0 && gD[i].ngayGiaoDich.compareTo(sdf.parse("17/12/2002"))<0){
                System.out.println(gD[i].toString());
            }
        }
    }
}
