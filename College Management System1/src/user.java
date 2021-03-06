/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shreya Sawant
 */
public class user extends javax.swing.JFrame {

    /**
     * Creates new form user
     */
    public user() {
        initComponents();
        Connect();
        User_Load();
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel d;

    public void Connect()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/collegemanagement","root","");
        }catch(ClassNotFoundException ex){
            Logger.getLogger(user.class.getName()).log(Level.SEVERE,null,ex);
        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void User_Load()
    {
        int c;
        try {
            pst =con.prepareStatement("select * from user");
            rs=pst.executeQuery();


            ResultSetMetaData rsd =rs.getMetaData();
            c = rsd.getColumnCount();
            d=(DefaultTableModel)jTable1.getModel();
            d.setRowCount(0);

            while(rs.next())
            {
                Vector v2 =new Vector();

                for(int i=1; i<=c;i++){
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("phone"));
                    v2.add(rs.getString("address"));
                    v2.add(rs.getString("uname"));
                    v2.add(rs.getString("utype"));

                }
                d.addRow(v2);
            }


        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }








    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtuname = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        txtutype = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Phone");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("User Type");

        txtuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunameActionPerformed(evt);
            }
        });

        txtutype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Teacher", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtpass, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtuname, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtutype, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtphone)
                                        .addComponent(txtaddress))
                                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel5))
                                        .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(txtutype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Name", "Phone", "Address", "Username", "User Type"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("User Creation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addComponent(jLabel7)))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void txtunameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // TODO add your handling code here:
            String name = txtname.getText();
            String phone =txtphone.getText();
            String address =txtaddress.getText();
            String uname =txtuname.getText();
            String password=txtpass.getText();
            String utype= txtutype.getSelectedItem().toString();

            pst =con.prepareStatement("insert into user(name,phone,address,uname,password,utype)values(?,?,?,?,?,?)");
            pst.setString(1,name);
            pst.setString(2,phone);
            pst.setString(3,address);
            pst.setString(4,uname);
            pst.setString(5,password);
            pst.setString(6,utype);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"User Added");

            txtname.setText("");
            txtphone.setText("");
            txtaddress.setText("");
            txtuname.setText("");
            txtpass.setText("");
            txtutype.setSelectedIndex(-1);
            txtname.requestFocus();
            User_Load();


        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        d =(DefaultTableModel)jTable1.getModel();
        int selectIndex =jTable1.getSelectedRow();

        String id =d.getValueAt(selectIndex,0).toString();
        txtname.setText(d.getValueAt(selectIndex,1).toString());
        txtphone.setText(d.getValueAt(selectIndex,2).toString());
        txtaddress.setText(d.getValueAt(selectIndex,3).toString());
        txtuname.setText(d.getValueAt(selectIndex,4).toString());
        txtutype.setSelectedItem(d.getValueAt(selectIndex,5).toString());

        jButton1.setEnabled(false);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        try {
            // ODO add your handling code here:

            d =(DefaultTableModel)jTable1.getModel();
            int selectIndex =jTable1.getSelectedRow();

            String id =d.getValueAt(selectIndex,0).toString();

            String name = txtname.getText();
            String phone =txtphone.getText();
            String address =txtaddress.getText();
            String uname =txtuname.getText();
            String password=txtpass.getText();
            String utype= txtutype.getSelectedItem().toString();

            pst =con.prepareStatement("update user set name =?,phone=?,address=?,uname=?,utype=? where id=?");
            pst.setString(1,name);
            pst.setString(2,phone);
            pst.setString(3,address);
            pst.setString(4,uname);
            pst.setString(5,utype);
            pst.setString(6,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"User Edited");
            jButton1.setEnabled(true);
            txtname.setText("");
            txtphone.setText("");
            txtaddress.setText("");
            txtuname.setText("");
            txtpass.setText("");
            txtutype.setSelectedIndex(-1);
            txtname.requestFocus();
            User_Load();


        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }






    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        jButton1.setEnabled(true);
        txtname.setText("");
        txtphone.setText("");
        txtaddress.setText("");
        txtuname.setText("");
        txtpass.setText("");
        txtutype.setSelectedIndex(-1);
        txtname.requestFocus();
        User_Load();

    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {


        try {
            // ODO add your handling code here:


            d =(DefaultTableModel)jTable1.getModel();
            int selectIndex =jTable1.getSelectedRow();

            String id =d.getValueAt(selectIndex,0).toString();



            pst =con.prepareStatement("delete from user where id =?");

            pst.setString(1,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"User Deleted ");
            jButton1.setEnabled(true);
            txtname.setText("");
            txtphone.setText("");
            txtaddress.setText("");
            txtuname.setText("");
            txtpass.setText("");
            txtutype.setSelectedIndex(-1);
            txtname.requestFocus();
            User_Load();


        } catch (SQLException ex) {
            Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        this.setVisible(false);



    }


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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtuname;
    private javax.swing.JComboBox<String> txtutype;
    // End of variables declaration
}
