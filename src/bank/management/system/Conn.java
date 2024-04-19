
package bank.management.system;

import java.sql.*;

public class Conn {
   Connection c;
  Statement ps;
    public Conn(){
    
    try{
    
      
        
   Class.forName("com.mysql.cj.jdbc.Driver");
  c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","mysqlsmit1251");
  ps = c.createStatement();
    
    
    
    }
    catch(Exception e){
        
        
    e.printStackTrace();
    
    
    
    
    
    }
    
    
    
    
    
    
    
    }
    
    
    
}
