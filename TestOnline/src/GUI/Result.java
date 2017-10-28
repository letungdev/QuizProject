/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.HomeTest;
import DAO.ResultDao;
import DAO.UserInformation;
import DAO.alert_messager;
import GUI.Login;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author TMK_PLAN4
 */
public class Result extends javax.swing.JFrame {

  private  ResultDao resultDao;
   private static final Log log = LogFactory.getLog(Login.class); 
    public Result() {
        initComponents();
        lbid.setText(String.valueOf(UserInformation.userID));
        lbname.setText(UserInformation.name);
        lbClass.setText(UserInformation.classID);
        lbquestotal.setText(String.valueOf(UserInformation.tongsoCau));
        lbquizid.setText(HomeTest.maDe);
        lbcorrectanswer.setText(String.valueOf(UserInformation.socaudung));
        lbSubject.setText(UserInformation.subjectID);
        float diem = (10 / UserInformation.tongsoCau) * UserInformation.socaudung;
        DecimalFormat df = new DecimalFormat("#.##");
        String dx = df.format(diem);
        diem = Float.valueOf(dx);

        lbmark.setText(String.valueOf(diem));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPdf = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbClass = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbquizid = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbquestotal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbcorrectanswer = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbmark = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbSubject = new javax.swing.JLabel();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "UserName", "Password", "Permission"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(253, 241, 203));
        jPanel1.setMinimumSize(new java.awt.Dimension(1350, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 580));

        jPanel3.setBackground(new java.awt.Color(251, 191, 124));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rsz_1logoaptech.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("You have compeleted the exam !");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(466, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));

        btnPdf.setForeground(new java.awt.Color(102, 102, 102));
        btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494095448_20.png"))); // NOI18N
        btnPdf.setText("Export PDF");
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });

        btnLogout.setForeground(new java.awt.Color(102, 102, 102));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1494095551_logout.png"))); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPdf)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("ID ");

        lbid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbid.setText("jLabel3");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Name");

        lbname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbname.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Class");

        lbClass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbClass.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Quiz ID");

        lbquizid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbquizid.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Ques Total ");

        lbquestotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbquestotal.setText("jLabel12");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Correct Total");

        lbcorrectanswer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbcorrectanswer.setText("jLabel14");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Mark Total");

        lbmark.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbmark.setText("jLabel16");

        jLabel3.setText("SubJect");

        lbSubject.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbClass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbid, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbquestotal)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbquizid)
                            .addComponent(lbcorrectanswer))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSubject)
                            .addComponent(lbmark, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbid)
                    .addComponent(jLabel9)
                    .addComponent(lbquizid)
                    .addComponent(jLabel15)
                    .addComponent(lbmark))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbname)
                    .addComponent(jLabel11)
                    .addComponent(lbquestotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbClass)
                    .addComponent(jLabel13)
                    .addComponent(lbcorrectanswer)
                    .addComponent(jLabel3)
                    .addComponent(lbSubject))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        writePdfUsingIText();
    }//GEN-LAST:event_btnPdfActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
      Login login = new Login();
      login.setVisible(true);
      this.dispose();
        

    }//GEN-LAST:event_btnLogoutActionPerformed
//    public void AddResult() {
//        int matk = Integer.parseInt(lbid.getText());
//        int madethi = Integer.parseInt(lbquizid.getText());
//        float diem = Float.parseFloat(lbmark.getText());
//        ResultDto dto = new ResultDto(matk,madethi,diem);
//        resultDao = new ResultDao();
//        this.resultDao.addResult(dto);
//
//    }

    public void writePdfUsingIText() {
        JFileChooser dialog = new JFileChooser();
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            String filePath = dialog.getSelectedFile().getPath() + ".pdf";
            Document document = new Document();

            try {
//                Font f = new Font();
//                f.setStyle(BaseColor.RED);
//                f.setSize(8);
                Font code = new Font(FontFamily.COURIER, 12, Font.NORMAL, BaseColor.RED);
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(filePath));

                //open
                document.open();
                //set header
                PdfPTable header = new PdfPTable(1);

                // add text header
                PdfPCell text = new PdfPCell();
                text.setPaddingBottom(15);
                text.setPaddingLeft(10);
                text.setBorder(Rectangle.BOTTOM);
                text.setBorderColor(BaseColor.LIGHT_GRAY);
                text.addElement(new Phrase("CNC Aptech", code));
                text.addElement(new Phrase("www.cncaptech.edu.vn",code));
                header.addCell(text);
                document.add(header);

                // end set head & foot
                Paragraph p = new Paragraph();
                p.add("Your Exam Result");
                p.setAlignment(Element.ALIGN_CENTER);
                p.setFont(code);
                document.add(p);

                Paragraph p2 = new Paragraph();
                p2.add("Name: " + lbname.getText()); //no alignment
                p2.setIndentationLeft(50); // tab left
                p2.setFont(code);
                document.add(p2);

                Paragraph p3 = new Paragraph();
                p3.add("Class: " + lbClass.getText()); //no alignment
                p3.setIndentationLeft(50); // tab left
                p3.setFont(code);
                document.add(p3);

                Paragraph p4 = new Paragraph();
                p4.add("Subject: " + lbSubject.getText()); //no alignment
                p4.setSpacingAfter(35); // Enter 50 row
                p4.setIndentationLeft(50); // tab left
                p4.setFont(code);
                document.add(p4);
                /*
            Font f = new Font();
            f.setStyle(Font.BOLD);
            f.setSize(8);

            document.add(new Paragraph("This is my paragraph 3", f));
                 */
                // add tabel
                PdfPTable table = new PdfPTable(4); // 4 columns.

                PdfPCell cell1 = new PdfPCell(new Paragraph("Quiz ID"));
                cell1.setBackgroundColor(BaseColor.RED);
                PdfPCell cell2 = new PdfPCell(new Paragraph("Question Total"));
                cell2.setBackgroundColor(BaseColor.RED);
                PdfPCell cell3 = new PdfPCell(new Paragraph("Question Correct"));
                cell3.setBackgroundColor(BaseColor.RED);
                PdfPCell cell4 = new PdfPCell(new Paragraph("Question Score"));
                cell4.setBackgroundColor(BaseColor.RED);
                PdfPCell cell5 = new PdfPCell(new Paragraph(lbquizid.getText()));
                cell5.setBackgroundColor(BaseColor.RED);
                PdfPCell cell6 = new PdfPCell(new Paragraph(lbquestotal.getText()));
                cell6.setBackgroundColor(BaseColor.RED);
                PdfPCell cell7 = new PdfPCell(new Paragraph(lbcorrectanswer.getText()));
                cell7.setBackgroundColor(BaseColor.RED);
                PdfPCell cell8 = new PdfPCell(new Paragraph(lbmark.getText()));
                cell8.setBackgroundColor(BaseColor.RED);

                table.addCell(cell1);
                table.addCell(cell2);
                table.addCell(cell3);
                table.addCell(cell4);
                table.addCell(cell5);
                table.addCell(cell6);
                table.addCell(cell7);
                table.addCell(cell8);

                document.add(table);

                //close
                document.close();
                alert_messager alt = new alert_messager();
                alt.alter("Export Done");
                System.out.println("Done");

            } catch (Exception e) {
               log.error(e.toString());
            }
        }
    }

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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lbClass;
    private javax.swing.JLabel lbSubject;
    private javax.swing.JLabel lbcorrectanswer;
    private javax.swing.JLabel lbid;
    private javax.swing.JLabel lbmark;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbquestotal;
    private javax.swing.JLabel lbquizid;
    // End of variables declaration//GEN-END:variables
}
