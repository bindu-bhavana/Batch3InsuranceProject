package com.insurance.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.driver.OracleDriver;

public class DatabaseConnection {
	private static Connection con=null;
	public static Connection getConnection() {
			  String user="system";
			  String password="VBhavana23";
			  String url="jdbc:oracle:thin:@localhost:1521:orcl";
			  try {
				  DriverManager.registerDriver(new OracleDriver());
				 con=DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
			}
			return con;
	    }
	public static void closeConnection() {
		// TODO Auto-generated method stub
		try {
			con.close();
		} catch (SQLException e) {
		}
	}
	}


