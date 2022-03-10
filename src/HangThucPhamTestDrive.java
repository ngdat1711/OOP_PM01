public class HangThucPhamTestDrive {
    public static void main(String[] args) {
        HangThucPham htp = new HangThucPham();
        //khong chinh sua
        //co quyen truy cap
        //htp.setMaHang("TP09");
        System.out.println(htp);
        System.out.println("MH " + htp.getMaHang());
        HangThucPham htp2 = new HangThucPham(null);
        System.out.println(htp2);
        HangThucPham htp3 = new HangThucPham(null,null, 0, null, null);
        System.out.println(htp3);
        if(htp3.kiemTraHanSuDung()){
            System.out.println("het han r dung an ");

        }else{
            System.out.println("con han su dung an di");
        }
        
        System.out.println("ngay hien ta: " + new Date());
    }
    
}
