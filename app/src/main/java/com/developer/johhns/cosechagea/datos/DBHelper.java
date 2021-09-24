package com.developer.johhns.cosechagea.datos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private  Context contexto ;

    public DBHelper(@Nullable Context context) {
        super(context, DB_DDL.DB_NAME , null , 1 );
        this.contexto = context ;
    }

    @Override
    public void onCreate(SQLiteDatabase db ) {
        db.execSQL( "CREATE TABLE PRUEBA ( CODIGO TEXT, NOMBRE TEXT )" );
        Log.i( "DB", DB_DDL.HH_USUARIOS ) ;
        db.execSQL( DB_DDL.HH_USUARIOS ) ;
        //insertarDBA() ;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL( "DROP TABLE IF EXISTS HH_USUARIOS" );
        db.execSQL( "DROP TABLE IF EXISTS PRUEBA" );
        onCreate(db);
    }



    public void insertarRegistro( String tabla, ContentValues  campos ) {
      SQLiteDatabase db = this.getWritableDatabase() ;
      db.insert( tabla , null , campos ) ;
      db.close();
    }

    public boolean esUsuarioValido( String usuario, String clave ){
        SQLiteDatabase db = this.getWritableDatabase() ;
        Cursor datos = db.rawQuery("select * from HH_USUARIOS where USUARIO = ? and CLAVE = ?" , new String[] { usuario ,clave }) ;
        if ( datos.getCount() > 0 ) {
            db.close();
            return true ;
        } else {
            db.close();
            return  false ;
        }
    }

    public void insertarDBA() {
        ContentValues contentValues ;///= new ContentValues();
        /*
        contentValues.put("USUARIO", "ADMIN" );
        contentValues.put("CLAVE"  , "ADMIN" );
        insertarRegistro("HH_USUARIOS",contentValues);

        contentValues = new ContentValues();
        contentValues.put("USUARIO", "1234" );
        contentValues.put("CLAVE"  , "1234" );
        insertarRegistro("HH_USUARIOS",contentValues);
*/
        contentValues = new ContentValues();
        contentValues.put("CODIGO" , "hola" );
        contentValues.put("NOMBRE" , "hola" );
        insertarRegistro("PRUEBA",contentValues);
    }

}
