package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignupTwo extends JFrame implements ActionListener{

   JLabel pan,additionalDetails,religion, category, income, educational,qualification,occupation,aadhar,citizen,account;
        JTextField panT,aadharT;
        JComboBox incomeT,religionT,categoryT,educationT,occupationT;
        JButton next;
        JRadioButton yes,no,s,n;
        ButtonGroup citizengroup,accountgroup;

        String formno;
SignupTwo(String formno){
    
       this.formno=formno;

       setLayout(null);//make default layout which is " border layout " null
       
        
        setTitle("NEW ACCOUNT FORM - PAGE 2");
        
        additionalDetails=new JLabel("Page 2 : Additional Details");
        additionalDetails.setBounds(290,80,300,30);
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        add(additionalDetails);
        
        religion=new JLabel("Religion:");
        religion.setBounds(100,140,100,30);
        //religion.setBackground(Color.white);
        religion.setFont(new Font("Raleway",Font.BOLD,22));
        add(religion);
        
        String [] rel={"Hindu","Muslim","Christian","Shikh","Other"};
        religionT=new JComboBox(rel);//need to pass array of String
        religionT.setBounds(300,140,400,30);//to add on frame we use this method
        religionT.setFont(new Font("Raleway",Font.BOLD,14));
        religionT.setBackground(Color.WHITE);
        add(religionT);
          
        category=new JLabel("Category:");
        category.setBounds(100,190,200,30);
        category.setFont(new Font("Raleway",Font.BOLD,22));
        add(category);
        
        String []cat={"Open","OBC","SC","NT","Other"};
        categoryT=new JComboBox(cat);
        categoryT.setFont(new Font("Raleway",Font.BOLD,14));
        categoryT.setBounds(300,190,400,30);//to add on frame we use this method
        categoryT.setBackground(Color.white);
        add(categoryT);

        
        income=new JLabel("Income:");
        income.setBounds(100,240,200,30);
        income.setFont(new Font("Raleway",Font.BOLD,22));
        add(income);

        String []inc={"Null","<1,50,000","<2,50,000","<5,00,000","<8,00,000","upto 15,00,000"};
        incomeT=new JComboBox(inc);
        incomeT.setFont(new Font("Raleway",Font.BOLD,14));
        incomeT.setBounds(300,240,400,30);//to add on frame we use this method
        incomeT.setBackground(Color.white);
        add(incomeT);
        
        educational=new JLabel("Educational ");
        educational.setBounds(100,290,200,30);
        educational.setFont(new Font("Raleway",Font.BOLD,22));
        add(educational);
    
        
        qualification=new JLabel("Qualification :");
        qualification.setBounds(100,315,200,30);
        qualification.setFont(new Font("Raleway",Font.BOLD,22));
        add(qualification);
        
        String []edu={"Non-Graduation","Graduate","Post-Graduate","Doctrate"};
        educationT=new JComboBox(edu);
        educationT.setFont(new Font("Raleway",Font.BOLD,14));
        educationT.setBounds(300,315,400,30);//to add on frame we use this method
        educationT.setBackground(Color.white);
        add(educationT);
         
             
        occupation=new JLabel("Occupation :");
        occupation.setBounds(100,390,200,30);
        occupation.setFont(new Font("Raleway",Font.BOLD,22));
        add(occupation);
        
        String [] occ={"Salaried","Self-Employed","Business","Student","Retired","Other"};
        occupationT= new JComboBox(occ);
        occupationT.setFont(new Font("Raleway",Font.BOLD,14));
        occupationT.setBounds(300,390,400,30);//to add on frame we use this method
        occupationT.setBackground(Color.white);
        add(occupationT);
               
      
        pan=new JLabel("PAN NO:");
        pan.setBounds(100,440,200,30);
        pan.setFont(new Font("Raleway",Font.BOLD,22));
        add(pan);
        
        panT=new JTextField();
        panT.setFont(new Font("Raleway",Font.BOLD,14));
        panT.setBounds(300,440,400,30);//to add on frame we use this method
        add(panT);
        
        aadhar=new JLabel("AADHAR:");
        aadhar.setBounds(100,490,200,30);
        aadhar.setFont(new Font("Raleway",Font.BOLD,22));
        add(aadhar);
        
        aadharT=new JTextField();
        aadharT.setFont(new Font("Raleway",Font.BOLD,14));
        aadharT.setBounds(300,490,400,30);//to add on frame we use this method
        add(aadharT);
        
        citizen=new JLabel("Senior Citizen:");
        citizen.setBounds(100,540,200,30);
        citizen.setFont(new Font("Raleway",Font.BOLD,22));
        add(citizen);
                
        yes=new JRadioButton("YES");
        yes.setBounds(300, 540, 100, 30);
        yes.setBackground(Color.white);
        add(yes);
        
        no=new JRadioButton("NO");
        no.setBounds(450, 540, 100, 30);
        no.setBackground(Color.white);
        add(no);
            
        citizengroup=new ButtonGroup();
        citizengroup.add(yes);
        citizengroup.add(no);
               
        account=new JLabel("Existing Account :");
        account.setBounds(100,590,200,30);
        account.setFont(new Font("Raleway",Font.BOLD,22));
        add(account);
        
        s=new JRadioButton("YES");
        s.setBounds(300, 590, 100, 30);
        s.setBackground(Color.white);
        add(s);
        
        n=new JRadioButton("NO");
        n.setBounds(450, 590, 100, 30);
        n.setBackground(Color.white);
        add(n);
        
        accountgroup=new ButtonGroup();
        accountgroup.add(s);
        accountgroup.add(n);

        next=new JButton("Next");
        next.setBounds(630, 640, 70, 30);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        add(next);

        
        setSize(900,800);//length and width
        setVisible(true);
        setLocation(350,10);//from left and top
    
        getContentPane().setBackground(Color.white);
    
    
    }

@Override
   public void actionPerformed(ActionEvent ae){
   // String formno=""+Math.random();
    String religion=(String) religionT.getSelectedItem();
    String category=(String) categoryT.getSelectedItem();
    String income=(String) incomeT.getSelectedItem();
    String education=(String)educationT.getSelectedItem();
    String occupation=(String)occupationT.getSelectedItem();


    String pan=panT.getText();
    String aadhar=aadharT.getText();

    String citizen="null";
    if(yes.isSelected()){
    citizen="yes";
    }
    else{
    citizen="no";
    }
    
    
    
    String account="null";
    if(n.isSelected()){
    account="n";
    }
    else{
    account="s";
    }



       
       
       try{
    
        if(aadhar.isEmpty()){
        JOptionPane.showMessageDialog(null,"AADHAR is Required..!");
        }
        else{
        
            Conn c=new Conn();
            String query="Insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+citizen+"','"+account+"')";
        
              c.ps.executeUpdate(query);
        
              
              
              setVisible(false);
              new SignupThree(formno).setVisible(true);
        } 
        
        
        
    
    }
    catch(Exception e){
        System.out.println(e.getMessage());
          
    
    
    }
       
   }
       public static void main(String[] args) {
        new SignupTwo(" ");
    }
}
