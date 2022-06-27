package controller2;

import java.util.Scanner;
import model.BookManagement;
import model.Book;
import model.Reader;
import model.SachMuon;

import static model.Book.books;
import static model.Reader.readers;
import static model.SachMuon.vListSachMuonTest;
import static model.SachMuon.vListSachMuon;

public class QLMS {
    public static Reader mNhapBanDocMuonMuonSach() {
        int vMaBanDocMuonSach = 0;
        Reader reader = null;
        do {
            System.out.print("Nhap ma ban doc: ");
            vMaBanDocMuonSach = new Scanner(System.in).nextInt();
            for (int i = 0; i < readers.length; i++) {
                if (readers[i] != null && readers[i].getvMaBanDoc() == vMaBanDocMuonSach) {
                    reader = readers[i];
                    break;
                }
            }
            if (reader != null) {
                break;
            }
            System.out.println("Khong tim thay ban doc!");
        } while (true);
        return reader;
    }

    public static int mSoLuongSachMuon(){
        int vSoLuongSachMuonMuon;
        do{
            System.out.print("Nhap so luong sach muon muon: ");
            vSoLuongSachMuonMuon = new Scanner(System.in).nextInt();
            if (vSoLuongSachMuonMuon<=0 || vSoLuongSachMuonMuon>=6){
                System.out.println("Ban doc khong duoc muon qua 5 cuon sach!");
            }
        }while(vSoLuongSachMuonMuon<=0 || vSoLuongSachMuonMuon>=6);
        return vSoLuongSachMuonMuon;
    }

    public static Book mNhapMaSachMuonMuon(){
        int vMaSachMuonMuon =0;
        Book book = null;
        do{
            System.out.print("Nhap ma sach muon muon: ");
            vMaSachMuonMuon = new Scanner(System.in).nextInt();
            for(int i=0; i<books.length;i++){
                if(books[i] != null && books[i].getvMaSach() == vMaSachMuonMuon){
                    book = books[i];
                    break;
                }
            }
            if (book != null){
                break;
            }
        }while(true);
    return book;
    }
    public static int mSoCuonSachMuonMuon(){
        int vSoCuonSachMuonMuon;
        do {
            System.out.print("Nhap so cuon muon muon (tu 1 den 3): ");
            vSoCuonSachMuonMuon = new Scanner(System.in).nextInt();
            if(vSoCuonSachMuonMuon<=0 || vSoCuonSachMuonMuon>=4){
                System.out.println("Cu phap khong hop le. Moi nhap lai!");
            }
        }while(vSoCuonSachMuonMuon<=0 || vSoCuonSachMuonMuon>=4);
        return vSoCuonSachMuonMuon;
    }

    public static void mMuonSach(){
        int limit, vSoLuongSachMuon, vSoCuonSachMuonMuon, count=0;
        Reader reader = mNhapBanDocMuonMuonSach();
        System.out.println(reader.toString());
        vSoLuongSachMuon = mSoLuongSachMuon();
        limit = vSoLuongSachMuon;
        vListSachMuonTest = new SachMuon[limit];
        for(int i=0; i<vSoLuongSachMuon; i++){
            Book book = mNhapMaSachMuonMuon();
            System.out.println(book.toString());

            do{
                vSoCuonSachMuonMuon = mSoCuonSachMuonMuon();
                if(vSoCuonSachMuonMuon > limit){
                    System.out.println("So cuon sach muon muon nhieu hon tong so sach muon!");
                }
            }while(vSoCuonSachMuonMuon > limit);

            SachMuon vSachMuon = new SachMuon(book, vSoCuonSachMuonMuon);
            vSachMuon.mLuuSachMuon(vSachMuon);
            System.out.println(vSachMuon.toString());

            count++;
            limit -= vSoCuonSachMuonMuon;
            if(limit == 0){
                break;
            }
        }

        vListSachMuon = new SachMuon[count];
        for (int i=0; i<count; i++){
            vListSachMuon[i] = vListSachMuonTest[i];
        }

        BookManagement vBookManagement = new BookManagement(reader, vListSachMuon);
        vBookManagement.LuuThongTinMuonSach(vBookManagement);
    }


}
