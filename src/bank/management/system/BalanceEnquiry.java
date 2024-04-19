
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class BalanceEnquiry extends JFrame implements ActionListener{
    String pinno;
    JButton back;
    BalanceEnquiry(String pinno)
    {
        this.pinno=pinno;
    
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0,900,900);
        add(image);
    
        
        
        
        back =new JButton("BACK");
        back.setBounds(355, 520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
                Conn conn=new Conn();
                int balance=0;
          try{
          
              ResultSet rs=conn.ps.executeQuery("select *from transaction where PIN_no='"+pinno+"' ");
              
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
          }
           catch(Exception e){
                                  
                      
                      }
        JLabel text =new JLabel("Your Current Account balance is Rs: "+balance);
        text.setBounds(170, 300,400,30);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway",Font.BOLD,16));
        image.add(text);
        
        setSize(900, 900);
        setLocation(300,0);
        setUndecorated(true);//this will remove the white line present in output with java logo
        setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==back){
    
        setVisible(false);
        new Transaction(pinno).setVisible(true);
    
    }
    
    
    
    
    
    
    }   
    public static void main(String[] args) {
        new BalanceEnquiry(" ");
    }
    
    
    
}
