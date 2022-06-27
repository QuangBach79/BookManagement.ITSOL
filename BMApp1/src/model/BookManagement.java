package model;

import java.util.Arrays;

public class BookManagement {
    public static BookManagement[] listBanDocMuonSach = new BookManagement[100];
    private Reader reader;
    private SachMuon[] vSachMuon;
    public BookManagement() {
    }

    public BookManagement(Reader reader, SachMuon[] vSachMuon) {
        this.reader = reader;
        this.vSachMuon = vSachMuon;
    }

    public Reader getReader() {return reader;}
    public void setReader(Reader reader) {this.reader = reader;}

    public SachMuon[] getvSachMuon() {return vSachMuon;}
    public void setvSachMuon(SachMuon[] vSachMuon) {this.vSachMuon = vSachMuon;}

    public void LuuThongTinMuonSach(BookManagement vBookManagement){
        for(int i=0; i< listBanDocMuonSach.length; i++){
            if(listBanDocMuonSach[i] == null){
                listBanDocMuonSach[i] = vBookManagement;
                return;
            }
        }
    }

    public String toString(){
        return "{" +
                reader +", "+ "Sach muon: " +
                Arrays.toString(vSachMuon) +
                "}";
    }
}
