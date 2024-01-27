package com.example.sistempakarmotor2tak;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "sistempakarkawasakininja";

    public Database(Context context) {
        super(context, DATABASE_NAME, null, 5);
    }



    public void createTable(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS gejala");
        db.execSQL("CREATE TABLE if not exists gejala (id TEXT PRIMARY KEY, nama TEXT, " +
                "ya VARCHAR(5), tidak VARCHAR(5), mulai VARCHAR(5), selesai VARCHAR(5));");
    }

    public void createTable2(SQLiteDatabase db2) {
        db2.execSQL("DROP TABLE IF EXISTS penyakit");
        db2.execSQL("CREATE TABLE if not exists penyakit (kode_penyakit TEXT PRIMARY KEY , " +
                "nama_penyakit TEXT);");
    }

    public void generateData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        db.execSQL("INSERT INTO gejala VALUES ('G001','Apakah tarikan terasa berat?', 'G003', 'G006', 'Y', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G002','Apakah motor sulit dinyalakan?', 'P001', 'P001', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G003','Apakah aktif mengganti setelan karbu?', 'G004', 'P001', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G004','Apakah pilot jet memiliki ukuran yang pas?', 'G005', 'P001', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G005','Apakah campuran udara dan bensin pada pilot jet karburator sudah cukup?', 'G002', 'P001', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G006','Apakah motor cepat panas?', 'G007', 'G011', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G007','Apakah air pada reservoir cepat habis?', 'G008', 'P002', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G008','Apakah proses pendinginan optimal?', 'G009', 'P002', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G009','Apakah bearing pada pompa mengeluarkan bunyi gesekan?', 'G010', 'P002', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G010','Apakah terdapat air radiator yang bocor kedalam mesin? ', 'P002', 'P002', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G011','Apakah sering terjadi motor tiba-tiba mati?', 'G012', 'G016', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G012','Apakah tampilan lampu redup?', 'G013', 'P003', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G013','Apakah lampu beberapa kali mati?', 'G014', 'P003', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G014','Apakah komponen aki tekor?', 'G015', 'P003', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G015','Apakah motor dapat melakukan start tangan?', 'P003', 'P003', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G016','Apakah motor mengeluarkan asap tebal?', 'G017', 'G021', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G017','Apakah ada tegangan atau arus  yang keluar?', 'G018', 'P004', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G018','Apakah terdapat percikan api saat kabel menempel ke besi?', 'G019', 'P004', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G019','Apakah komponen sepul dan pulser baik-baik saja?', 'G020', 'P004', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G020','Apakah posisi kabel sudah benar?', 'P004', 'P004', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G021','Sudah berapa lamakah usia pemakaian?', 'G022', 'G026', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G022','Apakah setelan stopper sudah pas?', 'G023', 'P005', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G023','Apakah saat di engkol motor mengeluarkan bunyi seperti terompet?', 'G024', 'P005', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G024','Apakah putaran mesin terasa tertahan?', 'G025', 'P005', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G025','Apakah penyetelan karburator masuk ke setelan irit?', 'P005', 'P005', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G026','Apakah tarikan pada motor terasa berat?', 'G027', 'G031', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G027','Apakah sering melakukan tarikan RPM lebih dari 7.000?', 'G028', 'P006', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G028','Apakah suara knalpot menjadi pecah?', 'G029', 'P006', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G029','Apakah kualitas oli yang dipakai sudah baik?', 'G030', 'P006', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G030','Apakah terjadi kemacetan saat KIPS terbuka?', 'P006', 'P006', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G031','Apakah knalpot mengeluarkan asap yang berlebih serta bau gosong?', 'G032', 'G036', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G032','Apakah pasokan bensin dan oli samping ideal?', 'G033', 'P007', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G033','Apakah setelan karburator sudah cukup basah?', 'G034', 'P007', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G034','Apakah sudah dilakukan pengecekan jalur oli sampiing?', 'G035', 'P007', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G035','Apakah kualitas air radiator masih layak?', 'P007', 'P007', 'T', 'T');");


        db.execSQL("INSERT INTO gejala VALUES ('P001','Kerusakan Pada Pilot Jet', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P002','Masalah Pada Pompa Air Radiator', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P003','Masalah Kiprok', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P004','CDI Bermasalah', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P005','Masalah Membran / Reed Valve', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P006','Masalah Pada  KIPS', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P007','Overheat', '0', '0', 'T', 'Y');");



    }

    public void generateData2(SQLiteDatabase db2) {
        db2.execSQL("INSERT INTO penyakit VALUES ('P001','Kerusakan Pada Pilot Jet');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P002','Masalah Pada Pompa Air Radiator');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P003','Masalah Kiprok');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P004','CDI Bermasalah');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P005','Masalah Membran / Reed Valve');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P006','Masalah Pada  KIPS');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P007','Overheat');");


    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public void onCreate(SQLiteDatabase db) {

    }
}
