import java.io.*; 
class CopyCharacters 
{ 
public static void main(String args[]) 
{ 
 
//Declare and create input and output files 
 
File infile=new File("input.txt"); 
 
File outfile=new File("output.txt"); 
 
FileReader ins=null; 
 
FileWriter outs=null; 
 
try 
 
{ 
 
ins=new FileReader(infile); 
 
outs=new FileWriter(outfile); 
 
int ch; 
 
while((ch=ins.read())!=-1) 
 
{ 
 
outs.write(ch); 
 
} 
 
} 
catch(IOException e) 
{ 
 
System.out.println(e); 
 
System.exit(-1); 
} 
finally 
{ 
 
try 
 
{ 
 
ins.close(); 
 
outs.close(); 
 
} 
 
catch(IOException e){} 
} 
} 
} 
