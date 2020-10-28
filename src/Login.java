
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import java.util.Scanner; 
import java.io.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class Login extends javax.swing.JFrame {

    public Login() throws FileNotFoundException, IOException {
        try {
            this.accountFile = new FileInputStream("src/account.txt");
            initComponents();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }                   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PassWord = new javax.swing.JPasswordField();
        DangNhap = new javax.swing.JButton();
        LayLaiMatKhau = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        DangKy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Hệ Thống Quản Lý Phần Thưởng");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 0));
        jLabel2.setText("Đăng Nhập :");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BK-logo.jpg"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 25)); // NOI18N
        jLabel4.setText("Tài Khoản : ");

        UserName.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        UserName.setForeground(new java.awt.Color(153, 153, 153));
        UserName.setText("Nhập Tài Khoản");
        UserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameMouseClicked(evt);
            }
        });
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        UserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UserNameKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 25)); // NOI18N
        jLabel5.setText("Mật Khẩu : ");

        PassWord.setText("******");
        PassWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassWordMouseClicked(evt);
            }
        });
        PassWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PassWordKeyPressed(evt);
            }
        });

        DangNhap.setBackground(new java.awt.Color(0, 255, 0));
        DangNhap.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        DangNhap.setForeground(new java.awt.Color(255, 255, 255));
        DangNhap.setText("Đăng nhập");
        DangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangNhapActionPerformed(evt);
            }
        });

        LayLaiMatKhau.setBackground(new java.awt.Color(0, 255, 0));
        LayLaiMatKhau.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        LayLaiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        LayLaiMatKhau.setText("Lấy Lại Mật Khẩu");
        LayLaiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LayLaiMatKhauMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        jLabel6.setText("Quên Mật Khẩu ?");

        DangKy.setBackground(new java.awt.Color(51, 255, 0));
        DangKy.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        DangKy.setForeground(new java.awt.Color(255, 255, 255));
        DangKy.setText("Đăng Ký");
        DangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangKyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DangNhap)
                        .addGap(217, 217, 217))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(UserName, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(PassWord))
                                .addGap(85, 85, 85))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LayLaiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UserName))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PassWord))
                        .addGap(34, 34, 34)
                        .addComponent(DangNhap)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DangKy)
                            .addComponent(LayLaiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameActionPerformed

    private void DangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangNhapActionPerformed
        login();
    }//GEN-LAST:event_DangNhapActionPerformed

    private void LayLaiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LayLaiMatKhauMouseClicked
        ForGotPassWord fgpw = new ForGotPassWord();
        fgpw.setVisible(true);
        fgpw.setResizable(false);
        fgpw.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_LayLaiMatKhauMouseClicked

    private void DangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangKyActionPerformed
        Register register = new Register();
        register.setVisible(true);
        register.setResizable(false);
        register.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_DangKyActionPerformed

    private void UserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameMouseClicked
        if(PassWord.getText().equals("")){
                PassWord.setText("******");
                checkclickpassword=false;
        }
        if(!checkclickusername){           
        UserName.setText("");
        UserName.setFont(tnrmstraight);
        UserName.setForeground(Color.BLACK);
        checkclickusername=true;
        }
    }//GEN-LAST:event_UserNameMouseClicked

    private void PassWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassWordMouseClicked
        if(UserName.getText().equals("")) {
            UserName.setText("Nhập Tài Khoản");
            UserName.setFont(tnmrnghieng);
            UserName.setForeground(Color.GRAY);
            checkclickusername=false;
        }
        if(!checkclickpassword){
        PassWord.setText("");
        checkclickpassword=true;
        }
    }//GEN-LAST:event_PassWordMouseClicked

    private void UserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserNameKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            if(UserName.getText().equals("")) {
                UserName.setText("Nhập Tài Khoản");
                UserName.setFont(tnmrnghieng);
                UserName.setForeground(Color.GRAY);
                checkclickusername=false;
            }
            if(!checkclickpassword){
                PassWord.setText("");
                checkclickpassword=true;
            }
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_UserNameKeyPressed

    private void PassWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassWordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            if(PassWord.getText().equals("")){
                PassWord.setText("******");
                checkclickpassword=false;
            }
            if(!checkclickusername){
                UserName.setText("");
                UserName.setFont(tnrmstraight);
                UserName.setForeground(Color.BLACK);
                checkclickusername=true;
            }
        }
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            login();
        }
    }//GEN-LAST:event_PassWordKeyPressed

    private void login(){
        String username = UserName.getText();
        String password = PassWord.getText();      
        if(username.equals("")||password.equals("")||
            username.equals("Nhập Tài Khoản")||password.equals("******")){
            JOptionPane.showMessageDialog(rootPane,"Vui Lòng Nhập Đầy Đủ Thông Tin !");
            UserName.setText("Nhập Tài Khoản");
            UserName.setFont(tnmrnghieng);
            UserName.setForeground(Color.GRAY);
            checkclickusername=false;
            PassWord.setText("******");
            checkclickpassword=false;
        }
        else{
            String inputun,inputpw,inputemail,inputex;
            boolean checkup=false;
            Scanner sc = new Scanner(accountFile);
            while (sc.hasNextLine()) 
            { 
                inputun = sc.nextLine(); 
                inputpw = sc.nextLine();
                if(username.equals(inputun)&&password.equals(inputpw)){
                    checkup=true;
                    break;
                }
            } 
            if(checkup){
                Main main = new Main();
                main.setVisible(true);
                main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Nhập sai tài khoản hoặc mật khẩu rồi bạn ê. Nhập lại đê !");
                UserName.setText("Nhập Tài Khoản");
                UserName.setFont(tnmrnghieng);
                UserName.setForeground(Color.GRAY);
                checkclickusername=false;
                PassWord.setText("******");
                checkclickpassword=false;
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    private boolean checkclickusername = false;
    private boolean checkclickpassword = false;
    Font tnrmstraight = new Font("Times New Roman", Font.BOLD, 14);
    Font tnmrnghieng = new Font("Times New Roman", Font.ITALIC,14);
    
    FileInputStream accountFile;
    FileInputStream inputStream;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DangKy;
    private javax.swing.JButton DangNhap;
    private javax.swing.JButton LayLaiMatKhau;
    private javax.swing.JPasswordField PassWord;
    private javax.swing.JTextField UserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
