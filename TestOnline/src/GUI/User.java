/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.Class_pjDAO;
import DAO.UserDAO;
import DAO.alert_messager;
import DTO.Class_pjDTO;
import DTO.UserDTO;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author Administrator
 */
public class User extends javax.swing.JInternalFrame {

    /**
     * Creates new form User1
     */
    private DefaultTableModel model = null;
    private int selectedRow = -1;
    private final UserDAO userdao;
    alert_messager alt = new alert_messager();
    private static final Log log = LogFactory.getLog(Login.class); 

    public User() {
        initComponents();
        model = new DefaultTableModel(null, new Object[]{"matk", "hoten", "ngayshinh", "diachi", "namhoc",
            "sdt", "email", "username", "pass", "malophoc", "quyen"});
        tbluser.setModel(model);
        this.userdao = new UserDAO();
        loaddata(); // load giu lieu len table khi dang nhap
        loadPermissionToCBO();// load permision to combox
        loadClassIDToCBO();//load malophoc len combox

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnUsergood = new javax.swing.JPanel();
        pnuser = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtiduser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        datechbirthday = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtyearschool = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtsearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnrefresh = new javax.swing.JButton();
        cbquyen = new javax.swing.JComboBox<>();
        cbClassID = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbluser = new javax.swing.JTable();
        panelUser = new javax.swing.JPanel();

        setBackground(new java.awt.Color(253, 241, 203));
        setMinimumSize(new java.awt.Dimension(1350, 685));
        setPreferredSize(new java.awt.Dimension(1350, 685));
        setVisible(true);

        pnUsergood.setPreferredSize(new java.awt.Dimension(1350, 551));
        pnUsergood.setLayout(new java.awt.BorderLayout());

        pnuser.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnuser.setPreferredSize(new java.awt.Dimension(1150, 170));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("User ID");

        txtiduser.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Class");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Name");

        txtname.setMaximumSize(new java.awt.Dimension(6, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Adress");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Username");

        txtusername.setMaximumSize(new java.awt.Dimension(6, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Phone");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Email");

        txtphone.setMaximumSize(new java.awt.Dimension(6, 20));

        txtemail.setMaximumSize(new java.awt.Dimension(6, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Permission");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Birthday");

        btnAdd.setForeground(new java.awt.Color(102, 102, 102));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494188840_flat-style-circle-add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnupdate.setForeground(new java.awt.Color(102, 102, 102));
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494135526_compose.png"))); // NOI18N
        btnupdate.setText("Edit");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setForeground(new java.awt.Color(102, 102, 102));
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494188946_flat-style-circle-delete-trash.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("year schl");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Pass");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494189020_icon-111-search.png"))); // NOI18N

        jLabel27.setForeground(new java.awt.Color(255, 0, 51));
        jLabel27.setText("(*)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtsearch)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("(*)");

        jLabel17.setForeground(new java.awt.Color(255, 0, 51));
        jLabel17.setText("(*)");

        jLabel18.setForeground(new java.awt.Color(255, 0, 51));
        jLabel18.setText("(*)");

        jLabel19.setForeground(new java.awt.Color(255, 0, 51));
        jLabel19.setText("(*)");

        jLabel20.setForeground(new java.awt.Color(255, 0, 51));
        jLabel20.setText("(*)");

        jLabel21.setForeground(new java.awt.Color(255, 0, 51));
        jLabel21.setText("(*)");

        jLabel22.setForeground(new java.awt.Color(255, 0, 51));
        jLabel22.setText("(*)");

        jLabel23.setForeground(new java.awt.Color(255, 0, 51));
        jLabel23.setText("(*)");

        jLabel24.setForeground(new java.awt.Color(255, 0, 51));
        jLabel24.setText("(*)");

        jLabel25.setForeground(new java.awt.Color(255, 0, 51));
        jLabel25.setText("(*)");

        btnrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        cbquyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--" }));

        cbClassID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));
        cbClassID.setMaximumSize(new java.awt.Dimension(70, 20));

        javax.swing.GroupLayout pnuserLayout = new javax.swing.GroupLayout(pnuser);
        pnuser.setLayout(pnuserLayout);
        pnuserLayout.setHorizontalGroup(
            pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnuserLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnuserLayout.createSequentialGroup()
                        .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addGap(32, 32, 32)
                        .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtiduser, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(pnuserLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)))
                        .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnuserLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(datechbirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnuserLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnuserLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(pnuserLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel16)))
                        .addGap(24, 24, 24)
                        .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txtaddress)))
                    .addGroup(pnuserLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtyearschool)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnuserLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbquyen, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnuserLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbClassID, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel23))
                .addGap(33, 33, 33)
                .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnuserLayout.createSequentialGroup()
                        .addComponent(btnrefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnuserLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btndelete, btnrefresh, btnupdate});

        pnuserLayout.setVerticalGroup(
            pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnuserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnuserLayout.createSequentialGroup()
                        .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtiduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addComponent(datechbirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel22)
                                .addComponent(jLabel7)
                                .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel25)
                                .addComponent(jLabel6)
                                .addComponent(cbClassID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23)))
                        .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnuserLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel13)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel16)))
                            .addGroup(pnuserLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel14)
                                    .addComponent(cbquyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))))
                        .addGap(18, 18, 18)
                        .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel8)
                            .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(txtyearschool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addGroup(pnuserLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndelete)
                            .addComponent(btnupdate)
                            .addComponent(btnAdd)
                            .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(68, 68, 68))
        );

        pnuserLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btndelete, btnrefresh, btnupdate});

        pnUsergood.add(pnuser, java.awt.BorderLayout.PAGE_START);

        tbluser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdUser", "Name", "Birthday", "Address", "Year School", "Phone", "Email", "User name", "password", "ID Class", "Permission", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbluser.setPreferredSize(new java.awt.Dimension(1150, 390));
        tbluser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbluserMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbluser);

        pnUsergood.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnUsergood, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout panelUserLayout = new javax.swing.GroupLayout(panelUser);
        panelUser.setLayout(panelUserLayout);
        panelUserLayout.setHorizontalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        panelUserLayout.setVerticalGroup(
            panelUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(panelUser, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String username = this.txtusername.getText();
        String name = this.txtname.getText();
        String address = this.txtaddress.getText();
        /*Doan code covert int to String*/
        int yearschool = 0;
        try {
            yearschool = Integer.parseInt(this.txtyearschool.getText().trim());
        } catch (NumberFormatException e) {
            log.error(e.toString());
        }
        /*Doan code covert int to String*/
        String phone = this.txtphone.getText();
        String email = this.txtemail.getText();
        String password = this.txtpass.getText();
        //command.setString(2, MDI_Java_md5.md5(txtPass.getText()));

        //xu ly ten lop hoc ve ma lop hoc
        String ml = cbClassID.getSelectedItem().toString();
        String malop = Class_pjDAO.getMaLophoc(ml);
        String permission = this.cbquyen.getSelectedItem().toString();
        /*convert Util date to SQL date*/
        java.sql.Date dt = null;
        try {
            dt = new java.sql.Date(this.datechbirthday.getDate().getTime());
        } catch (Exception e) {
            log.error(e.toString());
        }
        /*convert Util date to SQL date*/
        UserDTO userdto = new UserDTO(name, dt, address, yearschool, phone, email, username, password, malop, permission);
        if (username.isEmpty()) {
            alt.alter("Username is empty");
        } else {
            if (UserDAO.CheckUsernameExists(username) == true) {
                alt.alter("Username already Exists");
            } else {
                if (permission.equals("--select--") || ml.equals("--Select--")) {
                    alt.alter("You have to selec all combobox before Add");
                } else {
                    boolean isAdddUser = this.userdao.inserUser(userdto);
                    if (isAdddUser) {
                        alt.alter("Add Successed");
                        refreshUser();
                        loaddata();
                    } else {
                        alt.alter("Add Not Success");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tbluserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbluserMouseClicked
        // su kien lich chuot vao table hien thi thong tin len textfile
        try {

            // get text tu bang 
            int row = tbluser.getSelectedRow();
            int iduser = (Integer) model.getValueAt(row, 0);
            String name = (String) model.getValueAt(row, 1);
            Date birthday = (Date) model.getValueAt(row, 2);
            String address = (String) model.getValueAt(row, 3);
            int yearshool = (Integer) model.getValueAt(row, 4);
            String phone = (String) model.getValueAt(row, 5);
            String email = (String) model.getValueAt(row, 6);
            String username = (String) model.getValueAt(row, 7);
            String password = (String) model.getValueAt(row, 8);
            String idcalss_pj = (String) model.getValueAt(row, 9);
            String permission = (String) model.getValueAt(row, 10);
            // xet text len cac o text fild
            txtiduser.setText(String.valueOf(iduser));
            txtname.setText(name);
            datechbirthday.setDate(birthday);
            txtaddress.setText(address);
            txtyearschool.setText(String.valueOf(yearshool));
            txtphone.setText(phone);
            txtemail.setText(email);
            txtusername.setText(username);
            txtpass.setText(password);
            cbClassID.setSelectedItem(idcalss_pj);
            cbquyen.setSelectedItem(permission);
        } catch (Exception e) {
            log.error(e.toString());
        }

        selectedRow = this.tbluser.getSelectedRow();
    }//GEN-LAST:event_tbluserMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:       
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please selecte a row want to update");
        } else {
            UserDTO dto = new UserDTO();
            dto.setIduser(Integer.valueOf(txtiduser.getText()));
            dto.setName(txtname.getText());
            /*convert Util date to SQL date*/
            java.sql.Date dt = null;
            try {
                dt = new java.sql.Date(this.datechbirthday.getDate().getTime());
            } catch (Exception e) {
                log.error(e.toString());
            }
            dto.setBirthday(dt);
            /*convert Util date to SQL date*/
            dto.setAddress(txtaddress.getText());
            dto.setYearschool(Integer.valueOf(txtyearschool.getText()));
            dto.setPhone(txtphone.getText());
            dto.setEmail(txtemail.getText());
            dto.setUsername(txtusername.getText());
            dto.setPassword(txtpass.getText());
            //xu ly ten lop hoc ve ma lop hoc
            String ml = cbClassID.getSelectedItem().toString();
            String malop = Class_pjDAO.getMaLophoc(ml);
            dto.setIdclass_pj(malop);
            //convert gia tri tu combox to String
            String permission = cbquyen.getSelectedItem().toString();
            dto.setPermission(permission);
            UserDAO dao = new UserDAO();
            dao.updateUser(dto);
            boolean isUpdate = this.userdao.updateUser(dto);
            if (isUpdate) {
                alt.alter("update Successed !");
                loaddata(); // sau khi update thanh cong se load du lieu len bang
                refreshUser();
            } else {
                alt.alter("Update not Successed");
            }
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please selecte a row to delete");
        } else {
            if (JOptionPane.showConfirmDialog(this, "Are you sure to delete?", "Deelte Warming", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                UserDTO dto = new UserDTO();
                dto.setIduser(Integer.valueOf(txtiduser.getText()));
                UserDAO dao = new UserDAO();
                dao.deleteUser(dto);
                boolean isDelete = this.userdao.deleteUser(dto);
                if (isDelete) {
                    alt.alter("Delete Success!!");
                    loaddata();
                    refreshUser();
                } else {
                    alt.alter("Delete Not Success");
                }
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // Search du lieu tren table
        String query = txtsearch.getText().toLowerCase();
        search(query);

    }//GEN-LAST:event_txtsearchKeyReleased

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        refreshUser();
    }//GEN-LAST:event_btnrefreshActionPerformed
    /*Tao filter*/
    public void search(String quuery) {
        TableRowSorter<TableModel> tr = new TableRowSorter<TableModel>(model);
        tbluser.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(quuery));

    }

    // ham lam moi!
    public void refreshUser() {
        txtiduser.setText("");
        txtname.setText("");
        txtaddress.setText("");
        txtyearschool.setText("");
        txtphone.setText("");
        txtemail.setText("");
        txtusername.setText("");
        txtpass.setText("");
        cbClassID.setSelectedIndex(0);
        cbquyen.setSelectedIndex(0);
        datechbirthday.setDate(null);

    }

    public void loaddata() {
        model = new DefaultTableModel(null, new Object[]{"User ID", "Name", "Birthday", "Address", "School Year",
            "Phone", "Email", "Username", "Password", "Class", "Permission"});
        ResultSet rs = this.userdao.loaddata();
        try {

            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt("matk"), rs.getString("hoten"), rs.getDate("ngaysinh"),
                    rs.getString("diachi"), rs.getInt("namhoc"), rs.getString("sdt"), rs.getString("email"), rs.getString("username"),
                    rs.getString("pass"), rs.getString("tenlop"), rs.getString("quyen")});
            }
            tbluser.setModel(model);
            rs.close();
        } catch (SQLException e) {
            log.error(e.toString());
        }
    }

    public void loadPermissionToCBO() {
        ResultSet rs = this.userdao.loadpermission();
        try {
            while (rs.next()) {
                this.cbquyen.addItem(rs.getString("quyen"));
            }
            rs.close();
        } catch (SQLException e) {
           log.error(e.toString());
        }

    }

    public void loadClassIDToCBO() {
        Class_pjDAO dao = new Class_pjDAO();
        ResultSet rs = dao.LoadataClass_pj();
        try {
            while (rs.next()) {
                String nameclass = rs.getString("tenlop");
                this.cbClassID.addItem(String.valueOf(new Class_pjDTO(nameclass)));
            }

        } catch (SQLException e) {
           log.error(e.toString());
        }
    }

    // method check username already exit

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbClassID;
    private javax.swing.JComboBox<String> cbquyen;
    private com.toedter.calendar.JDateChooser datechbirthday;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelUser;
    private javax.swing.JPanel pnUsergood;
    private javax.swing.JPanel pnuser;
    private javax.swing.JTable tbluser;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtiduser;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtusername;
    private javax.swing.JTextField txtyearschool;
    // End of variables declaration//GEN-END:variables
}
