

import java.awt.Color;
import java.io.*;
import java.sql.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon; 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.data.general.DefaultPieDataset;
public class graphical extends javax.swing.JFrame {

    
    public graphical() {
        initComponents();
        getContentPane().setBackground(Color.white);
    
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setToolTipText("");

        jLabel3.setToolTipText("");

        jButton1.setBackground(new java.awt.Color(190, 171, 144));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton1.setText("Display");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(190, 171, 144));
        jButton4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton4.setText("Back");
        jButton4.setActionCommand("Bcak");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1296, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(630, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
         try{
             String mobilebrands[] = {
      "first_frequent_itemset",   
      "second_frequent_itemset",   
      "third_frequent_itemset",            
      };
             
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
             // line below needs to be modified to include the database name, user, and password (if any)
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
             Statement s = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
              
     ResultSet rs= s.executeQuery("select * from firstfrequent" );
     
      DefaultPieDataset dataset = new DefaultPieDataset( );
     
      while( rs.next( ) ) 
      {
         dataset.setValue( 
         rs.getString( "first_frequent" ) ,
         Double.parseDouble( rs.getString( "count" )));
      }
      
       JFreeChart chart = ChartFactory.createPieChart(
         "First Frequent ItemSet[Threshold > 2]",  // chart title           
         dataset,         // data           
         true,            // include legend          
         true,           
         false );

      int width = 560; /* Width of the image */
      int height = 370; /* Height of the image */ 
      File pieChart = new File( "Pie_Chart.jpeg" );
      ChartUtilities.saveChartAsJPEG( pieChart , chart , width , height );
      
      
      String que="select * from secondfrequent";
      ResultSet rs1= s.executeQuery(que);
      DefaultPieDataset dataset1 = new DefaultPieDataset( );
      while( rs1.next( ) ) 
      {
          String i=rs1.getString( "frequent" );
          String q=rs1.getString( "itemset" );
          String j=i+q;
         dataset1.setValue( 
         j,
         Double.parseDouble( rs1.getString( "count" )));
      }
       JFreeChart chart1 = ChartFactory.createPieChart(
         "second Frequent ItemSet[Threshold > 2]",  // chart title           
         dataset1,         // data           
         true,            // include legend          
         true,           
         false );

      int width1 = 560; /* Width of the image */
      int height1 = 370; /* Height of the image */ 
      File pieChart1 = new File( "Pie_Chart1.jpeg" );
      ChartUtilities.saveChartAsJPEG( pieChart1 , chart1 , width1 , height1 );
      
      String qu="select * from thirdfrequent";
      ResultSet rs2= s.executeQuery(qu);
      DefaultPieDataset dataset2 = new DefaultPieDataset( );
      while( rs2.next( ) ) 
      {
          String i=rs2.getString("frequent");
          String j=rs2.getString("itemset");
          String k=rs2.getString("sets");
          String l=i+j+k;
         dataset2.setValue( 
        l,
         Double.parseDouble( rs2.getString( "count" )));
      }
      JFreeChart chart2 = ChartFactory.createPieChart(
         "Third Frequent ItemSet[Threshold > 2]",  // chart title           
         dataset2,         // data           
         true,            // include legend          
         true,           
         false );

      int width2 = 560; /* Width of the image */
      int height2 = 370; /* Height of the image */ 
      File pieChart2 = new File( "Pie_Chart2.jpeg" );
      ChartUtilities.saveChartAsJPEG( pieChart2 , chart2 , width2 , height2 );
     
      
         } catch (ClassNotFoundException ex) {
            Logger.getLogger(graphical.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(graphical.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(graphical.class.getName()).log(Level.SEVERE, null, ex);
        }
          ImageIcon image = new ImageIcon("C:\\Users\\Sayori\\Documents\\NetBeansProjects\\client side registration\\Pie_Chart.jpeg");
          jLabel2.setIcon(image);
          ImageIcon image1 = new ImageIcon("C:\\Users\\Sayori\\Documents\\NetBeansProjects\\client side registration\\Pie_Chart1.jpeg");
          jLabel3.setIcon(image1);
          ImageIcon image2 = new ImageIcon("C:\\Users\\Sayori\\Documents\\NetBeansProjects\\client side registration\\Pie_Chart2.jpeg");
          jLabel4.setIcon(image2);




    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        new  MainPage().setVisible(true);

        this.dispose(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(graphical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(graphical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(graphical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(graphical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new graphical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
