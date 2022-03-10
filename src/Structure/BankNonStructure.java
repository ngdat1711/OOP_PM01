package Structure;

import java.util.Scanner;

public class BankNonStructure {
    public static void main(String[] args) {
        
        //khai bao 2 bien
        int account_number = 12345;
        int account_balance = 0;

        //data cu

        //hanh dong thao tac len data
        Scanner input;
        input = new Scanner(System.in);

        //gui tien: deposit
        System.out.println("Nhap vao so tien gui: ");
        int depositAmount = 0;
        depositAmount = input.nextInt();
        account_balance += depositAmount;//thao tac len data

        //show
        System.out.println("thong tin tai khoan");
        System.out.println("Account number: ");
        System.out.println("Account balance: ");

        //rut tien; withdraw 
        System.out.println("Nhap vao so tien can rut > ");
        int withdrawAmount = 0;
        withdrawAmount = input.nextInt();
        account_balance -= withdrawAmount;// thao tac tren data
        //show 
        System.out.println("thong tin tai khoan");
        System.out.println("account number: " + account_number);
        System.out.println("account balance: " + account_balance);
}
}
