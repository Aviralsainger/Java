
package std;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Teacher extends javax.swing.JFrame {

    
    public Teacher() {
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        ts = new javax.swing.JTextField();
        ti = new javax.swing.JTextField();
        tp = new javax.swing.JTextField();
        tj = new javax.swing.JTextField();
        ta = new javax.swing.JTextField();
        tn = new javax.swing.JTextField();
        td = new javax.swing.JTextField();
        tsts = new javax.swing.JTextField();
        tl = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ttu = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tui = new javax.swing.JTextField();
        tun = new javax.swing.JTextField();
        Record = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tsal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tpay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel1.setText("Teacher Record");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel3.setText("Last School");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel4.setText("Joining Date");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel5.setText("Phon");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel6.setText("subjects");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel7.setText("Father name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel8.setText("Degree");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel9.setText("Id");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel10.setText("Address");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel11.setText("salary");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14));  
        jLabel12.setText("name");

        search.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jButton3.setText("Prev");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        ttu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "Degree", "Address", "Joining", "phon", "Subject", "Fname", "Lastschool", "salary", "payment", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ttu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ttuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ttu);

        delete.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel14.setText("Id");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel13.setText("name");

        Record.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        Record.setText("Record");
        Record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel15.setText("payment");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel16.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel7))
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ts, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tj, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(td, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tn, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ti, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Add)
                        .addGap(14, 14, 14)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tsts, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tpay, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tsal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(tui, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(tun, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(search)
                        .addContainerGap(273, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(Record, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(1152, 1152, 1152)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(tui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(ti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(tn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(td, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(ta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(ts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(tpay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tsts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(Add)
                            .addComponent(jButton2)
                            .addComponent(delete))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(Record)
                    .addContainerGap(496, Short.MAX_VALUE)))
        );

        pack();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
    new Registation().setVisible(true);
    dispose();
    }

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {
 String ttn=tn.getText();
         String ttp=tp.getText();
          String ttf=tf.getText();
           String ttsal=tsal.getText();
            String ttsts=tsts.getText();
             String tts=ts.getText();
               String tta=ta.getText();
                  String ttpay=tpay.getText();
                    String ttj=tj.getText();
                      String ttd=td.getText();
                        String ttl=tl.getText();
                          int id=Integer.parseInt(ti.getText());
                  Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root","");

    String sql="INSERT INTO teacher(id,name,degree,address,joiningdate,phon,subject,fname,lastschool,salary,payment,status) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)" ;  
    PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
    ps.setInt(1,id);
      ps.setString(2,ttn);
       ps.setString(3,ttd);
        ps.setString(4,tta);
         ps.setString(5,ttj);
          ps.setString(6,ttp);
           ps.setString(7,tts);
             ps.setString(8,ttf);
              ps.setString(9,ttl);
               ps.setString(10,ttsal);
                ps.setString(11,ttpay);
                 ps.setString(12,ttsts);
             
             ps.executeUpdate();
            
             JOptionPane.showMessageDialog(null,"you have success fully registerd");
            
           RecordActionPerformed(evt);
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

    private void RecordActionPerformed(java.awt.event.ActionEvent evt) {
      
                  Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root","");
    String sql="select * from  teacher order by id " ;  
    PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
   
        
             ResultSet rs=ps.executeQuery();
             ResultSetMetaData rss=rs.getMetaData();
             DefaultTableModel dm=(DefaultTableModel) ttu.getModel();
             dm.setRowCount(0);
             c=rss.getColumnCount();
             while(rs.next())
             {
             Vector v=new Vector();
             for(int i=1;i<=c;i++)
             {
             v.add(rs.getInt("id"));
             v.add(rs.getString("name"));
             v.add(rs.getString("degree"));
             v.add(rs.getString("address"));
              v.add(rs.getString("joiningdate"));
           
             v.add(rs.getString("phon"));
               v.add(rs.getString("subject"));
             v.add(rs.getString("fname"));
             v.add(rs.getString("lastschool"));
              v.add(rs.getString("salary"));
              v.add(rs.getString("payment"));
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

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {
         int c;
       String name=tun.getText();
       int id=Integer.parseInt(tui.getText());
      
                  Connection con=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root","");
    String sql="select * from  teacher where id=? or name=?" ;  
    PreparedStatement ps=(PreparedStatement) con.prepareStatement(sql);
    ps.setInt(1,id);
      ps.setString(2,name);
    
    
        
             ResultSet rs=ps.executeQuery();
             ResultSetMetaData rss=rs.getMetaData();
             DefaultTableModel dm=(DefaultTableModel) ttu.getModel();
             dm.setRowCount(0);
             c=rss.getColumnCount();
             while(rs.next())
             {
             Vector v=new Vector();
             for(int i=1;i<=c;i++)
             {
            v.add(rs.getInt("id"));
             v.add(rs.getString("name"));
             v.add(rs.getString("degree"));
             v.add(rs.getString("address"));
              v.add(rs.getString("joiningdate"));
           
             v.add(rs.getString("phon"));
               v.add(rs.getString("subject"));
             v.add(rs.getString("fname"));
             v.add(rs.getString("lastschool"));
              v.add(rs.getString("salary"));
              v.add(rs.getString("payment"));
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel dm=(DefaultTableModel) ttu.getModel();
      int si=ttu.getSelectedRow();
      
                 try {
           PreparedStatement ps;
      //     int id=Integer.parseInt(dm.getValueAt(si,0).toString());
       String ttn=tn.getText();
         String ttp=tp.getText();
          String ttf=tf.getText();
           String ttsal=tsal.getText();
            String ttsts=tsts.getText();
             String tts=ts.getText();
               String tta=ta.getText();
                  String ttpay=tpay.getText();
                    String ttj=tj.getText();
                      String ttd=td.getText();
                        String ttl=tl.getText();
                          int id=Integer.parseInt(ti.getText());
            Connection con=null;
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/std","root","");
            ps=(PreparedStatement) con.prepareStatement("update teacher set name=?,"
                    + "degree=?,address=?,joiningdate=?,phon=?,subject=?"
                    + ",fname=?,lastschool=?,salary=?,payment=?,status=? where id=?");
             ps.setString(1,ttn);
      ps.setString(2,ttd);
       ps.setString(3,tta);
        ps.setString(4,ttj);
         ps.setString(5,ttp);
          ps.setString(6,tts);
           ps.setString(7,ttf);
             ps.setString(8,ttl);
              ps.setString(9,ttsal);
               ps.setString(10,ttpay);
                ps.setString(11,ttsts);
             ps.setInt(12,id);
          ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"record updated");
           
           tn.setText("");
         tp.setText("");
          tf.setText("");
           tsal.setText("");
           tsts.setText("");
             ts.setText("");
               ta.setText("");
                tl.setText(""); 
                ti.setText("");  
                tpay.setText("");  
                td.setText("");  
                tj.setText("");  
                tn.requestFocus();
           RecordActionPerformed(evt);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registation.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(Registation.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }

    private void ttuMouseClicked(java.awt.event.MouseEvent evt) {
        DefaultTableModel dm=(DefaultTableModel) ttu.getModel();
      int si=ttu.getSelectedRow();
      tn.setText(dm.getValueAt(si,1).toString());
         tp.setText(dm.getValueAt(si,5).toString());
          tf.setText(dm.getValueAt(si,7).toString());
           tsal.setText(dm.getValueAt(si,9).toString());
           tl.setText(dm.getValueAt(si,8).toString());
             ts.setText(dm.getValueAt(si,6).toString());
               tsts.setText(dm.getValueAt(si,11).toString());
                ti.setText(dm.getValueAt(si,0).toString());  
                 tpay.setText(dm.getValueAt(si,10).toString());  
                  tj.setText(dm.getValueAt(si,4).toString());  
                   td.setText(dm.getValueAt(si,2).toString());  
                    ta.setText(dm.getValueAt(si,3).toString());  
                tn.requestFocus();
                
                
                
                
                
                
                
                
                
                
    }//GEN-LAST:event_ttuMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel dm=(DefaultTableModel) ttu.getModel();
      int si=ttu.getSelectedRow();
       PreparedStatement ps;
         Connection con=null;
       try {
           
           int id=Integer.parseInt(dm.getValueAt(si,0).toString());
            int DialogResult=JOptionPane.showConfirmDialog(null,"Do you want to delete the record","Warning",JOptionPane.YES_NO_OPTION);
            if(DialogResult==JOptionPane.YES_OPTION)
            {
            
            
            Class.forName("com.mysql.jdbc.Driver");
            con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/std","root","");
            ps=(PreparedStatement) con.prepareStatement("delete from teacher where id=?");
          
             ps.setInt(1,id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"record ddeleted");
            tn.setText("");
         tp.setText("");
          tf.setText("");
           tsal.setText("");
           tsts.setText("");
             ts.setText("");
               ta.setText("");
                tl.setText(""); 
                ti.setText("");  
                tpay.setText("");  
                td.setText("");  
                tj.setText("");  
                tn.requestFocus();
            }}
            catch (ClassNotFoundException ex) {
            Logger.getLogger(Registation.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(Registation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Record;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JTextField ta;
    private javax.swing.JTextField td;
    private javax.swing.JTextField tf;
    private javax.swing.JTextField ti;
    private javax.swing.JTextField tj;
    private javax.swing.JTextField tl;
    private javax.swing.JTextField tn;
    private javax.swing.JTextField tp;
    private javax.swing.JTextField tpay;
    private javax.swing.JTextField ts;
    private javax.swing.JTextField tsal;
    private javax.swing.JTextField tsts;
    private javax.swing.JTable ttu;
    private javax.swing.JTextField tui;
    private javax.swing.JTextField tun;
    // End of variables declaration//GEN-END:variables

}
