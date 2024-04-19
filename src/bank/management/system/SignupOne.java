package bank.management.system;



import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;





public class SignupOne extends JFrame implements ActionListener
{
    
    long random;
    JLabel formno,personalDetails, name, fname, lname, city,  state,dob,gender,email,status,address,pincode;
    JTextField nameText,fnameText,lnameText,emailText,addressText,cityText,stateText,pinText;
    JButton next;
    JRadioButton male,female,trans,married,single,other;
     JDateChooser dateChooser;
      ButtonGroup statusgroup,gendergroup;
     
     SignupOne()
      {
        setLayout(null);//make default layout which is " border layout " null
        Random ran=new Random();//if setLayout is not null then setBounds doesn't affect
        random=(Math.abs((ran.nextLong()%9000L)+1000L));

        formno=new JLabel("APPLICATION FORM NO :"+random);
        formno.setBounds(140,20,600,40);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        add(formno);
        
        personalDetails=new JLabel("Page 1 : Personal Details");
        personalDetails.setBounds(290,80,300,30);
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        add(personalDetails);
        
        name=new JLabel("Name:");
        name.setBounds(100,140,200,30);
        name.setFont(new Font("Raleway",Font.BOLD,22));
        add(name);
        
        nameText=new JTextField();
        nameText.setFont(new Font("Raleway",Font.BOLD,14));
        nameText.setBounds(300,140,400,30);//to add on frame we use this method
        add(nameText);
          
        fname=new JLabel("Father's Name:");
        fname.setBounds(100,190,200,30);
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        add(fname);
        
        fnameText=new JTextField();
        fnameText.setFont(new Font("Raleway",Font.BOLD,14));
        fnameText.setBounds(300,190,400,30);//to add on frame we use this method
        add(fnameText);
        
        
        lname=new JLabel("Last Name:");
        lname.setBounds(100,240,200,30);
        lname.setFont(new Font("Raleway",Font.BOLD,22));
        add(lname);

        lnameText=new JTextField();
        lnameText.setFont(new Font("Raleway",Font.BOLD,14));
        lnameText.setBounds(300,240,400,30);//to add on frame we use this method
        add(lnameText);
        
        
        dob=new JLabel("Date of Birth:");
        dob.setBounds(100,290,200,30);
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        add(dob);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300, 290,200,30);
        add(dateChooser);
        
        
        
        gender=new JLabel("Gender :");
        gender.setBounds(100,340,200,30);
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(300, 340, 100, 30);
        male.setBackground(Color.white);
        add(male);
                
        female=new JRadioButton("Female");
        female.setBounds(450, 340, 100, 30);
        female.setBackground(Color.white);
        add(female);
        
        trans=new JRadioButton("Trans");
        trans.setBounds(600, 340, 100, 30);
        trans.setBackground(Color.white);
        add(trans);
        //to avoid choosing both options of gender here we are adding buttongroup
        //and in that group we must add all the gender given in radiobutton
        
        gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(trans);
        
        email=new JLabel("Email :");
        email.setBounds(100,380,200,30);
        email.setFont(new Font("Raleway",Font.BOLD,22));
        add(email);
        
        emailText=new JTextField();
        emailText.setFont(new Font("Raleway",Font.BOLD,14));
        emailText.setBounds(300,380,400,30);//to add on frame we use this method
        add(emailText);
        
        status=new JLabel("Marital Status :");
        status.setBounds(100,430,200,30);
        status.setFont(new Font("Raleway",Font.BOLD,22));
        add(status);
        
        married=new JRadioButton("Married");
        married.setBounds(300, 430, 100, 30);
        married.setBackground(Color.white);
        add(married);
        
        single=new JRadioButton("Single");
        single.setBounds(450, 430, 100, 30);
        single.setBackground(Color.white);
        add(single);
        
        other=new JRadioButton("Other");
        other.setBounds(600, 430, 100, 30);
        other.setBackground(Color.white);
        add(other);    
        
        statusgroup=new ButtonGroup();
        statusgroup.add(married);
        statusgroup.add(single);
        statusgroup.add(other);
      
        address=new JLabel("Address :");
        address.setBounds(100,480,200,30);
        address.setFont(new Font("Raleway",Font.BOLD,22));
        add(address);
        
        addressText=new JTextField();
        addressText.setFont(new Font("Raleway",Font.BOLD,14));
        addressText.setBounds(300,480,400,30);//to add on frame we use this method
        add(addressText);
        
        city=new JLabel("City :");
        city.setBounds(100,530,200,30);
        city.setFont(new Font("Raleway",Font.BOLD,22));
        add(city);
        
        cityText=new JTextField();
        cityText.setFont(new Font("Raleway",Font.BOLD,14));
        cityText.setBounds(300,530,400,30);//to add on frame we use this method
        add(cityText);
        
        state=new JLabel("State :");
        state.setBounds(100,580,200,30);
        state.setFont(new Font("Raleway",Font.BOLD,22));
        add(state);
        
        stateText=new JTextField();
        stateText.setFont(new Font("Raleway",Font.BOLD,14));
        stateText.setBounds(300,580,400,30);//to add on frame we use this method
        add(stateText);
        
        pincode=new JLabel("Pin Code :");
        pincode.setBounds(100,630,200,30);
        pincode.setFont(new Font("Raleway",Font.BOLD,22));
        add(pincode);
        
        pinText=new JTextField();
        pinText.setFont(new Font("Raleway",Font.BOLD,14));
        pinText.setBounds(300,630,400,30);//to add on frame we use this method
        add(pinText);
        
   
         next=new JButton("Next");
        next.setBounds(650, 680, 70, 30);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);//to create live buttn
        add(next);
        
        
        setSize(900,800);//length and width
        setVisible(true);
        setLocation(350,10);//from left and top
    
        getContentPane().setBackground(Color.white);
    
    
    
    
    
    
    
    
    
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
    
                    String formno=""+random;
                    
                    String name=nameText.getText();
                    String fname=fnameText.getText();
                    String lname=lnameText.getText();
                    
                    
                    String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
                    String gender=null;
                    if(male.isSelected()){
                    
                     gender="Male";
                    
                    }else if(female.isSelected()){
                    gender="Female";
                    }
                    else{
                    gender="Trans";
                    }
                                                   
                    String email=emailText.getName();         
                   
                    String status=null;
                    if(married.isSelected()){
                    status="Married";
                    }
                    else if(single.isSelected()){
                    status="Single";
                    
                    }
                    else{
                     status="other";
    }
                   
                    String address=addressText.getText();
                    String city=cityText.getText();
                    String state=stateText.getText();
                  String  pincode=pinText.getText();

    try{
    
        if(name.isEmpty()){
        JOptionPane.showMessageDialog(null,"Name is Required..!");
        }
        else{
        
            Conn c=new Conn();
            String query="Insert into signup values('"+formno+"','"+name+"','"+fname+"','"+lname+"','"+dob+"','"+gender+"','"+email+"','"+status+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
        
              c.ps.executeUpdate(query);
        
              
              setVisible(false);
              new SignupTwo(formno).setVisible(true);
              
              
        } 
        
        
        
    
    }
    catch(Exception e){
        System.out.println(e.getMessage());
          
    
    
    }
    }
    
    
    
    

    public static void main(String[] args) {
        
        
     new SignupOne();
        
    }




}
