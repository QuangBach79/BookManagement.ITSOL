package model;

import java.util.Scanner;

public class Book{
    public static Book[] books = new Book[100];
    private static int stt = 10000;
    private int vMaSach;
    private String vTenSach;
    private String vTacGia;
    private String vChuyenNganh;
    private String vNamXuatBan;

    private static final String KHTN = "Khoa hoc tu nhien";
    private static final String VHNT = "Van hoc nghe thuat";
    private static final String DTVT = "Dien tu vien thong";
    private static final String CNTT = "Cong nghe thong tin";

    public Book(){}

    public Book(int vMaSach, String vTenSach, String vTacGia, String vChuyenNganh, String vNamXuatBan) {
        this.vMaSach = vMaSach;
        this.vTenSach = vTenSach;
        this.vTacGia = vTacGia;
        this.vChuyenNganh = vChuyenNganh;
        this.vNamXuatBan = vNamXuatBan;
    }

    public int getStt() {
        return stt;
    }
    public void setStt(int stt) {
        Book.stt = stt;
    }

    public int getvMaSach() {
        return vMaSach;
    }
    public void setvMaSach(int vMaSach) {
        this.vMaSach = vMaSach;
    }

    public String getvTenSach() {
        return vTenSach;
    }
    public void setvTenSach(String vTenSach) {
        this.vTenSach = vTenSach;
    }

    public String getvTacGia() {
        return vTacGia;
    }
    public void setvTacGia(String vTacGia) {
        this.vTacGia = vTacGia;
    }

    public String getvChuyenNganh() {
        return vChuyenNganh;
    }
    public void setvChuyenNganh(String vChuyenNganh) {
        this.vChuyenNganh = vChuyenNganh;
    }

    public String getvNamXuatBan() {
        return vNamXuatBan;
    }
    public void setvNamXuatBan(String vNamXuatBan) {
        this.vNamXuatBan = vNamXuatBan;
    }

    public void mNhapSachMoi(){
        this.vMaSach = stt++;
        System.out.print("Nhap ten sach: ");
        this.vTenSach = new Scanner(System.in).nextLine();
        System.out.print("Nhap tac gia: ");
        this.vTacGia = new Scanner(System.in).nextLine();
        System.out.print("Chon chuyen nganh: ");
        this.mNhapChuyenNganh();
        System.out.println("Nhap nam xuat ban: ");
        this.vNamXuatBan = new Scanner(System.in).nextLine();
    }

    public void mNhapChuyenNganh(){
        int vChonChuyenNganh;
        System.out.println("1. Khoa hoc tu nhien");
        System.out.println("2. Van hoc nghe thuat");
        System.out.println("3. Dien tu vien thong");
        System.out.println("4. Cong nghe thong tin");
        do{
            vChonChuyenNganh = new Scanner(System.in).nextInt();
            if (vChonChuyenNganh<=0 || vChonChuyenNganh>=5) {
            System.out.println("Cu phap khong hop le. Moi nhap lai!");
            }
        }while(vChonChuyenNganh<=0 || vChonChuyenNganh>=5);
        switch (vChonChuyenNganh){
            case 1:
                this.vChuyenNganh = Book.KHTN;
                break;
            case 2:
                this.vChuyenNganh = Book.VHNT;
                break;
            case 3:
                this.vChuyenNganh = Book.DTVT;
                break;
            case 4:
                this.vChuyenNganh = Book.CNTT;
                break;
        }
    }
    public void mLuuSach(Book book){
        for(int i = 0; i<books.length; i++){
            if(books[i] == null){
                books[i] = book;
                return;
            }
        }
    }
    @Override
    public String toString(){
        return "{"+
                vMaSach + ", " +
                vTenSach + ", " +
                vTacGia + ", " +
                vChuyenNganh + ", " +
                vNamXuatBan +
                "}";
    }

}
