package jobamatching;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.xml.ws.Action;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class WorkEnvironment extends javax.swing.JFrame {

    private static DefaultTableModel tableModel;
    private static int columnNumber = 1;
    /**
     * Creates new form WorkEnvironment
     */
    public WorkEnvironment() {
        initComponents();
       tableModel = new DefaultTableModel(new Object[] { "Initial Column","2nd Colum"," third"," 4th" }, 5);
       jTable1.setModel(tableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        clsDateFld = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        JobRef = new javax.swing.JTextField();
        maxSal = new javax.swing.JTextField();
        minSal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JobType = new javax.swing.JComboBox();
        ProvinceBox = new javax.swing.JComboBox();
        RegionBox = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dateFld = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Benefits = new javax.swing.JTextArea();
        JobTitle = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        salaryNegChckbx = new javax.swing.JCheckBox();
        equity = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        descrptionText = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        requirementsText = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ideal = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        roles = new javax.swing.JTextArea();
        scrnChckbx = new javax.swing.JCheckBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        remunaration = new javax.swing.JComboBox();
        Category = new javax.swing.JComboBox();
        level = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setBorder(new javax.swing.border.MatteBorder(null));

        clsDateFld.setColumns(3);
        clsDateFld.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        clsDateFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        clsDateFld.setToolTipText("Enter date in M/D/YY format");
        clsDateFld.setBounds(320, 430, 230, 30);
        jDesktopPane1.add(clsDateFld, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Date Available");
        jLabel1.setBounds(50, 400, 110, 20);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JobRef.setBounds(320, 50, 230, 30);
        jDesktopPane1.add(JobRef, javax.swing.JLayeredPane.DEFAULT_LAYER);
        maxSal.setBounds(460, 500, 90, 30);
        jDesktopPane1.add(maxSal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        minSal.setBounds(320, 500, 90, 30);
        jDesktopPane1.add(minSal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Job Type");
        jLabel2.setBounds(50, 220, 110, 20);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Benefits");
        jLabel3.setBounds(50, 560, 110, 20);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Job Level");
        jLabel4.setBounds(50, 180, 110, 20);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Job Category");
        jLabel5.setBounds(50, 140, 110, 20);
        jDesktopPane1.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Job Title");
        jLabel6.setBounds(50, 100, 110, 20);
        jDesktopPane1.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Remuneration");
        jLabel7.setBounds(50, 270, 110, 20);
        jDesktopPane1.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Location:");
        jLabel8.setBounds(50, 330, 110, 20);
        jDesktopPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("To");
        jLabel9.setBounds(430, 510, 30, 20);
        jDesktopPane1.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Closing date");
        jLabel10.setBounds(50, 440, 110, 20);
        jDesktopPane1.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Salary:");
        jLabel11.setBounds(50, 510, 110, 20);
        jDesktopPane1.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("From");
        jLabel12.setBounds(210, 510, 60, 20);
        jDesktopPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        JobType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Contract", "Permanent", "Temporary" }));
        JobType.setBounds(320, 220, 230, 20);
        jDesktopPane1.add(JobType, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ProvinceBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "The Eastern Cape", "The Free State", "Gauteng", "KwaZulu-Natal", "Limpopo", "Mpumalanga", "The Northern Cape", "North West", "The Western Cape", "Outside South Africa" }));
        ProvinceBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ProvinceBoxItemStateChanged(evt);
            }
        });
        ProvinceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvinceBoxActionPerformed(evt);
            }
        });
        ProvinceBox.setBounds(320, 320, 230, 20);
        jDesktopPane1.add(ProvinceBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        RegionBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bisho", "East London", "Jeffreys Bay", "Mdantsane", "Queenstown", "Cradock", "Grahamstown", "Port Elizabeth", "Uitenhage", "Umtata (Mthatha)", "Coffee Bay", "Port St Johns", "Willowvale" }));
        RegionBox.setBounds(320, 360, 230, 20);
        jDesktopPane1.add(RegionBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Province");
        jLabel13.setBounds(210, 330, 80, 15);
        jDesktopPane1.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Region");
        jLabel14.setBounds(210, 360, 90, 15);
        jDesktopPane1.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        dateFld.setColumns(3);
        dateFld.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        dateFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateFld.setText(getUtilDate());
        dateFld.setToolTipText("Enter date in M/D/YY format");
        dateFld.setBounds(320, 390, 230, 30);
        jDesktopPane1.add(dateFld, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Benefits.setColumns(20);
        Benefits.setRows(5);
        jScrollPane2.setViewportView(Benefits);

        jScrollPane2.setBounds(320, 560, 240, 180);
        jDesktopPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        JobTitle.setBounds(320, 90, 230, 30);
        jDesktopPane1.add(JobTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Job Ref");
        jLabel15.setBounds(50, 60, 100, 20);
        jDesktopPane1.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        salaryNegChckbx.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        salaryNegChckbx.setText("Salary Negotiable");
        salaryNegChckbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryNegChckbxActionPerformed(evt);
            }
        });
        salaryNegChckbx.setBounds(320, 470, 230, 23);
        jDesktopPane1.add(salaryNegChckbx, javax.swing.JLayeredPane.DEFAULT_LAYER);

        equity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        equity.setText("Equity position");
        equity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equityActionPerformed(evt);
            }
        });
        equity.setBounds(320, 20, 230, 23);
        jDesktopPane1.add(equity, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Description ");
        jLabel16.setBounds(600, 60, 100, 20);
        jDesktopPane1.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        descrptionText.setColumns(20);
        descrptionText.setRows(5);
        jScrollPane3.setViewportView(descrptionText);

        jScrollPane3.setBounds(590, 90, 330, 360);
        jDesktopPane1.add(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Minimum Requirements");
        jLabel17.setBounds(590, 450, 220, 30);
        jDesktopPane1.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        requirementsText.setColumns(20);
        requirementsText.setRows(5);
        jScrollPane4.setViewportView(requirementsText);

        jScrollPane4.setBounds(590, 490, 330, 250);
        jDesktopPane1.add(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Ideal Candidate (what you look for in a person)");
        jLabel18.setBounds(940, 60, 310, 20);
        jDesktopPane1.add(jLabel18, javax.swing.JLayeredPane.DEFAULT_LAYER);

        ideal.setColumns(20);
        ideal.setRows(5);
        jScrollPane5.setViewportView(ideal);

        jScrollPane5.setBounds(940, 90, 290, 230);
        jDesktopPane1.add(jScrollPane5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Key Roles/Responsibilities");
        jLabel19.setBounds(950, 350, 230, 20);
        jDesktopPane1.add(jLabel19, javax.swing.JLayeredPane.DEFAULT_LAYER);

        roles.setColumns(20);
        roles.setRows(5);
        jScrollPane6.setViewportView(roles);

        jScrollPane6.setBounds(940, 380, 280, 180);
        jDesktopPane1.add(jScrollPane6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        scrnChckbx.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        scrnChckbx.setText("Instant Screening online questions");
        scrnChckbx.setBounds(950, 590, 260, 23);
        jDesktopPane1.add(scrnChckbx, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jToggleButton1.setText("Add This Job");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jToggleButton1.setBounds(980, 670, 130, 23);
        jDesktopPane1.add(jToggleButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        remunaration.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Basic Salary", "Basic Salary Plus Benefits", "Cost To Company", "Cost To Company Plus Benefits", "Commission", "Basic Plus Commission" }));
        remunaration.setBounds(320, 270, 230, 20);
        jDesktopPane1.add(remunaration, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Category.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Animal Care", "Biotechnology", "Database", "Engineering", "Entertainment", "Finance", "Graphics", "Health", "Hospitality", "Internet", "IT", "Legal", "Managerial", "Networking", "Odd", "Personnel", "Programming", "Public Services", "Sales", "Secretarial", "Service", "Specialist", "Teaching" }));
        Category.setBounds(320, 140, 230, 20);
        jDesktopPane1.add(Category, javax.swing.JLayeredPane.DEFAULT_LAYER);

        level.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Junior", "Skilled", "Senior", "Management", "Executive", " " }));
        level.setBounds(320, 180, 230, 20);
        jDesktopPane1.add(level, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1301, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(598, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1311, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 814, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        jScrollPane1.setViewportView(jTabbedPane1);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");

        jMenuItem1.setText("View");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1272, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        Statement stmnt;
        String sql;
        String location = ProvinceBox.getSelectedItem().toString().concat(", "+RegionBox.getSelectedItem().toString());
        byte neg = 0,eqty=0;
        if(salaryNegChckbx.isSelected())
        neg=1;
        if(equity.isSelected())
        eqty=1;
        try
        {
            Class.forName ("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JOBMATCH","root","admin");
            stmnt = con.createStatement();
            sql = "insert into job values('"+JobRef.getText()+"','"+JobTitle.getText()+"','"+Category.getSelectedItem().toString()+"',"
            + "'"+level.getSelectedItem()+"','"+JobType.getSelectedItem()+"','"+remunaration.getSelectedItem()+"','"+Benefits.getText()+"'"
            + ",'"+minSal.getText()+"','"+maxSal.getText()+"','"+neg+"','"+location+"',"+ "'"+eqty+"','"+descrptionText.getText()+"','"+requirementsText.getText()+"'"
            + ",'"+roles.getText()+"','"+ideal.getText()+"','mumble','"+clsDateFld.getText()+"');";
            stmnt.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "success");
            stmnt.close();
        }
        catch (Exception c)
        {
            JOptionPane.showMessageDialog(rootPane, "Unable to execute query!\n"+c);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void equityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equityActionPerformed

    private void salaryNegChckbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryNegChckbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryNegChckbxActionPerformed

    private void ProvinceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvinceBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProvinceBoxActionPerformed

    private void ProvinceBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ProvinceBoxItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_ProvinceBoxItemStateChanged

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
            java.util.logging.Logger.getLogger(WorkEnvironment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkEnvironment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkEnvironment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkEnvironment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkEnvironment().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Benefits;
    private javax.swing.JComboBox Category;
    private javax.swing.JTextField JobRef;
    private javax.swing.JTextField JobTitle;
    private javax.swing.JComboBox JobType;
    private javax.swing.JComboBox ProvinceBox;
    private javax.swing.JComboBox RegionBox;
    private javax.swing.JFormattedTextField clsDateFld;
    private javax.swing.JFormattedTextField dateFld;
    private javax.swing.JTextArea descrptionText;
    private javax.swing.JCheckBox equity;
    private javax.swing.JTextArea ideal;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox level;
    private javax.swing.JTextField maxSal;
    private javax.swing.JTextField minSal;
    private javax.swing.JComboBox remunaration;
    private javax.swing.JTextArea requirementsText;
    private javax.swing.JTextArea roles;
    private javax.swing.JCheckBox salaryNegChckbx;
    private javax.swing.JCheckBox scrnChckbx;
    // End of variables declaration//GEN-END:variables

    private String getUtilDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
