import java.util.Scanner;

public class ChuyenXe {
    protected String Macx, NameTX, SoX;
    protected double DoanhThu;
    Scanner in = new Scanner(System.in);

    protected void setMacx(String macx){
        Macx = macx;

    }
    protected String getMacx(){
        return Macx;
    }
    protected void setNameTX(String nameTX){
        NameTX = nameTX;
    }
    protected String getNameTX(){
        return NameTX;
    }
    protected void setSoX(String soX){
        SoX = soX;
    }
    protected String getSoX(){
        return SoX;
    }
    protected void setDoanhThu(double doanhThu){
        DoanhThu = doanhThu;
    }
    private double getDoanhThu(){
        return DoanhThu;
    }
    
    
}
