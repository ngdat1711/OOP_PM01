package kiemTraGiuaKyOOP.datnd2008110117;

import java.util.Scanner;

public class danhSachGiaoDichTestDrive {
    public static void main(String[] args) {
            danhSachGiaoDichList gdl = new danhSachGiaoDichList();
            Scanner varInput = new Scanner (System.in);
            int t;
    
            do{
                System.out.println("=======MENU===========");
                System.out.println(">>0: Thoat");
                System.out.println(">>1Them giao dich dat");
                System.out.println(">>2 Them giao dich nha");
                System.out.println(">>3 Hien Thi danh sach gd ");
                System.out.println(">>4 Tong");
                System.out.println("Trung binh tien");
                System.out.print("Nhap lua chon");
                t=varInput.nextInt();
                switch(t){
                    case 1:
                    gdl.ThemGD(1);
                    break;
                    case 2:
                    gdl.ThemGD(2);
                    break;
                    case 3:
                    gdl.hienthiGD();
                    break;
                    case 4:
                    gdl.Tong();
                    case 5:
                    gdl.TB();
                    break;
    
    
                }
            }while(t!=0);
            System.out.println("Ket thuc giao dich");
            
            
        }
}
