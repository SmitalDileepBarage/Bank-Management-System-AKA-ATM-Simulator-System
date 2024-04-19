
package bank.management.system;
import java.awt.*;
//import javax.swing.*;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
//import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Deposit extends JFrame implements ActionListener {
    
    JButton deposit,back;
    String pinno;
     JTextField amountT;
    
    Deposit(String pinno){
        this.pinno=pinno;
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900, 900);
        add(image);
        
        JLabel text= new JLabel("Enter the amount you want to deposit :");
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(170,300,400,20);
        image.add(text);
  
       amountT=new JTextField();
        amountT.setFont(new Font("Raleway",Font.BOLD,22));
        amountT.setBounds(170,350,320,25);
        image.add(amountT);
        
         deposit =new JButton("Deposit");
        deposit.setBounds(355,520,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back =new JButton("Back");
        back.setBounds(355,485,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,10);
        setVisible(true);
        
    
    
    
    
    
    
    
    
    
    
    
    }
    
    public void actionPerformed(ActionEvent ae){
    
        
        if(ae.getSource()== deposit){
            
            
            String amount=amountT.getText();
            Date date=new Date();
            
        if(amount.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please fill the amount first...!");
        }
        else{
        //setVisible(false);
        
        Conn conn=new Conn();
        String query="insert into Transaction values('"+ pinno+"','"+date+"','Deposit','"+ amount+"')";
                try {
                    
                  conn.ps.executeUpdate(query);
                  JOptionPane.showMessageDialog(null,"Rs."+amount+" Deposited Successfully..!");
                  setVisible(false);
                             new Transaction(pinno).setVisible(false);

                } catch (Exception ex) {
                    ex.printStackTrace();
                     setVisible(false);
                             new Transaction(pinno).setVisible(true);

                }
        
        
        }
        }
        else if(ae.getSource()==back){
        
            
            setVisible(false);
        new Transaction(pinno).setVisible(true);
        
        
        }
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        new Deposit(" ");
    }
}
