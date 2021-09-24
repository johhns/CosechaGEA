package com.developer.johhns.cosechagea.datos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

	DB_DDL ddl = new DB_DDL() ;

    public DBHelper(@Nullable Context context) {
        super(context, "ST_CC.db3" , null , 1 );
    }

    @Override
    public void onCreate(SQLiteDatabase db ) {
        db.execSQL( ddl.HH_USUARIOS );
        insertarDBA( ) ;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL( "DROP TABLE IF EXISTS HH_USUARIOS" );
		onCreate(db);
    }

    public void insertarRegistro( String tabla, ContentValues  campos ) {
      SQLiteDatabase db = this.getWritableDatabase() ;
      db.insert( tabla , null , campos ) ;
      db.close();
    }

    public boolean esUsuarioValido( String usuario, String clave ){
        SQLiteDatabase db = this.getWritableDatabase() ;
        Cursor datos = db.rawQuery("Select * From HH_USUARIOS Where usuario = ? And clave = ?" , new String[] { usuario ,clave }) ;
        if ( datos.getCount() > 0 ) {
            db.close();
            return true ;
        } else {
            db.close();
            return  false ;
        }
    }

    public void insertarDBA( ) {
        SQLiteDatabase db = this.getWritableDatabase() ;
        ContentValues contentValues = new ContentValues();
        contentValues.put("NOMBRE", "ADMIN" );
        contentValues.put("CLAVE" , "ADMIN" );
        insertarRegistro("HH_USUARIOS",contentValues);
        db.close();
    }

}
