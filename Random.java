import java.io.*; 
class Random 
{ 
 
public static void main(String args[]) 
 
{ 
 
RandomAccessFile file=null; 
 
try 
 
{ 
 
file=new RandomAccessFile("sample.dat","rw"); 
 
file.writeChar('X'); 
 
file.writeInt(555); 
 
file.writeDouble(3.141592); 
 
file.seek(0); 
 
System.out.println(file.readChar()); 
 
System.out.println(file.readInt()); 
 
System.out.println(file.readDouble()); 
 
file.seek(2); 
 
System.out.println(file.readInt()); 
 
file.seek(file.length()); 
 
file.writeBoolean(false); 
 
file.seek(14); 
 
System.out.println(file.readBoolean()); 
 
file.close(); 
 
} 
 
catch(IOException e) 
 
{ 
 
System.out.println(e); 
 
} 
 
} 
}
