package com.dhtl.btl_ptud.controller;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.dhtl.btl_ptud.database.DatabaseConnect;

import java.util.ArrayList;

public class DeThiController {
    public ArrayList<Object> arrayList = new ArrayList<>();
    private DatabaseConnect databaseConnect;

    public DeThiController(Context context) {
        databaseConnect = new DatabaseConnect(context);
    }


    SQLiteDatabase db;
    public String getTieuDe(){
        db = databaseConnect.getReadableDatabase();
        String sql = "SELECT * FROM DeThi";
        Cursor cs = db.rawQuery(sql, null);
        String tieuDe = "";
        while (cs.moveToNext()) {
            // đọc dữ liệu ở cột
            tieuDe = cs.getString(1);
        }
        return tieuDe;
    }
}