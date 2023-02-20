import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class Book implements ActionListener 
{ 
JLabel lcode; 
JLabel lname; 
JLabel lprice; 
JLabel ldisc; 
JLabel lbill; 
JTextField tcode; 
JTextField tname; 
JTextField tprice; 
JTextField tdisc; 
JTextField tbill; 
JButton bill; 
Book() 
{ 
JFrame jfrm=new JFrame("Book shop"); 
jfrm.setLayout(null); 
jfrm.setSize(300,300); 
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
lcode=new JLabel("Book Code"); 
tcode=new JTextField(); 
lname=new JLabel("Book Name"); 
tname=new JTextField(); 
lprice=new JLabel("Book Price"); 
tprice=new JTextField(); 
 
ldisc=new JLabel("Discount"); 
tdisc=new JTextField(); 
lbill=new JLabel("Net Price"); 
tbill=new JTextField(); 
 
bill=new JButton("BILL"); 
lcode.setBounds(100,25,100,25); 
 
lname.setBounds(100,50,100,25); 
 
lprice.setBounds(100,75,100,25); 
 
ldisc.setBounds(100,100,100,25); 
 
lbill.setBounds(100,125,100,25); 
 
tcode.setBounds(200,25,100,25); 
 
tname.setBounds(200,50,100,25); 
 
tprice.setBounds(200,75,100,25); 
 
tdisc.setBounds(200,100,100,25); 
 
tbill.setBounds(200,125,100,25); 
 
bill.setBounds(200,200,120,25); 
 
jfrm.add(lcode); 
 
jfrm.add(lname); 
 
jfrm.add(lprice); 
 
jfrm.add(ldisc); 
 
jfrm.add(lbill); 
 
jfrm.add(tcode); 
 
jfrm.add(tname); 
 
jfrm.add(tprice); 
 
jfrm.add(tdisc); 
 
jfrm.add(tbill); 
 
jfrm.add(bill); 
 
bill.addActionListener(this); 
 
jfrm.setVisible(true); 
 
tdisc.setEditable(false); 
 
tbill.setEditable(false); 
} 
public void actionPerformed(ActionEvent d) 
{ 
double discount; 
String discamt,billamt; 
int price; 
double netbill; 
try 
{ 
 
if(tcode.getText().equals("A")) 
 
discount=15; 
 
else if(tcode.getText().equals("B")) 
 
discount=20; 
else if(tcode.getText().equals("C")) 
 
discount=25; 
 
else 
 
discount=5; 
 
discamt=Double.toString(discount); 
 
if(!(tname.getText().equals(" "))&& 
 
!(tcode.getText().equals(" "))&& 
 
!(tprice.getText().equals(" "))) 
 
tdisc.setText(discamt+"%"); 
 
price=Integer.parseInt(tprice.getText()); 
 
netbill=price-(price*discount)/100; 
 
billamt=Double.toString(netbill); 
 
tbill.setText(billamt); 
 
} 
 
catch(NumberFormatException e) 
 
{ 
 
tbill.setText("Invalid NUmber!!!"); 
 
} 
 
} 
 
public static void main(String args[]) 
 
{ 
 
new Book(); 
 
} 
 
}
