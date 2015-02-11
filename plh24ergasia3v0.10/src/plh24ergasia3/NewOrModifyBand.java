/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plh24ergasia3;
import pojos.*;
import javax.swing.JOptionPane;
import static plh24ergasia3.DBManager.*;
/**
 *
 * @author thanos
 */
public class NewOrModifyBand extends javax.swing.JFrame {
    MusicGroup band;
    boolean modify;
    int selectedAvailableArtistRow, selectedSelectedArtistRow;
    Artist artist;
    
    /**
     * Creates new form NewOrModifyBand
     */
    public NewOrModifyBand() {//νεα εγγραφή
        initComponents();
        checkButtons();
        modify=false;
        selectedArtistList.clear();// καθαριζει τις εγραφες
    }
    
    public NewOrModifyBand(MusicGroup group) {
        initComponents(); 
        checkButtons();
        band=group;
        modify = true;
        selectedArtistList.clear();
        //θετω τις τιμες
        groupName.setText(band.getName());
        formationDate.setDate(band.getFormationDate());
        for(Artist ar:band.getArtistList()){//για ολους της λίστας
            selectedArtistList.add(ar);
            availableArtistList.remove(ar);//βγάζει τους υπάρχοντες
        }
        //artist.getMusicGroupList().clear();
    }
    
    private void checkButtons() {
        /* Έλεγχος των κουμπιών για ενεργοποίηση ή απενεργοποίηση */
        selectedAvailableArtistRow = availableArtistTable.getSelectedRow();
        selectedSelectedArtistRow = selectedArtistTable.getSelectedRow();        
        insertButton.setEnabled(selectedAvailableArtistRow >= 0);
        deleteSelectedArtistButton.setEnabled(selectedSelectedArtistRow >= 0);
    } 
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        radioDBv2PUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("radioDBv2PU").createEntityManager();
        artistQuery = java.beans.Beans.isDesignTime() ? null : radioDBv2PUEntityManager.createQuery("SELECT a FROM Artist a");
        availableArtistList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(artistQuery.getResultList());
        selectedArtistList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(artistQuery.getResultList());
        groupName = new javax.swing.JTextField();
        formationDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableArtistTable = new javax.swing.JTable();
        cancel = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        insertButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectedArtistTable = new javax.swing.JTable();
        deleteSelectedArtistButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ΔΙΑΧΕΙΡΙΣΗ ΣΥΓΚΡΟΤΗΜΑΤΟΣ");

        jLabel2.setText("Επωνυμία");

        jLabel3.setText("Ημ/νία Δημιουργίας");

        availableArtistTable.setColumnSelectionAllowed(true);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, availableArtistList, availableArtistTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${firstName}"));
        columnBinding.setColumnName("'Ονομα");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lastName}"));
        columnBinding.setColumnName("Επώνυμο");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${artisticName}"));
        columnBinding.setColumnName("Καλλιτεχνικό");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        availableArtistTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                availableArtistTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(availableArtistTable);
        availableArtistTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        cancel.setText("Ακύρωση");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        Save.setText("Αποθήκευση");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel1.setText("Διαθέσιμοι Καλλιτέχνες");

        insertButton.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        insertButton.setForeground(new java.awt.Color(48, 119, 44));
        insertButton.setText("-->");
        insertButton.setToolTipText("Εισαγωγή Καλλιτέχνη");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        selectedArtistTable.setColumnSelectionAllowed(true);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, selectedArtistList, selectedArtistTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${firstName}"));
        columnBinding.setColumnName("First Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lastName}"));
        columnBinding.setColumnName("Last Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${artisticName}"));
        columnBinding.setColumnName("Artistic Name");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        selectedArtistTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectedArtistTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(selectedArtistTable);
        selectedArtistTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        deleteSelectedArtistButton.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        deleteSelectedArtistButton.setForeground(new java.awt.Color(171, 25, 37));
        deleteSelectedArtistButton.setText("<--");
        deleteSelectedArtistButton.setToolTipText("Διαγραφή Καλλιτέχνη");
        deleteSelectedArtistButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSelectedArtistButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel4.setText("Μέλη Συγκροτήματος");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Save))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(insertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteSelectedArtistButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(groupName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(groupName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(formationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(insertButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteSelectedArtistButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Save)
                            .addComponent(cancel))
                        .addGap(29, 29, 29))))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        //selectedAvailableArtistRow=availableArtistTable.getSelectedRow();
        //Ορισμος επιλεγμένου καλλιτέχνη
        artist=availableArtistList.get(availableArtistTable.convertRowIndexToModel(selectedAvailableArtistRow));      
        
        // Αφαίρεση του επιλεγμένου καλλιτεχνη από τους διαθέσιμους 
        availableArtistList.remove(artist);
        // Εισαγωγή στη λίστα/πίνακα ττων επιλεγμένων
        selectedArtistList.add(selectedArtistList.size(), artist);
        
    }//GEN-LAST:event_insertButtonActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        
        if(groupName.getText().isEmpty()||selectedArtistList.size()>1){
            if(modify){//επεξεργασία συγκροτηματος //αποθηκευει τη νεα κρατα και την παλια χωρις λιστα καλλιτεχνων
                band.setName(groupName.getText());
                band.setFormationDate(formationDate.getDate());
                band.setArtistList(selectedArtistList);
                for(Artist artist:selectedArtistList)
                    artist.getMusicGroupList().add(band);
                if (modifyBand(band,selectedArtistList)){
                    //ανανεωση πίνακα
                    ListOfBands.musicGroupList.set(ListOfBands.BandsTable.getSelectedRow(), band);
                    
                    JOptionPane.showMessageDialog(null, "Επιτυχής αποθήκευση " , "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);                                           
                    dispose();
                } 
                else {
                    JOptionPane.showMessageDialog(null, "Σφάλμα επικοινωνίας με τη ΒΔ!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{//νεο συγκροτημα it works!
                band=new MusicGroup();
                band.setName(groupName.getText());
                band.setFormationDate(formationDate.getDate());
                band.setArtistList(selectedArtistList);
                for(Artist artist:selectedArtistList){                 
                    artist.getMusicGroupList().add(band);
                }
                if(addMusicGroup(band)==true){
                    JOptionPane.showMessageDialog(null, "Επιτυχής αποθήκευση " , "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);                                           
                    //προσθηκη στον πινακα
                    ListOfBands.musicGroupList.add(band);
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Σφάλμα επικοινωνίας με τη ΒΔ!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Πρέπει να επιλεγούν τουλάχιστον 2 καλλιτέχνες και να συμπληρωθεί το όνομα συγκροτήματος", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        checkButtons();
    }//GEN-LAST:event_SaveActionPerformed

    private void deleteSelectedArtistButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSelectedArtistButtonActionPerformed
        //selectedSelectedArtistRow=selectedArtistTable.getSelectedRow();
         // Ορισμός του επιλεγμένου καλλιτέχνη από τους επιλεγμένους
        artist = selectedArtistList.get(selectedArtistTable.convertRowIndexToModel(selectedSelectedArtistRow));
        // Αφαίρεση του επιλεγμένου καλλιέχνη από τους επιλεγμενους
        selectedArtistList.remove(artist);
        // Εισαγωγή στη λίστα/πίνακα των διαθέσιμων καλλιτεχνων
        availableArtistList.add(availableArtistList.size(), artist);      
        
    }//GEN-LAST:event_deleteSelectedArtistButtonActionPerformed

    private void availableArtistTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availableArtistTableMouseClicked
        // TODO add your handling code here:
        selectedArtistTable.clearSelection();
        deleteSelectedArtistButton.setEnabled(false);
        checkButtons();
    }//GEN-LAST:event_availableArtistTableMouseClicked

    private void selectedArtistTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectedArtistTableMouseClicked
        availableArtistTable.clearSelection();
        insertButton.setEnabled(false);
        checkButtons();
    }//GEN-LAST:event_selectedArtistTableMouseClicked

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
            java.util.logging.Logger.getLogger(NewOrModifyBand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewOrModifyBand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewOrModifyBand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewOrModifyBand.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewOrModifyBand().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.persistence.Query artistQuery;
    private java.util.List<pojos.Artist> availableArtistList;
    private javax.swing.JTable availableArtistTable;
    private javax.swing.JButton cancel;
    private javax.swing.JButton deleteSelectedArtistButton;
    private com.toedter.calendar.JDateChooser formationDate;
    private javax.swing.JTextField groupName;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.persistence.EntityManager radioDBv2PUEntityManager;
    private java.util.List<pojos.Artist> selectedArtistList;
    private javax.swing.JTable selectedArtistTable;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
