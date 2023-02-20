import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.io.*; 
public class Telephone 
{ 
 
static 
 
{ 
 
try 
 
{ 
 
Class.forName("com.mysql.cj.jdbc.Driver"); 
 
} 
 
catch(ClassNotFoundException cnf) 
 
{ 
 
System.out.println("Driver Could not be loaded"); 
 
} 
} //close static 
public static void main(String args[]) 
{ 
 
String ConnectionUrl="jdbc:mysql://localhost:3306/ameer";
 
String dbuser="root"; 
 
String pswd="password"; 
 
DataInputStream in=new DataInputStream(System.in); 
 
String ch; 
 
int flag=0; 
try 
{ 
Connection con=DriverManager.getConnection(ConnectionUrl,dbuser,pswd); 
Statement st=con.createStatement(); 
System.out.println("Enter a few characters of user name"); 
ch=in.readLine(); 
ResultSet rec=st.executeQuery 
("select * from tele where cname like '%"+ch+"%'"); 
while(rec.next()) 
{ 
System.out.println(rec.getString("cname")); 
 
System.out.println("\t"+rec.getString("phone")); 
 
flag=1; 
} 
if(flag==0) 
{ 
System.out.println("No record found"); 
} 
}//try close 
catch(SQLException e1) 
{ 
System.out.println("SQL Exception :"+e1); 
} 
catch(IOException e2) 
{ 
System.out.println("IO Exception:"+e2); 
} 
} 
}
