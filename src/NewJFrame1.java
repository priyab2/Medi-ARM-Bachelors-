



import java.awt.Color;
import java.io.*;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class NewJFrame1 extends javax.swing.JFrame {

    
    public NewJFrame1() {
        initComponents();
      
        jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(false);
        jScrollPane3.setVisible(false);
        jScrollPane5.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jLabel3.setVisible(false);
        jButton3.setVisible(false);
        
        
         jScrollPane1.getViewport().setBackground(Color.white);
         jScrollPane2.getViewport().setBackground(Color.white);
         jScrollPane3.getViewport().setBackground(Color.white);
          jScrollPane5.getViewport().setBackground(Color.white);
         getContentPane().setBackground(Color.white);
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton5);
        buttonGroup2.add(jRadioButton3);
        buttonGroup2.add(jRadioButton4);
          jComboBox1.addItem("1");
        jComboBox1.addItem("2");
        jComboBox1.addItem("3");
        jComboBox1.addItem("4");
        /*buttonGroup3.add(jRadioButton6);
        buttonGroup3.add(jRadioButton7);*/
       
        
       
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "pname", "count"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton1.setText("UPLOAD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jRadioButton1.setText("Weekly Pattern");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jRadioButton2.setText("Monthly Pattern");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Frequent", "ItemSet", "count"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTable3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Frequent", "Item", "Set", "count"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jRadioButton3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jRadioButton3.setText("Two Frequent ItemSet");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jRadioButton4.setText("Three Frequent ItemSet");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton2.setText("CONFIDENCE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "frequent", "item", "Set", "percent"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable4);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PATTERN GENERATION");

        jRadioButton5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jRadioButton5.setText("Random Pattern");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setText("Between");

        jButton3.setText("GO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel4.setText(" Threshold");

        jButton5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton5.setText("COMPLETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel5.setText("Duration");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel6.setText("Pattern Type");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        jButton4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton4.setText("Download");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        jLabel7.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(563, 563, 563)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jRadioButton1))
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioButton3))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(593, 593, 593)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3)
                        .addGap(45, 45, 45)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(9, 9, 9)
                .addComponent(jButton5)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(jRadioButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton4)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jRadioButton5)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton3)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton1)))))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton4)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
     Writer writer = null;
       DefaultTableModel mod=(DefaultTableModel)jTable3.getModel();
        int nRow = mod.getRowCount();
        int nCol = mod.getColumnCount();
        System.out.println(nRow+""+nCol);
        try{
        writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("student.csv"), "utf-8"));
        StringBuffer bufferHeader = new StringBuffer();
        
            for (int j = 0; j < nCol; j++) {
                System.out.println(bufferHeader.append(mod.getColumnName(j)));
                if (j!=nCol) bufferHeader.append(",");
            }
            writer.write(bufferHeader.toString() + "\r\n");
            
            for (int i = 0 ; i < nRow ; i++){
                 StringBuffer buffer = new StringBuffer();
                for (int j = 0 ; j < nCol ; j++){
                    System.out.println(buffer.append(mod.getValueAt(i,j)));
                    if (j!=nCol) buffer.append(",");
                }
                writer.write(buffer.toString() + "\r\n");
            }
                
               writer.close();
               
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        System.out.println("file successfully created");
        test1 c=new test1();
        String[] args = {};

        try {
            c.main(args);
          
        } catch (Exception ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
       JOptionPane.showMessageDialog(this, "Uploaded Successfully"); 
       System.out.println("alive");
       JOptionPane.showMessageDialog(this, "plz wait for download"); 
       
       
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
jScrollPane1.setVisible(true);
    getContentPane().revalidate();        
       
        
   Object thres = jComboBox1.getSelectedItem();
 
        
        DefaultTableModel mode2=(DefaultTableModel)jTable1.getModel();
            int rowCount = mode2.getRowCount();
for (int i = rowCount - 1; i >= 0; i--) {
    mode2.removeRow(i);
}
            try{
                ResultSet rs,rs1;

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver

                Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
                Statement s = con.createStatement();
                System.out.println("Connected to database !");

                String query=" select COUNT(*) as coun, pname from (select * from bill where purchase_date >= GETDATE()-7) as te group by pname having COUNT(*)>'"+thres+"'";
                rs=s.executeQuery(query);

                while(rs.next()){
                    //  System.out.println(rs.getInt("pid"));

                    String pname=rs.getString("pname");
                    int quant=Integer.parseInt(rs.getString("coun"));

                    Object o[]={pname,quant};
                    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
                    model.addRow(o);
                }
               //NewJFrame1 x=new NewJFrame1();

            }
            catch(Exception e) {
                e.printStackTrace();

            }
   
   
  
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
 
        jScrollPane1.setVisible(true);
    getContentPane().revalidate();       
        
    
        DefaultTableModel mode2=(DefaultTableModel)jTable1.getModel();
           int rowCount = mode2.getRowCount();
for (int i = rowCount - 1; i >= 0; i--) {
    mode2.removeRow(i);
}
      Object thres = jComboBox1.getSelectedItem();
        
      
        
            try{
               
        
                ResultSet rs,rs1;

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver

                Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
                Statement s = con.createStatement();
                System.out.println("Connected to database !");

                String query="select COUNT(*) as coun, pname from (select * from bill where purchase_date >= GETDATE()-30) as te group by pname having COUNT(*)>'"+thres+"'";
                rs=s.executeQuery(query);

                while(rs.next()){
                    //  System.out.println(rs.getInt("pid"));

                    String pname=rs.getString("pname");
                    int quant=Integer.parseInt(rs.getString("coun"));

                    Object o[]={pname,quant};
                    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
                    model.addRow(o);
                }
                NewJFrame1 x=new NewJFrame1();

            }
            catch(Exception e) {
                e.printStackTrace();

            }
    
 
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        
        jScrollPane2.setVisible(true);
    getContentPane().revalidate();
        
    
    
        DefaultTableModel mode1=(DefaultTableModel)jTable2.getModel();
            int rowCoun = mode1.getRowCount();
for (int i = rowCoun - 1; i >= 0; i--) {
    mode1.removeRow(i);
}
        try{
           
                
                String g=jTextField1.getText();
       String h=jTextField2.getText();
                
            int rows = jTable1.getRowCount();
         Vector v=new Vector(), temp=new Vector(), prev=new Vector();
      for(int row = 0; row<rows ; row++){
          
          String pname = (String) jTable1.getValueAt(row, 0);
      
          v.addElement(pname);
      }
      
          System.out.println(v.size());
             temp.removeAllElements();
            prev.removeAllElements();
          for(int k=0;k<v.size();k++){
             
                prev.addElement(v.elementAt(k));}
           
		String str="",str1="";
                int a=0,q1=0;
                double sum=0.0d;
             for(int i=0;i<v.size();i++){
                for(int j=i+1;j<v.size();j++)   
              {                    
                    
                  str=""+v.elementAt(i);
                  str1=""+v.elementAt(j);  
                      System.out.println(str+"\t"+str1);
                      sum=0;
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
                 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
                 Statement s = con.createStatement(); 
                  ResultSet rs,rs1;
                String que="select max(bill_no) as b  from bill";
                rs1=s.executeQuery(que);
                
                while(rs1.next())
                a=rs1.getInt("b");
                System.out.println(a);
                for(int k=1;k<=a;k++){               
                    String query="select count(*) as c from (select * from (select * from bill where (bill_no= '"+k+"' and (pname in('"+str+"','"+str1+"')))) as aa where purchase_date between'"+g+"'and'"+h+"') as bb ";
                    rs=s.executeQuery(query);
                   // System.out.println(query+" val : ");
                    
                    while(rs.next()){
                    
                        q1=rs.getInt("c");
                       //sum=Math.ceil(sum/2);
                      
                        if(q1>2){
                            sum++;
                            
                        }
                        //System.out.println(sum); 
                    } 
                }
                
                if(sum>=1){
                   Object o[]={str,str1,sum};
                             DefaultTableModel m=(DefaultTableModel)jTable2.getModel(); 
                             m.addRow(o); 
                  //System.out.println(str+"\t"+str1);
                
                }
              }
             }
          
          
      }
       catch(Exception e) {
       e.printStackTrace();
   
              }
       try{
                      
          if(jRadioButton1.isSelected()){
              
        int rows = jTable1.getRowCount();
         Vector v=new Vector(), temp=new Vector(), prev=new Vector();
      for(int row = 0; row<rows ; row++){
          
          String pname = (String) jTable1.getValueAt(row, 0);
      
          v.addElement(pname);
      }
      
          System.out.println(v.size());
             temp.removeAllElements();
            prev.removeAllElements();
          for(int k=0;k<v.size();k++){
             
                
                prev.addElement(v.elementAt(k));}
           
		String str="",str1="";
                int a=0,q1=0;
                double sum=0.0d;
             for(int i=0;i<v.size();i++){
                for(int j=i+1;j<v.size();j++)   
              {                    
                     
                  str=""+v.elementAt(i);
                  str1=""+v.elementAt(j);  
                      System.out.println(str+"\t"+str1);
                      sum=0;
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
                 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
                 Statement s = con.createStatement(); 
                  ResultSet rs,rs1;
                String que="select max(bill_no) as b  from bill";
                rs1=s.executeQuery(que);
                
                while(rs1.next())
                a=rs1.getInt("b");
                System.out.println(a);
                for(int k=1;k<=a;k++){               
                    String query="select count(*) as c from (select * from (select * from bill where (bill_no= '"+k+"' and (pname in('"+str+"','"+str1+"')))) as aa where purchase_date >= GETDATE()-7) as bb ";
                    rs=s.executeQuery(query);
                   // System.out.println(query+" val : ");
                    
                    while(rs.next()){
                    
                        q1=rs.getInt("c");
                       //sum=Math.ceil(sum/2);
                      
                        if(q1>1){
                            sum++;
                            
                        }
                        //System.out.println(sum); 
                    } 
                }
                if(sum>=1)
                {
                   Object o[]={str,str1,sum};
                             DefaultTableModel m=(DefaultTableModel)jTable2.getModel(); 
                             m.addRow(o); 
                  //System.out.println(str+"\t"+str1);
                
                }
              }
             }
          
          }
      }
       catch(Exception e) {
       e.printStackTrace();
   
              }
       try{
           if(jRadioButton2.isSelected()){
                DefaultTableModel mode2=(DefaultTableModel)jTable2.getModel();
            int rowCount = mode2.getRowCount();
for (int i = rowCount - 1; i >= 0; i--) {
    mode2.removeRow(i);
}
                   
        int rows = jTable1.getRowCount();
         Vector v=new Vector(), temp=new Vector(), prev=new Vector();
      for(int row = 0; row<rows ; row++){
          
          String pname = (String) jTable1.getValueAt(row, 0);
      
          v.addElement(pname);
      }
      
          System.out.println(v.size());
             temp.removeAllElements();
            prev.removeAllElements();
          for(int k=0;k<v.size();k++){
             
                
                prev.addElement(v.elementAt(k));}
           
		String str="",str1="";
             for(int i=0;i<v.size();i++){
                for(int j=i+1;j<v.size();j++)   
              {                    
                     
                  str=""+v.elementAt(i);
                  str1=""+v.elementAt(j);  
                     // System.out.println(str+"\t"+str1);
                  int a=0,q1=0;
                double sum=0.0d;
                  sum=0;
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
                 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
                 Statement s = con.createStatement(); 
                  ResultSet rs,rs1;
                String que="select max(bill_no) as b  from bill";
                rs1=s.executeQuery(que);
                
                while(rs1.next())
                a=rs1.getInt("b");
                System.out.println(a);
                for(int k=1;k<=a;k++){               
                    String query="select count(*) as c from (select * from (select * from bill where (bill_no= '"+k+"' and (pname in('"+str+"','"+str1+"')))) as aa where purchase_date >= GETDATE()-30) as bb ";
                    rs=s.executeQuery(query);
                    System.out.println(query+" val : ");
                  
                    while(rs.next()){
                    
                        q1=rs.getInt("c");
                        //System.out.print(q1+"\n");
                     
                        if(q1>1){
                            sum++;
                        }
                    } 
                }
                if(sum>=1){
                     // sum=Math.ceil(sum/2);
              Object o[]={str,str1,sum};
                DefaultTableModel mode3=(DefaultTableModel)jTable2.getModel(); 
                System.out.println("hhhhh");
                mode3.addRow(o);
                  System.out.println(str+"\t"+str1);
                
              }  
              }
             }
                  
          }
      }
       
                   catch(Exception e) {
       e.printStackTrace();
   
              }     
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
jScrollPane3.setVisible(true);
    getContentPane().revalidate();
        
        DefaultTableModel mode2=(DefaultTableModel)jTable3.getModel();
            int rowCount = mode2.getRowCount();
for (int i = rowCount - 1; i >= 0; i--) {
    mode2.removeRow(i);
}
        if(jRadioButton5.isSelected()){
             try{
      
                 String g=jTextField1.getText();
       String h=jTextField2.getText();
                 
        int rows = jTable2.getRowCount();
         Vector v=new Vector(), temp=new Vector(), prev=new Vector(),tem=new Vector();
      for(int row = 0; row<rows ; row++){
          
          String pname = (String) jTable2.getValueAt(row, 0);
          String pname1 = (String) jTable2.getValueAt(row, 1);
         
          v.addElement(pname);
          tem.addElement(pname1);
        
          
      }
      
          System.out.println(v.size());
             temp.removeAllElements();
            prev.removeAllElements();
          for(int k=0;k<v.size();k++){
             
                
                prev.addElement(v.elementAt(k));}
           
		String str="",str1="",c="",d="";
             for(int i=0;i<v.size();i++){
                for(int j=i+1;j<v.size();j++)   
              {                    
                     
                  str=""+v.elementAt(i);
                  str1=""+v.elementAt(j);
                  if(str.equals(str1)){
                    c=""+tem.elementAt(i);
                    d=""+tem.elementAt(j);
                     // System.out.println(str+"\t"+c+"\t"+d);
                  int a=0,sum=0,q1=0;
                  
          
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
                 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
                 Statement s = con.createStatement(); 
                  ResultSet rs,rs1;
                String que="select max(bill_no) as b  from bill";
                rs1=s.executeQuery(que);
                
                while(rs1.next())
                a=rs1.getInt("b");
                System.out.println(a);
                for(int k=1;k<=a;k++){               
                    String query="select count(*) as c from (select * from (select * from bill where (bill_no= '"+k+"' and (pname in('"+str+"','"+c+"','"+d+"')))) as aa where purchase_date between'"+g+"'and'"+h+"') as bb ";
                    rs=s.executeQuery(query);
                   // System.out.println(query+" val : ");
                  
                    while(rs.next()){
                    
                        q1=rs.getInt("c");
                        //float q2=Math.ceil(q1/2);
                        
                        System.out.print(q1+"\n");
                        if(q1>2){
                            sum++;
                            
                            }
                    } 
                }
                if(sum>=1){
              Object o[]={str,c,d,sum};
                            DefaultTableModel model=(DefaultTableModel)jTable3.getModel(); 
                            model.addRow(o);
                }
                  }
                
              }         
             }
          
          
      }
       catch(Exception e) {
       e.printStackTrace();
   
              }  
        }
        if(jRadioButton1.isSelected()){
          try{
      
        int rows = jTable2.getRowCount();
         Vector v=new Vector(), temp=new Vector(), prev=new Vector(),tem=new Vector();
      for(int row = 0; row<rows ; row++){
          
          String pname = (String) jTable2.getValueAt(row, 0);
          String pname1 = (String) jTable2.getValueAt(row, 1);
         
          v.addElement(pname);
          tem.addElement(pname1);
        
          
      }
      
          System.out.println(v.size());
             temp.removeAllElements();
            prev.removeAllElements();
          for(int k=0;k<v.size();k++){
             
                
                prev.addElement(v.elementAt(k));}
           
		String str="",str1="",c="",d="";
             for(int i=0;i<v.size();i++){
                for(int j=i+1;j<v.size();j++)   
              {                    
                     
                  str=""+v.elementAt(i);
                  str1=""+v.elementAt(j);
                  if(str.equals(str1)){
                    c=""+tem.elementAt(i);
                    d=""+tem.elementAt(j);
                     // System.out.println(str+"\t"+c+"\t"+d);
                  int a=0,sum=0,q1=0;
                  
          
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
                 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
                 Statement s = con.createStatement(); 
                  ResultSet rs,rs1;
                String que="select max(bill_no) as b  from bill";
                rs1=s.executeQuery(que);
                
                while(rs1.next())
                a=rs1.getInt("b");
                System.out.println(a);
                for(int k=1;k<=a;k++){               
                    String query="select count(*) as c from (select * from (select * from bill where (bill_no= '"+k+"' and (pname in('"+str+"','"+c+"','"+d+"')))) as aa where purchase_date >= GETDATE()-7) as bb ";
                    rs=s.executeQuery(query);
                   // System.out.println(query+" val : ");
                  
                    while(rs.next()){
                    
                        q1=rs.getInt("c");
                        //float q2=Math.ceil(q1/2);
                        
                        System.out.print(q1+"\n");
                        if(q1>2){
                            sum++;
                            
                            }
                    } 
                }
                if(sum>=1){
              Object o[]={str,c,d,sum};
                            DefaultTableModel model=(DefaultTableModel)jTable3.getModel(); 
                            model.addRow(o);
                }
                  }
                
              }         
             }
          
          
      }
       catch(Exception e) {
       e.printStackTrace();
   
              }    
        }
       if(jRadioButton2.isSelected()){
        try{
      
        int rows = jTable2.getRowCount();
         Vector v=new Vector(), temp=new Vector(), prev=new Vector(),tem=new Vector();
      for(int row = 0; row<rows ; row++){
          
          String pname = (String) jTable2.getValueAt(row, 0);
          String pname1 = (String) jTable2.getValueAt(row, 1);
         
          v.addElement(pname);
          tem.addElement(pname1);
        
          
      }
      
          System.out.println(v.size());
             temp.removeAllElements();
            prev.removeAllElements();
          for(int k=0;k<v.size();k++){
             
                
                prev.addElement(v.elementAt(k));}
           
		String str="",str1="",c="",d="";
             for(int i=0;i<v.size();i++){
                for(int j=i+1;j<v.size();j++)   
              {                    
                     
                  str=""+v.elementAt(i);
                  str1=""+v.elementAt(j);
                  if(str.equals(str1)){
                    c=""+tem.elementAt(i);
                    d=""+tem.elementAt(j);
                     // System.out.println(str+"\t"+c+"\t"+d);
                  int a=0,sum=0,q1=0;
                  
          
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
                 Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
                 Statement s = con.createStatement(); 
                  ResultSet rs,rs1;
                String que="select max(bill_no) as b  from bill";
                rs1=s.executeQuery(que);
                
                while(rs1.next())
                a=rs1.getInt("b");
                System.out.println(a);
                for(int k=1;k<=a;k++){               
                    String query="select count(*) as c from (select * from (select * from bill where (bill_no= '"+k+"' and (pname in('"+str+"','"+c+"','"+d+"')))) as aa where purchase_date >= GETDATE()-30) as bb ";
                    rs=s.executeQuery(query);
                   // System.out.println(query+" val : ");
                  
                    while(rs.next()){
                    
                        q1=rs.getInt("c");
                        //float q2=Math.ceil(q1/2);
                        
                        System.out.print(q1+"\n");
                        if(q1>2){
                            sum++;
                            
                            }
                    } 
                }
                if(sum>=1){
              Object o[]={str,c,d,sum};
                            DefaultTableModel model=(DefaultTableModel)jTable3.getModel(); 
                            model.addRow(o);
                }
                  }
                
              }         
             }
          
          
      }
       catch(Exception e) {
       e.printStackTrace();
   
              } 
       }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      jScrollPane5.setVisible(true);
    getContentPane().revalidate();
    
    DefaultTableModel mode2=(DefaultTableModel)jTable4.getModel();
            int rowCount = mode2.getRowCount();
for (int i = rowCount - 1; i >= 0; i--) {
    mode2.removeRow(i);
}
    
        if(jRadioButton3.isSelected() && jRadioButton5.isSelected()){
            String g=jTextField1.getText();
       String h=jTextField2.getText();

             int i=jTable2.getRowCount();
          try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
             // line below needs to be modified to include the database name, user, and password (if any)
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
             Statement s = con.createStatement();
             ResultSet rs,rs1,rs2;
           int temp=0,p=0,temp1=0,z=0,tem=0;
          Float d=0.0f;
           if(i>0){
               for(int row = 0; row<i ; row++){
               String a=(String)jTable2.getValueAt(row,0);
               String b=(String)jTable2.getValueAt(row,1);
                Object o[]={a,b};
               Object o1[]={b,a};
                DefaultTableModel model=(DefaultTableModel)jTable4.getModel(); 
               model.addRow(o);
               model.addRow(o1);
               }
                }
               int j=jTable4.getRowCount();
               for(int row=0;row<j;row++)
               {
                   String a=(String)jTable4.getValueAt(row,0);
               String b=(String)jTable4.getValueAt(row,1);
               String query="select count(pname) as counts from bill where purchase_date between'"+g+"'and'"+h+"' and pname='"+a+"'";
          rs=s.executeQuery(query);
         
           while(rs.next())
          temp=rs.getInt("counts");
           System.out.println(temp);
          
                 
                    String query1="select count(pname) as counts from bill where purchase_date between'"+g+"'and'"+h+"' and pname='"+b+"'";
                    rs2=s.executeQuery(query1);
                     System.out.println(query1); 
                while(rs2.next())
                    
                    tem=rs2.getInt("counts");
               
                
                
            
                    d=(float)temp/tem;
                    d=d*100;
                    String f=d.toString();
                    if(d>0 && d<100){
                    jTable4.setValueAt(d, row, 2);
                    }
               
              }
               }
          catch(SQLException sqle){ 
      System.out.println("Sql Exception :"+sqle.getMessage());
   } 
            catch (ClassNotFoundException ex) {
                       Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
                   }
           
         
        }
        if(jRadioButton3.isSelected() && jRadioButton2.isSelected()){
         int i=jTable2.getRowCount();
          try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
             // line below needs to be modified to include the database name, user, and password (if any)
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
             Statement s = con.createStatement();
             ResultSet rs,rs1,rs2;
           int temp=0,p=0,temp1=0,z=0,tem=0;
          Float d=0.0f;
           if(i>0){
               for(int row = 0; row<i ; row++){
               String a=(String)jTable2.getValueAt(row,0);
               String b=(String)jTable2.getValueAt(row,1);
                Object o[]={a,b};
               Object o1[]={b,a};
                DefaultTableModel model=(DefaultTableModel)jTable4.getModel(); 
               model.addRow(o);
               model.addRow(o1);
               }
                }
               int j=jTable4.getRowCount();
               for(int row=0;row<j;row++)
               {
                   String a=(String)jTable4.getValueAt(row,0);
               String b=(String)jTable4.getValueAt(row,1);
               String query="select count(pname) as counts from bill where purchase_date >= GETDATE()-30 and pname='"+a+"'";
          rs=s.executeQuery(query);
         
           while(rs.next())
          temp=rs.getInt("counts");
           System.out.println(temp);
          
                 
                    String query1="select count(pname) as counts from bill where purchase_date >= GETDATE()-30 and pname='"+b+"'";
                    rs2=s.executeQuery(query1);
                     System.out.println(query1); 
                while(rs2.next())
                    
                    tem=rs2.getInt("counts");
               
                
                
            
                    d=(float)temp/tem;
                    d=d*100;
                    String f=d.toString();
                    if(d>0 && d<100){
                    jTable4.setValueAt(d, row, 2);
                    }
                    
               
              }
               }
          catch(SQLException sqle){ 
      System.out.println("Sql Exception :"+sqle.getMessage());
   } 
            catch (ClassNotFoundException ex) {
                       Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
                   }
           
           }
            
          if(jRadioButton3.isSelected() && jRadioButton1.isSelected()){
         int i=jTable2.getRowCount();
          try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
             // line below needs to be modified to include the database name, user, and password (if any)
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
             Statement s = con.createStatement();
             ResultSet rs,rs1,rs2;
           int temp=0,p=0,temp1=0,z=0,tem=0;
          Float d=0.0f;
           if(i>0){
               for(int row = 0; row<i ; row++){
               String a=(String)jTable2.getValueAt(row,0);
               String b=(String)jTable2.getValueAt(row,1);
                Object o[]={a,b};
               Object o1[]={b,a};
                DefaultTableModel model=(DefaultTableModel)jTable4.getModel(); 
               model.addRow(o);
               model.addRow(o1);
               }
                }
               int j=jTable4.getRowCount();
               for(int row=0;row<j;row++)
               {
                   String a=(String)jTable4.getValueAt(row,0);
               String b=(String)jTable4.getValueAt(row,1);
               String query="select count(pname) as counts from bill where purchase_date >= GETDATE()-7 and pname='"+a+"'";
          rs=s.executeQuery(query);
         
           while(rs.next())
          temp=rs.getInt("counts");
           System.out.println(temp);
         
                 
                    String query1="select count(pname) as counts from bill where purchase_date >= GETDATE()-7 and pname='"+b+"'";
                    rs2=s.executeQuery(query1);
                     System.out.println(query1); 
                while(rs2.next())
                    
                    tem=rs2.getInt("counts");
                    d=(float)temp/tem;
                    d=d*100;
                    String f=d.toString();
                    if(d>0 && d<100){
                    jTable4.setValueAt(d, row, 2);
                    }
                  
               
              }
               }
          catch(SQLException sqle){ 
      System.out.println("Sql Exception :"+sqle.getMessage());
   } 
            catch (ClassNotFoundException ex) {
                       Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
                   }
           
           }
      
        if(jRadioButton4.isSelected() && jRadioButton2.isSelected()){
           int i=jTable3.getRowCount();
           System.out.println(i);
           try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
             // line below needs to be modified to include the database name, user, and password (if any)
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
             Statement s = con.createStatement();
             ResultSet rs,rs1,rs2;
           int temp=0,p=0,temp1=0,z=0,tem=0;
          Float d=0.0f;
           if(i>0){
               for(int row = 0; row<i ; row++){
               String a=(String)jTable3.getValueAt(row,0);
               String b=(String)jTable3.getValueAt(row,1);
               String c=(String)jTable3.getValueAt(row,2);
               Object o[]={a,b,c};
               Object o1[]={b,a,c};
               Object o2[]={c,a,b};
               DefaultTableModel model=(DefaultTableModel)jTable4.getModel(); 
               model.addRow(o);
               model.addRow(o1);
               model.addRow(o2);
            
               }
               int j=jTable4.getRowCount();
               for(int row=0;row<j;row++)
               {
                   String a=(String)jTable4.getValueAt(row,0);
               String b=(String)jTable4.getValueAt(row,1);
               String c=(String)jTable4.getValueAt(row,2);
               
       
            String query="select count(pname) as counts from bill where purchase_date >= GETDATE()-30 and pname='"+a+"'";
          rs=s.executeQuery(query);
         
           while(rs.next())
          temp=rs.getInt("counts");
           System.out.println(temp);
          String que="select max(bill_no) as b  from bill";
                rs1=s.executeQuery(que);
                while(rs1.next())
                z=rs1.getInt("b");
               System.out.println(z);
                for(int k=1;k<=z;k++){  
                    String query1="select count(*) as c from (select * from (select * from bill where (bill_no= '"+k+"' and (pname in('"+b+"','"+c+"')))) as aa where purchase_date >= GETDATE()-30) as bb ";
                    rs2=s.executeQuery(query1);
                     System.out.println(query1); 
                while(rs2.next())
                    
                    tem=rs2.getInt("c");
               
                temp1=temp1+tem;
                System.out.println(temp1);
                }
            
                    d=(float)temp/temp1;
                    d=d*100;
                    String f=d.toString();
                   
                    jTable4.setValueAt(d, row, 3);
                   
         
               
              }
               }
           
           }
            catch(SQLException sqle){ 
      System.out.println("Sql Exception :"+sqle.getMessage());
   } 
            catch (ClassNotFoundException ex) {
                       Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
                   }
           
       }
        
        if(jRadioButton4.isSelected() && jRadioButton5.isSelected()){
         String g=jTextField1.getText();
       String h=jTextField2.getText();
       int i=jTable3.getRowCount();
           System.out.println(i);
           try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
             // line below needs to be modified to include the database name, user, and password (if any)
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
             Statement s = con.createStatement();
             ResultSet rs,rs1,rs2;
           int temp=0,p=0,temp1=0,z=0,tem=0;
          Float d=0.0f;
           if(i>0){
               for(int row = 0; row<i ; row++){
               String a=(String)jTable3.getValueAt(row,0);
               String b=(String)jTable3.getValueAt(row,1);
               String c=(String)jTable3.getValueAt(row,2);
               Object o[]={a,b,c};
               Object o1[]={b,a,c};
               Object o2[]={c,a,b};
               DefaultTableModel model=(DefaultTableModel)jTable4.getModel(); 
               model.addRow(o);
               model.addRow(o1);
               model.addRow(o2);
            
               }
               int j=jTable4.getRowCount();
               for(int row=0;row<j;row++)
               {
                   String a=(String)jTable4.getValueAt(row,0);
               String b=(String)jTable4.getValueAt(row,1);
               String c=(String)jTable4.getValueAt(row,2);
               
       
            String query="select count(pname) as counts from bill where purchase_date between'"+g+"'and'"+h+"'  and pname='"+a+"'";
          rs=s.executeQuery(query);
         
           while(rs.next())
          temp=rs.getInt("counts");
           System.out.println(temp);
          String que="select max(bill_no) as b  from bill";
                rs1=s.executeQuery(que);
                while(rs1.next())
                z=rs1.getInt("b");
               System.out.println(z);
                for(int k=1;k<=z;k++){  
                    String query1="select count(*) as c from (select * from (select * from bill where (bill_no= '"+k+"' and (pname in('"+b+"','"+c+"')))) as aa where purchase_date between'"+g+"'and'"+h+"') as bb ";
                    rs2=s.executeQuery(query1);
                     System.out.println(query1); 
                while(rs2.next())
                    
                    tem=rs2.getInt("c");
               
                temp1=temp1+tem;
                System.out.println(temp1);
                }
            
                    d=(float)temp/temp1;
                    d=d*100;
                    String f=d.toString();
                    if(d>0 && d<100){
                    jTable4.setValueAt(d, row, 3);
                    }
                    
               
              }
               }
           
           }
            catch(SQLException sqle){ 
      System.out.println("Sql Exception :"+sqle.getMessage());
   } 
            catch (ClassNotFoundException ex) {
                       Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
                   }
           
       
   
        }
        if(jRadioButton4.isSelected() && jRadioButton1.isSelected()){
           int i=jTable3.getRowCount();
           System.out.println(i);
           try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
             // line below needs to be modified to include the database name, user, and password (if any)
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
             Statement s = con.createStatement();
             ResultSet rs,rs1,rs2;
           int temp=0,p=0,temp1=0,z=0,tem=0;
          Float d=0.0f;
           if(i>0){
               for(int row = 0; row<i ; row++){
               String a=(String)jTable3.getValueAt(row,0);
               String b=(String)jTable3.getValueAt(row,1);
               String c=(String)jTable3.getValueAt(row,2);
               Object o[]={a,b,c};
               Object o1[]={b,a,c};
               Object o2[]={c,a,b};
               DefaultTableModel model=(DefaultTableModel)jTable4.getModel(); 
               model.addRow(o);
               model.addRow(o1);
               model.addRow(o2);
            
               }
               int j=jTable4.getRowCount();
               for(int row=0;row<j;row++)
               {
                   String a=(String)jTable4.getValueAt(row,0);
               String b=(String)jTable4.getValueAt(row,1);
               String c=(String)jTable4.getValueAt(row,2);
               
       
            String query="select count(pname) as counts from bill where purchase_date >= GETDATE()-7 and pname='"+a+"'";
          rs=s.executeQuery(query);
         
           while(rs.next())
          temp=rs.getInt("counts");
           System.out.println(temp);
          String que="select max(bill_no) as b  from bill";
                rs1=s.executeQuery(que);
                while(rs1.next())
                z=rs1.getInt("b");
               System.out.println(z);
                for(int k=1;k<=z;k++){  
                    String query1="select count(*) as c from (select * from (select * from bill where (bill_no= '"+k+"' and (pname in('"+b+"','"+c+"')))) as aa where purchase_date >= GETDATE()-7) as bb ";
                    rs2=s.executeQuery(query1);
                     System.out.println(query1); 
                while(rs2.next())
                    
                    tem=rs2.getInt("c");
               
                temp1=temp1+tem;
                System.out.println(temp1);
                }
            
                    d=(float)temp/temp1;
                    d=d*100;
                    String f=d.toString();
                    if(d>0 && d<100){
                    jTable4.setValueAt(d, row, 3);
                    }
                    
               
              }
               }
           
           }
            catch(SQLException sqle){ 
      System.out.println("Sql Exception :"+sqle.getMessage());
   } 
            catch (ClassNotFoundException ex) {
                       Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
                   }
           
       }
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
   jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jLabel3.setVisible(true);
        jButton3.setVisible(true);
        getContentPane().revalidate();
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String k=jTextField1.getText();
       String j=jTextField2.getText();
     
       jScrollPane1.setVisible(true);
        getContentPane().revalidate();
             
  
       Object thres = jComboBox1.getSelectedItem();
  
       
          DefaultTableModel mode2=(DefaultTableModel)jTable1.getModel();
           int rowCount = mode2.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
    mode2.removeRow(i);
}
        
        
            try{
                ResultSet rs,rs1;

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver

                Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
                Statement s = con.createStatement();
                System.out.println("Connected to database !");

                String query="select COUNT(*) as coun, pname from (select * from bill where purchase_date between'"+k+"'and'"+j+"') as te group by pname having COUNT(*)>'"+thres+"'";
                rs=s.executeQuery(query);

                while(rs.next()){
                    //  System.out.println(rs.getInt("pid"));

                    String pname=rs.getString("pname");
                    int quant=Integer.parseInt(rs.getString("coun"));

                    Object o[]={pname,quant};
                    DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
                    model.addRow(o);
                }
                NewJFrame1 x=new NewJFrame1();

            }
            catch(Exception e) {
                e.printStackTrace();

            }
       
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      new  graphical().setVisible(true);

        this.dispose(); 
          
        
        int rows = jTable1.getRowCount();
        try{
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
             // line below needs to be modified to include the database name, user, and password (if any)
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
             Statement s = con.createStatement();
             
             String query="truncate table firstfrequent";
          s.executeQuery(query);
        }catch(SQLException sqle){ 
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   } 
      for(int row = 0; row<rows ; row++){
          String pname =(String)jTable1.getValueAt(row, 0);
          Object count =jTable1.getValueAt(row, 1);
           int quan = (int)count;
           try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
             // line below needs to be modified to include the database name, user, and password (if any)
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
             Statement s = con.createStatement();
             
             String query="insert into firstfrequent values('"+pname+"','"+quan+"')";
          s.executeQuery(query);
         }
            catch(SQLException sqle){ 
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }     
        }
      
      int rows1 = jTable2.getRowCount();
        try{
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
             // line below needs to be modified to include the database name, user, and password (if any)
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
             Statement s = con.createStatement();
             
             String query="truncate table secondfrequent";
          s.executeQuery(query);
        }catch(SQLException sqle){ 
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }
        
         for(int row = 0; row<rows1 ; row++){
          String pname =(String)jTable2.getValueAt(row, 0);
          String pname1 =(String)jTable2.getValueAt(row, 1);
          Object count =jTable2.getValueAt(row, 2);
            double quan = (double)count;
           try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
             // line below needs to be modified to include the database name, user, and password (if any)
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
             Statement s = con.createStatement();
             String query="insert into secondfrequent values('"+pname+"','"+pname1+"','"+quan+"')";
          s.executeQuery(query);
         }
            catch(SQLException sqle){ 
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }     
        }
        
         
               int rows2 = jTable3.getRowCount();
        try{
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
             // line below needs to be modified to include the database name, user, and password (if any)
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
             Statement s = con.createStatement();
             
           //  String query="truncate table thirdfrequent2";
          //s.executeQuery(query);
        }catch(SQLException sqle){ 
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }
        
         for(int row = 0; row<rows2 ; row++){
          String pname =(String)jTable3.getValueAt(row, 0);
          String pname1 =(String)jTable3.getValueAt(row, 1);
          String pname2 =(String)jTable3.getValueAt(row, 2);
          Object count =jTable3.getValueAt(row, 3);
            int quan = (Integer)count;
           try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  // load the driver
             // line below needs to be modified to include the database name, user, and password (if any)
             Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=medical;integratedsecurity=true;");
             Statement s = con.createStatement();
             String query="insert into thirdfrequent values('"+pname+"','"+pname1+"','"+pname2+"','"+quan+"')";
          s.executeQuery(query);
         }
            catch(SQLException sqle){ 
      System.out.println("Sql Exception :"+sqle.getMessage());
   }
   catch(ClassNotFoundException e) {
    System.out.println("Class Not Found Exception :" + e.getMessage());
   }     
        }
         
        
       new graphical().setVisible(true);

        this.dispose(); 
        
        
        
       
            
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
        download d=new download();
        String[] args1 = {};
        d.main(args1);
       }catch (Exception ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try{
        DefaultTableModel dm = new DefaultTableModel(); //Create a default table
	   BufferedReader br = null;
           String line;
           String[] tmp = new String[10];
           String[][] data = new String[10][10];
           String[] columnNames = new String[10];
	  // File out = new File("globalcou.csv");
	   //BufferedWriter bw = new BufferedWriter(new FileWriter(out));
            br = new BufferedReader(new FileReader("C:\\project\\s_globalcount.csv"));
	      line = br.readLine(); //read the 1st line of the csv file.
		//Set the column headers.
		  columnNames = line.split(","); //Convert the contents of the 1st line into a 
						//1-dimensinal array of 10 elements, then save it to the array columnNames[].
                  line = br.readLine(); //start reading into the records.
                  int row = 0;
             while(line != null){
		 tmp = line.split(",");

		   for (int col = 0; col < columnNames.length; ++col){
		       data[row][col] = tmp[col]; //store cells' data to the 2-dimensional array.
   		   }
		 row++;
		 line = br.readLine();
                 
 	      }
             dm.setDataVector(data, columnNames);
             jTable3.setModel(dm);

       } catch (IOException ex) {
            Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    
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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
