
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class PinChange extends JFrame implements ActionListener{
    JPasswordField pinT,repinT;
    JLabel pin;
    String pinno;
    JButton back,change;
    
    PinChange(String pinno){
    this.pinno=pinno;
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0,900,900);
        add(image);
    
        JLabel text= new JLabel("Change Your PIN:");
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(250,280,500,20);
        image.add(text);
  
        
        JLabel pin= new JLabel("New PIN:");
        pin.setForeground(Color.white);
        pin.setFont(new Font("System",Font.BOLD,16));
        pin.setBounds(165,320,180,25);
        image.add(pin);
        
        pinT=new JPasswordField();
        pinT.setFont(new Font("Raleway",Font.BOLD,22));
        pinT.setBounds(330,320,180,25);
        image.add(pinT);
        
        JLabel repin= new JLabel("Re-Enter PIN:");
        repin.setForeground(Color.white);
        repin.setFont(new Font("System",Font.BOLD,16));
        repin.setBounds(165,360,180,25);
        image.add(repin);
        
        repinT=new JPasswordField();
        repinT.setFont(new Font("Raleway",Font.BOLD,22));
        repinT.setBounds(330,360,180,25);
        image.add(repinT);
        
    change =new JButton("CHANGE");
        change.setBounds(355, 485,150,30);
        change.addActionListener(this);
        image.add(change);
    
    back =new JButton("BACK");
        back.setBounds(355, 520,150,30);
        back.addActionListener(this);
        image.add(back);
    
    
    
    
    
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
    else{
    try{
        String pin=pinT.getText();
        String repin=repinT.getText();
        
        
        if(pin.equals("")){
        JOptionPane.showMessageDialog(null,"Enter New Pin first..!");
            return;
        }
         if(repin != pin){
           JOptionPane.showMessageDialog(null,"New Pin and Re-Enter Pin didn't match..!");
        return;
        
         } 
            if(repin.equals("")){
           JOptionPane.showMessageDialog(null," Re-Enter Pin enter first.!");
        return;
         }
            
        
            Conn conn=new Conn();
            String query1="update transaction set PIN-no='"+repin+"'where PIN-no='"+pinno+"'";
            
            String query2="update login set PIN_No='"+repin+"'where PIN_No='"+pinno+"'";
            
            String query3="update signupthree set PIN_No='"+repin+"'where PIN_No='"+pinno+"'";
        
        conn.ps.execute(query1);
        conn.ps.execute(query2);
        conn.ps.execute(query3);
        
        JOptionPane.showMessageDialog(null," Changed Successfully..!");
        
        
        setVisible(false);
        new Transaction(pinno).setVisible(true);

        
        
        
    
    
    }
    catch(Exception e){
    System.out.println(e.getMessage());
    
    
    }
    
    
    
    
    
    
    }
    
    
       
       
    
    
    
    
    
   }
    public static void main(String[] args) {
       new PinChange(" ").setVisible(true); 
    }
    
}
