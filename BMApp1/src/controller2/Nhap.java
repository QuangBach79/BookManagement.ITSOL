package controller2;

import model.Book;
import model.Reader;


import java.util.Scanner;

public class Nhap{
    public static void mDauSachMoi(){
        int vSoluongDauSachMoi;
        System.out.print("Nhap so luong dau sach moi: ");
        do {
            vSoluongDauSachMoi = new Scanner(System.in).nextInt();
            if (vSoluongDauSachMoi <=0){
                System.out.println("Cu phap khong hop le. Moi nhap lai!");
            }
        }while (vSoluongDauSachMoi <=0);

        for(int i=0; i<vSoluongDauSachMoi;i++) {
            Book book = new Book();
            book.mNhapSachMoi();
            book.mLuuSach(book);
            System.out.println("Sach moi them: " + book.toString());
        }
    }

    public static void mBanDocMoi(){
        int vSoLuongBanDocMoi;
        System.out.print("Nhap so luong ban doc moi:");
        do{
            vSoLuongBanDocMoi = new Scanner(System.in).nextInt();
            if(vSoLuongBanDocMoi<0){
                System.out.println("Cu phap khong hop le. Moi nhap lai!");
            }
        }while(vSoLuongBanDocMoi<0);

        for(int i=0; i<vSoLuongBanDocMoi; i++){
            Reader reader = new Reader();
            reader.mNhapBanDocMoi();
            reader.mLuuBanDoc(reader);
            System.out.println("Ban doc moi them: " + reader.toString());
        }
    }
}
