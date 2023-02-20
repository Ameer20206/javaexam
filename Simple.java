import java.rmi.*; 
public interface Simpintf extends Remote 
{ 
double Simpcal(double p,double n,double r)throws RemoteException; 
} 
//code for implementation 
import java.rmi.*; 
import java.rmi.server.*; 
public class Simpimpl extends UnicastRemoteObject implements Simpintf 
{ 
public double Simpcal(double p,double t,double r)throws RemoteException 
{ 
double s=(p*t*r)/100; 
return s; 
} 
public Simpimpl() throws RemoteException{}; 
} 
//code for server 
import java.rmi.*; 
import java.net.*; 
public class SimpServer 
{ 
public static void main(String args[]) 
{ 
try 
{ 
Simpimpl x=new Simpimpl(); 
Naming.rebind("SimpServer",x); 
} 
catch(Exception e) 
{} 
} }
//code for client 
import java.rmi.*; 
import java.io.*; 
public class SimpClient 
{ 
public static void main(String args[]) 
{ 
try 
{ 
DataInputStream in=new DataInputStream(System.in); 
Simpintf s=(Simpintf)Naming.lookup("rmi://localhost/SimpServer"); 
System.out.println("Simple Interest"); 
System.out.println("Enter Principle"); 
double p=Double.valueOf(in.readLine()); 
System.out.println("Enter time in number of years"); 
double t=Double.valueOf(in.readLine()); 
System.out.println("Enter the rate of interest"); 
double r=Double.valueOf(in.readLine()); 
System.out.println("Simple Interest is"+s.Simpcal(p,t,r)); 
} 
catch(Exception e) 
{} 
} 
} 
