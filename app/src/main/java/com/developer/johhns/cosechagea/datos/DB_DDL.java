package com.developer.johhns.cosechagea.datos;

public class DB_DDL {

    public final String HH_USUARIOS = "CREATE TABLE HH_USUARIOS (" +
                                      "	USUARIO           TEXT(50) NOT NULL," +
				                      "	NOMBRES           TEXT(100)," +
                                      "	ACTIVO            TEXT(2)," +
				                      "	CLAVE             TEXT(100)," +
				                      "	TIPO              TEXT(50) NOT NULL," +
				                      "	MODIFICADO_POR    TEXT(50)," +
				                      "	MODIFICADO_EL     TEXT(30)," +
				                      "	PRIMARY KEY (USUARIO)" +
				                      ");";


}
