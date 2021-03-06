/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.ConnectionManager;
import DAO.ResultDao;
import DAO.UserInformation;
import DAO.alert_messager;
import DTO.Question;
import DTO.ResultDto;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimerTask;
import java.util.Date;
import javax.swing.JOptionPane;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 *
 * @author dell
 */
public class Test extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    private String monHoc;
    private int tongcau;
    private int examTime; // timer
    private boolean isIt = false;//timer
    public String maDe;
    int currentQuestion = -1;
    int totalQuestion = 0;
    ArrayList<Question> listCauhoi = null;
    ArrayList<String> cauChon = null;
    Result result;
    alert_messager alt = new alert_messager();
    private static final Log log = LogFactory.getLog(Login.class); 
    public Test() {
        initComponents();
        setDeThiInfo();
        tmrQuizTime_Tick();
        listCauhoi = new ArrayList();
        cauChon = new ArrayList();
        this.btnPrevious.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnPrevious = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnsubmit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lbTimeRemaition = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtquestioncontent = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        anwA = new javax.swing.JRadioButton();
        anwd = new javax.swing.JRadioButton();
        anwc = new javax.swing.JRadioButton();
        anwb = new javax.swing.JRadioButton();
        lbcurrentquestion = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbtongcau = new javax.swing.JLabel();
        lbmonhoc = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbtime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1365, 741));

        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 680));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(1350, 720));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 102, 102));
        jPanel3.setMinimumSize(new java.awt.Dimension(366, 152));

        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button-Previous-icon.png"))); // NOI18N
        btnPrevious.setText("Back");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Button-Next-icon (1).png"))); // NOI18N
        btnnext.setText("Next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnsubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/submit.png"))); // NOI18N
        btnsubmit.setText("Submit");
        btnsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnPrevious)
                .addGap(18, 18, 18)
                .addComponent(btnnext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsubmit))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(860, 115));

        lbTimeRemaition.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbTimeRemaition.setForeground(new java.awt.Color(255, 102, 0));
        lbTimeRemaition.setText("0:00");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/question.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addComponent(lbTimeRemaition, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(lbTimeRemaition, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Question", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel5.setMinimumSize(new java.awt.Dimension(1350, 570));

        txtquestioncontent.setEditable(false);
        txtquestioncontent.setColumns(20);
        txtquestioncontent.setLineWrap(true);
        txtquestioncontent.setRows(5);
        txtquestioncontent.setText("question content");
        txtquestioncontent.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtquestioncontent);

        buttonGroup1.add(anwA);
        anwA.setText(" A");

        buttonGroup1.add(anwd);
        anwd.setText("D");

        buttonGroup1.add(anwc);
        anwc.setText("C");

        buttonGroup1.add(anwb);
        anwb.setText("B");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anwc)
                    .addComponent(anwb)
                    .addComponent(anwd)
                    .addComponent(anwA))
                .addContainerGap(639, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(anwA)
                .addGap(18, 18, 18)
                .addComponent(anwb)
                .addGap(18, 18, 18)
                .addComponent(anwc)
                .addGap(27, 27, 27)
                .addComponent(anwd)
                .addContainerGap())
        );

        lbcurrentquestion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbcurrentquestion.setText("Cau 1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbcurrentquestion)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lbcurrentquestion)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Ques Total:");

        lbtongcau.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbtongcau.setForeground(new java.awt.Color(255, 102, 0));
        lbtongcau.setText("jLabel8");

        lbmonhoc.setForeground(new java.awt.Color(255, 102, 0));
        lbmonhoc.setText("jLabel2");

        jLabel24.setForeground(new java.awt.Color(0, 102, 102));
        jLabel24.setText("Subject:");

        lbtime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbtime.setForeground(new java.awt.Color(255, 102, 0));
        lbtime.setText("0:00");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Exam Time :");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/test1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbtongcau)
                            .addComponent(lbmonhoc))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(lbtime, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(lbmonhoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbtongcau)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lbtime))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1345, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void setDeThiInfo() {

        maDe = HomeTest.maDe;
        examTime = UserInformation.timetest;
        monHoc = HomeTest.monHoc;
        tongcau = UserInformation.tongsoCau;
        lbtime.setText(String.valueOf(examTime));
        lbmonhoc.setText(monHoc);
        lbtongcau.setText(String.valueOf(tongcau));
    }

    /*dong ho dem nguoc thoi gian*/
    private void tmrQuizTime_Tick() {
        java.util.Timer timer = new java.util.Timer();// new time 
        int examTimeminute = Integer.valueOf(lbtime.getText()); // vd : set time counter 5s , se lay tu de thi getlabetExamTime
        examTime = examTimeminute * 60;
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                examTime--;
                int minute = examTime / 60;
                int Second = examTime - minute * 60;
                String time = +minute + ":" + Second;
                lbTimeRemaition.setText(time); // time lable show
                if (minute == 0 && Second == 0) {
                    timer.cancel();
                    alert_messager alt = new alert_messager();
                    alt.alter("thoi gian da het , nhan ok de xem ket qua");
                } else if (isIt) { // dung cai nay de stop timer (isIt=true)
                    timer.cancel();
                    isIt = false;
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }
    public void loadquestion(String maDe) {
        try {

            String sql = "{call ups_getQuizListBymadethi ('" + maDe + "')}";

            CallableStatement conn = ConnectionManager.getConnection().prepareCall(sql);
            ResultSet rs = conn.executeQuery();
            while (rs.next()) {
                Question ques = new Question();
                ques.setQuesion(rs.getString("ndcauhoi"));
                ques.setAnsw1(rs.getString("phuonganA"));
                ques.setAnsw2(rs.getString("phuonganB"));
                ques.setAnsw3(rs.getString("phuonganC"));
                ques.setAnsw4(rs.getString("phuonganD"));
                ques.setThoigianthi(rs.getInt("thoigianthi"));
                ques.setDapan(rs.getString("dapan"));
                listCauhoi.add(ques);
            }

        } catch (SQLException e) {
            log.error(e.toString());

        }
        totalQuestion = listCauhoi.size();
        System.out.println("Total Question : " + totalQuestion);

    }

    private void nextquestion() {
        currentQuestion++;
        if (currentQuestion > 0) {
            this.btnPrevious.setEnabled(true);
            if (anwA.isSelected()) {
                cauChon.add("A");
                System.out.println("A");
            } else if (anwb.isSelected()) {
                cauChon.add("B");
                System.out.println("B");
            } else if (anwc.isSelected()) {
                cauChon.add("C");
                System.out.println("C");
            } else if (anwd.isSelected()) {
                cauChon.add("D");
                System.out.println("D");
            } else {
                cauChon.add("e");
                System.out.println("e");
            }
        }

        if (currentQuestion < totalQuestion) {
            this.btnPrevious.setEnabled(true);
            Question t = listCauhoi.get(currentQuestion);
            txtquestioncontent.setText(t.getQuesion());
            anwA.setText(" Answer A :   " + t.getAnsw1());
            anwb.setText(" Answer B :   " + t.getAnsw2());
            anwc.setText(" Answer C :   " + t.getAnsw3());
            anwd.setText(" Answer D :   " + t.getAnsw4());
            buttonGroup1.clearSelection();
            //  jLabel7.setText("<html>" + (cauHientai + 1) + "/<b style=\"color:red\">" + soCau + "</b><hmtl>"); // hien thi so cau
            lbcurrentquestion.setText("Question : " + (currentQuestion + 1));
            lbtongcau.setText("<html>" + (currentQuestion + 1) + "/<b style=\"color:red\">" + totalQuestion + "</b><hmtl>");
        } else {
            btnnext.setEnabled(false);
            this.btnPrevious.setEnabled(true);
        }
    }

    private void checkResult() {
        int cau = 0;
        for (int i = 0; i < totalQuestion; i++) {
            String dapan = listCauhoi.get(i).getDapan().trim();
            String chon = cauChon.get(i) + "    ".trim();
            System.out.println("So sanh: " + dapan + "@" + chon);
            if (chon.equals(dapan)) {
                cau++;
            } else {
                System.out.println("khong dung");
            }
        }
        UserInformation.socaudung = cau;
    }
     public void AddResult() {
        int matk =UserInformation.userID;
        int madethi = Integer.valueOf(HomeTest.maDe);
        float diem = (10 / UserInformation.tongsoCau) * UserInformation.socaudung; 
       // get current time insert to result table
        java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        DecimalFormat df = new DecimalFormat("#.##");
        String dx = df.format(diem);
        diem = Float.valueOf(dx);
        ResultDto dto = new ResultDto(matk, diem, madethi, date);
        ResultDao dao = new ResultDao();
        boolean isAddResult = dao.addResult(dto);
        if(isAddResult){
        
        alt.alter("Submit is Success ,Please click ok to show result");
        }else{
        alt.alter("Submit faild , please check with your admin");
        }
    }

    private void btnsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmitActionPerformed

        if (cauChon.equals(0)) {
            alert_messager alt = new alert_messager();
            alt.alter("you have to answer at least one question ");

        } else {
            JOptionPane.showMessageDialog(null, "Are you sure to submit ?");
            checkResult();
            AddResult();
            result = new Result();
            result.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnsubmitActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed

        nextquestion();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed

        currentQuestion--;
        if (currentQuestion < 0) {
            this.btnPrevious.setEnabled(false);
        }

    }//GEN-LAST:event_btnPreviousActionPerformed
    // phuong thuc nay de ben Homtest
    public void setForm() {
        loadquestion(maDe);
        nextquestion();
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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton anwA;
    private javax.swing.JRadioButton anwb;
    private javax.swing.JRadioButton anwc;
    private javax.swing.JRadioButton anwd;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnsubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTimeRemaition;
    private javax.swing.JLabel lbcurrentquestion;
    private javax.swing.JLabel lbmonhoc;
    public static javax.swing.JLabel lbtime;
    private javax.swing.JLabel lbtongcau;
    private javax.swing.JTextArea txtquestioncontent;
    // End of variables declaration//GEN-END:variables
}
