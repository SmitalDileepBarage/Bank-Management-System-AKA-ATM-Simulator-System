
package bank.management.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;


public class Transaction  extends JFrame implements ActionListener{
    
    
    JButton deposit,withdraw,mini,pin,fast,current,exit;
    String pinno;
    Transaction(String pinno){
        this.pinno=pinno;
        setLayout(null);
      
     
     
     
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0,900,900);
        add(image);
        
        JLabel text=new JLabel("Please select your Transaction...!");
        text.setBounds(225,300,700,35);//this will add on frame but  not on background  image
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);//it will add text on image
        
        deposit=new JButton("Deposit");
        deposit.setBounds(170, 415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        
        withdraw=new JButton("Withdraw");
        withdraw.setBounds(355, 415,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
        
        fast=new JButton("Fast Cash");
        fast.setBounds(170, 450,150,30);
        fast.addActionListener(this);
        image.add(fast);
        
        mini=new JButton("Mini Statement");
        mini.setBounds(355, 450,150,30);
        mini.addActionListener(this);
        image.add(mini);
        
        pin=new JButton("Pin Change");
        pin.setBounds(170, 485,150,30);
        pin.addActionListener(this);
        image.add(pin);
        
        current =new JButton("Current Balance");
        current.setBounds(355, 485,150,30);
        current.addActionListener(this);
        image.add(current);
        
        exit=new JButton("Exit");
        exit.setBounds(355, 520,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        
        setSize(900, 900);
        setLocation(300,0);
        setUndecorated(true);//this will remove the white line present in output with java logo
        setVisible(true);//this must be last line of project...always remember
        
    
    
    
    
    
    
    
    
    
    
    
    
    }
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==exit){
    System.exit(0);
    }
    else if(ae.getSource()==deposit){
        setVisible(false);
        
        new Deposit(pinno).setVisible(true);
    }
    else if(ae.getSource()==withdraw){
        setVisible(false);
        new Withdraw(pinno).setVisible(true);
    
    }
    else if(ae.getSource()==mini){
        
        new MiniStatement(pinno).setVisible(true);
    
    }
    else if(ae.getSource()==pin){
        setVisible(false);
        new PinChange(pinno).setVisible(true);
    
    }else if(ae.getSource()==fast){
        setVisible(false);
        new FastCash(pinno).setVisible(true);
    
    }else if(ae.getSource()==current){
        setVisible(false);
        new BalanceEnquiry(pinno).setVisible(true);
    
    }
    
    
    }
    
    
    
    
    
    public static void main(String[] args) {
        new Transaction("");
    }
}
