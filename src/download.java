/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sayori
 */
    
import java.io.FileOutputStream ;
import java.io.IOException ;
import java.io.InputStream ;
import java.net.URL ;
import java.net.URLConnection ;
import java.io.File ;
import java.io.FileWriter;
import java.sql.*;


public class download {

    private static final int BUFFER_SIZE = 4096 ;
    
	public static void main(String args[]){   
            //this is a function
		long startTime = System.currentTimeMillis() ;
		String ftpUrl = "ftp://%s:%s@%s/%s";
		String file= "public_html/student.csv" ; // name of the file which has to be download
                
		String host = "ftp.sayoribeproject.site40.net" ; //ftp server
		String user = "a9583117" ; //user name of the ftp server
		String pass = "sayori23" ; // password of the ftp server
		String savePath = "c:/project/student.csv" ;
                
		ftpUrl = String.format(ftpUrl,user,pass,host,file) ;
               
                System.out.println(ftpUrl);
		System.out.println("Connecting to FTP server") ;

		try{
			URL url = new URL(ftpUrl) ;
			URLConnection conn = url.openConnection() ;
			InputStream inputStream = conn.getInputStream() ;
			long filesize = conn.getContentLength() ;
			System.out.println("Size of the file to download in kb is:-" + filesize/1024 ) ;

			FileOutputStream outputStream = new FileOutputStream(savePath) ;

			byte[] buffer = new byte[BUFFER_SIZE] ;
			int bytesRead = -1 ;
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead) ;
			}
			long endTime = System.currentTimeMillis() ;
			System.out.println("File downloaded") ;
			System.out.println("Download time in sec. is:-" + (endTime-startTime)/1000)  ;
			outputStream.close() ;
			inputStream.close() ;
                        
                         
		}
		catch (IOException ex){
			ex.printStackTrace() ;
		}
                
               
                
              /* 
                
           */     
                
                
	} 
}
