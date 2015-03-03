/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plh24ergasia3;

import javax.swing.JOptionPane;
import pojos.*;
import plh24ergasia3.DBManager;
/**
 *
 * @author thanos
 */
//under construction
public class NewOrModifyArtist extends javax.swing.JFrame {

    Artist artist;
    boolean modify;
    int confirm,selectedRow=-1;
    MusicGenre eidos;
    /**
     * Creates new form NewOrModifyArtist
     */
    public NewOrModifyArtist() {//νέα εγγραφη
        initComponents();
        modify=false;
        setTitle("ΠΡΟΣΘΗΚΗ ΝΕΟΥ ΚΑΛΛΙΤΕΧΝΗ");
    }
    public NewOrModifyArtist(Artist ar) {//τροποποίηση
        initComponents();               
        modify = true;
        artist=ar;
        setTitle("ΤΡΟΠΟΠΟΙΗΣΗ ΚΑΛΛΙΤΕΧΝΗ");
        
        firstName.setText(artist.getFirstName());
        lastName.setText(artist.getLastName());
        artisticName.setText(artist.getArtisticName());
        sex.setText(artist.getSex());
        birthDate.setDate(artist.getBirthDate());
        birthPlace.setText(artist.getBirthPlace());
        //ισως λειπει
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
        musicGenreQuery = java.beans.Beans.isDesignTime() ? null : radioDBv2PUEntityManager.createQuery("SELECT m FROM MusicGenre m");
        musicGenreList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : musicGenreQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        artisticName = new javax.swing.JTextField();
        sex = new javax.swing.JTextField();
        birthPlace = new javax.swing.JTextField();
        saveArtist = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        birthDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        genreTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ΔΙΑΧΕΙΡΙΣΗ ΚΑΛΛΙΤΕΧΝΗ");
        setPreferredSize(new java.awt.Dimension(600, 512));
        setResizable(false);

        jLabel1.setText("Όνομα:");

        jLabel2.setText("Επώνυμο:");

        jLabel3.setText("Καλλιτεχνικό όνομα:");

        jLabel4.setText("Φύλο:");

        jLabel5.setText("Ημερομηνία Γέννησης");

        jLabel6.setText("Τόπος Γέννησης:");

        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        artisticName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artisticNameActionPerformed(evt);
            }
        });

        saveArtist.setText("Αποθήκευση");
        saveArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveArtistActionPerformed(evt);
            }
        });

        cancel.setText("Ακύρωση");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        genreTable.setColumnSelectionAllowed(true);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, musicGenreList, genreTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Είδος Μουσικής");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(genreTable);
        genreTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel7.setText("Διαχείριση Καλλιτέχνη");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(birthDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(firstName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(artisticName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sex, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthPlace, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveArtist)
                            .addComponent(cancel))
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(artisticName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(saveArtist, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(birthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void artisticNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artisticNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_artisticNameActionPerformed

    private void saveArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveArtistActionPerformed
        // TODO add your handling code here:
        selectedRow=genreTable.getSelectedRow();
        if(firstName.getText().isEmpty()|| lastName.getText().isEmpty()||artisticName.getText().isEmpty()
                || sex.getText().isEmpty()||(birthDate.getDate()==null)|| birthPlace.getText().isEmpty()||selectedRow<0){
            JOptionPane.showMessageDialog(null, "Ολα τα πεδία είναι υποχρεωτικά!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        else{//ολα τα πεδια ειναι συμπληρωμένα
            if (modify==true) {//τροποποίηση
                confirm = JOptionPane.showConfirmDialog(null, "Επιθυμείτε να αποθηκεύσετε τις αλλαγές;" , "",JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirm==0){
                    artist.setFirstName(firstName.getText());
                    artist.setLastName(lastName.getText());
                    artist.setArtisticName(artisticName.getText());
                    artist.setSex(sex.getText());
                    artist.setBirthDate(birthDate.getDate());
                    artist.setBirthPlace(birthPlace.getText());
                    eidos=musicGenreList.get(genreTable.convertRowIndexToModel(selectedRow));
                    artist.setMusicGenrename(eidos);
                
                
                    if (DBManager.modifyArtist(artist)){
                        ListOfArtists.artistList1.set(ListOfArtists.ArtistsTable.getSelectedRow(), artist);
                        JOptionPane.showMessageDialog(null, "Επιτυχής τροποποίηση στοιχείων καλλιτέχνη!", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                    } 
                   
                    else {
                        JOptionPane.showMessageDialog(null, "Αποτυχία τροποποίησης καλλιτέχνη!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            else{//νέα εγγραφή
                confirm = JOptionPane.showConfirmDialog(null, "Επιθυμείτε να ολοκληρώσετε την καταχώριση;", "",JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (confirm==0){//πρόβλημα
                    artist=new Artist();
                    artist.setFirstName(firstName.getText());
                    artist.setLastName(lastName.getText());
                    artist.setArtisticName(artisticName.getText());
                    artist.setSex(sex.getText());
                    artist.setBirthDate(birthDate.getDate());//να το ξαναδω
                    artist.setBirthPlace(birthPlace.getText());
                    selectedRow=genreTable.getSelectedRow();
                    eidos=musicGenreList.get(genreTable.convertRowIndexToModel(selectedRow));
                    artist.setMusicGenrename(eidos);
                    if(DBManager.addArtist(artist)){
                        ListOfArtists.artistList1.add(artist);
                        JOptionPane.showMessageDialog(null, "Επιτυχής καταχώριση καλλιτέχνη ", "SUCCESSFUL", JOptionPane.INFORMATION_MESSAGE);
                    
                    dispose();//κλεισιμο παραθυρου
                    //new ListOfArtists().setVisible(true);//και ανοιγμα ανανεωμενης λιστας
                   
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Αποτυχία τροποποίησης καλλιτέχνη!", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                
            }
            
            
            
            
        }
    }//GEN-LAST:event_saveArtistActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(NewOrModifyArtist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewOrModifyArtist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewOrModifyArtist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewOrModifyArtist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewOrModifyArtist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField artisticName;
    private com.toedter.calendar.JDateChooser birthDate;
    private javax.swing.JTextField birthPlace;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField firstName;
    private javax.swing.JTable genreTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastName;
    private java.util.List<pojos.MusicGenre> musicGenreList;
    private javax.persistence.Query musicGenreQuery;
    private javax.persistence.EntityManager radioDBv2PUEntityManager;
    private javax.swing.JButton saveArtist;
    private javax.swing.JTextField sex;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
