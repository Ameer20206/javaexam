import java.awt.*; 
import java.applet.*; 
public class Employee extends Applet 
{ 
String ename; 
int ecode; 
double basic; 
double net; 
double gross; 
double da,hra,pt,pf; 
public void init() 
{ 
ename=getParameter("Param1"); 
ecode = Integer.parseInt(getParameter("Param2")); 
basic =Double.parseDouble(getParameter("Param3")); 
calculate(); 
} 
public void paint(Graphics g) 
{ 
g.drawString("Employee name:"+ ename,20,20); 
g.drawString("Employee code:"+ ecode,20,40); 
g.drawString("basic salary:"+ basic,20,60); 
g.drawString("DA:"+ da,20,80); 
g.drawString("HRA:"+ hra,20,100); 
g.drawString("PF:"+ pf,20,120); 
g.drawString("PT:"+ pt,20,140); 
g.drawString("Gross Salary:"+ gross,20,160); 
g.drawString("Net Salary:"+ net,20,180); 
} 
public void calculate() 
{ 
if (basic<=20000) 
{ 
da=0.4*basic; 
hra=0.15*basic; 
gross=basic+da+hra; 
pf=0.12*basic; 
pt=100; 
net =gross-(pf-pt); 
} 
if(basic>20000) 
{ 
 
da=0.5*basic; 
hra=0.15*basic; 
gross=basic+da+hra; 
pf=0.12*basic; 
pt=200; 
net =gross-(pf-pt); 
} 
} 
} 
Employee.html 
<html> 
<body> 
<applet 
code=Employee.class 
height=500 
width=500> 
<param name="param1" value="Ameer"></param>
<param name="param2" value="1001"></param> 
<param name="param3" value="30000"></param> 
</applet> 
</body> 
</html> 
