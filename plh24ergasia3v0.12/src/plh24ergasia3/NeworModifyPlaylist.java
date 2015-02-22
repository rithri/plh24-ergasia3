/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plh24ergasia3;
import java.util.Random;
import javax.swing.JOptionPane;
import static plh24ergasia3.DBManager.modifyPL;
import pojos.*;
import static plh24ergasia3.DBManager.modifyPlaylist;
/**
 *
 * @author tkomitopoulos
 */
public class NeworModifyPlaylist extends javax.swing.JFrame {
    Playlist playlist;
    boolean modify;
    Song song;
    int selectedAvailableSongRow, selectedSelectedSongRow;
    Random generator = new Random(); 
    /**
     * Creates new form NeworModifyPlaylist
     */
    public NeworModifyPlaylist() {
        initComponents();
        checkButtons();
        modify=false;
        selectedSongList.clear();
    }
    public  NeworModifyPlaylist(Playlist pl){//τροποποίηση
        initComponents();
        checkButtons();
        modify = true;
        playlist=pl;
        setTitle("ΤΡΟΠΟΠΟΙΗΣΗ PLAYLIST");
        
        description.setText(playlist.getName());
        CreationDate.setDate(playlist.getCreationDate());
        for(Song song:playlist.getSongList()){
            selectedSongList.add(song);
            availableSongList.remove(song);//βγάζει τα υπάρχοντα τραγουδια
        }
    }
    private void checkButtons() {
        /* Έλεγχος των κουμπιών για ενεργοποίηση ή απενεργοποίηση */
        selectedAvailableSongRow = availableSongTable.getSelectedRow();
        selectedSelectedSongRow = selectedSongTable.getSelectedRow();        
        insertSongButton.setEnabled(selectedAvailableSongRow >= 0);
        deleteSelectedSongButton.setEnabled(selectedSelectedSongRow >= 0);
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
        songQuery = java.beans.Beans.isDesignTime() ? null : radioDBv2PUEntityManager.createQuery("SELECT s FROM Song s");
        availableSongList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(songQuery.getResultList());
        selectedSongList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(songQuery.getResultList());
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        save = new javax.swing.JButton();
        insertSongButton = new javax.swing.JButton();
        deleteSelectedSongButton = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        CreationDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableSongTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectedSongTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ΔΙΑΧΕΙΡΙΣΗ ΛΙΣΤΑΣ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ΦΟΡΜΑ ΔΙΑΧΕΙΡΙΣΗΣ ΛΙΣΤΑΣ");

        jLabel2.setText("Περιγραφή");

        jLabel3.setText("Ημερομηνία δημιουργιας");

        jLabel4.setText("Λίστα Διαθέσιμων Τραγουδιών");

        cancel.setText("Ακύρωση");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        save.setText("Αποθήκευση");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        insertSongButton.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        insertSongButton.setForeground(new java.awt.Color(35, 169, 32));
        insertSongButton.setText("-->");
        insertSongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertSongButtonActionPerformed(evt);
            }
        });

        deleteSelectedSongButton.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        deleteSelectedSongButton.setForeground(new java.awt.Color(204, 44, 47));
        deleteSelectedSongButton.setText("<--");
        deleteSelectedSongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSelectedSongButtonActionPerformed(evt);
            }
        });

        jTextField2.setText("Αναζήτηση");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Αναζήτηση Τραγουδιού");

        description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, availableSongList, availableSongTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${title}"));
        columnBinding.setColumnName("Τίτλος");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${duration}"));
        columnBinding.setColumnName("Διάρκεια σε sec");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${albumalbumId.musicGroupmusicGroupId.name}"));
        columnBinding.setColumnName("Συγκρότημα");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${albumalbumId.artistartistId.lastName}"));
        columnBinding.setColumnName("Επώνυμο καλλιτέχνη");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        availableSongTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                availableSongTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(availableSongTable);

        selectedSongTable.setColumnSelectionAllowed(true);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, selectedSongList, selectedSongTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${title}"));
        columnBinding.setColumnName("Τίτλος");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${duration}"));
        columnBinding.setColumnName("Διάρκεια σε sec");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${albumalbumId.musicGroupmusicGroupId.name}"));
        columnBinding.setColumnName("Συγκρότημα ");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ObjectProperty.create());
        columnBinding.setColumnName("Επώνυμο καλλιτέχνη");
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        selectedSongTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectedSongTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(selectedSongTable);
        selectedSongTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertSongButton)
                    .addComponent(deleteSelectedSongButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancel))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(193, 193, 193))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CreationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(90, 90, 90)
                                        .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(save))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(516, 516, 516)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(330, 330, 330))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(CreationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(save)
                        .addGap(21, 21, 21)))
                .addGap(26, 26, 26)
                .addComponent(cancel)
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertSongButton)
                        .addGap(29, 29, 29)
                        .addComponent(deleteSelectedSongButton)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        //εδω θα μπει το αρχικο if
            if(!modify){//νεα playlist
                int id=generator.nextInt();
                String name="Playlist"+String.valueOf(id);//τυχαιο ονομα-κλειδι
                playlist=new Playlist(name);
                //playlist.setName(name);
                playlist.setDescription(description.getText());
                playlist.setCreationDate(CreationDate.getDate());
                playlist.setSongList(selectedSongList);
                for(Song song:selectedSongList){                 
                    song.getPlaylistList().add(playlist);
                }
                if(DBManager.addPlaylist(playlist)){
                    JOptionPane.showMessageDialog(null, "Επιτυχής αποθήκευση " , "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);                                           
                    //προσθηκη στον πινακα
                    ListOfPlaylist.playlistList.add(playlist);
                    dispose();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Σφάλμα επικοινωνίας με τη ΒΔ!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{//τροποποίηση playlist
                playlist.setDescription(description.getText());
                playlist.setCreationDate(CreationDate.getDate());
                //playlist.setSongList(selectedSongList);
                if(modifyPL(playlist,selectedSongList)){
                    if(modifyPlaylist(playlist)){
                        ListOfPlaylist.playlistList.set(ListOfPlaylist.PlaylistTable.getSelectedRow(), playlist);
                        JOptionPane.showMessageDialog(null, "Επιτυχής αποθήκευση " , "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);                                           
                        dispose();
                    }
                }
                else
                    JOptionPane.showMessageDialog(null, "Σφάλμα επικοινωνίας με τη ΒΔ!", "ERROR", JOptionPane.ERROR_MESSAGE);

            }
        checkButtons();
    }//GEN-LAST:event_saveActionPerformed

    private void insertSongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertSongButtonActionPerformed
        // TODO add your handling code here:
        //Ορισμος επιλεγμένου τραγουδιου
        song=availableSongList.get(availableSongTable.convertRowIndexToModel(selectedAvailableSongRow));      
        
        // Αφαίρεση του επιλεγμένου τραγουδιου από τα διαθέσιμα 
        availableSongList.remove(song);
        // Εισαγωγή στη λίστα/πίνακα ττων επιλεγμένων
        selectedSongList.add(selectedSongList.size(), song);
        
    }//GEN-LAST:event_insertSongButtonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionActionPerformed

    private void deleteSelectedSongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSelectedSongButtonActionPerformed
        // TODO add your handling code here:
         // Ορισμός του επιλεγμένου τραγουδιου από τους επιλεγμένους
        song = selectedSongList.get(selectedSongTable.convertRowIndexToModel(selectedSelectedSongRow));
        // Αφαίρεση του επιλεγμένου τραγουδιου από τα επιλεγμένα
        selectedSongList.remove(song);
        // Εισαγωγή στη λίστα/πίνακα των διαθέσιμων καλλιτεχνων
        availableSongList.add(availableSongList.size(), song);
    }//GEN-LAST:event_deleteSelectedSongButtonActionPerformed

    private void availableSongTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availableSongTableMouseClicked
        // TODO add your handling code here:
        selectedSongTable.clearSelection();
        deleteSelectedSongButton.setEnabled(false);
        checkButtons();
    }//GEN-LAST:event_availableSongTableMouseClicked

    private void selectedSongTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectedSongTableMouseClicked
        availableSongTable.clearSelection();
        insertSongButton.setEnabled(false);
        checkButtons();
    }//GEN-LAST:event_selectedSongTableMouseClicked

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
            java.util.logging.Logger.getLogger(NeworModifyPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NeworModifyPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NeworModifyPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NeworModifyPlaylist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NeworModifyPlaylist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser CreationDate;
    private java.util.List<pojos.Song> availableSongList;
    private javax.swing.JTable availableSongTable;
    private javax.swing.JButton cancel;
    private javax.swing.JButton deleteSelectedSongButton;
    private javax.swing.JTextField description;
    private javax.swing.JButton insertSongButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.persistence.EntityManager radioDBv2PUEntityManager;
    private javax.swing.JButton save;
    private java.util.List<pojos.Song> selectedSongList;
    private javax.swing.JTable selectedSongTable;
    private javax.persistence.Query songQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
