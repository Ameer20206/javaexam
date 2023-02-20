//interface code 
import java.rmi.*; 
public interface Dollintf extends Remote 
{ 
double cen_fah(double c)throws RemoteException; 
double fah_cen(double f)throws RemoteException; 
} 
//code for implementation 
import java.rmi.*; 
import java.rmi.server.*; 
public class Dollimpl extends UnicastRemoteObject implements Dollintf 
{ 
public double convert(double d)throws RemoteException 
{ 
double rs=d*82; 
return rs; 
} 
public Dollimpl() throws RemoteException{}; 
} 
//code for server 
import java.rmi.*; 
import java.net.*; 
public class DollServer 
{ 
public static void main(String args[]) 
{ 
try 
{ 
Dollimpl x=new Dollimpl(); 
Naming.rebind("DollServer",x); 
} 
catch(Exception e) 
{} 
  } } 
//code for client 
import java.rmi.*; 
import java.io.*; 
public class DollClient 
{ 
public static void main(String args[]) 
{ 
try 
{ 
Dollintf s=(Dollintf)Naming.lookup("rmi://localhost/DollServer"); 
System.out.println("Dollar Conversion"); 
double d=Double.valueOf(args[0]); 
System.out.println("The value of rupees is:"+s.convert(d)); 
} 
catch(Exception e) 
{} 
} 
}
