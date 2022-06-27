package controller2;

import model.BookManagement;

import static model.BookManagement.listBanDocMuonSach;

import java.util.Scanner;

public class SapXep {
    public static void mSapXep(){
        int choice = 0;
        System.out.println("Chon cach sap xep quan ly muon sach thu vien: ");
        System.out.println("1. Theo ten ban doc.");
        System.out.println("2. Theo so luong muon sach (giam dan).");
        do{
            choice = new Scanner(System.in).nextInt();
            if(choice == 1 || choice == 2){
                break;
            }
            System.out.println("Cu phap khong hop le. Moi ban nhap lai!");
        }while(true);

        switch (choice){
            case 1:
                for(int i=0; i<listBanDocMuonSach.length; i++){
                    if(listBanDocMuonSach == null){
                        break;
                    }
                    for(int j=i+1; j<listBanDocMuonSach.length; j++){
                        if (listBanDocMuonSach[j] == null){
                            break;
                        }
                        if(listBanDocMuonSach[i].getReader().getvHoTen().
                                compareTo(listBanDocMuonSach[j].getReader().getvHoTen()) > 0){
                            BookManagement temp = listBanDocMuonSach[j];
                            listBanDocMuonSach[j] = listBanDocMuonSach[i];
                            listBanDocMuonSach[i] = temp;
                        }
                    }
                }
                break;
            case 2:
                for(int i=0; i< listBanDocMuonSach.length; i++){
                    if(listBanDocMuonSach == null){
                        break;
                    }
                    for(int j=i+1; j< listBanDocMuonSach.length; j++){
                        if (listBanDocMuonSach[j] == null){
                            break;
                        }
                        if(listBanDocMuonSach[i].getvSachMuon().length < listBanDocMuonSach[j].getvSachMuon().length){
                            BookManagement temp = listBanDocMuonSach[j];
                            listBanDocMuonSach[j] = listBanDocMuonSach[i];
                            listBanDocMuonSach[i] = temp;
                        }
                    }
                }
                break;
        }
    }
}
