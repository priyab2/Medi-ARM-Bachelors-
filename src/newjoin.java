
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sayori
 */
public class newjoin {
    public static void main (String [] args ) throws IOException {
         try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
                 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
                Statement s = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
               ResultSet rs,rs1;
                
                  boolean p;
                  
                
                String query="bulk insert student3 from 'C:\\project\\student.csv' with (fieldterminator = ',',rowterminator=',\\n',firstrow=2)" ;
                s.execute(query);
                
                String queryt="bulk insert student1 from 'C:\\project\\student1.csv' with (fieldterminator = ',',rowterminator=',\\n',firstrow=2)" ;
                s.execute(queryt);
                
                String drop2="drop table temp";
                s.execute(drop2);
                String join="select * into temp from(select c.pname,c.pname1,c.pname2,c.counts as c1,d.counts as c2 from student3 as c join student1 as d on c.pname=d.pname and c.pname1=d.pname1 and c.pname2=d.pname2)as t";
                s.execute(join);
                String drop1="drop table temp1";
                s.execute(drop1);
                String str="select * into temp1 from(SELECT pname,pname1,pname2,(COALESCE(c1, 0) + COALESCE(c2, 0))as counts FROM temp)as t";
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
  
       System.out.println("File updated");
       //  socket.close();
        }
        catch(Exception e) {
       e.printStackTrace();
        }
    }
}
