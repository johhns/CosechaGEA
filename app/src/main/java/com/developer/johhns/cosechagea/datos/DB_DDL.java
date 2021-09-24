package com.developer.johhns.cosechagea.datos;

public final class DB_DDL {

	public static final String DB_NAME = "st_cc_hh.db" ;

    public static final String HH_USUARIOS =  "CREATE TABLE HH_USUARIOS (" +
                                              " USUARIO           TEXT PRIMARY KEY ," +
	                                          " NOMBRES           TEXT," +
	                                          " ACTIVO            TEXT," +
	                                          " CLAVE             TEXT," +
	                                          " TIPO              TEXT," +
	                                          " MODIFICADO_POR    TEXT," +
	                                          " MODIFICADO_EL     TEXT)" ;


}
