

import java.io.*;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Servers {
    public static void main (String [] args ) throws IOException {
        ServerSocket serverSocket = new ServerSocket(15123);
        Socket socket = serverSocket.accept();
        System.out.println("Accepted connection : " + socket);
        
   
            InputStream is1 = socket.getInputStream();
        
        InputStreamReader isr=new InputStreamReader(is1);
        BufferedReader br=new BufferedReader(isr);
        String n1=br.readLine();
        int n=br.read();
        System.out.println(n1);
     
       StringBuilder out = new StringBuilder();
        String line;
           PrintWriter ou=new PrintWriter("s.csv");
        while ((line = br.readLine()) != null) {
        
           
           ou.append(line);
           ou.append(System.getProperty("line.separator"));
            
           
        }
        
        System.out.println(out.toString());   //Prints the string content read from input stream
        br.close();
        ou.close();
        
        
       
       /*if(n1.equalsIgnoreCase("hello")){
    System.out.println("hey");
        int filesize=202238600; int bytesRead; int currentTot = 0;
        byte [] bytearray = new byte [filesize]; 
        InputStream is = socket.getInputStream(); 
       
        FileOutputStream fos = new FileOutputStream("s.csv");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        bytesRead = is.read(bytearray,0,bytearray.length); 
        currentTot = bytesRead; 
         System.out.println(bytesRead);
        do { 
            bytesRead = is.read(bytearray, currentTot, (bytearray.length-currentTot)); 
            if(bytesRead >= 0) 
                currentTot += bytesRead; 
        } while(bytesRead > -1);
        System.out.println(bytearray.length);
        bos.write(bytearray, 0 , currentTot); 
      
         bos.flush();
        bos.close();
        
        socket.close();
        }
   */
       if(n1.equalsIgnoreCase("hello")){ 
       try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
                 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
                Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
               ResultSet rs,rs1;
                
                  boolean p;
                String drop="drop table csvdb";
                s.execute(drop);
                String que="create table [dbo]. [csvdb] (pname varchar(25),pname1 varchar(25),pname2 varchar(25),counts float)";
                s.execute(que);
                String query="bulk insert csvdb from 'C:\\Users\\Sanjay\\Documents\\project\\client side registration\\client side registration\\s.csv' with (fieldterminator = ',',rowterminator=',\\n',firstrow=2)" ;
                s.execute(query);
                String select="select * from csvdb";
                rs=s.executeQuery(select);
                String drop2="drop table temp";
                s.execute(drop2);
                String join="select * into temp from(select c.pname,c.pname1,c.pname2,c.counts as c1,d.counts as c2 from csvdb as c join dumm as d on c.pname=d.pname and c.pname1=d.pname1 and c.pname2=d.pname2)as t";
                s.execute(join);
                String drop1="drop table temp1";
                s.execute(drop1);
                String str="select * into temp1 from(SELECT pname,pname1,pname2 (COALESCE(c1, 0) + COALESCE(c2, 0))as counts FROM temp)as t";
                s.execute(str);
                String sum="select * from temp1";
                rs=s.executeQuery(sum);
                 System.out.println("hh"); 
                 rs.last();
                int rows=rs.getRow();
                 rs.beforeFirst();
                 System.out.println(rows);
                    String filename="globalcount.csv";
                    
                   FileWriter writer = new FileWriter(filename);
                  //writer = new BufferedWriter();
                  writer.append("pname");
                   writer.append(',');
                   writer.append("pname1");
                   writer.append(',');
                   writer.append("pname2");
                   writer.append(',');
                    writer.append("counts");
                    //writer.append(',');
                    writer.append(System.getProperty("line.separator"));
                    
                 while(rs.next()){
                     
                        writer.append(rs.getString("pname"));
                          writer.append(',');
                          writer.append(rs.getString("pname1"));
                          writer.append(',');
                          writer.append(rs.getString("pname2"));
                          writer.append(',');
                         writer.append(rs.getString("counts"));
                          
                          writer.append(System.getProperty("line.separator"));
                     
           
        }
           
     writer.close();
  
       System.out.println("File Received");
         socket.close();
        }
        catch(Exception e) {
       e.printStackTrace();
        }
        
     
    try{
          ServerSocket serverSock = new ServerSocket(15124);
        Socket sock = serverSock.accept();
        System.out.println("Accepted connection : " + sock);
          int filesize=202238600; int bytesRead; int currentTot = 0;
        byte [] bytearray = new byte [filesize]; 
         File transferFile = new File ("globalcount.csv");
        bytearray = new byte [(int)transferFile.length()];
        System.out.println();
        FileInputStream fin = new FileInputStream(transferFile);
        BufferedInputStream bin = new BufferedInputStream(fin);
        bin.read(bytearray,0,bytearray.length);
        OutputStream os = sock.getOutputStream();
        System.out.println("Sending Files...");
        os.write(bytearray,0,bytearray.length);
        
        os.flush();
       
        System.out.println("File transfer complete");
       
        sock.close();
     }
      catch(Exception e) {
       e.printStackTrace();
        }

       
        
       
       }  
       
       else{
            try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
                 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
                Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
               ResultSet rs,rs1;
                
                  boolean p;
                String drop="drop table csvdb";
                s.execute(drop);
                String que="create table [dbo]. [csvdb] (pname varchar(25),counts Integer)";
                s.execute(que);
                String query="bulk insert csvdb from 'C:\\Users\\Sanjay\\Documents\\project\\client side registration\\client side registration\\s.csv' with (fieldterminator = ',',rowterminator=',\\n',firstrow=2)" ;
                s.execute(query);
                String select="select * from csvdb";
                rs=s.executeQuery(select);
                String drop2="drop table temp";
                s.execute(drop2);
                String join="select * into temp from(select c.pname,c.counts as c1,d.counts as c2 from csvdb as c join dummy as d on c.pname=d.pname)as t";
                s.execute(join);
                String drop1="drop table temp1";
                s.execute(drop1);
                String str="select * into temp1 from(SELECT pname, (COALESCE(c1, 0) + COALESCE(c2, 0))as counts FROM temp)as t";
                s.execute(str);
                String sum="select * from temp1";
                rs=s.executeQuery(sum);
                 System.out.println("hh"); 
                 rs.last();
                int rows=rs.getRow();
                 rs.beforeFirst();
                 System.out.println(rows);
                    String filename="globalcount.csv";
                    
                   FileWriter writer = new FileWriter(filename);
                  //writer = new BufferedWriter();
                  writer.append("pname");
                   writer.append(',');
                    writer.append("counts");
                    //writer.append(',');
                    writer.append(System.getProperty("line.separator"));
                    
                 while(rs.next()){
                     
                        writer.append(rs.getString("pname"));
                          writer.append(',');
                         writer.append(rs.getString("counts"));
                          
                          writer.append(System.getProperty("line.separator"));
                     
           
        }
           
     writer.close();
  
       System.out.println("File Received");
         socket.close();
        }
        catch(Exception e) {
       e.printStackTrace();
        }
        
     
    try{
          ServerSocket serverSock = new ServerSocket(15124);
        Socket sock = serverSock.accept();
        System.out.println("Accepted connection : " + sock);
        int filesize=202238600; int bytesRead; int currentTot = 0;
        byte [] bytearray = new byte [filesize]; 
         File transferFile = new File ("globalcount.csv");
        bytearray = new byte [(int)transferFile.length()];
        System.out.println();
        FileInputStream fin = new FileInputStream(transferFile);
        BufferedInputStream bin = new BufferedInputStream(fin);
        bin.read(bytearray,0,bytearray.length);
        OutputStream os = sock.getOutputStream();
        System.out.println("Sending Files...");
        os.write(bytearray,0,bytearray.length);
        
        os.flush();
       
        System.out.println("File transfer complete");
       
        sock.close();
     }
      catch(Exception e) {
       e.printStackTrace();
        }
       }
    } 
}
        
    

