/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package taaasks;

import javax.swing.JComboBox;

/**
 *
 * @author teobourloglou
 */
public class CreateTask extends javax.swing.JDialog {

    /**
     * Creates new form CreateTask
     */
    public CreateTask(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    boolean submit = false;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        taskTitle = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        titleLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taskDescription = new javax.swing.JTextArea();
        errorMessage = new javax.swing.JLabel();
        tagLabel = new javax.swing.JLabel();
        taskTag = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(30, 30, 30));

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setMinimumSize(new java.awt.Dimension(427, 0));

        taskTitle.setBackground(new java.awt.Color(54, 53, 59));
        taskTitle.setFont(new java.awt.Font("Futura", 1, 16)); // NOI18N
        taskTitle.setForeground(new java.awt.Color(255, 255, 255));
        taskTitle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        taskTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 192, 192), 2));
        taskTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskTitleActionPerformed(evt);
            }
        });

        createButton.setBackground(new java.awt.Color(202, 232, 234));
        createButton.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        createButton.setText("Create");
        createButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Enter a title for this task*");

        titleLabel1.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        titleLabel1.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel1.setText("Enter a description");

        taskDescription.setBackground(new java.awt.Color(54, 53, 59));
        taskDescription.setColumns(20);
        taskDescription.setFont(new java.awt.Font("Futura", 1, 16)); // NOI18N
        taskDescription.setForeground(new java.awt.Color(255, 255, 255));
        taskDescription.setRows(5);
        taskDescription.setWrapStyleWord(true);
        taskDescription.setAutoscrolls(false);
        taskDescription.setBorder(null);
        jScrollPane1.setViewportView(taskDescription);

        errorMessage.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(255, 102, 102));
        errorMessage.setText("*You need to fill the title");

        tagLabel.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        tagLabel.setForeground(new java.awt.Color(255, 255, 255));
        tagLabel.setText("Select a tag");

        taskTag.setFont(new java.awt.Font("Futura", 0, 13)); // NOI18N
        taskTag.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Critical Priority", "High Priority", "Medium Priority", "Low Priority", "No Priority" }));
        taskTag.setSelectedIndex(2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel1)
                            .addComponent(titleLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(taskTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tagLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(taskTitle, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(createButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(errorMessage, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 58, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taskTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tagLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taskTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(errorMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
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

    private void taskTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskTitleActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        if (taskTitle.getText().length() > 0) {
            this.dispose();
            submit = true;
        } else {
            errorMessage.setVisible(true);
        }
    }//GEN-LAST:event_createButtonActionPerformed

    public void errorMessageHide() {
        errorMessage.setVisible(false);
    }
    
    public String getTaskTitle() {
        return taskTitle.getText();
    }
    
    public String getTaskDescription() {
        return taskDescription.getText();
    }
    
    public JComboBox<String> getTaskTag() {
        return taskTag;
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
            java.util.logging.Logger.getLogger(CreateTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateTask dialog = new CreateTask(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tagLabel;
    private javax.swing.JTextArea taskDescription;
    private javax.swing.JComboBox<String> taskTag;
    private javax.swing.JTextField taskTitle;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel titleLabel1;
    // End of variables declaration//GEN-END:variables
}
