package factory;

import java.sql.Connection;

import enums.Vendor;
import pool.DBConstant;

public class DatabaseFactory {

	public static Database createDatabase(Vendor v, String id, String pass) {
		Database db = null;
		String driver = "", url = "";
		switch (v) {
		case ORACLE:
			driver = DBConstant.ORACLE_DRIVER;
			url = DBConstant.CONNECTION_URL;
			db = new Oracle(driver,url,id,pass);
			break;
		case MARIADB:
			driver = DBConstant.MRIADB_DRIVER;
			url = DBConstant.CONNECTION_URL;
		//	db = new MariaDB(driver,url,DBConstant.USERNAME,DBConstant.PASSWORD);
			break;
		case MYSQL:
			driver = DBConstant.MYSQL_DRIVER;
			url = DBConstant.CONNECTION_URL;
			//db = new MySQL(driver,DBConstant.USERNAME,DBConstant.PASSWORD);
			break;
		case MSSQL:
			driver = DBConstant.MSSQL_DRIVER;
			url = DBConstant.CONNECTION_URL;
			//db = new MsSQL(driver,url,DBConstant.USERNAME,DBConstant.PASSWORD);
			break;
			

		}
		return db;
			
	}

}
