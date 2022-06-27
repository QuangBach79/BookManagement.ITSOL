package model;

import java.util.Scanner;

public class Reader {
    public static Reader[] readers = new Reader[100];
    private static final String SV = "Sinh vien";
    private static final String HVCH = "Hoc vien cao hoc";
    private static final String GV = "Giao vien";
    private static int stt = 10000;
    private int vMaBanDoc;
    private String vHoTen;
    private String vDiaChi;
    private String vSDT;
    private String vLoaiBanDoc;

    public Reader(){}

    public Reader(int vMaBanDoc, String vHoTen, String vDiaChi, String vSDT, String vLoaiBanDoc) {
        this.vMaBanDoc = vMaBanDoc;
        this.vHoTen = vHoTen;
        this.vDiaChi = vDiaChi;
        this.vSDT = vSDT;
        this.vLoaiBanDoc = vLoaiBanDoc;
    }

    public static int getStt() {
        return stt;
    }
    public static void setStt(int stt) {
        Reader.stt = stt;
    }

    public int getvMaBanDoc() {
        return vMaBanDoc;
    }
    public void setvMaBanDoc(int vMaBanDoc) {
        this.vMaBanDoc = vMaBanDoc;
    }

    public String getvHoTen() {
        return vHoTen;
    }
    public void setvHoTen(String vHoTen) {
        this.vHoTen = vHoTen;
    }

    public String getvDiaChi() {
        return vDiaChi;
    }
    public void setvDiaChi(String vDiaChi) {
        this.vDiaChi = vDiaChi;
    }

    public String getvSDT() {
        return vSDT;
    }
    public void setvSDT(String vSDT) {
        this.vSDT = vSDT;
    }

    public String getvLoaiBanDoc() {
        return vLoaiBanDoc;
    }
    public void setvLoaiBanDoc(String vLoaiBanDoc) {
        this.vLoaiBanDoc = vLoaiBanDoc;
    }

    public void mNhapBanDocMoi(){
        this.vMaBanDoc = stt++;
        System.out.print("Nhap ho ten: ");
        this.vHoTen = new Scanner(System.in).nextLine();
        System.out.print("Nhap Dia Chi: ");
        this.vDiaChi = new Scanner(System.in).nextLine();
        System.out.print("Nhap SDT: ");
        this.vSDT = new Scanner(System.in).nextLine();
        System.out.println("Nhap loai ban doc:");
        this.mNhapLoaiBanDoc();
    }

    public void mNhapLoaiBanDoc(){
        int vChonLoaiBanDoc;
        System.out.println("1. Sinh vien");
        System.out.println("2. Hoc vien cao hoc");
        System.out.println("3. Giao vien");
        System.out.println("Chon loai ban doc: ");
        do{
            vChonLoaiBanDoc = new Scanner(System.in).nextInt();
            if (vChonLoaiBanDoc<=0 || vChonLoaiBanDoc >=5){
                System.out.println("Cu phap khong hop le. Moi nhap lai!");
            }
        }while(vChonLoaiBanDoc<=0 || vChonLoaiBanDoc >=5);
        switch (vChonLoaiBanDoc){
            case 1:
                this.vLoaiBanDoc = Reader.SV;
                break;
            case 2:
                this.vLoaiBanDoc = Reader.HVCH;
                break;
            case 3:
                this.vLoaiBanDoc = Reader.GV;
                break;
        }
    }

    public void mLuuBanDoc(Reader reader){
        for(int i=0; i<readers.length; i++){
            if (readers[i] == null){
                readers[i] = reader;
                return;
            }
        }
    }

    @Override
    public String toString(){
        return "Ban Doc {" +
                vMaBanDoc +", "+
                vHoTen +", "+
                vDiaChi +", "+
                vSDT +", "+
                vLoaiBanDoc +
                "}";
    }
}
