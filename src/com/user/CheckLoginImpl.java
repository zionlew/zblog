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
            String sql = "select count(*) from user where username=? and userpass=?";

            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, userpass);

            rs = pstmt.executeQuery();

            boolean flg = rs.next();
            
            System.out.println("ddd"+ flg);
            
            return flg;
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeAll(conn, pstmt, rs);

        }

        return true;
    }

}
