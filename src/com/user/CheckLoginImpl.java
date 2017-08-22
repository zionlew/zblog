/**----------------------------------------------------------+
 +   PGM-ID  :   CheckLoginImpl.java
 +   Author  :   H.Liu
 +   Date    :   2017年8月22日 下午8:14:08
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.ConnectionManager;

public class CheckLoginImpl {

    public boolean check(String username, String userpass) {

        Connection conn = ConnectionManager.getConnectionInstance();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String sql = "select userid from user where username=? and userpass=?";
            System.out.println("username:" + username);
            System.out.println("userpass:" + userpass);
            pstmt =  conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, userpass);

            rs = pstmt.executeQuery();
            boolean flg = false;
            
            while(rs.next()){
                flg= true;
                System.out.println(rs.getString(1));
                               
            }
            
            System.out.println("check:"+ flg);
           
            return flg;
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeAll(conn, pstmt, rs);

        }

        return true;
    }

}
