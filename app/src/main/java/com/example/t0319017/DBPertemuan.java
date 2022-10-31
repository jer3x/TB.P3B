//package com.example.t0319017;
//
//import android.content.Context;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
//import androidx.annotation.Nullable;
//
//import java.util.Date;
//
//public class DBPertemuan extends SQLiteOpenHelper {
//
//    private Context context;
//    public static final String DATABASE_NAME = "crud";
//    private static final int DATABASE_VERSION = 1;
//
//
//    //TABLE
//    private static final String TABLE_NAME = "bikinpertemuan";
//    private static final String COLUMN_ID = "_id";
//    private static final String COLUMN_DOKTER = "nama_dokter";
//    private static final String COLUMN_KELUHAN = "nama_keluhan";
//    private static final String COLUMN_DATE= "tanggal";
//    private static final String COLUMN_WAKTU = "waktu";
//    String tableName = TABLE_NAME;
//
//    public DBPertemuan(@Nullable Context context){
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//        this.context = context;
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase sqLiteDatabase){
//        String query = "CREATE TABLE " + TABLE_NAME +
//                " (" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                COLUMN_DOKTER + " TEXT, " +
//                COLUMN_KELUHAN + " TEXT, " +
//                COLUMN_DATE + " TEXT, " +
//                COLUMN_WAKTU + " TEXT);";
//        sqLiteDatabase.execSQL(query);
//
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int j){
//        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
//        onCreate(sqLiteDatabase);
//
//
//    }
//
//    void add()
//
//}
