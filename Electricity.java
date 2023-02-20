import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class ElectricBill implements ActionListener 
{ 
JLabel lmno; 
JLabel lcname; 
JLabel lpmr; 
JLabel lcmr; 
JLabel lunit; 
 
JLabel lamt; 
JTextField tmno; 
JTextField tcname; 
JTextField tpmr; 
JTextField tcmr; 
JTextField tunit; 
JTextField tamt; 
JButton bill; 
ElectricBill() 
{ 
JFrame jfrm=new JFrame("Electricity Bill"); 
jfrm.setLayout(null); 
jfrm.setSize(300,300); 
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
lmno=new JLabel("Meter Number"); 
tmno=new JTextField(); 
lcname=new JLabel("Customer Name"); 
tcname=new JTextField(); 
lpmr=new JLabel("Previous meter reading"); 
tpmr=new JTextField(); 
 
lcmr=new JLabel("current meter reading"); 
tcmr=new JTextField(); 
lunit=new JLabel("unit consumed"); 
tunit=new JTextField(); 
lamt=new JLabel("Total amount"); 
tamt=new JTextField(); 
 
bill=new JButton("BILL"); 
 
lmno.setBounds(100,25,200,25); 
 
lcname.setBounds(100,50,200,25); 
 
lpmr.setBounds(100,75,200,25); 
 
lcmr.setBounds(100,100,200,25); 
 
lunit.setBounds(100,125,200,25); 
 
lamt.setBounds(100,150,200,25); 
 
tmno.setBounds(300,25,100,25); 
 
tcname.setBounds(300,50,100,25); 
 
tpmr.setBounds(300,75,100,25); 
 
tcmr.setBounds(300,100,100,25); 
 
tunit.setBounds(300,125,100,25); 
 
tamt.setBounds(300,150,100,25); 
 
bill.setBounds(200,200,120,25); 
 
jfrm.add(lmno); 
 
jfrm.add(lcname); 
 
jfrm.add(lpmr); 
 
jfrm.add(lcmr); 
 
jfrm.add(lunit); 
 
jfrm.add(lamt); 
 
jfrm.add(tmno); 
 
jfrm.add(tcname); 
 
jfrm.add(tpmr); 
 
jfrm.add(tcmr); 
 
jfrm.add(tunit); 
 
jfrm.add(tamt); 
 
jfrm.add(bill); 
 
bill.addActionListener(this); 

jfrm.setVisible(true); 
 
tunit.setEditable(false); 
 
tamt.setEditable(false); 
 
} 
 
public void actionPerformed(ActionEvent d) 
{ 
int unit,diff,cmr,pmr; 
String net=null; 
double charge=0; 
try 
{ 
 
pmr=Integer.parseInt(tpmr.getText()); 
 
cmr=Integer.parseInt(tcmr.getText()); 
 
if(cmr>pmr) 
 
{ 
 
unit=cmr-pmr; 
 
if(unit<=150) 
 
charge=200; 
 
else if(unit>150&&unit<=200) 
 
{ 
 
diff=unit-150; 
 
charge=200+diff*1.5; 
 
} 
 
else if(unit>200&&unit<=300) 
 
{ 
 
diff=unit-150; 
 
charge=200+diff*2; 
 
} 
 
else 
 
{ 
 
diff=unit-150; 
 
charge=Math.max(200+diff*3,500); 
 
} 
 
net=Double.toString(charge); 
 
tunit.setText(Integer.toString(unit)); 
 
tamt.setText(net); 
 
} 
 
else 
 
tamt.setText("Invalid Number"); 
 
} 
 
catch(NumberFormatException e) 
 
{ 
 
tamt.setText("Invalid Number");
} 
 
} 
 
public static void main(String args[]) 
 
{ 
 
new ElectricBill(); 
 
} 
 
}
