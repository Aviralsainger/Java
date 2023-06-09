
package std;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;


public class Attendence extends javax.swing.JFrame {
JRadioButton jRadioButton1; 
 JRadioButton jRadioButton2; 
  
    public Attendence() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sat = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jd = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        sun = new javax.swing.JTextField();
        sur = new javax.swing.JTextField();
        suc = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sr = new javax.swing.JLabel();
        sn = new javax.swing.JLabel();
        si3 = new javax.swing.JLabel();
        si4 = new javax.swing.JLabel();
        p = new javax.swing.JCheckBox();
        Edit = new javax.swing.JButton();
        sc = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setText("Student Attendence");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "rollno", "name", "class", "Total classes", "absent", "Attendence%", "attensence"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        sat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                satMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sat);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Prev");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("name");

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Rollno");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Class");

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Roll no");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Class");

        sr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        sn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        si3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        si4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        si4.setText("Attendence");

        p.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        p.setText("pesent");
        p.setActionCommand("");
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        sc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 532, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(29, 29, 29)
                        .addComponent(sun, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(57, 57, 57)
                        .addComponent(sur, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel14)
                        .addGap(32, 32, 32)
                        .addComponent(suc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Edit)
                                    .addComponent(si3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jd, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(sr, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(si4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(p)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(sun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(37, 37, 37)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jd, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sr, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(si3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(si4)
                            .addComponent(p))
                        .addGap(50, 50, 50)
                        .addComponent(Edit)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4)
                            .addComponent(jButton6)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//int c;
      
                  Connection con=null,con1,con2;
                  PreparedStatement ps,pl,pl1;
                    String sql,sql1,sql2;
                      ResultSet rs,rp,rp1;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root","");
     sql="select id ,name,rollno,class from  student order by id" ;  
     ps=(PreparedStatement) con.prepareStatement(sql);
   
        
             rs=ps.executeQuery();
            // ResultSetMetaData rss=rs.getMetaData();
             DefaultTableModel dm=(DefaultTableModel) sat.getModel();
             dm.setRowCount(0);
             //c=rss.getColumnCount();
           
             while(rs.next())
             {
             Vector v=new Vector();
           
             v.add(rs.getInt("id"));
             v.add(rs.getString("name"));
             v.add(rs.getString("rollno"));
             v.add(rs.getString("class"));
              con1=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root","");
            sql1="select count(distinct date) as cou from attendence where  id=? " ; 
              pl=(PreparedStatement) con1.prepareStatement(sql1);
              pl.setInt(1,rs.getInt("id"));
             rp=pl.executeQuery();
             int k=1;
             while(rp.next())
             {
                 k=rp.getInt("cou");
             v.add(rp.getInt("cou"));
             
            
             }
             rp.close();
              con2=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root","");
            sql2="select count(distinct date) as absent from attendence where  id=? and status=?" ; 
              pl1=(PreparedStatement) con2.prepareStatement(sql2);
              pl1.setInt(1,rs.getInt("id"));
               pl1.setInt(2,0);
             rp1=pl1.executeQuery();
              while(rp1.next())
             {
                 int d=rp1.getInt("absent");
             v.add(rp1.getInt("absent"));
              v.add((float)((k-d)/(float)k)*100);
             
            
             }
               rp1.close();
             
             
             
             
             
             
             
             
             
             
             dm.addRow(v);
             
             
             }
            rs.close(); 
        }
        catch (ClassNotFoundException ex)
        {
          System.out.println("class exception");
        }
        catch(SQLException ex)
        {
         System.out.println("sql exception"+ex.getMessage());
        }         
        
        
        
        
        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Connection con=null;
                  PreparedStatement ps;
                    String sql;
                      ResultSet rs;
                    DefaultTableModel dm=(DefaultTableModel) sat.getModel();
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root","");
        for(int i=0;i<dm.getRowCount();i++)
        {
             
       int id,c=1;
       id= (int) dm.getValueAt(i,0);
        String rollno=dm.getValueAt(i,1).toString();
         String name=dm.getValueAt(i,2).toString();
         String cls=dm.getValueAt(i,3).toString();
        sql="INSERT INTO attendence VALUES (?,?,?,?,?,?)" ;  
        if(dm.getValueAt(i,7)==null)
        {
          
      
           c=0; 
            
      
        }
      
         ps=(PreparedStatement) con.prepareStatement(sql);
   ps.setInt(1,id);
      ps.setString(2,rollno);
       ps.setString(3,name);
        ps.setInt(6,c);
        Date datee=jd.getDate();
         if(datee==null )
        {
            
            JOptionPane.showMessageDialog(null,"please enter the date");  
        
        }
         DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        String date = fmt.format(this.jd.getDate());
        System.out.println("jay"+jd.getDate());
       
           ps.setString(5,date);
          ps.setString(4,cls);
        
             ps.executeUpdate();
            
        
        }
          JOptionPane.showMessageDialog(null,"successfully submited");
        } 
         catch (ClassNotFoundException ex)
        {
          System.out.println("class exception");
        }
        catch(SQLException ex)
        {
         System.out.println("sql exception"+ex.getMessage());
        }   
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int c;
        String name=sun.getText();
        String cls=suc.getText();
        String roll=sur.getText();
        PreparedStatement ps;
        Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root","");
            if(name.equals("") && cls.equals(""))
            {
                
                String sql="select * from  student where  rollno=?" ;
             ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setString(1,roll);
           
           
            }
            else if(name.equals("") && roll.equals(""))
            {
                String sql="select * from  student where class=?" ;
             ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setString(1,cls);
            
            
            }
            else if( cls.equals("") && roll.equals(""))
            {
            
                String sql="select * from  student where name=?" ;
             ps=(PreparedStatement) con.prepareStatement(sql);
       
            ps.setString(1,name);
           
            
            
            
            }
            else if (name.equals(""))
            {
                String sql="select * from  student where rollno=? and class=? " ;
             ps=(PreparedStatement) con.prepareStatement(sql);
           
            ps.setString(1,roll);
            ps.setString(2,cls);
            }
             else if (roll.equals(""))
            {
                String sql="select * from  student where name=?  and class=? " ;
             ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setString(1,name);
            
            ps.setString(2,cls);
            }
             else if (cls.equals(""))
            {
                String sql="select * from  student where name=? and rollno=? " ;
             ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,roll);
          
            }
             else
            {
                String sql="select * from  student where name=? and rollno=? and class=? " ;
             ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,roll);
            ps.setString(3,cls);
            }
           
            
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData rss=rs.getMetaData();
            DefaultTableModel dm=(DefaultTableModel) sat.getModel();
            dm.setRowCount(0);
            c=rss.getColumnCount();
            while(rs.next())
            {
                Vector v=new Vector();
              
                    v.add(rs.getInt("id"));
                   
                    v.add(rs.getString("rollno"));
                     v.add(rs.getString("name"));
                    v.add(rs.getString("class"));
                   

                

                dm.addRow(v);

            }

        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("class exception");
        }
        catch(SQLException ex)
        {
            System.out.println("sql exception"+ex.getMessage());
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        DefaultTableModel dm=(DefaultTableModel) sat.getModel();
        dm.setRowCount(0);
         sun.setText("");
        suc.setText("");
        sur.setText("");
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void satMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_satMouseClicked
        DefaultTableModel dm=(DefaultTableModel) sat.getModel();
      int si=sat.getSelectedRow();
      sr.setText(dm.getValueAt(si,1).toString());
        
           sc.setText(dm.getValueAt(si,3).toString());
            
                sn.setText(dm.getValueAt(si,2).toString());  
                sn.requestFocus();
    }//GEN-LAST:event_satMouseClicked

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
       
        DefaultTableModel dm=(DefaultTableModel) sat.getModel();
    
      
                 try {
           PreparedStatement ps;
           
           int k=0;
       String stn=sn.getText();
         String str=sr.getText();
        String stc=sc.getText();
            Connection con=null;
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/std","root","");
            ps=(PreparedStatement) con.prepareStatement("update attendence set status=? where rollno=? and  name=?");
            if(p.isSelected())
            {
            k=1;
            }
            
             ps.setString(2,str);
      ps.setString(3,stn);
       ps.setInt(1,k);
      
       
       
       
          ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"record updated");
           p.setSelected(false);
           sn.setText("");
        
           sc.setText("");
            
                sr.setText("");  
                sn.requestFocus();
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registation.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(Registation.class.getName()).log(Level.SEVERE, null, ex);
        }      
        
        
        
        
        
    }//GEN-LAST:event_EditActionPerformed

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
        
        
        
        
        
    }
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jd;
    private javax.swing.JCheckBox p;
    private javax.swing.JTable sat;
    private javax.swing.JLabel sc;
    private javax.swing.JLabel si3;
    private javax.swing.JLabel si4;
    private javax.swing.JLabel sn;
    private javax.swing.JLabel sr;
    private javax.swing.JTextField suc;
    private javax.swing.JTextField sun;
    private javax.swing.JTextField sur;
   
}
