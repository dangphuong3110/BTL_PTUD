package com.dhtl.btl_ptud.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

import com.dhtl.btl_ptud.R;
import com.dhtl.btl_ptud.controller.DeThiController;
import com.dhtl.btl_ptud.model.DeThi;
import com.dhtl.btl_ptud.model.database.DatabaseConnect;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    DatabaseConnect databaseConnect;
    SQLiteDatabase db;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        databaseConnect = new DatabaseConnect(this);
        db = databaseConnect.getReadableDatabase();
        textView = (TextView) findViewById(R.id.tv1);
        DeThiController deThiController = new DeThiController(context);
        textView.setText(deThiController.getTieuDe());
        db.close();
    }

}