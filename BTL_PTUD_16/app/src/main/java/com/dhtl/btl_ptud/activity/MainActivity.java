package com.dhtl.btl_ptud.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

import com.dhtl.btl_ptud.R;
import com.dhtl.btl_ptud.database.DatabaseConnect;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    DatabaseConnect databaseConnect;
    SQLiteDatabase db;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}