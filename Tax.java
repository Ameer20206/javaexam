//interface code 
import java.rmi.*; 
public interface Taxintf extends Remote 
{ 
double taxcal(double s)throws RemoteException; 
} 
//code for implementation 
import java.rmi.*; 
import java.rmi.server.*; 
public class Taximp extends UnicastRemoteObject implements Taxintf 
{ 
public double taxcal(double s)throws RemoteException 
{ 
double tax=0; 
if(s<=10000) 
tax=0; 
if(s>10000&&s<=25000) 
tax=0.025*s; 
if(s>25000&&s<=100000) 
tax=0.05*s; 
if(s>100000&&s<=1000000) 
tax=0.075*s; 
if(s>1000000) 
tax=0.10*s; 
return tax; 
} 
public Taximp() throws RemoteException{}; 
} 
//code for server 
import java.rmi.*; 
import java.net.*; 
public class TaxServer 
{ 
public static void main(String args[]) 
{ 
try 
{ 
Taximp x=new Taximp(); 
Naming.rebind("TaxServer",x); 
} 
catch(Exception e) 
{} 
} 
} 
//code for client 
import java.rmi.*; 
import java.io.*; 
public class TaxClient 
{ 
public static void main(String args[]) 
{ 
try 
{ 
DataInputStream in=new DataInputStream(System.in); 
Taxintf t=(Taxintf)Naming.lookup("rmi://localhost/TaxServer"); 
System.out.println("Enter Salary"); 
double sal=Double.valueOf(in.readLine()); 
double it=t.taxcal(sal); 
if(it==0) 
{ 
System.out.println("Salary less than 10000"); 
System.out.println("No tax deduction"); 
System.exit(0); 
} 
System.out.println("Tax is:"+it); 
} 
catch(Exception e) 
{} 
} 
}
