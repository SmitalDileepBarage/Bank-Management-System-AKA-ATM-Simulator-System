
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    
    JButton deposit,withdraw,mini,pin,fast,current,exit;
    String pinno;
    FastCash(String pinno){
        this.pinno=pinno;
        setLayout(null);
      
     
     
     
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0,900,900);
        add(image);
        
        JLabel text=new JLabel("Select Withdrawl Amount");
        text.setBounds(225,300,700,35);//this will add on frame but  not on background  image
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);//it will add text on image
        
        deposit=new JButton("RS.100");
        deposit.setBounds(170, 415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        
        withdraw=new JButton("Rs.500");
        withdraw.setBounds(355, 415,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        fast=new JButton("Rs.1000");
        fast.setBounds(170, 450,150,30);
        fast.addActionListener(this);
        image.add(fast);
        
        mini=new JButton("Rs.2000");
        mini.setBounds(355, 450,150,30);
        mini.addActionListener(this);
        image.add(mini);
        
        pin=new JButton("Rs.5000");
        pin.setBounds(170, 485,150,30);
        pin.addActionListener(this);
        image.add(pin);
        
        current =new JButton("Rs.10000");
        current.setBounds(355, 485,150,30);
        current.addActionListener(this);
        image.add(current);
        
        exit=new JButton("Back");
        exit.setBounds(355, 520,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        
        setSize(900, 900);
        setLocation(300,0);
        setUndecorated(true);//this will remove the white line present in output with java logo
        setVisible(true);//this must be last line of project...always remember
    
    
    
    }
    
    public void actionPerformed(ActionEvent ae){
    
       
        if(ae.getSource()==exit)
        {
          setVisible(false);
          new Transaction(pinno).setVisible(true);
                
        }
        else
        {
                Conn conn=new Conn();
                String amount=((JButton)ae.getSource()).getText().substring(3);
          try{
          
              ResultSet rs=conn.ps.executeQuery("select *from transaction where PIN_no='"+pinno+"' ");
              int balance=0;
              while(rs.next())
              {
                  if(rs.getString("type_of_Transaction").equals("Deposit"))
                    {
                       balance=Integer.parseInt(balance+rs.getString("amount"));
                    }
                  else
                    {
                       balance=balance-Integer.parseInt(rs.getString("amount"));          
              
                    }
              }
              
              
            if(ae.getSource()!= exit && balance < Integer.parseInt(amount))
            {
                JOptionPane.showMessageDialog(null,"Insufficient Balance..!");
                return;  
             }
       Date date=new Date();
       
       String query="Insert into transaction values('"+pinno+"','"+date+"','WithDrawl','"+ amount+"')";
       conn.ps.executeUpdate(query);
       JOptionPane.showMessageDialog(null,"RS"+ amount +"Debited Successfully..!");
          
       
              setVisible(false);
              new Transaction(pinno).setVisible(true);
          }
        catch(Exception e){
        
        e.printStackTrace();
        }
        
        
        
        }
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        new FastCash(" ");
    }
}

