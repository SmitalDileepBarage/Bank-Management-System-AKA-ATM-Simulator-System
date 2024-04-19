
package bank.management.system;

import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.util.Random;



public class SignupThree  extends JFrame implements ActionListener{
    JRadioButton recurring,current,saving,fixed;
    ButtonGroup accountgroup;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
     JButton cancel,submit;
      JTextField pinT,cardT;
      String formno;
  SignupThree(String formno){
  this.formno=formno;
      setTitle("Account Details");
      setLayout(null);
      
      JLabel l1=new JLabel("Page 3: Account Details");
      l1.setFont(new Font("Raleway" , Font.BOLD, 22));
      l1.setBounds(280,40,400,40);
      add(l1);
      
      
    JLabel account=new JLabel("Account Type:");
    account.setFont(new Font("Raleway" , Font.BOLD, 22));
    account.setBounds(100,140,200,30);
    add(account);

    saving=new JRadioButton("Savings Account");
    saving.setFont(new Font("Raleway" , Font.BOLD, 14));
    saving.setBackground(Color.WHITE);
    saving.setBounds(140,180,200,30);
    add(saving);
  
    current=new JRadioButton("Current Account");
    current.setFont(new Font("Raleway" , Font.BOLD, 14));
    current.setBackground(Color.WHITE);
    current.setBounds(380,180,200,30);
    add(current);
  
    fixed=new JRadioButton("Fixed Deposit Account");
    fixed.setFont(new Font("Raleway" , Font.BOLD, 14));
    fixed.setBackground(Color.WHITE);
    fixed.setBounds(140,220,200,30);
    add(fixed);
  
    
    recurring=new JRadioButton("Recurring Account");
    recurring.setFont(new Font("Raleway" , Font.BOLD, 14));
    recurring.setBackground(Color.WHITE);
    recurring.setBounds(380,220,200,30);
    add(recurring);
  
    accountgroup=new ButtonGroup();
    accountgroup.add(fixed);
    accountgroup.add(current);
    accountgroup.add(saving);
    accountgroup.add(recurring);

      JLabel card=new JLabel("Card Number :");
      card.setFont(new Font("Raleway" , Font.BOLD, 22));
      card.setBounds(140,280,200,30);
      add(card);

    JLabel carddetail=new JLabel("Your 16 digit card number");
    carddetail.setFont(new Font("Raleway" , Font.BOLD, 12));
    carddetail.setBounds(140,300,300,30);
    add(carddetail);

    cardT=new JTextField("XXXX-XXXX-XXXX-1011");
     cardT.setFont(new Font("Raleway" , Font.BOLD, 16));
     cardT.setBounds(380,280,200,30);
     add(cardT);
    
     JLabel pin=new JLabel("PIN Number :");
      pin.setFont(new Font("Raleway" , Font.BOLD, 22));
      pin.setBounds(140,340,200,30);
      add(pin);

      JLabel pindetail=new JLabel("Your 4 digit pin");
     pindetail.setFont(new Font("Raleway" , Font.BOLD, 12));
      pindetail.setBounds(140,360,250,30);
     add(pindetail);
     
    pinT=new JTextField("XXXX");
    pinT.setFont(new Font("Raleway" , Font.BOLD, 16));
    pinT.setBounds(380,340,200,30);
    add(pinT);
    
    
    JLabel service=new JLabel("Services Required:");
    service.setFont(new Font("Raleway" , Font.BOLD, 22));
    service.setBounds(100,420,200,30);
    add(service);
    
    c1=new JCheckBox("ATM CARD");
    c1.setBackground(Color.white);
    c1.setFont(new Font("Raleway",Font.BOLD,16));
    c1.setBounds(140, 470, 200, 30);
    add(c1);
       
    c2=new JCheckBox("Internet Banking");
    c2.setBackground(Color.white);
    c2.setFont(new Font("Raleway",Font.BOLD,16));
    c2.setBounds(380, 470, 200, 30);
    add(c2);
    
    
    c3=new JCheckBox("Mobile Banking");
    c3.setBackground(Color.white);
    c3.setFont(new Font("Raleway",Font.BOLD,16));
    c3.setBounds(140, 520, 200, 30);
    add(c3);
    
    
    c4=new JCheckBox("Email & SMS Alerts ");
    c4.setBackground(Color.white);
    c4.setFont(new Font("Raleway",Font.BOLD,16));
    c4.setBounds(380, 520, 200, 30);
    add(c4);
    
    
    c5=new JCheckBox("Cheque Book ");
    c5.setBackground(Color.white);
    c5.setFont(new Font("Raleway",Font.BOLD,16));
    c5.setBounds(140, 570, 200, 30);
    add(c5);
    
    c6=new JCheckBox("E-Statements ");
    c6.setBackground(Color.white);
    c6.setFont(new Font("Raleway",Font.BOLD,16));
    c6.setBounds(380, 570, 200, 30);
    add(c6);
    
    c7=new JCheckBox("I hereby declares that above eneterd details are correct to the best of my knowledge ");
    c7.setBackground(Color.white);
    c7.setFont(new Font("Raleway",Font.BOLD,12));
    c7.setBounds(100, 610, 510, 30);
    add(c7);
    
    cancel=new JButton("CANCEL");
        cancel.setBounds(180, 670, 100, 30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);
    
    submit=new JButton("SUBMIT");
        submit.setBounds(430, 670, 100, 30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);
        
      setSize(850, 820);
      setVisible(true);
      setLocation(350,10);
      getContentPane().setBackground(Color.white);
  }  
  @Override
  public void actionPerformed(ActionEvent ae)  {
  
      if(ae.getSource()==submit)
      {
          
      
      String account=null;
      
      if(fixed.isSelected()){
         account="fixed";
      }
      else if(current.isSelected()){
          account ="current";
      }
      else if(recurring.isSelected()){
          account="recurring";
      }
      else if(saving.isSelected()){
          
          account="saving";
      }
  
      
     // String card=cardT.getText();
      //String pin=pinT.getText();
      
       Random random=new Random();
       String cardno=""+ Math.abs((random.nextLong() % 90000000L)) + 50409360L;
          
      String pinno=""+Math.abs((random.nextLong() % 9000L));
      
      String service="";
      if(c1.isSelected()){
      service=service+" ATM Card";
      }
      else if(c2.isSelected()){
      service=service+" Internet Banking";
      }
      else if(c3.isSelected()){
      service=service+" Mobile Banking";
      }
      else if(c4.isSelected()){
      service=service+" Email & SMS Alert";
      }
      else if(c5.isSelected()){
      service=service+" Cheque book";
      }
      else if(c6.isSelected()){
      service=service+" E-Statements";
      }
      
      
      try{
      if(account.isEmpty()){
          JOptionPane.showMessageDialog(null,"Choose Account type first..!");
      }
      else{
      
      Conn conn=new Conn();
      
      String query1="insert into signupthree values('"+ formno +"','"+ account+"','"+ cardno+"','"+ pinno+"','"+ service+"')";
     
      
     String query2="insert into login values('"+ formno +"','"+ cardno+"','"+ pinno+"')";
     
     conn.ps.executeUpdate(query1);
      conn.ps.executeUpdate(query2);
      
       JOptionPane.showMessageDialog(null,"Card Number:"+cardno+"\n Pin Number:"+pinno);
          setVisible(false);
         new Deposit(pinno).setVisible(true);

       
      }
      }
      catch(Exception e){
      e.printStackTrace();
      
      
      
      
      }
  }
      else if(ae.getSource()==cancel){
          
          setVisible(false);
          new Login().setVisible(true);
      
      
      
      }
  
  }
    public static void main(String[] args) {
        new SignupThree(" ");
    }
}
