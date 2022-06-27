package controller1;

import controller2.*;

import java.util.Scanner;

public class Choice {
    public static void choiceMenu(){
        boolean count = true;
        int vLuaChon;
        do {
            do {
                System.out.println("Moi ban nhap lua chon: ");
                vLuaChon = new Scanner(System.in).nextInt();
                if (vLuaChon<=0 || vLuaChon>=9){
                    System.out.println("Lua chon khong hop le. Moi nhap lai.");
                }
            }while (vLuaChon<=0 || vLuaChon >=9);
            switch(vLuaChon){
                case 1:
                    Nhap.mDauSachMoi();
                    break;
                case 2:
                    In.mSachDaCo();
                    break;
                case 3:
                    Nhap.mBanDocMoi();
                    break;
                case 4:
                    In.mBanDocDaCo();
                    break;
                case 5:
                    QLMS.mMuonSach();
                    break;
                case 6:
                    In.mQuanLyMuonSach();
                    break;
                case 7:
                    SapXep.mSapXep();
                    In.mQuanLyMuonSach();
                    break;
                case 8:
                    TimKiem.mTimKiemQLMS();
                    break;
                case 9:
                    count = false;
                    break;
            }
        }while(count);
    }
}
