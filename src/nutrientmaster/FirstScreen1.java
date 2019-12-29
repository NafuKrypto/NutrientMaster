/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrientmaster;

import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class FirstScreen1 extends javax.swing.JFrame {

    /**
     * Creates new form FirstScreen1
     */
    public FirstScreen1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        text_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        text_weight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        text_height = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmb_gender = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        text_age = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        cmb_activity = new javax.swing.JComboBox<>();
        next_button = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");

        text_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_nameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Weight(in kg)");

        text_weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_weightActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Height(in foot)");

        text_height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_heightActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender");

        cmb_gender.setBackground(new java.awt.Color(67, 215, 241));
        cmb_gender.setForeground(new java.awt.Color(2, 1, 1));
        cmb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Age");

        text_age.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        text_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_ageActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Activity");

        cmb_activity.setBackground(new java.awt.Color(67, 215, 241));
        cmb_activity.setEditable(true);
        cmb_activity.setForeground(new java.awt.Color(1, 0, 0));
        cmb_activity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NotActive", "LightlyAcitve", "ModeratelyActive", "VeryActive", "ExtraActive" }));

        next_button.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        next_button.setText(" Next");
        next_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_buttonActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\Compressed\\NutrientMaster\\food1.png")); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\Compressed\\NutrientMaster\\black-background_00313351.jpg")); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(text_name, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addComponent(text_weight, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(text_height, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel4)
                        .addGap(94, 94, 94)
                        .addComponent(cmb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel6)
                        .addGap(94, 94, 94)
                        .addComponent(cmb_activity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel5)
                        .addGap(126, 126, 126)
                        .addComponent(text_age, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(520, 520, 520)
                        .addComponent(next_button)))
                .addContainerGap(82, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(text_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(text_weight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(text_height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cmb_activity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(text_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(next_button)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validateForm()
    { 
        boolean errorFound=false;
        if(this.text_name.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter your name", "Error", JOptionPane.ERROR_MESSAGE);
            errorFound=true;
            this.setVisible(true);
            return false;
        }
        if(this.text_weight.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter your weight", "Error", JOptionPane.ERROR_MESSAGE);
            errorFound=true;
            this.setVisible(true);
            return false;
        }
        try
        {
            Float.parseFloat(text_weight.getText());
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Invalid weight", "Error", JOptionPane.ERROR_MESSAGE);
            errorFound=true;
            this.setVisible(true);
            return false;
        }
        if(this.text_height.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter your height", "Error", JOptionPane.ERROR_MESSAGE);
            errorFound=true;
            this.setVisible(true);
            return false;
        }
         try
        {
            Float.parseFloat(text_height.getText());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Invalid height", "Error", JOptionPane.ERROR_MESSAGE);
            errorFound=true;
            this.setVisible(true);
            return false;
        }
        if(this.text_age.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please enter your age", "Error", JOptionPane.ERROR_MESSAGE);
            errorFound=true;
            this.setVisible(true);
            return false;
        }
        try
        {
            Integer.parseInt(text_age.getText());
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Invalid age", "Error", JOptionPane.ERROR_MESSAGE);
            errorFound=true;
            this.setVisible(true);
            return false;
        }
        
        return errorFound;
    }
    private void text_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_nameActionPerformed

    private void next_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_buttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SecondScreen secondScreen1=new SecondScreen();
       
        if(validateForm()==false)
        {
            secondScreen1.name=text_name.getText();
            secondScreen1.gender=cmb_gender.getSelectedItem().toString();
            secondScreen1.weight=Float.parseFloat(text_weight.getText());
            secondScreen1.height=Float.parseFloat(text_height.getText());
            secondScreen1.activity=cmb_activity.getSelectedItem().toString();
            secondScreen1.age=Integer.parseInt(text_age.getText());
            secondScreen1.calculateSomething();
            secondScreen1.calculateCarbohydrate();
            secondScreen1.calculateProtein();
            secondScreen1.calculateFat();
            secondScreen1.calculateVitamin();
            secondScreen1.setVisible(true);
        }
    }//GEN-LAST:event_next_buttonActionPerformed

    private void text_weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_weightActionPerformed

    private void text_heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_heightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_heightActionPerformed

    private void text_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_ageActionPerformed

    
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
            java.util.logging.Logger.getLogger(FirstScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstScreen1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_activity;
    private javax.swing.JComboBox<String> cmb_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton next_button;
    private javax.swing.JFormattedTextField text_age;
    private javax.swing.JTextField text_height;
    private javax.swing.JTextField text_name;
    private javax.swing.JTextField text_weight;
    // End of variables declaration//GEN-END:variables
}