
package bank.management.system;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.*;

public class MiniStatement extends JFrame{
    
    String pinno;
    MiniStatement(String pinno){
    this.pinno=pinno;
        setTitle("Mini Statements");
    setLayout(null);
    
    
        

    JLabel bank =new JLabel("Indian Overseas Bank");
    bank.setBounds(100, 20,200,30);
    bank.setFont(new Font("Raleway",Font.BOLD,16));
    add(bank);


    JLabel card =new JLabel();
    card.setBounds(20, 80,400,20);
   // card.setFont(new Font("Raleway",Font.BOLD,16));
    add(card);


    JLabel mini =new JLabel();
    mini.setBounds(20,140,400,200);
   // mini.setForeground(Color.white);
    //mini.setFont(new Font("Raleway",Font.BOLD,16));
    add(mini);

    
    JLabel bal=new JLabel();
    bal.setBounds(20,400,300,20);
    add(bal);

    Conn conn=new Conn();

      try{


          ResultSet rs=conn.ps.executeQuery("select *from login where PIN_No='"+pinno+"' ");

            while(rs.next())
           {

             card.setText("Card Number : " + rs.getString("Card_No").substring(0,4)+ "-XXXXXXXX-" + rs.getString("Card_No").substring(12));

           }
          
         }
      catch(Exception e)
       {
       System.out.println( e.getMessage());              
       }


      //now for Transaction table
      try{
          
          int bala=0;
      ResultSet rs=conn.ps.executeQuery("select *from transaction where PIN_no='"+pinno+"'");
      while(rs.next()){
      
          mini.setText(mini.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type_of_Transaction")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
           if(rs.getString("type_of_Transaction").equals("Deposit"))
                    {
                       bala=Integer.parseInt(bala+rs.getString("amount"));
                    }
                  else
                    {
                       bala=bala-Integer.parseInt(rs.getString("amount"));          
              
                    }
      }
          bal.setText("Your Current acoount balance is Rs :"+bala);
      }
      catch(Exception e){}



        
        
        
        
        setSize(400, 600);
        setLocation(20,20);
        //setUndecorated(true);//this will remove the white line present in output with java logo
        getContentPane().setBackground(Color.white);
        setVisible(true);
    
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        new MiniStatement(" ");
    }
    
    
    
}
