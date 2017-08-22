/**----------------------------------------------------------+
 +   PGM-ID  :   ConnectionManager.java
 +   Author  :   Liu Huan
 +   Date    :   2014年12月16日 下午8:33:58
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author LH
 *
 */
public class ConnectionManager {

	public static Connection getConnectionInstance(){
		Connection conn = null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://101.132.36.134:3306/zblog", "root", "uAiqwVwjJ8-i");
				return conn;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		return conn;
	}
	
	public static void closeAll(Connection conn, Statement stmt, ResultSet rs) {
		if (rs != null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null){
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
		if (conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
}
	
}
