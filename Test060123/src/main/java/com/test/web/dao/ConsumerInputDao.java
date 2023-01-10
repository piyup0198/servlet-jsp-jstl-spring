package com.test.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.test.web.model.ElectricityUser;

public class ConsumerInputDao {
	public static int insert(ElectricityUser u){  
        int status=0;  
        Connection con = null;
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	String url = "jdbc:mysql://localhost:3306/infinite";
	        String user = "root";
	        String pass = "priyanka@1";
	        con = DriverManager.getConnection(url,user,pass);
	        PreparedStatement ps=con.prepareStatement(  
                    "insert into electricity_user(meterId,consName,currRead,prevRead,zone) values (?,?,?,?,?)");  
       ps.setLong(1,u.getMeterId());  
       ps.setString(2,u.getConsName());
       ps.setInt(3,(int) u.getCurrReading());
       ps.setInt(4,(int) u.getPrevReading());
       ps.setString(5,u.getZone());
       ps.executeUpdate();  
 
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }

}
