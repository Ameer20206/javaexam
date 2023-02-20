import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.io.*; 
public class Bank 
{ 
 
static 
 
{ 
 
try 
 
{ 
 
Class.forName("com.mysql.cj.jdbc.Driver"); 
 
} 
 
catch(ClassNotFoundException cnf) 
 
{ 
 
System.out.println("Driver Could not be loaded" +cnf); 
 
} 
 
} //close static 
public static void main(String args[]) 
{ 
 
try 
 
{ 
 
String
 
ConnectionUrl="jdbc:mysql://localhost:3306/ameer";
 
String dbuser="root"; 
 
String pswd="password"; 
 
DataInputStream in=new DataInputStream(System.in); 
 
String sql; 
 
int vaccno,flag=0; 
 
try 
 
{ 
Connection con=DriverManager.getConnection(ConnectionUrl,dbuser,pswd);
Statement st=con.createStatement(); 
System.out.println("Enter account number"); 
vaccno=Integer.parseInt(in.readLine()); 
sql="select * from account where accno=" +vaccno; 
ResultSet rec=st.executeQuery(sql); 
while(rec.next()) 
{ 
 
System.out.print(rec.getInt("accno")); 
 
System.out.print("\t"+rec.getString("name")); 
 
System.out.println("\t"+rec.getInt("bal")); 
 
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
