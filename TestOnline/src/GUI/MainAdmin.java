/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.UserInformation;
import Report.Ireport;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 *
 * @author TMK_PLAN4
 */
public class MainAdmin extends javax.swing.JPanel {

    GridBagLayout layout = new GridBagLayout();
    User user;
    Class_pj class_pj; 
    Subject subject;
    private static final Log log = LogFactory.getLog(Login.class);

    public MainAdmin() {
        initComponents();
        CurrentTime();// hien thi thoi gian dang nhap
        lbName.setText(UserInformation.name); // show user name login
        user = new User();
        class_pj = new Class_pj();
        subject = new Subject();
        pnAdmin.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        pnAdmin.add(user, c);
        c.gridx = 0;
        c.gridy = 0;
        pnAdmin.add(class_pj, c);
        c.gridx = 0;
        c.gridy = 0;
        pnAdmin.add(subject, c);
        c.gridx = 0;
        c.gridy = 0;
        
        user.setVisible(true);
        class_pj.setVisible(false);
        subject.setVisible(false);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        pnAdmin = new javax.swing.JPanel();
        pnAdminLeft = new javax.swing.JPanel();
        btnclass = new javax.swing.JButton();
        btnsubject = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnuser = new javax.swing.JButton();
        lbName = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        setMinimumSize(new java.awt.Dimension(1350, 720));
        setPreferredSize(new java.awt.Dimension(1350, 720));
        setLayout(new java.awt.BorderLayout());

        pnAdmin.setAutoscrolls(true);
        pnAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnAdmin.setInheritsPopupMenu(true);
        pnAdmin.setMinimumSize(new java.awt.Dimension(1350, 685));
        pnAdmin.setPreferredSize(new java.awt.Dimension(1350, 685));
        add(pnAdmin, java.awt.BorderLayout.CENTER);

        pnAdminLeft.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnAdminLeft.setMinimumSize(new java.awt.Dimension(200, 100));
        pnAdminLeft.setPreferredSize(new java.awt.Dimension(200, 100));

        btnclass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnclass.setForeground(new java.awt.Color(102, 102, 102));
        btnclass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/class.png"))); // NOI18N
        btnclass.setPreferredSize(new java.awt.Dimension(55, 55));
        btnclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclassActionPerformed(evt);
            }
        });

        btnsubject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnsubject.setForeground(new java.awt.Color(102, 102, 102));
        btnsubject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494643911_set_of_three_books.png"))); // NOI18N
        btnsubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubjectActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Report.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnuser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnuser.setForeground(new java.awt.Color(102, 102, 102));
        btnuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        btnuser.setBorder(null);
        btnuser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnuser.setMaximumSize(new java.awt.Dimension(55, 55));
        btnuser.setMinimumSize(new java.awt.Dimension(55, 55));
        btnuser.setPreferredSize(new java.awt.Dimension(55, 55));
        btnuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuserActionPerformed(evt);
            }
        });

        lbName.setText("jLabel1");

        lbDate.setText("jLabel1");

        lbTime.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("User");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Class");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Subject");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Report");

        javax.swing.GroupLayout pnAdminLeftLayout = new javax.swing.GroupLayout(pnAdminLeft);
        pnAdminLeft.setLayout(pnAdminLeftLayout);
        pnAdminLeftLayout.setHorizontalGroup(
            pnAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAdminLeftLayout.createSequentialGroup()
                .addGroup(pnAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAdminLeftLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnuser, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnAdminLeftLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnAdminLeftLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(742, 742, 742))
                    .addGroup(pnAdminLeftLayout.createSequentialGroup()
                        .addComponent(btnclass, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(708, 708, 708)))
                .addGroup(pnAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbName)
                    .addComponent(lbDate)
                    .addComponent(lbTime))
                .addGap(132, 132, 132))
        );

        pnAdminLeftLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnclass, btnsubject, btnuser, jButton1});

        pnAdminLeftLayout.setVerticalGroup(
            pnAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAdminLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAdminLeftLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(pnAdminLeftLayout.createSequentialGroup()
                        .addGroup(pnAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnAdminLeftLayout.createSequentialGroup()
                                .addGroup(pnAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnclass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnsubject, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAdminLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4))))
                            .addGroup(pnAdminLeftLayout.createSequentialGroup()
                                .addComponent(lbName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbTime)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pnAdminLeftLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel3, jLabel4, jLabel6});

        pnAdminLeftLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnclass, btnsubject, btnuser, jButton1});

        add(pnAdminLeft, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents
 public void CurrentTime() {
        Thread clock = new Thread() {
            @Override
            public void run() {
                for (;;) {
                    Calendar cal = new GregorianCalendar();
                    int year = cal.get(Calendar.YEAR);
                    int month = cal.get(Calendar.MONTH) + 1;
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    int hour = cal.get(Calendar.HOUR);
                    int minute = cal.get(Calendar.MINUTE);
                    int second = cal.get(Calendar.SECOND);
                    lbDate.setText(month + "/" + day + "/" + year);
                    String pm = Calendar.PM == 1 ? "PM" : "AM";
                    String str_S = String.valueOf(second);
                    String str_M = String.valueOf(minute);
                    if (second <= 9) {
                        str_S = '0' + str_S;
                    }
                    if (minute <= 9) {
                        str_M = '0' + str_M;
                    }
                    lbTime.setText(hour + ":" + str_M + ":" + str_S + " " + pm);

                }
            }
        };
        clock.start();
    }

    private void btnclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclassActionPerformed
        // TODO add your handling code here:
        user.setVisible(false);
        class_pj.setVisible(true);
        subject.setVisible(false);


    }//GEN-LAST:event_btnclassActionPerformed

    private void btnsubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubjectActionPerformed
        // TODO add your handling code here:
        user.setVisible(false);
        class_pj.setVisible(false);
        subject.setVisible(true);
    }//GEN-LAST:event_btnsubjectActionPerformed

    private void btnuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuserActionPerformed
        // TODO add your handling code here:
        user.setVisible(true);
        class_pj.setVisible(false);
        subject.setVisible(false);
    }//GEN-LAST:event_btnuserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Ireport ir = new Ireport();
            ir.showJasper("src/Report/reportKetQua.jasper");
        }catch(Exception ex){
           log.error( ex.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclass;
    private javax.swing.JButton btnsubject;
    private javax.swing.JButton btnuser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTime;
    private javax.swing.JPanel pnAdmin;
    private javax.swing.JPanel pnAdminLeft;
    // End of variables declaration//GEN-END:variables
}
