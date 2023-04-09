package com.dhtl.btl_ptud.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DatabaseConnect extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "my_database.db";
    private static final int DATABASE_VERSION = 1;
    ContentValues values;
    public DatabaseConnect(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Tao bang DeThi
    String dropTableDeThi = "DROP TABLE IF EXISTS DeThi";
    public String CREATE_DETHI_TABLE = "CREATE TABLE IF NOT EXISTS DeThi (maDeThi INTEGER PRIMARY KEY AUTOINCREMENT,tieuDe NVARCHAR(255) NOT NULL, moTa NVARCHAR(255),"
            +"soCauHoi INTEGER,thoiGianLamBai INTEGER,diemToiDa INTEGER)";
    //Tao bang CauHoi
    public String CREATE_CAUHOI_TABLE = "CREATE TABLE IF NOT EXISTS CauHoi (maCauHoi INTEGER PRIMARY KEY AUTOINCREMENT,noiDung NVARCHAR(255) NOT NULL, dapAnA NVARCHAR(255),"
            +"dapAnB NVARCHAR(255),dapAnC NVARCHAR(255),dapAnD NVARCHAR(255), dapAnDung NVARCHAR(1) NOT NULL,mucDoKho INTEGER)";

    //Tao bang NguoiDung
    public String CREATE_NGUOIDUNG_TABLE = "CREATE TABLE IF NOT EXISTS NguoiDung (maNguoiDung INTEGER PRIMARY KEY AUTOINCREMENT, tenDangNhap NVARCHAR(255) NOT NULL,matKhau NVARCHAR(255) NOT NULL, hoTen NVARCHAR(255),"
            +"email NVARCHAR(255),soDienThoai NVARCHAR(15))";

    //Tạo bảng Kết quả
    public String CREATE_KETQUA_TABLE = "CREATE TABLE IF NOT EXISTS KetQua (maKetQua INTEGER PRIMARY KEY AUTOINCREMENT, maNguoiDung INTEGER, FOREIGN KEY(maNguoiDung) REFERENCES NguoiDung(maNguoiDung),maDeThi INTEGER,"
            +"FOREIGN KEY(maDeThi) REFERENCES DeThi(maDeThi) , soCauTraLoiDung INTEGER, soCauTraLoiSai INTEGER, thoiGianLamBai INTEGER, diemSo INTEGER)";
    //Tạo bảng Lịch sử thi
    public String CREATE_LICHSUTHI_TABLE = "CREATE TABLE IF NOT EXISTS LichSuThi (maLichSu INTEGER PRIMARY KEY AUTOINCREMENT, maNguoiDung INTEGER, FOREIGN KEY(maNguoiDung) REFERENCES NguoiDung(maNguoiDung),maDeThi INTEGER,"
            +"FOREIGN KEY(maDeThi) REFERENCES DeThi(maDeThi) , thoiGianBatDau DATETIME, thoiGianKetThuc DATETIME)";
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DETHI_TABLE);
        ContentValues values = new ContentValues();
        values.put("maDeThi", 1);
        values.put("tieuDe", "abc");
        values.put("moTa", "cdb");
        db.insert("DeThi", null, values);
//        db.execSQL(CREATE_CAUHOI_TABLE);
//        db.execSQL(CREATE_NGUOIDUNG_TABLE);
//        db.execSQL(CREATE_KETQUA_TABLE);
//        db.execSQL(CREATE_LICHSUTHI_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String dropTableDeThi = "DROP TABLE IF EXISTS DeThi";
        String dropTableCauHoi = "DROP TABLE IF EXISTS CauHoi";
        String dropTableNguoiDung = "DROP TABLE IF EXISTS NguoiDung";
        String dropTableKetQua = "DROP TABLE IF EXISTS KetQua";
        String dropTableLichSu = "DROP TABLE IF EXISTS LichSu";
        db.execSQL(dropTableLichSu);
        db.execSQL(dropTableKetQua);
        db.execSQL(dropTableDeThi);
        db.execSQL(dropTableCauHoi);
        db.execSQL(dropTableNguoiDung);
        onCreate(db);
    }
}

