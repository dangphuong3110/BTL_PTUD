package com.dhtl.btl_ptud.model;

public class KetQua {
    private int maKetQua, soCauTLDung, soCauTLSai, thoiGianLamBai, diemSo;
    private String maNguoiDung, maDeThi;

    public KetQua(int maKetQua, int soCauTLDung, int soCauTLSai, int thoiGianLamBai, int diemSo, String maNguoiDung, String maDeThi) {
        this.maKetQua = maKetQua;
        this.soCauTLDung = soCauTLDung;
        this.soCauTLSai = soCauTLSai;
        this.thoiGianLamBai = thoiGianLamBai;
        this.diemSo = diemSo;
        this.maNguoiDung = maNguoiDung;
        this.maDeThi = maDeThi;
    }

    public int getMaKetQua() {
        return maKetQua;
    }

    public void setMaKetQua(int maKetQua) {
        this.maKetQua = maKetQua;
    }

    public int getSoCauTLDung() {
        return soCauTLDung;
    }

    public void setSoCauTLDung(int soCauTLDung) {
        this.soCauTLDung = soCauTLDung;
    }

    public int getSoCauTLSai() {
        return soCauTLSai;
    }

    public void setSoCauTLSai(int soCauTLSai) {
        this.soCauTLSai = soCauTLSai;
    }

    public int getThoiGianLamBai() {
        return thoiGianLamBai;
    }

    public void setThoiGianLamBai(int thoiGianLamBai) {
        this.thoiGianLamBai = thoiGianLamBai;
    }

    public int getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(int diemSo) {
        this.diemSo = diemSo;
    }

    public String getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(String maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public String getMaDeThi() {
        return maDeThi;
    }

    public void setMaDeThi(String maDeThi) {
        this.maDeThi = maDeThi;
    }
}
