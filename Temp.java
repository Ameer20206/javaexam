import java.rmi.*; 
public interface Tempintf extends Remote 
{ 
double cen_fah(double c)throws RemoteException; 
double fah_cen(double f)throws RemoteException; 
} 
//code for logic implementation 
import java.rmi.*; 
import java.rmi.server.*; 
public class TempConvert extends UnicastRemoteObject implements Tempintf 
{ 
public double cen_fah(double c)throws RemoteException 
{ 
double f=c*1.8+32; 
return f; 
} 
public double fah_cen(double f)throws RemoteException 
{ 
double c=(f-32)/1.8; 
return c; 
} 
public TempConvert() throws RemoteException{}; 
} 
// code for server 
import java.rmi.*; 
import java.net.*; 
public class TempServer 
{ 
public static void main(String args[]) 
{ 
try 
{ 
TempConvert t=new TempConvert(); 
Naming.rebind("TempServer",t); 
} 
catch(Exception e) 
{} 
} 
} 
//code for client 
import java.rmi.*; 
import java.io.*; 
public class TempClient 
{ 
public static void main(String args[]) 
{ 
try 
{ 
DataInputStream in=new DataInputStream(System.in); 
Tempintf 
t=(Tempintf)Naming.lookup("rmi://localhost/TempServer"); 
System.out.println("Temperature Conversion"); 
System.out.println("Enter Celsius Temperature"); 
float c=Float.valueOf(in.readLine()); 
System.out.println("Fahrenheit Value is"+t.cen_fah(c)); 
System.out.println("Enter Fahrenheit Temperature"); 
float f=Float.valueOf(in.readLine()); 
System.out.println("Celsius Value is"+t.fah_cen(f)); 
} 
catch(Exception e) 
{} 
} 
}
