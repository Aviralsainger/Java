
package std;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.event.ActionEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Syudentupdate extends javax.swing.JFrame {
/
    public Syudentupdate() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sn = new javax.swing.JTextField();
        sr = new javax.swing.JTextField();
        sc = new javax.swing.JTextField();
        sa = new javax.swing.JTextField();
        sp = new javax.swing.JTextField();
        sf = new javax.swing.JTextField();
        sfee = new javax.swing.JTextField();
        ss = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        suc = new javax.swing.JTextField();
        sur = new javax.swing.JTextField();
        sun = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tsu = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        Record = new javax.swing.JButton();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Student update");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Class");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Phone");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Fathername");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Fees");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); 

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setText("Status");

        delete.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        prev.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        prev.setText("Prev");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel11.setText("name");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel12.setText("Rollno");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setText("Class");

        tsu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "Rollno", "Class", "Phone", "Address", "Fathername", "Fees", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tsuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tsu);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Record.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        Record.setText("Records");
        Record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordActionPerformed(evt);
            }
        });

        print.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(prev)
                            .addComponent(Add))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Edit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(print)
                                .addGap(0, 27, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sfee, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sf, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sa, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sr, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Record)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(sun, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(sur, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(suc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton2)
                                .addGap(122, 122, 122))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(1010, 1010, 1010))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 90, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(suc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(sur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(sun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jButton2)
                            .addComponent(Record))
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addComponent(prev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(sr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(sa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(sf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(sfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete)
                            .addComponent(Edit)
                            .addComponent(Add)
                            .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );

        pack();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
            int c;
       String name=sun.getText();
       String cls=suc.getText();
       String roll=sur.getText();
                  Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root","");
    String sql; 
    PreparedStatement ps;
    
        if(name.equals("") && cls.equals(""))
            {
                
                 sql="select * from  student where  rollno=?" ;
             ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setString(1,roll);
           
           
            }
            else if(name.equals("") && roll.equals(""))
            {
                sql="select * from  student where class=?" ;
             ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setString(1,cls);
            
            
            }
            else if( cls.equals("") && roll.equals(""))
            {
            
                sql="select * from  student where name=?" ;
             ps=(PreparedStatement) con.prepareStatement(sql);
       
            ps.setString(1,name);
           
            
            
            
            }
            else if (name.equals(""))
            {
                sql="select * from  student where rollno=? and class=? " ;
             ps=(PreparedStatement) con.prepareStatement(sql);
           
            ps.setString(1,roll);
            ps.setString(2,cls);
            }
             else if (roll.equals(""))
            {
                 sql="select * from  student where name=?  and class=? " ;
             ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setString(1,name);
            
            ps.setString(2,cls);
            }
             else if (cls.equals(""))
            {
               sql="select * from  student where name=? and rollno=? " ;
             ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,roll);
          
            }
             else
            {
               sql="select * from  student where name=? and rollno=? and class=? " ;
             ps=(PreparedStatement) con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,roll);
            ps.setString(3,cls);
            }
           
        
             ResultSet rs=ps.executeQuery();
             ResultSetMetaData rss=rs.getMetaData();
             DefaultTableModel dm=(DefaultTableModel) tsu.getModel();
             dm.setRowCount(0);
             c=rss.getColumnCount();
             while(rs.next())
             {
             Vector v=new Vector();
             for(int i=1;i<=c;i++)
             {
             v.add(rs.getInt("id"));
             v.add(rs.getString("name"));
             v.add(rs.getString("rollno"));
             v.add(rs.getString("class"));
             v.add(rs.getString("phone"));
             v.add(rs.getString("address"));
             v.add(rs.getString("fname"));
             v.add(rs.getString("fees"));
             v.add(rs.getString("status"));
             
             
             }
             
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
        
        
        
    }

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {
      DefaultTableModel dm=(DefaultTableModel) tsu.getModel();
      int si=tsu.getSelectedRow();
      
                 try {
           PreparedStatement ps;
           int id=Integer.parseInt(dm.getValueAt(si,0).toString());
           
       String stn=sn.getText();
         String stp=sp.getText();
          String stf=sf.getText();
           String stfee=sfee.getText();
            String stc=sc.getText();
             String sts=ss.getText();
               String sta=sa.getText();
                  String str=sr.getText();
            Connection con=null;
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/std","root","");
            ps=(PreparedStatement) con.prepareStatement("update student set name=?,rollno=?,"
                    + "class=?,phone=?,address=?,fname=?,fees=?,status=? where id=?");
             ps.setString(1,stn);
      ps.setString(2,str);
       ps.setString(3,stc);
        ps.setString(4,stp);
         ps.setString(5,sta);
          ps.setString(6,stf);
           ps.setString(7,stfee);
             ps.setString(8,sts);
             ps.setInt(9,id);
          ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"record updated");
           
           sn.setText("");
         sp.setText("");
          sf.setText("");
           sfee.setText("");
           sc.setText("");
             ss.setText("");
               sa.setText("");
                sr.setText("");  
                sn.requestFocus();
          ActionEvent actionPerformed = null;
           actionPerformed=evt;
            RecordActionPerformed(evt);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registation.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(Registation.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_EditActionPerformed

    private void tsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tsuMouseClicked
       DefaultTableModel dm=(DefaultTableModel) tsu.getModel();
      int si=tsu.getSelectedRow();
      sn.setText(dm.getValueAt(si,1).toString());
         sp.setText(dm.getValueAt(si,4).toString());
          sf.setText(dm.getValueAt(si,6).toString());
           sfee.setText(dm.getValueAt(si,7).toString());
           sc.setText(dm.getValueAt(si,3).toString());
             ss.setText(dm.getValueAt(si,8).toString());
               sa.setText(dm.getValueAt(si,5).toString());
                sr.setText(dm.getValueAt(si,2).toString());  
                sn.requestFocus();
      
    }

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {
          DefaultTableModel dm=(DefaultTableModel) tsu.getModel();
      int si=tsu.getSelectedRow();
       PreparedStatement ps;
         Connection con=null;
       try {
           
           int id=Integer.parseInt(dm.getValueAt(si,0).toString());
            int DialogResult=JOptionPane.showConfirmDialog(null,"Do you want to delete the record","Warning",JOptionPane.YES_NO_OPTION);
            if(DialogResult==JOptionPane.YES_OPTION)
            {
            
            
            Class.forName("com.mysql.jdbc.Driver");
            con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/std","root","");
            ps=(PreparedStatement) con.prepareStatement("delete from student where id=?");
          
             ps.setInt(1,id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"record ddeleted");
             sn.setText("");
         sp.setText("");
          sf.setText("");
           sfee.setText("");
           sc.setText("");
             ss.setText("");
               sa.setText("");
                sr.setText("");  
                sn.requestFocus();
            }}
            catch (ClassNotFoundException ex) {
            Logger.getLogger(Registation.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(Registation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void RecordActionPerformed(java.awt.event.ActionEvent evt) {
  int c;
      
                  Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root","");
    String sql="select * from  student order by id " ;  
    PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
   
        
             ResultSet rs=ps.executeQuery();
             ResultSetMetaData rss=rs.getMetaData();
             DefaultTableModel dm=(DefaultTableModel) tsu.getModel();
             dm.setRowCount(0);
             c=rss.getColumnCount();
             while(rs.next())
             {
             Vector v=new Vector();
             for(int i=1;i<=c;i++)
             {
             v.add(rs.getInt("id"));
             v.add(rs.getString("name"));
             v.add(rs.getString("rollno"));
             v.add(rs.getString("class"));
             v.add(rs.getString("phone"));
             v.add(rs.getString("address"));
             v.add(rs.getString("fname"));
             v.add(rs.getString("fees"));
             v.add(rs.getString("status"));
             
             
             }
             
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
        
        
    }/
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {
        String stn=sn.getText();
         String stp=sp.getText();
          String stf=sf.getText();
           String stfee=sfee.getText();
            String stc=sc.getText();
             String sts=ss.getText();
               String sta=sa.getText();
                  String str=sr.getText();
                  Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root","");
    String sql="INSERT INTO student(name,rollno,class,phone,address,fname,fees,status) VALUES (?,?,?,?,?,?,?,?)" ;  
    PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
    ps.setString(1,stn);
      ps.setString(2,str);
       ps.setString(3,stc);
        ps.setString(4,stp);
         ps.setString(5,sta);
          ps.setString(6,stf);
           ps.setString(7,stfee);
             ps.setString(8,sts);
             ps.executeUpdate();
            
             JOptionPane.showMessageDialog(null,"you have success fully registerd");
            
          
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

    private void prevActionPerformed(java.awt.event.ActionEvent evt) {
      dispose();
    }//GEN-LAST:event_prevActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {
          String stn=sn.getText();
         String stp=sp.getText();
          String stf=sf.getText();
           String stfee=sfee.getText();
        
        
        String s="";
        s=s+"\t Student name "+stn+"\r\n*************************\r\n"+"\n\n"+"\n\t student fees"+stfee;
        
        
        
        new Feereceipt(s).setVisible(true);
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
            java.util.logging.Logger.getLogger(Syudentupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Syudentupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Syudentupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Syudentupdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Syudentupdate().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton Add;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Record;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton prev;
    private javax.swing.JButton print;
    private javax.swing.JTextField sa;
    private javax.swing.JTextField sc;
    private javax.swing.JTextField sf;
    private javax.swing.JTextField sfee;
    private javax.swing.JTextField sn;
    private javax.swing.JTextField sp;
    private javax.swing.JTextField sr;
    private javax.swing.JTextField ss;
    private javax.swing.JTextField suc;
    private javax.swing.JTextField sun;
    private javax.swing.JTextField sur;
    private javax.swing.JTable tsu;
    // End of variables declaration//GEN-END:variables
}
