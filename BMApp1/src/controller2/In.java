package controller2;

import static model.Reader.readers;
import static model.Book.books;
import static model.BookManagement.listBanDocMuonSach;

public class In {
    public static void mSachDaCo(){
        int count = 0;
        for(int i = 0; i< books.length; i++){
            if(books[i] == null){
                count = i;
                break;
            }
        }
        System.out.println("Danh sach dau sach: ");
        for(int i=0; i<count;i++){
            System.out.println(books[i].toString());
        }
    }

    public static void mBanDocDaCo(){
        int count =0;
        for (int i=0; i<readers.length; i++){
            if(readers[i] == null){
                count = i;
                break;
            }
        }
        System.out.println("Danh sach nguoi doc: ");
        for (int i=0; i<count; i++){
            System.out.println(readers[i].toString());
        }
    }
    public static void mQuanLyMuonSach(){
        int count = 0;
        for (int i=0; i<listBanDocMuonSach.length; i++){
            if(listBanDocMuonSach[i] == null){
                count = i;
                break;
            }
        }
        System.out.println("Quan ly muon sach: ");
        for(int i=0; i<count; i++){
            System.out.println(listBanDocMuonSach[i].toString());
        }
    }
}
