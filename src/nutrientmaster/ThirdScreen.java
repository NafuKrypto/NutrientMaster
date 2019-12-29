/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrientmaster;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Enumeration;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author sayem
 */
public class ThirdScreen extends javax.swing.JFrame implements TableModelListener {

    public DefaultTableModel model;

    /**
     * Creates new form ThirdScreen
     */
    public ThirdScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadDataInTable();
        jTable1.getModel().addTableModelListener(this);

    }

    private void loadDataInTable() {
        String[] columNames = new String[jTable1.getColumnCount()];
        Integer i = 0;
        Enumeration<TableColumn> ec = jTable1.getColumnModel().getColumns();
        while (ec.hasMoreElements()) {
            columNames[i++] = ec.nextElement().
                    getHeaderValue().toString();

        }
        model = new DefaultTableModel(columNames, 0) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0) {
                    return Boolean.class;
                } else if (columnIndex < 3) {
                    return String.class;
                } else {
                    return Double.class;
                }
            }

            @Override
            public boolean isCellEditable(int row, int col) {
                if (col == 0) // 0-indexed (6th col)
                {
                    return true;
                } else if (col == 2) // 7th col
                {
                    return ((Boolean) getValueAt(row, 0)).booleanValue();
                } else // every other column
                {
                    return false;
                }
            }

        };

        String line = "";
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader("food.csv"))) {
            i = 0;
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(cvsSplitBy);
                if (i == 0) {
                    i++;
                    continue;
                }
                i++;
                double cal = Double.parseDouble(data[2]);
                double fat = Double.parseDouble(data[3]);
                double pro = Double.parseDouble(data[4]);
                double carb = Double.parseDouble(data[5]);
                model.insertRow(0, new Object[]{Boolean.FALSE, data[0], data[1], cal, fat, pro, carb});
            }
            jTable1.setModel(model);
        } catch (Exception e) {

        }
    }

    @Override
    public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel model = (TableModel) e.getSource();
        String columnName = model.getColumnName(column);

        if (column == 2 && row == 0) {
            String data = (String) model.getValueAt(row, column);
            data = data.replaceAll("[\\D]", "");
            Double amount = Double.parseDouble(data);
            // Double fat = (Double) model.getValueAt(row, column + 1);
            model.setValueAt(amount * 2.66, row, column + 1);
            model.setValueAt(amount * 0.1712, row, column + 2);
            model.setValueAt(amount * 0.2604, row, column + 3);
            model.setValueAt(amount * 0, row, column + 4);
        }
        if (column == 2 && row == 1) {
            String data = (String) model.getValueAt(row, column);
            data = data.replaceAll("[\\D]", "");
            Double amount = Double.parseDouble(data);
            // Double fat = (Double) model.getValueAt(row, column + 1);
            model.setValueAt(amount * 63, row, column + 1);
            model.setValueAt(amount * 1.4, row, column + 2);
            model.setValueAt(amount * 8.89, row, column + 3);
            model.setValueAt(amount * 1.4, row, column + 4);
        }
        if (column == 2 && row == 2) {
            String data = (String) model.getValueAt(row, column);
            data = data.replaceAll("[\\D]", "");
            Double amount = Double.parseDouble(data);
            // Double fat = (Double) model.getValueAt(row, column + 1);
            model.setValueAt(amount * 2.357, row, column + 1);
            model.setValueAt(amount * 0.107, row, column + 2);
            model.setValueAt(amount * 0.322, row, column + 3);
            model.setValueAt(amount * 0, row, column + 4);
        }
        if (column == 2 && row == 3) {
            String data = (String) model.getValueAt(row, column);
            data = data.replaceAll("[\\D]", "");
            Double amount = Double.parseDouble(data);
            // Double fat = (Double) model.getValueAt(row, column + 1);
            model.setValueAt(amount * 3.1, row, column + 1);
            model.setValueAt(amount * 0.284, row, column + 2);
            model.setValueAt(amount * 0.311, row, column + 3);
            model.setValueAt(amount * 0.2513, row, column + 4);
        }
        if (column == 2 && row == 4) {
            String data = (String) model.getValueAt(row, column);
            data = data.replaceAll("[\\D]", "");
            Double amount = Double.parseDouble(data);
            // Double fat = (Double) model.getValueAt(row, column + 1);
            model.setValueAt(amount * 127, row, column + 1);
            model.setValueAt(amount * 3.54, row, column + 2);
            model.setValueAt(amount * 23.98, row, column + 3);
            model.setValueAt(amount * 0, row, column + 4);
        }
        if (column == 2 && row == 5) {
            String data = (String) model.getValueAt(row, column);
            data = data.replaceAll("[\\D]", "");
            Double amount = Double.parseDouble(data);
            // Double fat = (Double) model.getValueAt(row, column + 1);
            model.setValueAt(amount * 95, row, column + 1);
            model.setValueAt(amount * 0.31, row, column + 2);
            model.setValueAt(amount * 0.47, row, column + 3);
            model.setValueAt(amount * 25.13, row, column + 4);
        }
        if (column == 2 && row == 6) {
            String data = (String) model.getValueAt(row, column);
            data = data.replaceAll("[\\D]", "");
            Double amount = Double.parseDouble(data);
            // Double fat = (Double) model.getValueAt(row, column + 1);
            model.setValueAt(amount * 68, row, column + 1);
            model.setValueAt(amount * 0.41, row, column + 2);
            model.setValueAt(amount * 0.74, row, column + 3);
            model.setValueAt(amount * 17, row, column + 4);
        }
        if (column == 2 && row == 7) {
            String data = (String) model.getValueAt(row, column);
            data = data.replaceAll("[\\D]", "");
            Double amount = Double.parseDouble(data);
            // Double fat = (Double) model.getValueAt(row, column + 1);
            model.setValueAt(amount * 608, row, column + 1);
            model.setValueAt(amount * 45.76, row, column + 2);
            model.setValueAt(amount * 12.56, row, column + 3);
            model.setValueAt(amount * 38.94, row, column + 4);
        }
        if (column == 2 && row == 8) {
            String data = (String) model.getValueAt(row, column);
            data = data.replaceAll("[\\D]", "");
            Double amount = Double.parseDouble(data);
            // Double fat = (Double) model.getValueAt(row, column + 1);
            model.setValueAt(amount * 16, row, column + 1);
            model.setValueAt(amount * 0.9, row, column + 2);
            model.setValueAt(amount * 0.35, row, column + 3);
            model.setValueAt(amount * 3.78, row, column + 4);
        }
        if (column == 2 && row == 9) {
            String data = (String) model.getValueAt(row, column);
            data = data.replaceAll("[\\D]", "");
            Double amount = Double.parseDouble(data);
            // Double fat = (Double) model.getValueAt(row, column + 1);
            model.setValueAt(amount * 66, row, column + 1);
            model.setValueAt(amount * 0.82, row, column + 2);
            model.setValueAt(amount * 1.91, row, column + 3);
            model.setValueAt(amount * 12.65, row, column + 4);
        }
        if (column == 2 && row == 10) {
            String data = (String) model.getValueAt(row, column);
            data = data.replaceAll("[\\D]", "");
            Double amount = Double.parseDouble(data);
            // Double fat = (Double) model.getValueAt(row, column + 1);
            model.setValueAt(amount * 1.1, row, column + 1);
            model.setValueAt(amount * 0.0089, row, column + 2);
            model.setValueAt(amount * 0.0256, row, column + 3);
            model.setValueAt(amount * 0.2278, row, column + 4);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buyItems_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pickCal_lbl = new javax.swing.JLabel();
        restCal_lbl = new javax.swing.JLabel();
        pickCar_lbl = new javax.swing.JLabel();
        restCar_lbl = new javax.swing.JLabel();
        pickProtein_lbl = new javax.swing.JLabel();
        restProtein_lbl = new javax.swing.JLabel();
        pickFat_lbl = new javax.swing.JLabel();
        restFat_lbl = new javax.swing.JLabel();
        dutton_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 20, 13)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Name", "Amount", "Calorie (in g)", "Fat (in g)", "Protein (in g)", "Carbohydrate (in g)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        buyItems_button.setBackground(new java.awt.Color(240, 155, 152));
        buyItems_button.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        buyItems_button.setText("BuyItems");
        buyItems_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyItems_buttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 13)); // NOI18N
        jLabel1.setText("Total");

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Remain");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel3.setText("Calorie");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel4.setText("Carbohydrate");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel5.setText("Protien");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel6.setText("Fat");

        dutton_button.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        dutton_button.setText("Done");
        dutton_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dutton_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pickCal_lbl)
                                    .addComponent(restCal_lbl))
                                .addGap(101, 101, 101)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buyItems_button)
                                        .addGap(151, 151, 151))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dutton_button)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(106, 106, 106)
                                                .addComponent(jLabel5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(restCar_lbl)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(restProtein_lbl))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(pickCar_lbl)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(pickProtein_lbl))))))))
                            .addComponent(jLabel2))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pickFat_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(restFat_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buyItems_button)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pickFat_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pickCal_lbl)
                        .addComponent(pickCar_lbl)
                        .addComponent(pickProtein_lbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(restFat_lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(restCal_lbl)
                        .addComponent(restCar_lbl)
                        .addComponent(restProtein_lbl)))
                .addGap(33, 33, 33)
                .addComponent(dutton_button)
                .addGap(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static double restCal;
    public static double restCar;
    public static double restFat;
    public static double restProtein;
    private void buyItems_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyItems_buttonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        int count = 0;
        for (int i = 0; i < nRow; i++) {
            if ((boolean) dtm.getValueAt(i, 0) == false) {
                continue;
            }
            count++;
        }
        Object[][] tableData = new Object[count][nCol];

        int k = 0;
        for (int i = 0; i < nRow; i++) {
            if ((boolean) dtm.getValueAt(i, 0) == false) {
                continue;
            }
            for (int j = 0; j < nCol; j++) {

                tableData[k][j] = dtm.getValueAt(i, j);
            }
            k++;
        }
        int a = 0;
        int i, sum = 0;
        double pickCal = 0;
        double pickCar = 0;
        double pickFat = 0;
        double pickProtein = 0;
        double remainCal ;
        double remainCar ;
        double remainFat ;
        double remainProtein ;
        for (i = 0; i < count; i++) {
            pickCal += (double) tableData[i][3];
            pickFat += (double) tableData[i][4];
            pickProtein += (double) tableData[i][5];
            pickCar += (double) tableData[i][6];
        }
        remainCal=pickCal-restCal;
        remainCar=pickCar-restCar;
        remainFat=pickFat-restFat;
        remainProtein=pickProtein-restProtein;
        
        pickCal_lbl.setText(new DecimalFormat("##.###").format(pickCal));
        pickCar_lbl.setText(new DecimalFormat("##.### gram").format(pickCar));
        pickProtein_lbl.setText(new DecimalFormat("##.### gram").format(pickProtein));
        pickFat_lbl.setText(new DecimalFormat("##.### gram").format(pickFat));
        restCal_lbl.setText(new DecimalFormat("##.### gram").format(remainCal));
        restCar_lbl.setText(new DecimalFormat("##.### gram").format(remainCar));
        restFat_lbl.setText(new DecimalFormat("##.### gram").format(remainFat));
        restProtein_lbl.setText(new DecimalFormat("##.### gram").format(remainProtein));
        try {
            //mone kor, log in user name ta String username varaible ache
            String username = "Abrar";
            String filename = username + ".csv";
            FileWriter fileWriter = new FileWriter(filename);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            String filedata = username + ",";
            for (i = 0; i < count; i++) {
                if (i > 0) {
                    filedata += ";";
                }
                filedata += ((String) tableData[i][1]);
                filedata += " " + ((String) tableData[i][2]);
            }
            printWriter.printf("%s\n", filedata);

            printWriter.close();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_buyItems_buttonActionPerformed

    private void dutton_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dutton_buttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HomeFrame homeframe1=new HomeFrame();
        homeframe1.setVisible(true);
    }//GEN-LAST:event_dutton_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(ThirdScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThirdScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThirdScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThirdScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThirdScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyItems_button;
    private javax.swing.JButton dutton_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel pickCal_lbl;
    private javax.swing.JLabel pickCar_lbl;
    private javax.swing.JLabel pickFat_lbl;
    private javax.swing.JLabel pickProtein_lbl;
    private javax.swing.JLabel restCal_lbl;
    private javax.swing.JLabel restCar_lbl;
    private javax.swing.JLabel restFat_lbl;
    private javax.swing.JLabel restProtein_lbl;
    // End of variables declaration//GEN-END:variables
}
