package controller2;

import java.util.Scanner;
import static model.BookManagement.listBanDocMuonSach;

public class TimKiem {
    public TimKiem(){}
    public static void mTimKiemQLMS(){
        System.out.print("Nhap ban doc can tim kiem: ");
        String search = new Scanner(System.in).next();
        for(int i=0; i< listBanDocMuonSach.length; i++){
            if(listBanDocMuonSach[i].getReader().getvHoTen().equals(search)){
                System.out.println(listBanDocMuonSach[i].toString());
                break;
            }else{
                System.out.println("Khong tim thay ban doc muon sach!");
            }
        }
    }
}
