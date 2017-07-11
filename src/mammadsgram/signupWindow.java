package mammadsgram;

public class signupWindow extends javax.swing.JFrame {

    public signupWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namepanel = new javax.swing.JPanel();
        usernameField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        pass1Label = new javax.swing.JLabel();
        pass1Field = new javax.swing.JTextField();
        pass2Label = new javax.swing.JLabel();
        pass2Field = new javax.swing.JTextField();
        submitBtton = new javax.swing.JButton();
        aggreeCheckbox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usernameField.setColumns(10);
        usernameField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        usernameLabel.setFont(new java.awt.Font("Adobe Arabic", 0, 18)); // NOI18N
        usernameLabel.setText("enter your username:");

        idLabel.setFont(new java.awt.Font("Adobe Arabic", 0, 18)); // NOI18N
        idLabel.setText("enter your id:");

        idField.setColumns(10);
        idField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        pass1Label.setFont(new java.awt.Font("Adobe Arabic", 0, 18)); // NOI18N
        pass1Label.setText("enter your password:");

        pass1Field.setColumns(10);
        pass1Field.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        pass2Label.setFont(new java.awt.Font("Adobe Arabic", 0, 18)); // NOI18N
        pass2Label.setText("re enter your password:");

        pass2Field.setColumns(10);
        pass2Field.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        submitBtton.setFont(new java.awt.Font("Adobe Arabic", 0, 18)); // NOI18N
        submitBtton.setText("submit");
        submitBtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBttonActionPerformed(evt);
            }
        });

        aggreeCheckbox.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        aggreeCheckbox.setText("agree to the terms");
        aggreeCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggreeCheckboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout namepanelLayout = new javax.swing.GroupLayout(namepanel);
        namepanel.setLayout(namepanelLayout);
        namepanelLayout.setHorizontalGroup(
            namepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(namepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(namepanelLayout.createSequentialGroup()
                        .addComponent(submitBtton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aggreeCheckbox))
                    .addGroup(namepanelLayout.createSequentialGroup()
                        .addGroup(namepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(idLabel)
                            .addComponent(pass1Label)
                            .addComponent(pass2Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(namepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        namepanelLayout.setVerticalGroup(
            namepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(namepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(namepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(namepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass1Label)
                    .addComponent(pass1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(namepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pass2Label)
                    .addComponent(pass2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(namepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aggreeCheckbox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(namepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(namepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aggreeCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggreeCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aggreeCheckboxActionPerformed

    private void submitBttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBttonActionPerformed
        if (pass1Field.getText().equals(pass2Field.getText())){
            User user = new User();
            user.id = idField.getText();
            user.password = pass1Field.getText();
            user.username = usernameField.getText();
            user.writeUserToFile();
        }
    }//GEN-LAST:event_submitBttonActionPerformed

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
            java.util.logging.Logger.getLogger(signupWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signupWindow().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox aggreeCheckbox;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JPanel namepanel;
    private javax.swing.JTextField pass1Field;
    private javax.swing.JLabel pass1Label;
    private javax.swing.JTextField pass2Field;
    private javax.swing.JLabel pass2Label;
    private javax.swing.JButton submitBtton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
