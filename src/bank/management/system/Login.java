package bank.management.system;

import java.sql.*;
import javax.swing.*;//Jframe present in this package 
import java.awt.*;//Image class present in this package
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{

    
    JButton login ,signup ,clear ;
     JTextField cardTextField;
     JPasswordField pinText;
    Login(){
    
        setTitle("Automated Teller Machine ");
    
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));//to take resources from system...we use Classsloader
        //JLabel label=new JLabel(i1);//to put icon in frame we need to label it with Jlabel..u cannot put image into jlambel...
        //but imageicon can  be inserted into it 
        //add(label);
        Image i2 = i1.getImage().getScaledInstance(100 ,100 , Image.SCALE_DEFAULT);
         //u cannot put image into jlambel...so need to change the image into imageicons
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        
        JLabel text=new JLabel(" Welcome to ATM ");
        text.setFont(new Font("osward" ,Font.BOLD, 38));
        text.setBounds(200, 40,400,40);
        add(text);
        
       JLabel cardno=new JLabel(" Card No : ");
        cardno.setFont(new Font("Raleway" ,Font.BOLD, 28));
        cardno.setBounds(120, 150,150,30);
        add(cardno);
        
        cardTextField= new JTextField();
        cardTextField.setBounds(300, 150, 250, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD, 14));
        add(cardTextField);
        
        
       JLabel pin=new JLabel(" PIN : ");
        pin.setFont(new Font("Raleway" ,Font.BOLD, 28));
        pin.setBounds(120, 220,250,30);
        add(pin);
        
       pinText=new JPasswordField();
       pinText.setBounds(300, 220, 250, 30);
       pinText.setFont(new Font("Arial",Font.BOLD, 14));
       add(pinText);
       
       
       login=new JButton("SIGN IN");
       login.setBounds(300,300, 100, 30);
       login.setBackground(Color.black);
       login.setForeground(Color.white);
       login.addActionListener(this);
       
       add(login);
       
       
       clear=new JButton("CLEAR");
       clear.setBounds(450,300, 100, 30);
       clear.setBackground(Color.black);
       clear.setForeground(Color.white);
       clear.addActionListener(this);
       add(clear);
       
       signup=new JButton("SIGN UP");
       signup.setBounds(300,350, 250, 30);
       signup.setBackground(Color.black);
       signup.setForeground(Color.white);
       signup.addActionListener(this);
       add(signup);
       
       
       
       
       
       
       
       
       
       
       
        getContentPane().setBackground(Color.white);//to get containet we call getConte....
        
                
                
                
        setSize(800, 480);
        setVisible(true);
        setLocation(350, 150);
    }
    
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()== clear){
       pinText.setText(null);
       cardTextField.setText(null);
       }
       else if(ae.getSource()== login) {
           
           Conn conn=new Conn();
           String cardno= cardTextField.getText();
           String pinno=pinText.getText();//because Jpassword field depricated getText
           String query="select *from login where Card_No='"+cardno+"' and PIN_No='"+pinno+"'";
           try{
         
               ResultSet rs = conn.ps.executeQuery(query);
           if(rs.next()){
               setVisible(false);
               new Transaction(pinno).setVisible(true);
               
           }
           else{
           
           JOptionPane.showMessageDialog(null,"Incorrect Card number or Pin");
           
           }
           
           
           }
       catch(Exception e){
       e.printStackTrace();
       System.out.println(e.getMessage());
       
       
       
       
       
       }
       
       }
       else if(ae.getSource()== signup){
           setVisible(false);
           new SignupOne().setVisible(true);
       
       }
        
    }
    
    public static void main(String[] args) {
        
        
        new Login();
        
        
        
        
        
    }




}