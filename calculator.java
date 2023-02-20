import java.applet.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.lang.*; 
public class Calculator extends Applet implements ActionListener 
{ 
 
int n1,n2; 
 
int res=0; 
 
String str; 
 
TextField txt1; 
 
TextField txt2; 
 
Label l1; 
 
Label l2; 
 
Label l3; 
 
Label l4; 
 
Button plus; 
 
Button sub; 
 
Button mul; 
 
Button div; 
 
Button cal; 
 
Button clr; 
 
public void init() 
 
{ 
 
txt1=new TextField(); 
 
txt2=new TextField(); 
 
l1=new Label("Enter 1st number"); 
 
l2=new Label("Enter 2nd number"); 
 
l3=new Label("Result"); 
 
l4=new Label(""); 
 
plus=new Button("ADD"); 
 
sub=new Button("MINIUS"); 
 
mul=new Button("PRODUCT"); 
 
div=new Button("DIVIDE"); 
 
setLayout(null); 
 
add(txt1); 
 
add(txt2); 
 
add(l1); 
 
add(l2); 
add(l3); 
 
add(l4); 
 
add(plus); 
 
add(sub); 
 
add(mul); 
 
add(div); 
 
txt1.setBounds(300,20,80,20); 
 
txt2.setBounds(300,50,80,20); 
 
l1.setBounds(100,20,200,25); 
 
l2.setBounds(100,40,200,25); 
 
l3.setBounds(100,150,80,25); 
 
l4.setBounds(200,150,100,25); 
 
plus.setBounds(100,80,40,20); 
 
sub.setBounds(200,80,40,20); 
 
mul.setBounds(300,80,60,20); 
 
div.setBounds(400,80,40,20); 
 
plus.addActionListener(this); 
 
sub.addActionListener(this); 
 
mul.addActionListener(this); 
 
div.addActionListener(this); 
 
repaint(); 
} 
 
public void actionPerformed(ActionEvent d) 
 
{ 
 
try 
{ 
 
n1=Integer.parseInt(txt1.getText()); 
 
n2=Integer.parseInt(txt2.getText()); 
 
if(d.getSource()==plus) 
 
{ 
 
res=n1+n2; 
 
str=Integer.toString(res); 
 
l4.setText(str); 
 
} 
 
if(d.getSource()==sub) 
 
{ 
 
res=n1-n2; 
 
str=Integer.toString(res); 
 
l4.setText(str); 
 
} 
 
if(d.getSource()==mul) 
 
{ 
 
res=n1*n2; 
 
str=Integer.toString(res);
l4.setText(str); 
 
} 
 
if(d.getSource()==div) 
 
{ 
 
try 
 
{ 
 
res=n1/n2; 
 
str=Integer.toString(res); 
 
l4.setText(str); 
 
} 
 
catch(ArithmeticException e) 
 
{ 
 
l4.setText("Error.Division by zero"); 
 
} 
 
} 
 
} 
 
catch(NumberFormatException e) 
 
{ 
 
l4.setText("Invalid number"); 
} 
} 
} 
Calculator.html 
<html> 
<body> 
<applet 
 
code="Calculator.class" 
 
height=500 
 
width=500> 
</applet> 
</body> 
</html>
