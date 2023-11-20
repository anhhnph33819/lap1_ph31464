package com.example.lap1_ph31464.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Dbhelper extends SQLiteOpenHelper {
    public static final String Db_name = "QLCV";

    public Dbhelper(Context context) {
        super(context, Db_name, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //tạo bảng sản phẩm
        String tb_Congviec="create table congviec(\n" +
                "id integer primary key autoincrement,\n" +
                "tieude text,\n" +
                "noidung text,\n" +
                "ngay text,\n" +
                "loai text,\n" +
                "trangthai integer\n" +
                ")";
        sqLiteDatabase.execSQL(tb_Congviec);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
