package com.dhtl.btl_ptud.model;

public class DeThi {
    private int maDeThi, soCauHoi, thoiGianLamBai, diemToiDa;
    private String tieuDe, moTa;

    public DeThi() {
    }

    public DeThi(int maDeThi, int soCauHoi, int thoiGianLamBai, int diemToiDa, String tieuDe, String moTa) {
        this.maDeThi = maDeThi;
        this.soCauHoi = soCauHoi;
        this.thoiGianLamBai = thoiGianLamBai;
        this.diemToiDa = diemToiDa;
        this.tieuDe = tieuDe;
        this.moTa = moTa;
    }

    public int getMaDeThi() {
        return maDeThi;
    }

    public void setMaDeThi(int maDeThi) {
        this.maDeThi = maDeThi;
    }

    public int getSoCauHoi() {
        return soCauHoi;
    }

    public void setSoCauHoi(int soCauHoi) {
        this.soCauHoi = soCauHoi;
    }

    public int getThoiGianLamBai() {
        return thoiGianLamBai;
    }

    public void setThoiGianLamBai(int thoiGianLamBai) {
        this.thoiGianLamBai = thoiGianLamBai;
    }

    public int getDiemToiDa() {
        return diemToiDa;
    }

    public void setDiemToiDa(int diemToiDa) {
        this.diemToiDa = diemToiDa;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}