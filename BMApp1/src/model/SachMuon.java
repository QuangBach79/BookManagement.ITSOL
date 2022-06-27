package model;

public class SachMuon {
    public static SachMuon[] vListSachMuonTest;
    public static SachMuon[] vListSachMuon;
    private Book book;
    private int vSoLuongSachMuon;
    public SachMuon(){}

    public SachMuon(Book book, int vSoLuongSachMuon) {
        this.book = book;
        this.vSoLuongSachMuon = vSoLuongSachMuon;
    }

    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    public int getvSoLuongSachMuon() {
        return vSoLuongSachMuon;
    }
    public void setvSoLuongSachMuon(int vSoLuongSachMuon) {
        this.vSoLuongSachMuon = vSoLuongSachMuon;
    }

    public static void mLuuSachMuon(SachMuon pick){
        for (int i=0; i<vListSachMuonTest.length; i++){
            if(vListSachMuonTest[i] == null){
                vListSachMuonTest[i] = pick;
                return;
            }
        }
    }

    public String toString(){
        return "{" +
                book + " So luong: " +
                vSoLuongSachMuon + " cuon" +
                "}";
    }
}
