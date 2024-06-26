/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import workshop.utils.DBUtils;

/**
 *
 * @author kirikaza
 */
public class UsersDAO {
   private String  sql = "SELECT username,password,name FROM users ";
   private PreparedStatement ps = null;
   private ResultSet rs = null;
    
    public UsersDTO login(String username ,String password){
        UsersDTO dto = null;
        try {
            sql+="WHERE username = ? AND password = ?";
            Connection con = DBUtils.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            
            rs=ps.executeQuery();
            if(rs.next()){
                dto=new UsersDTO();
                dto.setName(rs.getString("name"));
                dto.setUsername(rs.getString("username"));
                dto.setPassword(rs.getString("password"));
            }
        } catch (Exception e) {
        }
        return dto;
    }
}
