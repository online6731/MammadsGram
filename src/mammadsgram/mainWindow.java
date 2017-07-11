// تغییر 

package mammadsgram;


import java.awt.Color;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.*;



public class mainWindow extends javax.swing.JFrame {    
    
    static ArrayList<Comment> comments = new ArrayList<>();
    static ArrayList<User> users = new ArrayList<>();
    String picturePath = "C:/Users/" + System.getProperty("user.name") + "/Documents/MammadsGram/pic 1/picture.jpg";
    JFrame mainFrame;
    
    
    public mainWindow() {
        initComponents();
        loadommentFromFile();
        loadUsersFromFile();
        buildGUI();
        
    }
    
    
    private void buildGUI(){
        
        this.setLocationRelativeTo(null);
         
        pictureLabel.setIcon(resize(new ImageIcon(picturePath), picturePanel.getWidth(), picturePanel.getHeight()));
        picturePanel.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        
        commentPanel.setBorder(BorderFactory.createLineBorder(Color.blue, 2));
        
        updateCommentList();
        
        sendButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                selectionButtonpressed();
            }
        });
        
    } 
    
    
    public void selectionButtonpressed(){
        Comment ycoment = new Comment();
        ycoment.content = yourComment.getText();
        ycoment.write();
        JOptionPane.showMessageDialog(mainWindow.this, "your comment addad to file comment.txt", "massage", JOptionPane.INFORMATION_MESSAGE);
        loadommentFromFile();
        updateCommentList();

    }
    
    
    private void updateCommentList(){
        DefaultListModel<String> commentListModel = new DefaultListModel<>();
        comments.forEach((c) -> {
            commentListModel.addElement(c.content);
        });
        commentList.setModel(commentListModel);
    }
    
    
    private void loadUsersFromFile(){     
        
        FileInputStream usersDatabase = null;
        String usersString = null;
        try {
            usersDatabase = new FileInputStream("C:/Users/" + System.getProperty("user.name") + "/Documents/MammadsGram/pic 1/users.txt");
            
            int c;
            while ((c = usersDatabase.read()) != -1) {
               usersString += (char) c;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MammadsGram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MammadsGram.class.getName()).log(Level.SEVERE, null, ex);
        
        } finally {
            if (usersDatabase != null) {
                try {
                    usersDatabase.close();
                } catch (IOException ex) {
                    Logger.getLogger(MammadsGram.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        Matcher userMatcher = Pattern.compile("<([^<>]+?):::([^<>]+?):::([^<>]+?)>").matcher(usersString);
        while (userMatcher.find()){
            User newUser = new User();
            newUser.id = userMatcher.group(1);
            newUser.username = userMatcher.group(2);
            newUser.password = userMatcher.group(3);
            users.add(newUser);
        }
    }
    
    
    private void loadommentFromFile(){
        FileInputStream commentsDatabase = null;
        String commentsString = null;
        try {
            commentsDatabase = new FileInputStream("C:/Users/" + System.getProperty("user.name") + "/Documents/MammadsGram/pic 1/comments.txt");
            
            int c;
            while ((c = commentsDatabase.read()) != -1) {
               commentsString += (char) c;
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MammadsGram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MammadsGram.class.getName()).log(Level.SEVERE, null, ex);
        
        } finally {
            if (commentsDatabase != null) {
                try {
                    commentsDatabase.close();
                } catch (IOException ex) {
                    Logger.getLogger(MammadsGram.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        comments = new ArrayList<>();
        Matcher commentMatcher = Pattern.compile("<([^<>]+?):::([^<>]+?)>").matcher(commentsString);
        while (commentMatcher.find()){
            Comment newComment = new Comment();
            newComment.id = commentMatcher.group(1);
            newComment.content = commentMatcher.group(2);
            comments.add(newComment);
        }
    }
    
    
    private static Icon resize(ImageIcon imageIcon, int width, int height) {
        Image img = imageIcon.getImage();  
        Image newimg = img.getScaledInstance(width, height,  java.awt.Image.SCALE_SMOOTH);  
        imageIcon = new ImageIcon(newimg);
        return imageIcon;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        picturePanel = new javax.swing.JPanel();
        pictureLabel = new javax.swing.JLabel();
        sendPanel = new javax.swing.JPanel();
        yourComment = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        commentPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MammadGram");

        picturePanel.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout picturePanelLayout = new javax.swing.GroupLayout(picturePanel);
        picturePanel.setLayout(picturePanelLayout);
        picturePanelLayout.setHorizontalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        picturePanelLayout.setVerticalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        sendPanel.setPreferredSize(new java.awt.Dimension(400, 100));

        yourComment.setFont(new java.awt.Font("Adobe Arabic", 0, 14)); // NOI18N
        yourComment.setText("what do you think?");

        sendButton.setText("SEND");

        javax.swing.GroupLayout sendPanelLayout = new javax.swing.GroupLayout(sendPanel);
        sendPanel.setLayout(sendPanelLayout);
        sendPanelLayout.setHorizontalGroup(
            sendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendPanelLayout.createSequentialGroup()
                .addComponent(yourComment, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sendPanelLayout.setVerticalGroup(
            sendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendPanelLayout.createSequentialGroup()
                .addComponent(yourComment, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        commentPanel.setPreferredSize(new java.awt.Dimension(400, 250));

        commentList.setFont(new java.awt.Font("Chaparral Pro Light", 0, 18)); // NOI18N
        commentList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        commentList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(commentList);

        javax.swing.GroupLayout commentPanelLayout = new javax.swing.GroupLayout(commentPanel);
        commentPanel.setLayout(commentPanelLayout);
        commentPanelLayout.setHorizontalGroup(
            commentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        commentPanelLayout.setVerticalGroup(
            commentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(commentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sendPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(picturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(commentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sendPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindow().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> commentList;
    private javax.swing.JPanel commentPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pictureLabel;
    private javax.swing.JPanel picturePanel;
    private javax.swing.JButton sendButton;
    private javax.swing.JPanel sendPanel;
    private javax.swing.JTextField yourComment;
    // End of variables declaration//GEN-END:variables
} 


