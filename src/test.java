
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sayori
 */
public class test {
    private static final int BUFFER_SIZE = 4096;
 
    public static void main(String[] args) {
       // String ftpUrl = "ftp://%s:%s@%s/%s;type=i";
       
 
        try {
        String ftpUrl="ftp://%s:%s@%s/%s;type=i";
        String host = "ftp.sayoribeproject.site40.net";
        String user = "a9583117";
        String pass = "sayori23";
        String filePath = "C:\\Users\\Sayori\\Documents\\NetBeansProjects\\Server\\globalcount.csv";
        String uploadPath = "public_html/globalcount.csv";
 
        ftpUrl = String.format(ftpUrl,user,pass,host,uploadPath);
        System.out.println("Upload URL: " + ftpUrl);
            
            URL url = new URL(ftpUrl);
            URLConnection conn = url.openConnection();
            OutputStream outputStream = conn.getOutputStream();
            FileInputStream inputStream = new FileInputStream(filePath);
 
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
 
            inputStream.close();
            outputStream.close();
 
            System.out.println("File uploaded");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
       
    
    }
}
