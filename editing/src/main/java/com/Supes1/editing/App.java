package com.Supes1.editing;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import java.io.File;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;









public class App extends JFrame implements ActionListener{
	
	
	
JPanel p1;
static JTextArea a1,a2,a3,a4,a5,a6,a7;
JLabel l1;
JButton b1,b2;
static JPasswordField pa;

int words=0,letters=0,sentences=0;
String str="";

static String mts="";
static String Senderadd="";
static String Receieveradd="";
static String secretcode="";
static String subjectmail="";


@SuppressWarnings("deprecation")
App()
{
	
	str="";
	
    p1 = new JPanel();
    p1.setLayout(null);
    p1.setBackground(new Color(3, 115, 15));
    p1.setBounds(0,0,999,150);
    add(p1);

    ImageIcon i1 = new ImageIcon("E:\\Eclipse\\Java\\Supes\\src\\icons\\logo.png");
    Image i2 = i1.getImage().getScaledInstance(150,100,Image.SCALE_SMOOTH);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel l1 = new JLabel(i3);
    l1.setBounds(300,10,400,130);
    p1.add(l1);
    
    
    ImageIcon i4 = new ImageIcon("E:\\Eclipse\\Java\\Supes\\src\\icons\\play-button.png");
    Image i5 = i4.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
    ImageIcon i6 = new ImageIcon(i5);
    JLabel l6 = new JLabel(i6);
    l6.setBounds(600,180, 430, 200);
    add(l6);
    
    JLabel l2 = new JLabel("Enter Your Text  :");
    l2.setFont(new Font("SAN_SERIF",Font.BOLD,12));
    l2.setForeground(Color.BLUE);
    l2.setBounds(50,100,200,180);
    add(l2);
    
    a1 = new JTextArea();
    a1.setBounds(200,180, 430, 200);
    a1.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
    a1.setBackground(new Color(232, 250, 235));
    a1.setLineWrap(true);
    a1.setWrapStyleWord(true);
    a1.setEditable(true);
    add(a1);
    
   
    
    JLabel l3 = new JLabel("Number Of Words :");
    l3.setFont(new Font("SAN_SERIF",Font.BOLD,12));
    l3.setForeground(Color.BLUE);
    l3.setBounds(50,330,200,180);
    add(l3);
    
    JLabel l4 = new JLabel("Number Of Letters :");
    l4.setFont(new Font("SAN_SERIF",Font.BOLD,12));
    l4.setForeground(Color.BLUE);
    l4.setBounds(50,350,200,180);
    add(l4);
    
    JLabel l5 = new JLabel("Number Of Sentences :");
    l5.setFont(new Font("SAN_SERIF",Font.BOLD,12));
    l5.setForeground(Color.BLUE);
    l5.setBounds(50,370,200,180);
    add(l5);
    
    JLabel l7 = new JLabel("Voice Translation");
    l7.setFont(new Font("SAN_SERIF",Font.BOLD,12));
    l7.setForeground(Color.BLUE);
    l7.setBounds(770,220,430,200);
    add(l7);
    
    
    a2 = new JTextArea();
    a2.setBounds(200,400,430,80);
    a2.setFont(new Font("SAN_SERIF",Font.PLAIN,16));
    a2.setBackground(new Color(232, 250, 235));
    a2.setLineWrap(true);
    a2.setWrapStyleWord(true);
    a2.setEditable(true);
    add(a2);
    
    
    b1 = new JButton("Go");
    b1.setBounds(650,260,100,50);
    b1.setBackground(new Color(92, 255, 228));
    b1.setForeground(Color.BLUE);
    b1.setFont(new Font("SAN_SERIF",Font.BOLD,16));
    b1.addActionListener(this);
    add(b1);
    
    
    JLabel l8 = new JLabel("Enter Recipient's Email:");
    l8.setFont(new Font("SAN_SERIF",Font.BOLD,12));
    l8.setForeground(Color.BLUE);
    l8.setBounds(50,430,200,180);
    add(l8);
    
    JLabel l9 = new JLabel("Enter Sender's Email:");
    l9.setFont(new Font("SAN_SERIF",Font.BOLD,12));
    l9.setForeground(Color.BLUE);
    l9.setBounds(50,470,200,180);
    add(l9);
    
    JLabel l10 = new JLabel("Password:");
    l10.setFont(new Font("SAN_SERIF",Font.BOLD,12));
    l10.setForeground(Color.BLUE);
    l10.setBounds(50,550,200,180);
    add(l10);
    
    a3 = new JTextArea();
    a3.setBounds(200,510,430,20);
    a3.setFont(new Font("SAN_SERIF",Font.PLAIN,16));     //reciever email field
    a3.setBackground(new Color(232, 250, 235));
    a3.setLineWrap(true);
    a3.setWrapStyleWord(true);
    a3.setEditable(true);
    add(a3);
    
    
    
    
    a4 = new JTextArea();
    a4.setBounds(200,550,430,20);
    a4.setFont(new Font("SAN_SERIF",Font.PLAIN,16));    // sender email field
    a4.setBackground(new Color(232, 250, 235));
    a4.setLineWrap(true);
    a4.setWrapStyleWord(true);
    a4.setEditable(true);
    add(a4);   
    
   
    
    
    
    
    pa = new JPasswordField();
    pa.setBackground(new Color(232, 250, 235));   //password field
    pa.setBounds(200,630,430,20);
    add(pa);
    
    
    
    b2 = new JButton("Send Email");
    b2.setBounds(650,530,150,50);
    b2.setBackground(new Color(92, 255, 228));
    b2.setForeground(Color.BLUE);
    b2.setFont(new Font("SAN_SERIF",Font.BOLD,16));
    b2.addActionListener(this);
    add(b2);   
    
    
    JLabel l11 = new JLabel("Status: ");
    l11.setFont(new Font("SAN_SERIF",Font.BOLD,12));
    l11.setForeground(Color.BLUE);
    l11.setBounds(650,350,430,200);
    add(l11);
    
    a6 = new JTextArea();
    a6.setBounds(700,425,200,50);
    a6.setFont(new Font("SAN_SERIF",Font.PLAIN,16));     //status display
    a6.setBackground(new Color(232, 250, 235));
    a6.setLineWrap(true);
    a6.setWrapStyleWord(true);
    a6.setEditable(false);
    add(a6);   
    
    
    JLabel l12 = new JLabel("Subject:");
    l12.setFont(new Font("SAN_SERIF",Font.BOLD,12));  
    l12.setForeground(Color.BLUE);
    l12.setBounds(50,510,200,180);
    add(l12);
    
    
    a7 = new JTextArea();
    a7.setBounds(200,590,430,20);
    a7.setFont(new Font("SAN_SERIF",Font.PLAIN,16));    // subject email field
    a7.setBackground(new Color(232, 250, 235));
    a7.setLineWrap(true);
    a7.setWrapStyleWord(true);
    a7.setEditable(true);
    add(a7);    
    
    
    
    
    
    
    
    
    
    
    
    b1.addMouseListener(new MouseAdapter()
    {
        
        public void mouseClicked(MouseEvent ae)
        {
            calculations();
        }

        
    });
    
    
    
    b2.addMouseListener(new MouseAdapter()
    {
        
        public void mouseClicked(MouseEvent ae)
        {
            sendEmail();
        }

        
    });
    
    
    
    
    
    
    
    getContentPane().setBackground(new Color(207, 255, 219));
    setLayout(null);   
    setSize(1000,1000);
    setLocation(20,20);
  //  setUndecorated(true);            // apply this to completely remove header  
    setVisible(true);
    
    
}
	

public void calculations()
 
{
	

str = a1.getText();
int l= str.length();
char ch;
int spaces=0,stops=0;


str=str.trim();
for(int i=0;i<l;i++)
{
	
ch=str.charAt(i);
if(ch==' ')
{ spaces++;}
else if(ch=='.')
{stops++;}
else if(Character.isLetter(ch))
{letters++;}



}
words = spaces+1;
sentences = stops;

if(str=="")
{
words = 0;
letters=0;
sentences =0;
}

a2.setText(words+" \n"+letters+"\n"+sentences+"\n");




}






public void actionPerformed(ActionEvent ae)
{        
  
}



private static void sendEmail() {
	
	
	
	Receieveradd= a3.getText();
	Senderadd = a4.getText();
	secretcode = pa.getText();
	mts = a1.getText();	
	subjectmail = a7.getText();
	
	
	
	String message = mts;
	String subject = subjectmail;
	String to = Receieveradd;
	String from = Senderadd;
	
	
	
	String host = "smtp.gmail.com";
	Properties properties = System.getProperties();
	System.out.println("Properties"+properties);
	
	properties.put("mail.smtp.host", host);
	properties.put("mail.smtp.port", "465");
	properties.put("mail.smtp.ssl.enable", "true");
	properties.put("mail.smtp.auth", "true");
	
	//step 1
	Session session=Session.getInstance(properties, new Authenticator() {
		String fr = a4.getText();
		String sec= pa.getText();
		@Override
		protected PasswordAuthentication getPasswordAuthentication() {				
			return new PasswordAuthentication(fr, secretcode);
		}
		
		
		
	});
	session.setDebug(true);
	
	
	//step 2
	MimeMessage m = new MimeMessage(session);
	
	try
	{
		m.setFrom(from);
		m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		
		m.setSubject(subject);
		m.setText(message);
		
		
		Transport.send(m);
		a6.setText("Email Sent Successfully");
		System.out.println("Email Sent Successfully....");
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	
	
	
	
}








	
public static void main(String[] args)
{
new App().setVisible(true);

}	
	
	
	
	
	
}